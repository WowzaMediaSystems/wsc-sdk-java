
# ShmMetrics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audioCodec** | [**AudioCodecMetric**](AudioCodecMetric.md) | The audio codec of the video source. |  [optional]
**bitsInRate** | [**BitsInRateMetric**](BitsInRateMetric.md) | The rate of the stream traveling from the source encoder to Wowza Streaming Cloud, in kilobits per second. |  [optional]
**bitsOutRate** | [**BitsOutRateMetric**](BitsOutRateMetric.md) | The total actual bitrate of all outbound video streams, in kilobits per second. |  [optional]
**bytesInRate** | [**BytesInRateMetric**](BytesInRateMetric.md) | The rate of the stream traveling from the source encoder to Wowza Streaming Cloud, in kilobytes per second. |  [optional]
**bytesOutRate** | [**BytesOutRateMetric**](BytesOutRateMetric.md) | The total actual bitrate of all outbound video streams, in kilobytes per second. |  [optional]
**configuredBytesOutRate** | [**ConfiguredBytesOutRateMetric**](ConfiguredBytesOutRateMetric.md) | The total configured bitrate of all outbound video streams, in kilobits per second. |  [optional]
**connected** | [**ConnectedMetric**](ConnectedMetric.md) | The connection status of the video source. **Yes** means the source is connected. **No** means the source is not connected. |  [optional]
**cpu** | [**CpuMetric**](CpuMetric.md) | The percentage of available CPU power on the virtual host being used by the transcoder. |  [optional]
**frameSize** | [**FrameSizeMetric**](FrameSizeMetric.md) | The frame size of the video source, in pixels. |  [optional]
**frameRate** | [**FrameRateMetric**](FrameRateMetric.md) | The frame rate of the video source, in frames per second. |  [optional]
**gpuDecoderUsage** | [**GpuDecoderUsageMetric**](GpuDecoderUsageMetric.md) | The percentage of the GPU decoding power on the virtual host being used by the transcoder. |  [optional]
**gpuDriverVersion** | [**GpuDriverVersionMetric**](GpuDriverVersionMetric.md) | The version of the GPU driver on the virtual host. |  [optional]
**gpuEncoderUsage** | [**GpuEncoderUsageMetric**](GpuEncoderUsageMetric.md) | The percentage of available GPU encoding power on the virtual host being used by the transcoder. |  [optional]
**gpuMemoryUsage** | [**GpuMemoryUsageMetric**](GpuMemoryUsageMetric.md) | The percentage of the GPU memory usage on the virtual host being used by the transcoder. |  [optional]
**gpuUsage** | [**GpuUsageMetric**](GpuUsageMetric.md) | The percentage of the total GPU usage on the virtual host being used by the transcoder. |  [optional]
**height** | [**HeightMetric**](HeightMetric.md) | The height of the frame of the video source frame, in pixels. |  [optional]
**keyframeInterval** | [**KeyframeIntervalMetric**](KeyframeIntervalMetric.md) | The number of video frames compressed in a group of pictures (GOP) between keyframes. |  [optional]
**streamTargetStatusOUTPUTIDXSTREAMTARGETIDX** | [**StreamTargetStatusOUTPUTIDXSTREAMTARGETIDXMetric**](StreamTargetStatusOUTPUTIDXSTREAMTARGETIDXMetric.md) | The status of the identified stream target assigned to the identified output. OUTPUTIDX identifies the output and STREAMTARGETIDX identifies the stream target. A status is returned for every stream target used by the transcoder. |  [optional]
**uniqueViews** | [**UniqueViewsMetric**](UniqueViewsMetric.md) | The number of IP addresses that received at least one chunk of the stream on any player or device in a 24-hour period. |  [optional]
**videoCodec** | [**VideoCodecMetric**](VideoCodecMetric.md) | The video codec of the video source. |  [optional]
**width** | [**WidthMetric**](WidthMetric.md) | The width of the frame of the video source, in pixels. |  [optional]



