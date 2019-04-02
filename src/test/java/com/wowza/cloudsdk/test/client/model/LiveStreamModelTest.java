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

public class LiveStreamModelTest {
	LiveStream modelObject = new LiveStream();

	@Test
	public void LiveStreamModelTest_setAspectRatioHeight()
	{
		modelObject.setAspectRatioHeight(12345);
		assertEquals(modelObject.getAspectRatioHeight().intValue(),12345);
	}
	@Test
	public void LiveStreamModelTest_setAspectRatioWidth()
	{
		modelObject.setAspectRatioWidth(12345);
		assertEquals(modelObject.getAspectRatioWidth().intValue(),12345);
	}
	@Test
	public void LiveStreamModelTest_setBillingMode()
	{
		modelObject.setBillingMode(LiveStream.BillingModeEnum.PAY_AS_YOU_GO);
		assertEquals(modelObject.getBillingMode(),LiveStream.BillingModeEnum.PAY_AS_YOU_GO);
	}
	@Test
	public void LiveStreamModelTest_setBroadcastLocation()
	{
		modelObject.setBroadcastLocation(LiveStream.BroadcastLocationEnum.EU_BELGIUM);
		assertEquals(modelObject.getBroadcastLocation(),LiveStream.BroadcastLocationEnum.EU_BELGIUM);
	}
	@Test
	public void LiveStreamModelTest_setClosedCaptionType()
	{
		modelObject.setClosedCaptionType(LiveStream.ClosedCaptionTypeEnum.BOTH);
		assertEquals(modelObject.getClosedCaptionType(),LiveStream.ClosedCaptionTypeEnum.BOTH);
	}
	@Test
	public void LiveStreamModelTest_setConnectionCode()
	{
		modelObject.setConnectionCode("ConnectionCode");
		assertEquals(modelObject.getConnectionCode(),"ConnectionCode");
	}
	@Test
	public void LiveStreamModelTest_setConnectionCodeExpiresAt()
	{
		modelObject.setConnectionCodeExpiresAt(OffsetDateTime.now());
	        Timestamp timestamp = Timestamp.valueOf(modelObject.getConnectionCodeExpiresAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
       		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void LiveStreamModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void LiveStreamModelTest_setDeliveryMethod()
	{
		modelObject.setDeliveryMethod(LiveStream.DeliveryMethodEnum.CDN);
		assertEquals(modelObject.getDeliveryMethod(),LiveStream.DeliveryMethodEnum.CDN);
	}
	@Test
	public void LiveStreamModelTest_setDeliveryProtocols()
	{
		List<String> deliveryProtocols = new ArrayList<String>();
		deliveryProtocols.add("deliver1");
		modelObject.setDeliveryProtocols(deliveryProtocols);
		assertEquals(modelObject.getDeliveryProtocols().get(0),"deliver1");
	}
	@Test
	public void LiveStreamModelTest_setDeliveryType()
	{
		modelObject.setDeliveryType(LiveStream.DeliveryTypeEnum.MULTI_BITRATE);
		assertEquals(modelObject.getDeliveryType(),LiveStream.DeliveryTypeEnum.MULTI_BITRATE);
	}
	@Test
	public void LiveStreamModelTest_setDirectPlaybackUrls()
	{
		HashMap<String,List<PlaybackUrl>> directPlaybackUrls = new HashMap<String,List<PlaybackUrl>>();
		String type = "rtmp";
		List<PlaybackUrl> playbackUrls = new ArrayList<PlaybackUrl>();
		PlaybackUrl playUrl = new PlaybackUrl();
		playUrl.setOutputId("uniqueOutputId");
		playbackUrls.add(playUrl);
		directPlaybackUrls.put(type,playbackUrls);
		modelObject.setDirectPlaybackUrls(directPlaybackUrls);
		assertEquals(modelObject.getDirectPlaybackUrls().get(type).get(0).getOutputId(),"uniqueOutputId");
	}
	@Test
	public void LiveStreamModelTest_setEncoder()
	{
		modelObject.setEncoder(LiveStream.EncoderEnum.WOWZA_GOCODER);
		assertEquals(modelObject.getEncoder(),LiveStream.EncoderEnum.WOWZA_GOCODER);
	}
	@Test
	public void LiveStreamModelTest_setHostedPage()
	{
		modelObject.setHostedPage(true);
		assertEquals(modelObject.isHostedPage(),true);
	}
	@Test
	public void LiveStreamModelTest_setHostedPageDescription()
	{
		modelObject.setHostedPageDescription("HostedPageDescription");
		assertEquals(modelObject.getHostedPageDescription(),"HostedPageDescription");
	}
	@Test
	public void LiveStreamModelTest_setHostedPageLogoImageUrl()
	{
		modelObject.setHostedPageLogoImageUrl("HostedPageLogoImageUrl");
		assertEquals(modelObject.getHostedPageLogoImageUrl(),"HostedPageLogoImageUrl");
	}
	@Test
	public void LiveStreamModelTest_setHostedPageSharingIcons()
	{
		modelObject.setHostedPageSharingIcons(true);
		assertEquals(modelObject.isHostedPageSharingIcons(),true);
	}
	@Test
	public void LiveStreamModelTest_setHostedPageTitle()
	{
		modelObject.setHostedPageTitle("HostedPageTitle");
		assertEquals(modelObject.getHostedPageTitle(),"HostedPageTitle");
	}
	@Test
	public void LiveStreamModelTest_setHostedPageUrl()
	{
		modelObject.setHostedPageUrl("HostedPageUrl");
		assertEquals(modelObject.getHostedPageUrl(),"HostedPageUrl");
	}
	@Test
	public void LiveStreamModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void LiveStreamModelTest_setLowLatency()
	{
		modelObject.setLowLatency(true);
		assertEquals(modelObject.isLowLatency(),true);
	}
	@Test
	public void LiveStreamModelTest_setName()
	{
		modelObject.setName("Name");
		assertEquals(modelObject.getName(),"Name");
	}
	@Test
	public void LiveStreamModelTest_setPlayerCountdown()
	{
		modelObject.setPlayerCountdown(true);
		assertEquals(modelObject.isPlayerCountdown(),true);
	}
	@Test
	public void LiveStreamModelTest_setPlayerCountdownAt()
	{
		modelObject.setPlayerCountdownAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getPlayerCountdownAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void LiveStreamModelTest_setPlayerEmbedCode()
	{
		modelObject.setPlayerEmbedCode("PlayerEmbedCode");
		assertEquals(modelObject.getPlayerEmbedCode(),"PlayerEmbedCode");
	}
	@Test
	public void LiveStreamModelTest_setPlayerHdsPlaybackUrl()
	{
		modelObject.setPlayerHdsPlaybackUrl("PlayerHdsPlaybackUrl");
		assertEquals(modelObject.getPlayerHdsPlaybackUrl(),"PlayerHdsPlaybackUrl");
	}
	@Test
	public void LiveStreamModelTest_setPlayerHlsPlaybackUrl()
	{
		modelObject.setPlayerHlsPlaybackUrl("PlayerHlsPlaybackUrl");
		assertEquals(modelObject.getPlayerHlsPlaybackUrl(),"PlayerHlsPlaybackUrl");
	}
	@Test
	public void LiveStreamModelTest_setPlayerId()
	{
		modelObject.setPlayerId("PlayerId");
		assertEquals(modelObject.getPlayerId(),"PlayerId");
	}
	@Test
	public void LiveStreamModelTest_setPlayerLogoImageUrl()
	{
		modelObject.setPlayerLogoImageUrl("PlayerLogoImageUrl");
		assertEquals(modelObject.getPlayerLogoImageUrl(),"PlayerLogoImageUrl");
	}
	@Test
	public void LiveStreamModelTest_setPlayerLogoPosition()
	{
		modelObject.setPlayerLogoPosition(LiveStream.PlayerLogoPositionEnum.TOP_LEFT);
		assertEquals(modelObject.getPlayerLogoPosition(),LiveStream.PlayerLogoPositionEnum.TOP_LEFT);
	}
	@Test
	public void LiveStreamModelTest_setPlayerResponsive()
	{
		modelObject.setPlayerResponsive(true);
		assertEquals(modelObject.isPlayerResponsive(),true);
	}
	@Test
	public void LiveStreamModelTest_setPlayerType()
	{
		modelObject.setPlayerType("PlayerType");
		assertEquals(modelObject.getPlayerType(),"PlayerType");
	}
	@Test
	public void LiveStreamModelTest_setPlayerVideoPosterImageUrl()
	{
		modelObject.setPlayerVideoPosterImageUrl("PlayerVideoPosterImageUrl");
		assertEquals(modelObject.getPlayerVideoPosterImageUrl(),"PlayerVideoPosterImageUrl");
	}
	@Test
	public void LiveStreamModelTest_setPlayerWidth()
	{
		modelObject.setPlayerWidth(12345);
		assertEquals(modelObject.getPlayerWidth().intValue(),12345);
	}
	@Test
	public void LiveStreamModelTest_setRecording()
	{
		modelObject.setRecording(true);
		assertEquals(modelObject.isRecording(),true);
	}
	/**
	@Test
	public void LiveStreamModelTest_setSourceConnectionInformation()
	{
		modelObject.setSourceConnectionInformation(Object);
		assertEquals(modelObject.getSourceConnectionInformation(),Object)
	}
	**/
	@Test
	public void LiveStreamModelTest_setStreamSourceId()
	{
		modelObject.setStreamSourceId("StreamSourceId");
		assertEquals(modelObject.getStreamSourceId(),"StreamSourceId");
	}
	@Test
	public void LiveStreamModelTest_setStreamTargets()
	{
		List<StreamTargetsId> streamTargets = new ArrayList<StreamTargetsId>();
		StreamTargetsId streamTargetsId = new StreamTargetsId();
		streamTargetsId.setId("targetID");
		streamTargets.add(streamTargetsId);
		modelObject.setStreamTargets(streamTargets);
		assertEquals(modelObject.getStreamTargets().get(0).getId(),"targetID");
	}
	@Test
	public void LiveStreamModelTest_setTargetDeliveryProtocol()
	{
		modelObject.setTargetDeliveryProtocol(LiveStream.TargetDeliveryProtocolEnum.HTTPS);
		assertEquals(modelObject.getTargetDeliveryProtocol(),LiveStream.TargetDeliveryProtocolEnum.HTTPS);
	}
	@Test
	public void LiveStreamModelTest_setTranscoderType()
	{
		modelObject.setTranscoderType(LiveStream.TranscoderTypeEnum.PASSTHROUGH);
		assertEquals(modelObject.getTranscoderType(),LiveStream.TranscoderTypeEnum.PASSTHROUGH);
	}
	@Test
	public void LiveStreamModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
	        assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void LiveStreamModelTest_setUseStreamSource()
	{
		modelObject.setUseStreamSource(true);
		assertEquals(modelObject.isUseStreamSource(),true);
	}
}
