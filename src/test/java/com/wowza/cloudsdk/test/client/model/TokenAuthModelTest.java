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

public class TokenAuthModelTest {
	TokenAuth modelObject = new TokenAuth();

	@Test
	public void TokenAuthModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void TokenAuthModelTest_setEnabled()
	{
		modelObject.setEnabled(true);
		assertEquals(modelObject.isEnabled(),true);
	}
	@Test
	public void TokenAuthModelTest_setStreamTargetId()
	{
		modelObject.setStreamTargetId("StreamTargetId");
		assertEquals(modelObject.getStreamTargetId(),"StreamTargetId");
	}
	@Test
	public void TokenAuthModelTest_setTrustedSharedSecret()
	{
		modelObject.setTrustedSharedSecret("TrustedSharedSecret");
		assertEquals(modelObject.getTrustedSharedSecret(),"TrustedSharedSecret");
	}
	@Test
	public void TokenAuthModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
}
