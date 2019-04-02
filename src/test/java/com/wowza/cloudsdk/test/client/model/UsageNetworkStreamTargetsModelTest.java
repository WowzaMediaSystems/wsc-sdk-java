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

public class UsageNetworkStreamTargetsModelTest {
	UsageNetworkStreamTargets modelObject = new UsageNetworkStreamTargets();

	@Test
	public void UsageNetworkStreamTargetsModelTest_setTotal()
	{
		HashOfTotals hashOfTotals = new HashOfTotals();
		hashOfTotals.setBytesBilled(12345);
		modelObject.setTotal(hashOfTotals);
		assertEquals(modelObject.getTotal().getBytesBilled().intValue(),12345);
	}
	@Test
	public void UsageNetworkStreamTargetsModelTest_setStreamTargets()
	{
		List<UsageNetworkStreamTarget> usageNetworkStreamTargets = new ArrayList<UsageNetworkStreamTarget>();
		UsageNetworkStreamTarget usageNetworkStreamTarget = new UsageNetworkStreamTarget();
		usageNetworkStreamTarget.setBytesBilled(12345);
		usageNetworkStreamTargets.add(usageNetworkStreamTarget);
		modelObject.setStreamTargets(usageNetworkStreamTargets);
		assertEquals(modelObject.getStreamTargets().get(0).getBytesBilled().intValue(),12345);
	}
}
