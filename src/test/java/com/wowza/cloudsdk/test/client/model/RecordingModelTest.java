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

public class RecordingModelTest {
	Recording modelObject = new Recording();

	@Test
	public void RecordingModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void RecordingModelTest_setDownloadUrl()
	{
		modelObject.setDownloadUrl("DownloadUrl");
		assertEquals(modelObject.getDownloadUrl(),"DownloadUrl");
	}
	@Test
	public void RecordingModelTest_setDuration()
	{
		modelObject.setDuration(1234567890L);
		assertEquals(modelObject.getDuration().longValue(),1234567890L);
	}
	@Test
	public void RecordingModelTest_setFileName()
	{
		modelObject.setFileName("FileName");
		assertEquals(modelObject.getFileName(),"FileName");
	}
	@Test
	public void RecordingModelTest_setFileSize()
	{
		modelObject.setFileSize(1234567890L);
		assertEquals(modelObject.getFileSize().longValue(),1234567890L);
	}
	@Test
	public void RecordingModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void RecordingModelTest_setReason()
	{
		modelObject.setReason("Reason");
		assertEquals(modelObject.getReason(),"Reason");
	}
	@Test
	public void RecordingModelTest_setStartsAt()
	{
		modelObject.setStartsAt("StartsAt");
		assertEquals(modelObject.getStartsAt(),"StartsAt");
	}
	@Test
	public void RecordingModelTest_setState()
	{
		modelObject.setState(Recording.StateEnum.COMPLETED);
		assertEquals(modelObject.getState(),Recording.StateEnum.COMPLETED);
	}
	@Test
	public void RecordingModelTest_setTranscoderId()
	{
		modelObject.setTranscoderId("TranscoderId");
		assertEquals(modelObject.getTranscoderId(),"TranscoderId");
	}
	@Test
	public void RecordingModelTest_setTranscoderName()
	{
		modelObject.setTranscoderName("TranscoderName");
		assertEquals(modelObject.getTranscoderName(),"TranscoderName");
	}
	@Test
	public void RecordingModelTest_setTranscodingUptimeId()
	{
		modelObject.setTranscodingUptimeId("timeStringType");
		assertEquals(modelObject.getTranscodingUptimeId(),"timeStringType");
	}
	@Test
	public void RecordingModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
}
