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

public class StreamSourceModelTest {
	StreamSource modelObject = new StreamSource();

	@Test
	public void StreamSourceModelTest_setBackupIpAddress()
	{
		modelObject.setBackupIpAddress("BackupIpAddress");
		assertEquals(modelObject.getBackupIpAddress(),"BackupIpAddress");
	}
	@Test
	public void StreamSourceModelTest_setBackupUrl()
	{
		modelObject.setBackupUrl("BackupUrl");
		assertEquals(modelObject.getBackupUrl(),"BackupUrl");
	}
	@Test
	public void StreamSourceModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void StreamSourceModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void StreamSourceModelTest_setIpAddress()
	{
		modelObject.setIpAddress("IpAddress");
		assertEquals(modelObject.getIpAddress(),"IpAddress");
	}
	@Test
	public void StreamSourceModelTest_setLocation()
	{
		modelObject.setLocation(StreamSource.LocationEnum.ASIA_PACIFIC_JAPAN);
		assertEquals(modelObject.getLocation(),StreamSource.LocationEnum.ASIA_PACIFIC_JAPAN);
	}
	@Test
	public void StreamSourceModelTest_setLocationMethod()
	{
		modelObject.setLocationMethod(StreamSource.LocationMethodEnum.REGION);
		assertEquals(modelObject.getLocationMethod(),StreamSource.LocationMethodEnum.REGION);
	}
	@Test
	public void StreamSourceModelTest_setName()
	{
		modelObject.setName("Name");
		assertEquals(modelObject.getName(),"Name");
	}
	@Test
	public void StreamSourceModelTest_setPassword()
	{
		modelObject.setPassword("Password");
		assertEquals(modelObject.getPassword(),"Password");
	}
	@Test
	public void StreamSourceModelTest_setPlaybackUrl()
	{
		modelObject.setPlaybackUrl("PlaybackUrl");
		assertEquals(modelObject.getPlaybackUrl(),"PlaybackUrl");
	}
	@Test
	public void StreamSourceModelTest_setPrimaryUrl()
	{
		modelObject.setPrimaryUrl("PrimaryUrl");
		assertEquals(modelObject.getPrimaryUrl(),"PrimaryUrl");
	}
	@Test
	public void StreamSourceModelTest_setProvider()
	{
		modelObject.setProvider("Provider");
		assertEquals(modelObject.getProvider(),"Provider");
	}
	@Test
	public void StreamSourceModelTest_setStreamName()
	{
		modelObject.setStreamName("StreamName");
		assertEquals(modelObject.getStreamName(),"StreamName");
	}
	@Test
	public void StreamSourceModelTest_setType()
	{
		modelObject.setType(StreamSource.TypeEnum.AKAMAISTREAMSOURCE);
		assertEquals(modelObject.getType(),StreamSource.TypeEnum.AKAMAISTREAMSOURCE);
	}
	@Test
	public void StreamSourceModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void StreamSourceModelTest_setUsername()
	{
		modelObject.setUsername("Username");
		assertEquals(modelObject.getUsername(),"Username");
	}
}
