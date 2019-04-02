 /*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 */
package com.wowza.cloudsdk.test.client.model;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;

import org.junit.Test;
import org.junit.Ignore;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneId;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

public class StreamTargetUllModelTest {
	StreamTargetUll modelObject = new StreamTargetUll();

	@Test
	public void StreamTargetUllModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void StreamTargetUllModelTest_setConnectionCode()
	{
		modelObject.setConnectionCode("ConnectionCode");
		assertEquals(modelObject.getConnectionCode(),"ConnectionCode");
	}
	@Test
	public void StreamTargetUllModelTest_setConnectionCodeExpiresAt()
	{
		modelObject.setConnectionCodeExpiresAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getConnectionCodeExpiresAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void StreamTargetUllModelTest_setEnabled()
	{
		modelObject.setEnabled(true);
		assertEquals(modelObject.isEnabled(),true);
	}
	@Test
	public void StreamTargetUllModelTest_setEnableHls()
	{
		modelObject.setEnableHls(true);
		assertEquals(modelObject.isEnableHls(),true);
	}
	@Test
	public void StreamTargetUllModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void StreamTargetUllModelTest_setIngestIpWhitelist()
	{
		List<String> ingestIpWhiteList = new ArrayList<String>();
		ingestIpWhiteList.add("127.0.0.1");
		modelObject.setIngestIpWhitelist(ingestIpWhiteList);
		assertEquals(modelObject.getIngestIpWhitelist().get(0),"127.0.0.1");
	}
	@Test
	public void StreamTargetUllModelTest_setName()
	{
		modelObject.setName("Name");
		assertEquals(modelObject.getName(),"Name");
	}
	@Test
	public void StreamTargetUllModelTest_setPlaybackUrls()
	{
		HashMap<String,List<String>> directPlaybackUrls = new HashMap<String,List<String>>();
		String type = "hls";
		List<String> playbackUrls = new ArrayList<String>();
		playbackUrls.add("hlsPlaybackURL");
		directPlaybackUrls.put(type,playbackUrls);
		modelObject.setPlaybackUrls(directPlaybackUrls);
		assertEquals(modelObject.getPlaybackUrls().get("hls").get(0),"hlsPlaybackURL");
	}
	@Test
	public void StreamTargetUllModelTest_setPrimaryUrl()
	{
		modelObject.setPrimaryUrl("PrimaryUrl");
		assertEquals(modelObject.getPrimaryUrl(),"PrimaryUrl");
	}
	@Test
	public void StreamTargetUllModelTest_setRegionOverride()
	{
		modelObject.setRegionOverride(StreamTargetUll.RegionOverrideEnum.ORIGIN_JP_EAST1_CDN_WOWZA_COM);
		assertEquals(modelObject.getRegionOverride(),StreamTargetUll.RegionOverrideEnum.ORIGIN_JP_EAST1_CDN_WOWZA_COM);
	}
	@Test
	public void StreamTargetUllModelTest_setSourceDeliveryMethod()
	{
		modelObject.setSourceDeliveryMethod(StreamTargetUll.SourceDeliveryMethodEnum.PUSH);
		assertEquals(modelObject.getSourceDeliveryMethod(),StreamTargetUll.SourceDeliveryMethodEnum.PUSH);
	}
	@Test
	public void StreamTargetUllModelTest_setSourceUrl()
	{
		modelObject.setSourceUrl("SourceUrl");
		assertEquals(modelObject.getSourceUrl(),"SourceUrl");
	}
	@Test
	public void StreamTargetUllModelTest_setState()
	{
		modelObject.setState(StreamTargetUll.StateEnum.ERROR);
		assertEquals(modelObject.getState(),StreamTargetUll.StateEnum.ERROR);
	}
	@Test
	public void StreamTargetUllModelTest_setStreamName()
	{
		modelObject.setStreamName("StreamName");
		assertEquals(modelObject.getStreamName(),"StreamName");
	}
	@Test
	public void StreamTargetUllModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
}
