
# Transcoder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationName** | **String** | The application name from the pull stream source URL. |  [optional]
**billingMode** | [**BillingModeEnum**](#BillingModeEnum) | The billing mode for the transcoder. The default is **pay_as_you_go**. |  [optional]
**broadcastLocation** | [**BroadcastLocationEnum**](#BroadcastLocationEnum) | The location where Wowza Streaming Cloud transcodes your stream. Choose a location as close as possible to your video source. |  [optional]
**bufferSize** | [**BufferSizeEnum**](#BufferSizeEnum) | The size, in milliseconds, of the incoming buffer. **0** means no buffer. The default is **4000** (4 seconds). |  [optional]
**closedCaptionType** | [**ClosedCaptionTypeEnum**](#ClosedCaptionTypeEnum) | The type of closed caption data being passed from the source. The default, **none**, indicates that no data is being provided. **cea** indicates that a CEA closed captioning data stream is being provided. **on_text** indicates that an onTextData closed captioning data stream is being provided. **both** indicates that both CEA and onTextData closed captioning data streams are being provided. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the transcoder was created. |  [optional]
**deliveryMethod** | [**DeliveryMethodEnum**](#DeliveryMethodEnum) | The type of connection between the source encoder and the transcoder. The default, **pull**, instructs the transcoder to pull the video from the source. **push** instructs the source to push the stream to the transcoder. **cdn** uses a stream source to deliver the stream to the transcoder. |  [optional]
**deliveryProtocols** | **List&lt;String** | An array of playback protocols enabled for this transcoder. By default, **rtmp**, **rtsp**, and **wowz** are returned. |  [optional]
**description** | **String** | An optional description of the transcoder. |  [optional]
**directPlaybackUrls** | [**List&lt;PlaybackUrl**](PlaybackUrl.md) | An array of direct playback URLs the transcoder&#39;s delivery protocols. Each protocol has a URL for the source and a URL for each output rendition. |  [optional]
**disableAuthentication** | **Boolean** | Authentication is required by default for RTMP and RTSP push connections from a video source to the transcoder. Specify **true** to disable authentication with the video source. |  [optional]
**domainName** | **String** | The domain name from the pull stream source URL. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the transcoder. |  [optional]
**idleTimeout** | **Integer** | The amount of idle time, in seconds, before the transcoder automatically shuts down. Valid values are the integers **0** (never shuts down) to **172800** (48 hours). The default is **1200** (20 minutes). |  [optional]
**lowLatency** | **Boolean** | If **true**, turns off the sort packet buffer and speeds the time it takes to decode and deliver video data to the player. The default is **false**. |  [optional]
**name** | **String** | A descriptive name for the transcoder. Maximum 200 characters. |  [optional]
**outputs** | [**List&lt;Output**](Output.md) | Output renditions associated with the transcoder. |  [optional]
**password** | **String** | A password for authenticating an RTMP or RTSP push connection. Can contain only uppercase and lowercase letters; numbers; and the period (.), underscore (_), and hyphen (-) characters. No other special characters can be used. |  [optional]
**playMaximumConnections** | [**PlayMaximumConnectionsEnum**](#PlayMaximumConnectionsEnum) | The number of users who are allowed to connect directly to the transcoder. |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | The transport protocol for the source video. The default is **rtmp**. |  [optional]
**recording** | **Boolean** | If **true**, creates a recording of the transcoded output. The default is **false**. |  [optional]
**sourcePort** | **Integer** | The port used for RTMP pull connections to Wowza Streaming Cloud. |  [optional]
**sourceUrl** | **String** | For the *delivery_method* **pull**. Enter the source&#39;s web address without the preceding protocol or the trailing slash (/). |  [optional]
**streamExtension** | **String** | For the *delivery_method* **push**. Some encoders append an extension to their stream names. If the device you&#39;re using does this, enter the extension. |  [optional]
**streamName** | **String** | The stream name from the pull stream source URL. |  [optional]
**streamSmoother** | **Boolean** | A dynamic buffer that helps stabilize streams in rough network conditions, but adds latency. Specify **true** to enable stream smoothing. The default is **false**. |  [optional]
**streamSourceId** | **String** | For the *delivery_method* **cdn**. The alphanumeric string that identifies the stream source that you want to use to deliver the stream to the transcoder. |  [optional]
**suppressStreamTargetStart** | **Boolean** | If **true**, disables stream targets when the transcoder starts. If **false** (the default), the targets start when the transcoder starts. |  [optional]
**transcoderType** | [**TranscoderTypeEnum**](#TranscoderTypeEnum) | The type of transcoder, either **transcoded** for streams that are transcoded into adaptive bitrate renditions or **passthrough** for streams that aren&#39;t processed by the transcoder. The default is **transcoded**. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the transcoder was updated. |  [optional]
**username** | **String** | A username for authenticating an RTMP or RTSP push connection. Can contain only uppercase and lowercase letters; numbers; and the period (.), underscore (_), and hyphen (-) characters. No other special characters can be used. |  [optional]
**watermark** | **Boolean** | Embeds an image into the transcoded stream for copyright protection. Specify **true** to embed a watermark image. |  [optional]
**watermarkHeight** | **Integer** | The height, in pixels, of the watermark image. If blank, Wowza Streaming Cloud uses the original image height. |  [optional]
**watermarkImageUrl** | **String** | The path to a GIF, JPEG, or PNG image that is embedded in all bitrate renditions of the stream. Watermark image files must be 2.5 MB or smaller. |  [optional]
**watermarkOpacity** | [**WatermarkOpacityEnum**](#WatermarkOpacityEnum) | The opacity, or percentage of transparency, of the watermark. **0** is fully transparent; **100** is fully opaque. |  [optional]
**watermarkPosition** | [**WatermarkPositionEnum**](#WatermarkPositionEnum) | The corner of the video frame in which you want the watermark to appear. The default is **top-left**. |  [optional]
**watermarkWidth** | **Integer** | The width, in pixels, of the watermark image. If blank, Wowza Streaming Cloud uses the original image width. |  [optional]


<a name="BillingModeEnum"></a>
## Enum: BillingModeEnum
Name | Value
---- | -----
PAY_AS_YOU_GO | &quot;pay_as_you_go&quot;
TWENTYFOUR_SEVEN | &quot;twentyfour_seven&quot;


<a name="BroadcastLocationEnum"></a>
## Enum: BroadcastLocationEnum
Name | Value
---- | -----
ASIA_PACIFIC_AUSTRALIA | &quot;asia_pacific_australia&quot;
ASIA_PACIFIC_JAPAN | &quot;asia_pacific_japan&quot;
ASIA_PACIFIC_SINGAPORE | &quot;asia_pacific_singapore&quot;
ASIA_PACIFIC_TAIWAN | &quot;asia_pacific_taiwan&quot;
EU_BELGIUM | &quot;eu_belgium&quot;
EU_GERMANY | &quot;eu_germany&quot;
EU_IRELAND | &quot;eu_ireland&quot;
SOUTH_AMERICA_BRAZIL | &quot;south_america_brazil&quot;
US_CENTRAL_IOWA | &quot;us_central_iowa&quot;
US_EAST_VIRGINIA | &quot;us_east_virginia&quot;
US_WEST_CALIFORNIA | &quot;us_west_california&quot;
US_WEST_OREGON | &quot;us_west_oregon&quot;


<a name="BufferSizeEnum"></a>
## Enum: BufferSizeEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1000 | 1000
NUMBER_2000 | 2000
NUMBER_3000 | 3000
NUMBER_4000 | 4000
NUMBER_5000 | 5000
NUMBER_6000 | 6000
NUMBER_7000 | 7000
NUMBER_8000 | 8000


<a name="ClosedCaptionTypeEnum"></a>
## Enum: ClosedCaptionTypeEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
CEA | &quot;cea&quot;
ON_TEXT | &quot;on_text&quot;
BOTH | &quot;both&quot;


<a name="DeliveryMethodEnum"></a>
## Enum: DeliveryMethodEnum
Name | Value
---- | -----
PULL | &quot;pull&quot;
CDN | &quot;cdn&quot;
PUSH | &quot;push&quot;


<a name="PlayMaximumConnectionsEnum"></a>
## Enum: PlayMaximumConnectionsEnum
Name | Value
---- | -----
NUMBER_10 | 10
NUMBER_11 | 11
NUMBER_12 | 12
NUMBER_13 | 13
NUMBER_14 | 14
NUMBER_15 | 15
NUMBER_16 | 16
NUMBER_17 | 17
NUMBER_18 | 18
NUMBER_19 | 19
NUMBER_20 | 20
NUMBER_21 | 21
NUMBER_22 | 22
NUMBER_23 | 23
NUMBER_24 | 24
NUMBER_25 | 25
NUMBER_26 | 26
NUMBER_27 | 27
NUMBER_28 | 28
NUMBER_29 | 29
NUMBER_30 | 30
NUMBER_31 | 31
NUMBER_32 | 32
NUMBER_33 | 33
NUMBER_34 | 34
NUMBER_35 | 35
NUMBER_36 | 36
NUMBER_37 | 37
NUMBER_38 | 38
NUMBER_39 | 39
NUMBER_40 | 40
NUMBER_41 | 41
NUMBER_42 | 42
NUMBER_43 | 43
NUMBER_44 | 44
NUMBER_45 | 45
NUMBER_46 | 46
NUMBER_47 | 47
NUMBER_48 | 48
NUMBER_49 | 49
NUMBER_50 | 50
NUMBER_51 | 51
NUMBER_52 | 52
NUMBER_53 | 53
NUMBER_54 | 54
NUMBER_55 | 55
NUMBER_56 | 56
NUMBER_57 | 57
NUMBER_58 | 58
NUMBER_59 | 59
NUMBER_60 | 60
NUMBER_61 | 61
NUMBER_62 | 62
NUMBER_63 | 63
NUMBER_64 | 64
NUMBER_65 | 65
NUMBER_66 | 66
NUMBER_67 | 67
NUMBER_68 | 68
NUMBER_69 | 69
NUMBER_70 | 70
NUMBER_71 | 71
NUMBER_72 | 72
NUMBER_73 | 73
NUMBER_74 | 74
NUMBER_75 | 75
NUMBER_76 | 76
NUMBER_77 | 77
NUMBER_78 | 78
NUMBER_79 | 79
NUMBER_80 | 80
NUMBER_81 | 81
NUMBER_82 | 82
NUMBER_83 | 83
NUMBER_84 | 84
NUMBER_85 | 85
NUMBER_86 | 86
NUMBER_87 | 87
NUMBER_88 | 88
NUMBER_89 | 89
NUMBER_90 | 90
NUMBER_91 | 91
NUMBER_92 | 92
NUMBER_93 | 93
NUMBER_94 | 94
NUMBER_95 | 95
NUMBER_96 | 96
NUMBER_97 | 97
NUMBER_98 | 98
NUMBER_99 | 99
NUMBER_100 | 100


<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
RTMP | &quot;rtmp&quot;
RTSP | &quot;rtsp&quot;


<a name="TranscoderTypeEnum"></a>
## Enum: TranscoderTypeEnum
Name | Value
---- | -----
TRANSCODED | &quot;transcoded&quot;
PASSTHROUGH | &quot;passthrough&quot;


<a name="WatermarkOpacityEnum"></a>
## Enum: WatermarkOpacityEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4
NUMBER_5 | 5
NUMBER_6 | 6
NUMBER_7 | 7
NUMBER_8 | 8
NUMBER_9 | 9
NUMBER_10 | 10
NUMBER_11 | 11
NUMBER_12 | 12
NUMBER_13 | 13
NUMBER_14 | 14
NUMBER_15 | 15
NUMBER_16 | 16
NUMBER_17 | 17
NUMBER_18 | 18
NUMBER_19 | 19
NUMBER_20 | 20
NUMBER_21 | 21
NUMBER_22 | 22
NUMBER_23 | 23
NUMBER_24 | 24
NUMBER_25 | 25
NUMBER_26 | 26
NUMBER_27 | 27
NUMBER_28 | 28
NUMBER_29 | 29
NUMBER_30 | 30
NUMBER_31 | 31
NUMBER_32 | 32
NUMBER_33 | 33
NUMBER_34 | 34
NUMBER_35 | 35
NUMBER_36 | 36
NUMBER_37 | 37
NUMBER_38 | 38
NUMBER_39 | 39
NUMBER_40 | 40
NUMBER_41 | 41
NUMBER_42 | 42
NUMBER_43 | 43
NUMBER_44 | 44
NUMBER_45 | 45
NUMBER_46 | 46
NUMBER_47 | 47
NUMBER_48 | 48
NUMBER_49 | 49
NUMBER_50 | 50
NUMBER_51 | 51
NUMBER_52 | 52
NUMBER_53 | 53
NUMBER_54 | 54
NUMBER_55 | 55
NUMBER_56 | 56
NUMBER_57 | 57
NUMBER_58 | 58
NUMBER_59 | 59
NUMBER_60 | 60
NUMBER_61 | 61
NUMBER_62 | 62
NUMBER_63 | 63
NUMBER_64 | 64
NUMBER_65 | 65
NUMBER_66 | 66
NUMBER_67 | 67
NUMBER_68 | 68
NUMBER_69 | 69
NUMBER_70 | 70
NUMBER_71 | 71
NUMBER_72 | 72
NUMBER_73 | 73
NUMBER_74 | 74
NUMBER_75 | 75
NUMBER_76 | 76
NUMBER_77 | 77
NUMBER_78 | 78
NUMBER_79 | 79
NUMBER_80 | 80
NUMBER_81 | 81
NUMBER_82 | 82
NUMBER_83 | 83
NUMBER_84 | 84
NUMBER_85 | 85
NUMBER_86 | 86
NUMBER_87 | 87
NUMBER_88 | 88
NUMBER_89 | 89
NUMBER_90 | 90
NUMBER_91 | 91
NUMBER_92 | 92
NUMBER_93 | 93
NUMBER_94 | 94
NUMBER_95 | 95
NUMBER_96 | 96
NUMBER_97 | 97
NUMBER_98 | 98
NUMBER_99 | 99
NUMBER_100 | 100


<a name="WatermarkPositionEnum"></a>
## Enum: WatermarkPositionEnum
Name | Value
---- | -----
TOP_LEFT | &quot;top-left&quot;
TOP_RIGHT | &quot;top-right&quot;
BOTTOM_LEFT | &quot;bottom-left&quot;
BOTTOM_RIGHT | &quot;bottom-right&quot;



