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

public class TranscoderModelTest {
	Transcoder modelObject = new Transcoder();

	@Test
	public void TranscoderModelTest_setApplicationName()
	{
		modelObject.setApplicationName("ApplicationName");
		assertEquals(modelObject.getApplicationName(),"ApplicationName");
	}
	@Test
	public void TranscoderModelTest_setBillingMode()
	{
		modelObject.setBillingMode(Transcoder.BillingModeEnum.TWENTYFOUR_SEVEN);
		assertEquals(modelObject.getBillingMode(),Transcoder.BillingModeEnum.TWENTYFOUR_SEVEN);
	}
	@Test
	public void TranscoderModelTest_setBroadcastLocation()
	{
		modelObject.setBroadcastLocation(Transcoder.BroadcastLocationEnum.EU_BELGIUM);
		assertEquals(modelObject.getBroadcastLocation(),Transcoder.BroadcastLocationEnum.EU_BELGIUM);
	}
	@Test
	public void TranscoderModelTest_setBufferSize()
	{
		modelObject.setBufferSize(Transcoder.BufferSizeEnum.NUMBER_1000);
		assertEquals(modelObject.getBufferSize(),Transcoder.BufferSizeEnum.NUMBER_1000);
	}
	@Test
	public void TranscoderModelTest_setClosedCaptionType()
	{
		modelObject.setClosedCaptionType(Transcoder.ClosedCaptionTypeEnum.CEA);
		assertEquals(modelObject.getClosedCaptionType(),Transcoder.ClosedCaptionTypeEnum.CEA);
	}
	@Test
	public void TranscoderModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void TranscoderModelTest_setDeliveryMethod()
	{
		modelObject.setDeliveryMethod(Transcoder.DeliveryMethodEnum.PULL);
		assertEquals(modelObject.getDeliveryMethod(),Transcoder.DeliveryMethodEnum.PULL);
	}
	@Test
	public void TranscoderModelTest_setDeliveryProtocols()
	{
		List<String> protocols = new ArrayList<String>();
		protocols.add("protocol");
		modelObject.setDeliveryProtocols(protocols);
		assertEquals(modelObject.getDeliveryProtocols().get(0),"protocol");
	}
	@Test
	public void TranscoderModelTest_setDescription()
	{
		modelObject.setDescription("Description");
		assertEquals(modelObject.getDescription(),"Description");
	}
	@Test
	public void TranscoderModelTest_setDirectPlaybackUrls()
	{
		HashMap<String,List<PlaybackUrl>> directPlaybackUrls = new HashMap<String,List<PlaybackUrl>>();
		String type = "rtmp";
		List <PlaybackUrl> playbackUrls = new ArrayList<PlaybackUrl>();
		PlaybackUrl playbackUrl = new PlaybackUrl();
		playbackUrl.setName("playbackUrlName");
		playbackUrls.add(playbackUrl);
		directPlaybackUrls.put(type,playbackUrls);
		modelObject.setDirectPlaybackUrls(directPlaybackUrls);
		assertEquals(modelObject.getDirectPlaybackUrls().get("rtmp").get(0).getName(),"playbackUrlName");
	}
	@Test
	public void TranscoderModelTest_setDisableAuthentication()
	{
		modelObject.setDisableAuthentication(true);
		assertEquals(modelObject.isDisableAuthentication(),true);
	}
	@Test
	public void TranscoderModelTest_setDomainName()
	{
		modelObject.setDomainName("DomainName");
		assertEquals(modelObject.getDomainName(),"DomainName");
	}
	@Test
	public void TranscoderModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void TranscoderModelTest_setIdleTimeout()
	{
		modelObject.setIdleTimeout(12345);
		assertEquals(modelObject.getIdleTimeout().intValue(),12345);
	}
	@Test
	public void TranscoderModelTest_setLowLatency()
	{
		modelObject.setLowLatency(true);
		assertEquals(modelObject.isLowLatency(),true);
	}
	@Test
	public void TranscoderModelTest_setName()
	{
		modelObject.setName("Name");
		assertEquals(modelObject.getName(),"Name");
	}
	@Test
	public void TranscoderModelTest_setOutputs()
	{
		List<Output> outputs = new ArrayList<Output>();
		Output output = new Output();
		output.setName("outputName");
		outputs.add(output);
		modelObject.setOutputs(outputs);
		assertEquals(modelObject.getOutputs().get(0).getName(),"outputName");
	}
	@Test
	public void TranscoderModelTest_setPassword()
	{
		modelObject.setPassword("Password");
		assertEquals(modelObject.getPassword(),"Password");
	}
	@Test
	public void TranscoderModelTest_setPlayMaximumConnections()
	{
		modelObject.setPlayMaximumConnections(Transcoder.PlayMaximumConnectionsEnum.NUMBER_14);
		assertEquals(modelObject.getPlayMaximumConnections(),Transcoder.PlayMaximumConnectionsEnum.NUMBER_14);
	}
	@Test
	public void TranscoderModelTest_setProtocol()
	{
		modelObject.setProtocol(Transcoder.ProtocolEnum.RTSP);
		assertEquals(modelObject.getProtocol(),Transcoder.ProtocolEnum.RTSP);
	}
	@Test
	public void TranscoderModelTest_setRecording()
	{
		modelObject.setRecording(true);
		assertEquals(modelObject.isRecording(),true);
	}
	@Test
	public void TranscoderModelTest_setSourcePort()
	{
		modelObject.setSourcePort(12345);
		assertEquals(modelObject.getSourcePort().intValue(),12345);
	}
	@Test
	public void TranscoderModelTest_setSourceUrl()
	{
		modelObject.setSourceUrl("SourceUrl");
		assertEquals(modelObject.getSourceUrl(),"SourceUrl");
	}
	@Test
	public void TranscoderModelTest_setStreamExtension()
	{
		modelObject.setStreamExtension("StreamExtension");
		assertEquals(modelObject.getStreamExtension(),"StreamExtension");
	}
	@Test
	public void TranscoderModelTest_setStreamName()
	{
		modelObject.setStreamName("StreamName");
		assertEquals(modelObject.getStreamName(),"StreamName");
	}
	@Test
	public void TranscoderModelTest_setStreamSmoother()
	{
		modelObject.setStreamSmoother(true);
		assertEquals(modelObject.isStreamSmoother(),true);
	}
	@Test
	public void TranscoderModelTest_setStreamSourceId()
	{
		modelObject.setStreamSourceId("StreamSourceId");
		assertEquals(modelObject.getStreamSourceId(),"StreamSourceId");
	}
	@Test
	public void TranscoderModelTest_setSuppressStreamTargetStart()
	{
		modelObject.setSuppressStreamTargetStart(true);
		assertEquals(modelObject.isSuppressStreamTargetStart(),true);
	}
	@Test
	public void TranscoderModelTest_setTranscoderType()
	{
		modelObject.setTranscoderType(Transcoder.TranscoderTypeEnum.PASSTHROUGH);
		assertEquals(modelObject.getTranscoderType(),Transcoder.TranscoderTypeEnum.PASSTHROUGH);
	}
	@Test
	public void TranscoderModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void TranscoderModelTest_setUsername()
	{
		modelObject.setUsername("Username");
		assertEquals(modelObject.getUsername(),"Username");
	}
	@Test
	public void TranscoderModelTest_setWatermark()
	{
		modelObject.setWatermark(true);
		assertEquals(modelObject.isWatermark(),true);
	}
	@Test
	public void TranscoderModelTest_setWatermarkHeight()
	{
		modelObject.setWatermarkHeight(12345);
		assertEquals(modelObject.getWatermarkHeight().intValue(),12345);
	}
	@Test
	public void TranscoderModelTest_setWatermarkImageUrl()
	{
		modelObject.setWatermarkImageUrl("WatermarkImageUrl");
		assertEquals(modelObject.getWatermarkImageUrl(),"WatermarkImageUrl");
	}
	@Test
	public void TranscoderModelTest_setWatermarkOpacity()
	{
		modelObject.setWatermarkOpacity(Transcoder.WatermarkOpacityEnum.NUMBER_4);
		assertEquals(modelObject.getWatermarkOpacity(),Transcoder.WatermarkOpacityEnum.NUMBER_4);
	}
	@Test
	public void TranscoderModelTest_setWatermarkPosition()
	{
		modelObject.setWatermarkPosition(Transcoder.WatermarkPositionEnum.BOTTOM_RIGHT);
		assertEquals(modelObject.getWatermarkPosition(),Transcoder.WatermarkPositionEnum.BOTTOM_RIGHT);
	}
	@Test
	public void TranscoderModelTest_setWatermarkWidth()
	{
		modelObject.setWatermarkWidth(12345);
		assertEquals(modelObject.getWatermarkWidth().intValue(),12345);
	}
}
