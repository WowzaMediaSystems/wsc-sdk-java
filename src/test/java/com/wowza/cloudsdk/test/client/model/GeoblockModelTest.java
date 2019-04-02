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

public class GeoblockModelTest {
	Geoblock modelObject = new Geoblock();

	@Test
	public void GeoblockModelTest_setCountries()
	{
		ArrayList<String> countries = new ArrayList<String>();
		countries.add("DE");
		modelObject.setCountries(countries);
		assertEquals(modelObject.getCountries().get(0),"DE");
	}
	@Test
	public void GeoblockModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void GeoblockModelTest_setState()
	{
		modelObject.setState(Geoblock.StateEnum.FAILED);
		assertEquals(modelObject.getState(),Geoblock.StateEnum.FAILED);
	}
	@Test
	public void GeoblockModelTest_setStreamTargetId()
	{
		modelObject.setStreamTargetId("StreamTargetId");
		assertEquals(modelObject.getStreamTargetId(),"StreamTargetId");
	}
	@Test
	public void GeoblockModelTest_setType()
	{
		modelObject.setType(Geoblock.TypeEnum.DENY);
		assertEquals(modelObject.getType(),Geoblock.TypeEnum.DENY);
	}
	@Test
	public void GeoblockModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
                Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
                assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void GeoblockModelTest_setWhitelist()
	{
		ArrayList<String> whiteList = new ArrayList<String>();
		whiteList.add("DE");
		modelObject.setWhitelist(whiteList);
		assertEquals(modelObject.getWhitelist().get(0),"DE");
	}
}
