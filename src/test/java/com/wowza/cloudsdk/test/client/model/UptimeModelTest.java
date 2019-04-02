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

public class UptimeModelTest {
	Uptime modelObject = new Uptime();

	@Test
	public void UptimeModelTest_setBilled()
	{
		modelObject.setBilled(true);
		assertEquals(modelObject.isBilled(),true);
	}
	@Test
	public void UptimeModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void UptimeModelTest_setEndedAt()
	{
		modelObject.setEndedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getEndedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void UptimeModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void UptimeModelTest_setRunning()
	{
		modelObject.setRunning(true);
		assertEquals(modelObject.isRunning(),true);
	}
	@Test
	public void UptimeModelTest_setStartedAt()
	{
		modelObject.setStartedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getStartedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void UptimeModelTest_setTranscoderId()
	{
		modelObject.setTranscoderId("TranscoderId");
		assertEquals(modelObject.getTranscoderId(),"TranscoderId");
	}
	@Test
	public void UptimeModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt("UpdatedAt");
		assertEquals(modelObject.getUpdatedAt(),"UpdatedAt");
	}
}
