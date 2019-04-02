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

public class SchedulesModelTest {
	Schedules modelObject = new Schedules();

	@Test
	public void SchedulesModelTest_setSchedules()
	{
		List<Schedule> schedules = new ArrayList<Schedule>();
		Schedule schedule = new Schedule();
		schedule.setName("myTestSchedule");
		schedules.add(schedule);
		modelObject.setSchedules(schedules);
		assertEquals(modelObject.getSchedules().get(0).getName(),"myTestSchedule");
	}
}
