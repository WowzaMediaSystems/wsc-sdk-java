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

public class StreamTargetMetricsModelTest {
	StreamTargetMetrics modelObject = new StreamTargetMetrics();

	@Test
	public void StreamTargetMetricsModelTest_setAverageBytesIn()
	{
		modelObject.setAverageBytesIn(1234.45F);
		assertEquals(modelObject.getAverageBytesIn().floatValue(),1234.45F,0);
	}
	@Test
	public void StreamTargetMetricsModelTest_setAverageTotalConnections()
	{
		modelObject.setAverageTotalConnections(1234.45F);
		assertEquals(modelObject.getAverageTotalConnections().floatValue(),1234.45F,0);
	}
	@Test
	public void StreamTargetMetricsModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void StreamTargetMetricsModelTest_setDroppedConnections()
	{
		modelObject.setDroppedConnections(12345);
		assertEquals(modelObject.getDroppedConnections().intValue(),12345);
	}
	@Test
	public void StreamTargetMetricsModelTest_setMaximumTotalConnections()
	{
		modelObject.setMaximumTotalConnections(12345);
		assertEquals(modelObject.getMaximumTotalConnections().intValue(),12345);
	}
	@Test
	public void StreamTargetMetricsModelTest_setMinimumTotalConnections()
	{
		modelObject.setMinimumTotalConnections(12345);
		assertEquals(modelObject.getMinimumTotalConnections().intValue(),12345);
	}
	@Test
	public void StreamTargetMetricsModelTest_setNewConnections()
	{
		modelObject.setNewConnections(12345);
		assertEquals(modelObject.getNewConnections().intValue(),12345);
	}
}
