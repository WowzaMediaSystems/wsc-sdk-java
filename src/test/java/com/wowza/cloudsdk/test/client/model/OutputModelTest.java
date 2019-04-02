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

public class OutputModelTest {
	Output modelObject = new Output();

	@Test
	public void OutputModelTest_setAspectRatioHeight()
	{
		modelObject.setAspectRatioHeight(12345);
		assertEquals(modelObject.getAspectRatioHeight().intValue(),12345);
	}
	@Test
	public void OutputModelTest_setAspectRatioWidth()
	{
		modelObject.setAspectRatioWidth(12345);
		assertEquals(modelObject.getAspectRatioWidth().intValue(),12345);
	}
	@Test
	public void OutputModelTest_setBitrateAudio()
	{
		modelObject.setBitrateAudio(12345);
		assertEquals(modelObject.getBitrateAudio().intValue(),12345);
	}
	@Test
	public void OutputModelTest_setBitrateVideo()
	{
		modelObject.setBitrateVideo(12345);
		assertEquals(modelObject.getBitrateVideo().intValue(),12345);
	}
	@Test
	public void OutputModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void OutputModelTest_setFramerateReduction()
	{
		modelObject.setFramerateReduction(Output.FramerateReductionEnum._1_2);
		assertEquals(modelObject.getFramerateReduction(),Output.FramerateReductionEnum._1_2);
	}
	@Test
	public void OutputModelTest_setH264Profile()
	{
		modelObject.setH264Profile(Output.H264ProfileEnum.HIGH);
		assertEquals(modelObject.getH264Profile(),Output.H264ProfileEnum.HIGH);
	}
	@Test
	public void OutputModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void OutputModelTest_setKeyframes()
	{
		modelObject.setKeyframes(Output.KeyframesEnum._30);
		assertEquals(modelObject.getKeyframes(),Output.KeyframesEnum._30);
	}
	@Test
	public void OutputModelTest_setName()
	{
		modelObject.setName("Name");
		assertEquals(modelObject.getName(),"Name");
	}
	@Test
	public void OutputModelTest_setOutputStreamTargets()
	{
		List<OutputStreamTarget> outputStreamTargets = new ArrayList<OutputStreamTarget>();
		OutputStreamTarget outputStreamTarget = new OutputStreamTarget();
		outputStreamTarget.setId("streamTarget");
		outputStreamTargets.add(outputStreamTarget);
		modelObject.setOutputStreamTargets(outputStreamTargets);
		assertEquals(modelObject.getOutputStreamTargets().get(0).getId(),"streamTarget");
	}
	@Test
	public void OutputModelTest_setPassthroughAudio()
	{
		modelObject.setPassthroughAudio(true);
		assertEquals(modelObject.isPassthroughAudio(),true);
	}
	@Test
	public void OutputModelTest_setPassthroughVideo()
	{
		modelObject.setPassthroughVideo(true);
		assertEquals(modelObject.isPassthroughVideo(),true);
	}
	@Test
	public void OutputModelTest_setStreamFormat()
	{
		modelObject.setStreamFormat(Output.StreamFormatEnum.AUDIOONLY);
		assertEquals(modelObject.getStreamFormat(),Output.StreamFormatEnum.AUDIOONLY);
	}
	@Test
	public void OutputModelTest_setTranscoderId()
	{
		modelObject.setTranscoderId("TranscoderId");
		assertEquals(modelObject.getTranscoderId(),"TranscoderId");
	}
	@Test
	public void OutputModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
}
