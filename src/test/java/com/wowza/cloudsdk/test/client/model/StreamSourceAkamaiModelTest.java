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

public class StreamSourceAkamaiModelTest {
	StreamSourceAkamai modelObject = new StreamSourceAkamai();

	@Test
	public void StreamSourceAkamaiModelTest_setBackupIpAddress()
	{
		modelObject.setBackupIpAddress("BackupIpAddress");
		assertEquals(modelObject.getBackupIpAddress(),"BackupIpAddress");
	}
	@Test
	public void StreamSourceAkamaiModelTest_setBackupUrl()
	{
		modelObject.setBackupUrl("BackupUrl");
		assertEquals(modelObject.getBackupUrl(),"BackupUrl");
	}
	@Test
	public void StreamSourceAkamaiModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void StreamSourceAkamaiModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void StreamSourceAkamaiModelTest_setIpAddress()
	{
		modelObject.setIpAddress("IpAddress");
		assertEquals(modelObject.getIpAddress(),"IpAddress");
	}
	@Test
	public void StreamSourceAkamaiModelTest_setLocation()
	{
		modelObject.setLocation(StreamSourceAkamai.LocationEnum.ASIA_PACIFIC_SINGAPORE);
		assertEquals(modelObject.getLocation(),StreamSourceAkamai.LocationEnum.ASIA_PACIFIC_SINGAPORE);
	}
	@Test
	public void StreamSourceAkamaiModelTest_setLocationMethod()
	{
		modelObject.setLocationMethod(StreamSourceAkamai.LocationMethodEnum.IP_ADDRESS);
		assertEquals(modelObject.getLocationMethod(),StreamSourceAkamai.LocationMethodEnum.IP_ADDRESS);
	}
	@Test
	public void StreamSourceAkamaiModelTest_setName()
	{
		modelObject.setName("Name");
		assertEquals(modelObject.getName(),"Name");
	}
	@Test
	public void StreamSourceAkamaiModelTest_setPassword()
	{
		modelObject.setPassword("Password");
		assertEquals(modelObject.getPassword(),"Password");
	}
	@Test
	public void StreamSourceAkamaiModelTest_setPlaybackUrl()
	{
		modelObject.setPlaybackUrl("PlaybackUrl");
		assertEquals(modelObject.getPlaybackUrl(),"PlaybackUrl");
	}
	@Test
	public void StreamSourceAkamaiModelTest_setPrimaryUrl()
	{
		modelObject.setPrimaryUrl("PrimaryUrl");
		assertEquals(modelObject.getPrimaryUrl(),"PrimaryUrl");
	}
	@Test
	public void StreamSourceAkamaiModelTest_setProvider()
	{
		modelObject.setProvider("Provider");
		assertEquals(modelObject.getProvider(),"Provider");
	}
	@Test
	public void StreamSourceAkamaiModelTest_setStreamName()
	{
		modelObject.setStreamName("StreamName");
		assertEquals(modelObject.getStreamName(),"StreamName");
	}
	@Test
	public void StreamSourceAkamaiModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void StreamSourceAkamaiModelTest_setUsername()
	{
		modelObject.setUsername("Username");
		assertEquals(modelObject.getUsername(),"Username");
	}
}
