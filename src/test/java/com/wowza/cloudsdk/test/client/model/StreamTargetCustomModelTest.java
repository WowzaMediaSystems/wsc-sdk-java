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

public class StreamTargetCustomModelTest {
	StreamTargetCustom modelObject = new StreamTargetCustom();

	@Test
	public void StreamTargetCustomModelTest_setBackupUrl()
	{
		modelObject.setBackupUrl("BackupUrl");
		assertEquals(modelObject.getBackupUrl(),"BackupUrl");
	}
	@Test
	public void StreamTargetCustomModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void StreamTargetCustomModelTest_setHdsPlaybackUrl()
	{
		modelObject.setHdsPlaybackUrl("HdsPlaybackUrl");
		assertEquals(modelObject.getHdsPlaybackUrl(),"HdsPlaybackUrl");
	}
	@Test
	public void StreamTargetCustomModelTest_setHlsPlaybackUrl()
	{
		modelObject.setHlsPlaybackUrl("HlsPlaybackUrl");
		assertEquals(modelObject.getHlsPlaybackUrl(),"HlsPlaybackUrl");
	}
	@Test
	public void StreamTargetCustomModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void StreamTargetCustomModelTest_setName()
	{
		modelObject.setName("Name");
		assertEquals(modelObject.getName(),"Name");
	}
	@Test
	public void StreamTargetCustomModelTest_setPassword()
	{
		modelObject.setPassword("Password");
		assertEquals(modelObject.getPassword(),"Password");
	}
	@Test
	public void StreamTargetCustomModelTest_setPrimaryUrl()
	{
		modelObject.setPrimaryUrl("PrimaryUrl");
		assertEquals(modelObject.getPrimaryUrl(),"PrimaryUrl");
	}
	@Test
	public void StreamTargetCustomModelTest_setProvider()
	{
		modelObject.setProvider("Provider");
		assertEquals(modelObject.getProvider(),"Provider");
	}
	@Test
	public void StreamTargetCustomModelTest_setRtmpPlaybackUrl()
	{
		modelObject.setRtmpPlaybackUrl("RtmpPlaybackUrl");
		assertEquals(modelObject.getRtmpPlaybackUrl(),"RtmpPlaybackUrl");
	}
	@Test
	public void StreamTargetCustomModelTest_setStreamName()
	{
		modelObject.setStreamName("StreamName");
		assertEquals(modelObject.getStreamName(),"StreamName");
	}
	@Test
	public void StreamTargetCustomModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void StreamTargetCustomModelTest_setUsername()
	{
		modelObject.setUsername("Username");
		assertEquals(modelObject.getUsername(),"Username");
	}
}
