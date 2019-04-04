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

public class PropertyModelTest {
	Property modelObject = new Property();

	@Test
	public void PropertyModelTest_setKey()
	{
		modelObject.setKey(Property.KeyEnum.RELATIVEPLAYLISTS);
		assertEquals(modelObject.getKey(),Property.KeyEnum.RELATIVEPLAYLISTS);
	}
	@Test
	public void PropertyModelTest_setSection()
	{
		modelObject.setSection(Property.SectionEnum.PLAYLIST);
		assertEquals(modelObject.getSection(),Property.SectionEnum.PLAYLIST);
	}
	@Test
	public void PropertyModelTest_setValue()
	{
		modelObject.setValue("Value");
		assertEquals(modelObject.getValue(),"Value");
	}
}
