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

public class UsageTimeTranscoderModelTest {
	UsageTimeTranscoder modelObject = new UsageTimeTranscoder();

	@Test
	public void UsageTimeTranscoderModelTest_setDeleted()
	{
		modelObject.setDeleted(true);
		assertEquals(modelObject.isDeleted(),true);
	}
	@Test
	public void UsageTimeTranscoderModelTest_setId()
	{
		modelObject.setId(12345);
		assertEquals(modelObject.getId().intValue(),12345);
	}
	@Test
	public void UsageTimeTranscoderModelTest_setName()
	{
		modelObject.setName("Name");
		assertEquals(modelObject.getName(),"Name");
	}
	@Test
	public void UsageTimeTranscoderModelTest_setSecondsBilled()
	{
		modelObject.setSecondsBilled(12345);
		assertEquals(modelObject.getSecondsBilled().intValue(),12345);
	}
	@Test
	public void UsageTimeTranscoderModelTest_setSecondsUsed()
	{
		modelObject.setSecondsUsed(12345);
		assertEquals(modelObject.getSecondsUsed().intValue(),12345);
	}
}
