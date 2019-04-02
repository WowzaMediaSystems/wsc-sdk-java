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

public class TranscodersModelTest {
	Transcoders modelObject = new Transcoders();

	@Test
	public void TranscodersModelTest_setTranscoders()
	{
		List<IndexTranscoder> indexTranscoders = new ArrayList<IndexTranscoder>();
		IndexTranscoder indexTranscoder = new IndexTranscoder();
		indexTranscoder.setName("indexTranscoderName");
		indexTranscoders.add(indexTranscoder);
		modelObject.setTranscoders(indexTranscoders);
		assertEquals(modelObject.getTranscoders().get(0).getName(),"indexTranscoderName");
	}
}
