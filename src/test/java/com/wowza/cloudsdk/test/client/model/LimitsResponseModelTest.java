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

public class LimitsResponseModelTest {
	LimitsResponse modelObject = new LimitsResponse();

	@Test
	public void LimitsResponseModelTest_setCurrent()
	{
		ShmMetrics shmMetrics = new ShmMetrics();
		AudioCodecMetric audioCodecMetric = new AudioCodecMetric();
		audioCodecMetric.setStatus("newAudioCodec");
		shmMetrics.setAudioCodec(audioCodecMetric);
		modelObject.setCurrent(shmMetrics);
		assertEquals(modelObject.getCurrent().getAudioCodec().getStatus(),"newAudioCodec");
	}
	@Test
	public void LimitsResponseModelTest_setLimits()
	{
		Limits limits = new Limits();
		List<String> fields = new ArrayList<String>();
		fields.add("to");
		fields.add("from");
		fields.add("here");
		limits.setFields(fields);
		modelObject.setLimits(limits);
		assertEquals(modelObject.getLimits().getFields().get(1),"from");
	}
}

