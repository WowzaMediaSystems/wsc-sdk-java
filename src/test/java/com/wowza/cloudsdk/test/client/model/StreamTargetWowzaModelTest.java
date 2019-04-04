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

public class StreamTargetWowzaModelTest {
	StreamTargetWowza modelObject = new StreamTargetWowza();

	@Test
	public void StreamTargetWowzaModelTest_setName()
	{
		modelObject.setName("Name");
		assertEquals(modelObject.getName(),"Name");
	}
	@Test
	public void StreamTargetWowzaModelTest_setLocation()
	{
		modelObject.setLocation(StreamTargetWowza.LocationEnum.ASIA_PACIFIC_JAPAN);
		assertEquals(modelObject.getLocation(),StreamTargetWowza.LocationEnum.ASIA_PACIFIC_JAPAN);
	}
	@Test
	public void StreamTargetWowzaModelTest_setProvider()
	{
		modelObject.setProvider(StreamTargetWowza.ProviderEnum.AKAMAI_LEGACY_RTMP);
		assertEquals(modelObject.getProvider(),StreamTargetWowza.ProviderEnum.AKAMAI_LEGACY_RTMP);
	}
	@Test
	public void StreamTargetWowzaModelTest_setUseCors()
	{
		modelObject.setUseCors(true);
		assertEquals(modelObject.isUseCors(),true);
	}
	@Test
	public void StreamTargetWowzaModelTest_setUseSecureIngest()
	{
		modelObject.setUseSecureIngest(true);
		assertEquals(modelObject.isUseSecureIngest(),true);
	}
}
