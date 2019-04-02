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

public class MetaModelTest {
	Meta modelObject = new Meta();

	@Test
	public void MetaModelTest_setStatus()
	{
		modelObject.setStatus(12345);
		assertEquals(modelObject.getStatus().intValue(),12345);
	}
	@Test
	public void MetaModelTest_setCode()
	{
		modelObject.setCode("Code");
		assertEquals(modelObject.getCode(),"Code");
	}
	@Test
	public void MetaModelTest_setTitle()
	{
		modelObject.setTitle("Title");
		assertEquals(modelObject.getTitle(),"Title");
	}
	@Test
	public void MetaModelTest_setMessage()
	{
		modelObject.setMessage("Message");
		assertEquals(modelObject.getMessage(),"Message");
	}
	@Test
	public void MetaModelTest_setDescription()
	{
		modelObject.setDescription("Description");
		assertEquals(modelObject.getDescription(),"Description");
	}
}
