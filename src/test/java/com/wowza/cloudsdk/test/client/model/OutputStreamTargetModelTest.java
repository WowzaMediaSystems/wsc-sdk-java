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

public class OutputStreamTargetModelTest {
	OutputStreamTarget modelObject = new OutputStreamTarget();

	@Test
	public void OutputStreamTargetModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void OutputStreamTargetModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void OutputStreamTargetModelTest_setOutputId()
	{
		modelObject.setOutputId("OutputId");
		assertEquals(modelObject.getOutputId(),"OutputId");
	}
	@Test
	public void OutputStreamTargetModelTest_setStreamTarget()
	{
		OutputStreamTarget modelObject = new OutputStreamTarget();
		StreamTarget streamTarget = new StreamTarget();
		streamTarget.setConnectionCode("connectionCode1234");
		modelObject.setStreamTarget(streamTarget);
		assertEquals(modelObject.getStreamTarget().getConnectionCode(),"connectionCode1234");
	}
	@Test
	public void OutputStreamTargetModelTest_setStreamTargetId()
	{
		modelObject.setStreamTargetId("StreamTargetId");
		assertEquals(modelObject.getStreamTargetId(),"StreamTargetId");
	}
	@Test
	public void OutputStreamTargetModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void OutputStreamTargetModelTest_setUseStreamTargetBackupUrl()
	{
		modelObject.setUseStreamTargetBackupUrl(true);
		assertEquals(modelObject.isUseStreamTargetBackupUrl(),true);
	}
}
