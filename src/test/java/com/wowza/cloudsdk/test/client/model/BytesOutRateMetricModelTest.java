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

public class BytesOutRateMetricModelTest {
	BytesOutRateMetric modelObject = new BytesOutRateMetric();

	@Test
	public void BytesOutRateMetricModelTest_setStatus()
	{
		modelObject.setStatus("Status");
		assertEquals(modelObject.getStatus(),"Status");
	}
	@Test
	public void BytesOutRateMetricModelTest_setText()
	{
		modelObject.setText("Text");
		assertEquals(modelObject.getText(),"Text");
	}
	@Test
	public void BytesOutRateMetricModelTest_setUnits()
	{
		modelObject.setUnits("Units");
		assertEquals(modelObject.getUnits(),"Units");
	}
	@Test
	public void BytesOutRateMetricModelTest_setValue()
	{
		modelObject.setValue(12F);
		assertEquals(modelObject.getValue(),12F,0);
	}
}
