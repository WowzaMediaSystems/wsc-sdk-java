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

public class PlayerModelTest {
	Player modelObject = new Player();

	@Test
	public void PlayerModelTest_setCountdown()
	{
		modelObject.setCountdown(true);
		assertEquals(modelObject.isCountdown(),true);
	}
	@Test
	public void PlayerModelTest_setCountdownAt()
	{
		modelObject.setCountdownAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCountdownAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void PlayerModelTest_setCreatedAt()
	{
		modelObject.setCreatedAt(OffsetDateTime.now());
		Timestamp timestamp = Timestamp.valueOf(modelObject.getCreatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void PlayerModelTest_setEmbedCode()
	{
		modelObject.setEmbedCode("EmbedCode");
		assertEquals(modelObject.getEmbedCode(),"EmbedCode");
	}
	@Test
	public void PlayerModelTest_setHdsPlaybackUrl()
	{
		modelObject.setHdsPlaybackUrl("HdsPlaybackUrl");
		assertEquals(modelObject.getHdsPlaybackUrl(),"HdsPlaybackUrl");
	}
	@Test
	public void PlayerModelTest_setHlsPlaybackUrl()
	{
		modelObject.setHlsPlaybackUrl("HlsPlaybackUrl");
		assertEquals(modelObject.getHlsPlaybackUrl(),"HlsPlaybackUrl");
	}
	@Test
	public void PlayerModelTest_setHostedPage()
	{
		modelObject.setHostedPage(true);
		assertEquals(modelObject.isHostedPage(),true);
	}
	@Test
	public void PlayerModelTest_setHostedPageDescription()
	{
		modelObject.setHostedPageDescription("HostedPageDescription");
		assertEquals(modelObject.getHostedPageDescription(),"HostedPageDescription");
	}
	@Test
	public void PlayerModelTest_setHostedPageLogoImageUrl()
	{
		modelObject.setHostedPageLogoImageUrl("HostedPageLogoImageUrl");
		assertEquals(modelObject.getHostedPageLogoImageUrl(),"HostedPageLogoImageUrl");
	}
	@Test
	public void PlayerModelTest_setHostedPageSharingIcons()
	{
		modelObject.setHostedPageSharingIcons("HostedPageSharingIcons");
		assertEquals(modelObject.getHostedPageSharingIcons(),"HostedPageSharingIcons");
	}
	@Test
	public void PlayerModelTest_setHostedPageTitle()
	{
		modelObject.setHostedPageTitle("HostedPageTitle");
		assertEquals(modelObject.getHostedPageTitle(),"HostedPageTitle");
	}
	@Test
	public void PlayerModelTest_setHostedPageUrl()
	{
		modelObject.setHostedPageUrl("HostedPageUrl");
		assertEquals(modelObject.getHostedPageUrl(),"HostedPageUrl");
	}
	@Test
	public void PlayerModelTest_setId()
	{
		modelObject.setId("Id");
		assertEquals(modelObject.getId(),"Id");
	}
	@Test
	public void PlayerModelTest_setLogoImageUrl()
	{
		modelObject.setLogoImageUrl("LogoImageUrl");
		assertEquals(modelObject.getLogoImageUrl(),"LogoImageUrl");
	}
	@Test
	public void PlayerModelTest_setLogoPosition()
	{
		modelObject.setLogoPosition("LogoPosition");
		assertEquals(modelObject.getLogoPosition(),"LogoPosition");
	}
	@Test
	public void PlayerModelTest_setResponsive()
	{
		modelObject.setResponsive(true);
		assertEquals(modelObject.isResponsive(),true);
	}
	@Test
	public void PlayerModelTest_setTranscoderId()
	{
		modelObject.setTranscoderId("TranscoderId");
		assertEquals(modelObject.getTranscoderId(),"TranscoderId");
	}
	@Test
	public void PlayerModelTest_setType()
	{
		modelObject.setType("Type");
		assertEquals(modelObject.getType(),"Type");
	}
	@Test
	public void PlayerModelTest_setUpdatedAt()
	{
		modelObject.setUpdatedAt(OffsetDateTime.now());
	        Timestamp timestamp = Timestamp.valueOf(modelObject.getUpdatedAt().atZoneSameInstant(ZoneId.of("Z")).toLocalDateTime());
		assertTrue(System.currentTimeMillis()>=timestamp.getTime());
	}
	@Test
	public void PlayerModelTest_setVideoPosterImageUrl()
	{
		modelObject.setVideoPosterImageUrl("VideoPosterImageUrl");
		assertEquals(modelObject.getVideoPosterImageUrl(),"VideoPosterImageUrl");
	}
	@Test
	public void PlayerModelTest_setWidth()
	{
		modelObject.setWidth(12345);
		assertEquals(modelObject.getWidth().intValue(),12345);
	}
}
