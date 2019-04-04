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
import com.wowza.cloudsdk.client.model.FrameSizeMetric;

import org.junit.Test;
import org.junit.Ignore;


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

public class ShmMetricsModelTest {
	ShmMetrics modelObject = new ShmMetrics();

	@Test
	public void ShmMetricsModelTest_setAudioCodec()
	{
		AudioCodecMetric audioCodecMetric = new AudioCodecMetric();
		audioCodecMetric.setStatus("audioCodecMetricStatus");
		modelObject.setAudioCodec(audioCodecMetric);
		assertEquals(modelObject.getAudioCodec().getStatus(),"audioCodecMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setBitsInRate()
	{
		BitsInRateMetric bitsInRateMetric = new BitsInRateMetric();
		bitsInRateMetric.setStatus("bitsInRateMetricStatus");
		modelObject.setBitsInRate(bitsInRateMetric);
		assertEquals(modelObject.getBitsInRate().getStatus(),"bitsInRateMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setBitsOutRate()
	{
		BitsOutRateMetric bitsOutRateMetric = new BitsOutRateMetric();
		bitsOutRateMetric.setStatus("bitsOutRateMetricStatus");
		modelObject.setBitsOutRate(bitsOutRateMetric);
		assertEquals(modelObject.getBitsOutRate().getStatus(),"bitsOutRateMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setBytesInRate()
	{
		BytesInRateMetric bytesInRateMetric = new BytesInRateMetric();
		bytesInRateMetric.setStatus("bytesInRateMetricStatus");
		modelObject.setBytesInRate(bytesInRateMetric);
		assertEquals(modelObject.getBytesInRate().getStatus(),"bytesInRateMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setBytesOutRate()
	{
		BytesOutRateMetric bytesOutRateMetric = new BytesOutRateMetric();
		bytesOutRateMetric.setStatus("bytesOutRateMetricStatus");
		modelObject.setBytesOutRate(bytesOutRateMetric);
		assertEquals(modelObject.getBytesOutRate().getStatus(),"bytesOutRateMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setConfiguredBytesOutRate()
	{
		ConfiguredBytesOutRateMetric configuredBytesOutRateMetric = new ConfiguredBytesOutRateMetric();
		configuredBytesOutRateMetric.setStatus("configuredBytesOutRateMetricStatus");
		modelObject.setConfiguredBytesOutRate(configuredBytesOutRateMetric);
		assertEquals(modelObject.getConfiguredBytesOutRate().getStatus(),"configuredBytesOutRateMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setConnected()
	{
		ConnectedMetric connectedMetric = new ConnectedMetric();
		connectedMetric.setStatus("connectedMetricStatus");
		modelObject.setConnected(connectedMetric);
		assertEquals(modelObject.getConnected().getStatus(),"connectedMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setCpu()
	{
		CpuMetric cpuMetric = new CpuMetric();
		cpuMetric.setStatus("cpuMetricStatus");
		modelObject.setCpu(cpuMetric);
		assertEquals(modelObject.getCpu().getStatus(),"cpuMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setFrameSize()
	{
		FrameSizeMetric frameSizeMetric = new FrameSizeMetric();
		frameSizeMetric.setStatus("frameSizeMetricStatus");
		modelObject.setFrameSize(frameSizeMetric);
		assertEquals(modelObject.getFrameSize().getStatus(),"frameSizeMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setFrameRate()
	{
		FrameRateMetric frameRateMetric = new FrameRateMetric();
		frameRateMetric.setStatus("frameRateMetricStatus");
		modelObject.setFrameRate(frameRateMetric);
		assertEquals(modelObject.getFrameRate().getStatus(),"frameRateMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setGpuDecoderUsage()
	{
		GpuDecoderUsageMetric gpuDecoderUsageMetric = new GpuDecoderUsageMetric();
		gpuDecoderUsageMetric.setStatus("gpuDecoderUsageMetricStatus");
		modelObject.setGpuDecoderUsage(gpuDecoderUsageMetric);
		assertEquals(modelObject.getGpuDecoderUsage().getStatus(),"gpuDecoderUsageMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setGpuDriverVersion()
	{
		GpuDriverVersionMetric gpuDriverVersionMetric = new GpuDriverVersionMetric();
		gpuDriverVersionMetric.setStatus("gpuDriverVersionMetricStatus");
		modelObject.setGpuDriverVersion(gpuDriverVersionMetric);
		assertEquals(modelObject.getGpuDriverVersion().getStatus(),"gpuDriverVersionMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setGpuEncoderUsage()
	{
		GpuEncoderUsageMetric gpuEncoderUsageMetric = new GpuEncoderUsageMetric();
		gpuEncoderUsageMetric.setStatus("gpuEncoderUsageMetricStatus");
		modelObject.setGpuEncoderUsage(gpuEncoderUsageMetric);
		assertEquals(modelObject.getGpuEncoderUsage().getStatus(),"gpuEncoderUsageMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setGpuMemoryUsage()
	{
		GpuMemoryUsageMetric gpuMemoryUsageMetric = new GpuMemoryUsageMetric();
		gpuMemoryUsageMetric.setStatus("gpuMemoryUsageMetricStatus");
		modelObject.setGpuMemoryUsage(gpuMemoryUsageMetric);
		assertEquals(modelObject.getGpuMemoryUsage().getStatus(),"gpuMemoryUsageMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setGpuUsage()
	{
		GpuUsageMetric gpuUsageMetric = new GpuUsageMetric();
		gpuUsageMetric.setStatus("gpuUsageMetricStatus");
		modelObject.setGpuUsage(gpuUsageMetric);
		assertEquals(modelObject.getGpuUsage().getStatus(),"gpuUsageMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setHeight()
	{
		HeightMetric heightMetric = new HeightMetric();
		heightMetric.setStatus("heightMetricStatus");
		modelObject.setHeight(heightMetric);
		assertEquals(modelObject.getHeight().getStatus(),"heightMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setKeyframeInterval()
	{
		KeyframeIntervalMetric keyframeIntervalMetric = new KeyframeIntervalMetric();
		keyframeIntervalMetric.setStatus("keyframeIntervalMetricStatus");
		modelObject.setKeyframeInterval(keyframeIntervalMetric);
		assertEquals(modelObject.getKeyframeInterval().getStatus(),"keyframeIntervalMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setStreamTargetStatusOUTPUTIDXSTREAMTARGETIDX()
	{
		StreamTargetStatusOUTPUTIDXSTREAMTARGETIDXMetric streamTargetStatusOUTPUTIDXSTREAMTARGETIDXMetric = new StreamTargetStatusOUTPUTIDXSTREAMTARGETIDXMetric();
		streamTargetStatusOUTPUTIDXSTREAMTARGETIDXMetric.setStatus("streamTargetStatusOUTPUTIDXSTREAMTARGETIDXMetricStatus");
		modelObject.setStreamTargetStatusOUTPUTIDXSTREAMTARGETIDX(streamTargetStatusOUTPUTIDXSTREAMTARGETIDXMetric);
		assertEquals(modelObject.getStreamTargetStatusOUTPUTIDXSTREAMTARGETIDX().getStatus(),"streamTargetStatusOUTPUTIDXSTREAMTARGETIDXMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setUniqueViews()
	{
		UniqueViewsMetric uniqueViewsMetric = new UniqueViewsMetric();
		uniqueViewsMetric.setStatus("uniqueViewsMetricStatus");
		modelObject.setUniqueViews(uniqueViewsMetric);
		assertEquals(modelObject.getUniqueViews().getStatus(),"uniqueViewsMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setVideoCodec()
	{
		VideoCodecMetric videoCodecMetric = new VideoCodecMetric();
		videoCodecMetric.setStatus("videoCodecMetricStatus");
		modelObject.setVideoCodec(videoCodecMetric);
		assertEquals(modelObject.getVideoCodec().getStatus(),"videoCodecMetricStatus");
	}
	@Test
	public void ShmMetricsModelTest_setWidth()
	{
		WidthMetric widthMetric = new WidthMetric();
		widthMetric.setStatus("widthMetricStatus");
		modelObject.setWidth(widthMetric);
		assertEquals(modelObject.getWidth().getStatus(),"widthMetricStatus");
	}
}

