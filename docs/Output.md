
# Output

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aspectRatioHeight** | **Integer** | The height, in pixels, of the output rendition. Should correspond to a widescreen or standard aspect ratio and be divisible by 8. The default is **1080**. |  [optional]
**aspectRatioWidth** | **Integer** | The width, in pixels, of the output rendition. Should correspond to a widescreen or standard aspect ratio and be divisible by 8. The default is **1980**. |  [optional]
**bitrateAudio** | **Integer** | The audio bitrate, in kilobits per second (Kbps). Must be between **0** (for passthrough audio) and **1000**. The default is **128**. |  [optional]
**bitrateVideo** | **Integer** | The video bitrate, in kilobits per second (Kbps). Must be between **0** (for passthrough video) and **10240**. The default is **4000**. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the output rendition was created. |  [optional]
**framerateReduction** | [**FramerateReductionEnum**](#FramerateReductionEnum) | Reduce the frame rate of the transcoded output rendition. The default, **0**, uses the encoded stream&#39;s frame rate without reduction. |  [optional]
**h264Profile** | [**H264ProfileEnum**](#H264ProfileEnum) | The encoding method. Specify **main** for desktop streaming, **baseline** for playback on mobile devices, or **high** for HD playback. The default is **high**. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the output rendition. |  [optional]
**keyframes** | [**KeyframesEnum**](#KeyframesEnum) | The interval used to define the compression applied to a group of frames. The default, **follow_source**, uses the keyframe interval of the source video. |  [optional]
**name** | **String** | A descriptive name for the output (generated, not writable). |  [optional]
**outputStreamTargets** | [**List&lt;OutputStreamTarget**](OutputStreamTarget.md) |  |  [optional]
**passthroughAudio** | **Boolean** | If **true**, sends the audio track to the target without transcoding. The default is **false**. |  [optional]
**passthroughVideo** | **Boolean** | If **true**, sends the video track to the target without transcoding. The default is **false**. |  [optional]
**streamFormat** | [**StreamFormatEnum**](#StreamFormatEnum) | The contents of the stream. The default is both audio and video (**audiovideo**). |  [optional]
**transcoderId** | **String** | The unique alphanumeric string that identifies the transcoder. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the output rendition was updated. |  [optional]


<a name="FramerateReductionEnum"></a>
## Enum: FramerateReductionEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_1_2 | &quot;1/2&quot;
_1_4 | &quot;1/4&quot;
_1_25 | &quot;1/25&quot;
_1_30 | &quot;1/30&quot;
_1_50 | &quot;1/50&quot;
_1_60 | &quot;1/60&quot;


<a name="H264ProfileEnum"></a>
## Enum: H264ProfileEnum
Name | Value
---- | -----
MAIN | &quot;main&quot;
BASELINE | &quot;baseline&quot;
HIGH | &quot;high&quot;


<a name="KeyframesEnum"></a>
## Enum: KeyframesEnum
Name | Value
---- | -----
FOLLOW_SOURCE | &quot;follow_source&quot;
_25 | &quot;25&quot;
_30 | &quot;30&quot;
_50 | &quot;50&quot;
_60 | &quot;60&quot;
_100 | &quot;100&quot;
_120 | &quot;120&quot;


<a name="StreamFormatEnum"></a>
## Enum: StreamFormatEnum
Name | Value
---- | -----
AUDIOVIDEO | &quot;audiovideo&quot;
VIDEOONLY | &quot;videoonly&quot;
AUDIOONLY | &quot;audioonly&quot;



