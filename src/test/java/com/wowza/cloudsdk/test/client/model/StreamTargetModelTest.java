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

public class StreamTargetModelTest {
	StreamTarget modelObject = new StreamTarget();

	@Test
	public void StreamTargetModelTest_setBackupUrl()
	{
		modelObject.setBackupUrl("BackupUrl");
		assertEquals(modelObject.getBackupUrl(),"BackupUrl");
	}
	@Test
	public void StreamTargetModelTest_setConnectionCode()
	{
		modelObject.setConnectionCode("ConnectionCode");
		assertEquals(modelObject.getConnectionCode(),"ConnectionCode");
	}
	@Test
	public void StreamTargetModelTest_setConnectionCodeExpiresAt()
	{
		modelObject.setConnectionCodeExpiresAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getConnectionCodeExpiresAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void StreamTargetModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void StreamTargetModelTest_setHdsPlaybackUrl()
	{
		modelObject.setHdsPlaybackUrl("HdsPlaybackUrl");
		assertEquals(modelObject.getHdsPlaybackUrl(),"HdsPlaybackUrl");
	}
	@Test
	public void StreamTargetModelTest_setHlsPlaybackUrl()
	{
		modelObject.setHlsPlaybackUrl("HlsPlaybackUrl");
		assertEquals(modelObject.getHlsPlaybackUrl(),"HlsPlaybackUrl");
	}
	@Test
	public void StreamTargetModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void StreamTargetModelTest_setLocation()
	{
		modelObject.setLocation(StreamTarget.LocationEnum.ASIA_PACIFIC_JAPAN);
		assertEquals(modelObject.getLocation(),StreamTarget.LocationEnum.ASIA_PACIFIC_JAPAN);
	}
	@Test
	public void StreamTargetModelTest_setName()
	{
		modelObject.setName("Name");
		assertEquals(modelObject.getName(),"Name");
	}
	@Test
	public void StreamTargetModelTest_setPassword()
	{
		modelObject.setPassword("Password");
		assertEquals(modelObject.getPassword(),"Password");
	}
	@Test
	public void StreamTargetModelTest_setPrimaryUrl()
	{
		modelObject.setPrimaryUrl("PrimaryUrl");
		assertEquals(modelObject.getPrimaryUrl(),"PrimaryUrl");
	}
	@Test
	public void StreamTargetModelTest_setProvider()
	{
		modelObject.setProvider("Provider");
		assertEquals(modelObject.getProvider(),"Provider");
	}
	@Test
	public void StreamTargetModelTest_setRtmpPlaybackUrl()
	{
		modelObject.setRtmpPlaybackUrl("RtmpPlaybackUrl");
		assertEquals(modelObject.getRtmpPlaybackUrl(),"RtmpPlaybackUrl");
	}
	@Test
	public void StreamTargetModelTest_setSecureIngestQueryParam()
	{
		modelObject.setSecureIngestQueryParam("SecureIngestQueryParam");
		assertEquals(modelObject.getSecureIngestQueryParam(),"SecureIngestQueryParam");
	}
	@Test
	public void StreamTargetModelTest_setStreamName()
	{
		modelObject.setStreamName("StreamName");
		assertEquals(modelObject.getStreamName(),"StreamName");
	}
	@Test
	public void StreamTargetModelTest_setType()
	{
		modelObject.setType(StreamTarget.TypeEnum.CUSTOMSTREAMTARGET);
		assertEquals(modelObject.getType(),StreamTarget.TypeEnum.CUSTOMSTREAMTARGET);
	}
	@Test
	public void StreamTargetModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void StreamTargetModelTest_setUseCors()
	{
		modelObject.setUseCors(true);
		assertEquals(modelObject.isUseCors(),true);
	}
	@Test
	public void StreamTargetModelTest_setUseSecureIngest()
	{
		modelObject.setUseSecureIngest(true);
		assertEquals(modelObject.isUseSecureIngest(),true);
	}
	@Test
	public void StreamTargetModelTest_setUsername()
	{
		modelObject.setUsername("Username");
		assertEquals(modelObject.getUsername(),"Username");
	}
}
