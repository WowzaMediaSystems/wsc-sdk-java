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

import java.time.LocalDate;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

public class ScheduleModelTest {
	Schedule modelObject = new Schedule();

	@Test
	public void ScheduleModelTest_setActionType()
	{
		modelObject.setActionType(Schedule.ActionTypeEnum.STOP);
		assertEquals(modelObject.getActionType(),Schedule.ActionTypeEnum.STOP);
	}
	@Test
	public void ScheduleModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void ScheduleModelTest_setEndRepeat()
	{
		LocalDate locaDate = LocalDate.now();
		modelObject.setEndRepeat(locaDate);
		Timestamp timestamp = Timestamp.valueOf(modelObject.getEndRepeat().atStartOfDay());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void ScheduleModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void ScheduleModelTest_setName()
	{
		modelObject.setName("Name");
		assertEquals(modelObject.getName(),"Name");
	}
	@Test
	public void ScheduleModelTest_setRecurrenceData()
	{
		modelObject.setRecurrenceData(Schedule.RecurrenceDataEnum.TUESDAY.toString());
		assertEquals(modelObject.getRecurrenceData(),Schedule.RecurrenceDataEnum.TUESDAY.toString());
	}
	@Test
	public void ScheduleModelTest_setRecurrenceType()
	{
		modelObject.setRecurrenceType(Schedule.RecurrenceTypeEnum.ONCE);
		assertEquals(modelObject.getRecurrenceType(),Schedule.RecurrenceTypeEnum.ONCE);
	}
	@Test
	public void ScheduleModelTest_setStartRepeat()
	{
                LocalDate locaDate = LocalDate.now();
                modelObject.setStartRepeat(locaDate);
                Timestamp timestamp = Timestamp.valueOf(modelObject.getStartRepeat().atStartOfDay());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void ScheduleModelTest_setStartTranscoder()
	{
		modelObject.setStartTranscoder(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getStartTranscoder().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void ScheduleModelTest_setState()
	{
		modelObject.setState(Schedule.StateEnum.EXPIRED);
		assertEquals(modelObject.getState(),Schedule.StateEnum.EXPIRED);
	}
	@Test
	public void ScheduleModelTest_setStopTranscoder()
	{
		modelObject.setStopTranscoder(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getStopTranscoder().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void ScheduleModelTest_setTranscoderId()
	{
		modelObject.setTranscoderId("TranscoderId");
		assertEquals(modelObject.getTranscoderId(),"TranscoderId");
	}
	@Test
	public void ScheduleModelTest_setTranscoderName()
	{
		modelObject.setTranscoderName("TranscoderName");
		assertEquals(modelObject.getTranscoderName(),"TranscoderName");
	}
	@Test
	public void ScheduleModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
}
