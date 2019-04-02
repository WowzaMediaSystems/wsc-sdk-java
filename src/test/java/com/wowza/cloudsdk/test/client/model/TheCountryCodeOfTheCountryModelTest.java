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

public class TheCountryCodeOfTheCountryModelTest {
	TheCountryCodeOfTheCountry modelObject = new TheCountryCodeOfTheCountry();

	@Test
	public void TheCountryCodeOfTheCountryModelTest_setName()
	{
		modelObject.setName("Name");
		assertEquals(modelObject.getName(),"Name");
	}
	@Test
	public void TheCountryCodeOfTheCountryModelTest_setPercentageViewers()
	{
		modelObject.setPercentageViewers(12345);
		assertEquals(modelObject.getPercentageViewers().intValue(),12345);
	}
	@Test
	public void TheCountryCodeOfTheCountryModelTest_setPercentageViewingTime()
	{
		modelObject.setPercentageViewingTime(12345);
		assertEquals(modelObject.getPercentageViewingTime().intValue(),12345);
	}
	@Test
	public void TheCountryCodeOfTheCountryModelTest_setProtocols()
	{
		UsageViewerDataProtocols usageViewerDataProtocols = new UsageViewerDataProtocols();
		ProtocolObject protocolObject = new ProtocolObject();
		TheNameOfTheProtocol protocolName = new TheNameOfTheProtocol();
		protocolName.setName("protocolNameHere");
		protocolObject.setProtocolName(protocolName);
		usageViewerDataProtocols.add(protocolObject);
		modelObject.setProtocols(usageViewerDataProtocols);
		assertEquals(modelObject.getProtocols().get(0).getProtocolName().getName(),"protocolNameHere");
	}
	@Test
	public void TheCountryCodeOfTheCountryModelTest_setSecondsAvgViewingTime()
	{
		modelObject.setSecondsAvgViewingTime(12345);
		assertEquals(modelObject.getSecondsAvgViewingTime().intValue(),12345);
	}
	@Test
	public void TheCountryCodeOfTheCountryModelTest_setSecondsTotalViewingTime()
	{
		modelObject.setSecondsTotalViewingTime(12345);
		assertEquals(modelObject.getSecondsTotalViewingTime().intValue(),12345);
	}
	@Test
	public void TheCountryCodeOfTheCountryModelTest_setTotalUniqueViewers()
	{
		modelObject.setTotalUniqueViewers(12345);
		assertEquals(modelObject.getTotalUniqueViewers().intValue(),12345);
	}
}
