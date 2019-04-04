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

public class UrlModelTest {
	Url modelObject = new Url();

	@Test
	public void UrlModelTest_setBitrate()
	{
		modelObject.setBitrate(12345);
		assertEquals(modelObject.getBitrate().intValue(),12345);
	}
	@Test
	public void UrlModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void UrlModelTest_setHeight()
	{
		modelObject.setHeight(12345);
		assertEquals(modelObject.getHeight().intValue(),12345);
	}
	@Test
	public void UrlModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void UrlModelTest_setLabel()
	{
		modelObject.setLabel("Label");
		assertEquals(modelObject.getLabel(),"Label");
	}
	@Test
	public void UrlModelTest_setPlayerId()
	{
		modelObject.setPlayerId("PlayerId");
		assertEquals(modelObject.getPlayerId(),"PlayerId");
	}
	@Test
	public void UrlModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void UrlModelTest_setUrl()
	{
		modelObject.setUrl("Url");
		assertEquals(modelObject.getUrl(),"Url");
	}
	@Test
	public void UrlModelTest_setWidth()
	{
		modelObject.setWidth(12345);
		assertEquals(modelObject.getWidth().intValue(),12345);
	}
}
