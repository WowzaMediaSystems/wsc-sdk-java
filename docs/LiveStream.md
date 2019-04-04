
# LiveStream

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aspectRatioHeight** | **Integer** | The height, in pixels, of the video source. Should correspond to a widescreen (16:9) or standard (4:3) aspect ratio and be divisible by 8. |  [optional]
**aspectRatioWidth** | **Integer** | The width, in pixels, of the video source. Should correspond to a widescreen (16:9) or standard (4:3) aspect ratio and be divisible by 8. |  [optional]
**billingMode** | [**BillingModeEnum**](#BillingModeEnum) | The billing mode for the stream. The default is **pay_as_you_go**. |  [optional]
**broadcastLocation** | [**BroadcastLocationEnum**](#BroadcastLocationEnum) | The location of your stream. Choose a location as close as possible to your video source. |  [optional]
**closedCaptionType** | [**ClosedCaptionTypeEnum**](#ClosedCaptionTypeEnum) | The type of closed caption data being passed from the source. The default, **none**, indicates that no data is being provided. **cea** indicates that a CEA closed captioning data stream is being provided. **on_text** indicates that an onTextData closed captioning data stream is being provided. **both** indicates that both CEA and onTextData closed captioning data streams are being provided. |  [optional]
**connectionCode** | **String** | A six-character, alphanumeric string that allows certain encoders, including Wowza Streaming Engine and the Wowza GoCoder app, to connect with Wowza Streaming Cloud. The code can be used once and expires 24 hours after it&#39;s created. |  [optional]
**connectionCodeExpiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the *connection_code* expires. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the live stream was created. |  [optional]
**deliveryMethod** | [**DeliveryMethodEnum**](#DeliveryMethodEnum) | The type of connection between the video source and the transcoder. The default, **push**, instructs the source to push the stream to the transcoder. **pull** instructs the transcoder to pull the video from the source. **cdn** uses a stream source to deliver the stream to the transcoder. |  [optional]
**deliveryProtocols** | **List&lt;String** | An array of direct delivery protocols enabled for this live stream. By default, **rtmp**, **rtsp**, and **wowz** are enabled. |  [optional]
**deliveryType** | [**DeliveryTypeEnum**](#DeliveryTypeEnum) | For streams whose *encoder* is **wowza_streaming_engine**. The default is **multi-bitrate**, which means you&#39;re sending one or more bitrate renditions from Wowza Streaming Engine directly to a Wowza CDN target without transcoding in Wowza Streaming Cloud. The value **single-bitrate** means you&#39;re sending a single source stream to Wowza Streaming Cloud for transcoding and/or to deliver the source stream to multiple stream targets in Wowza Streaming Cloud. |  [optional]
**directPlaybackUrls** | [**List&lt;PlaybackUrl**](PlaybackUrl.md) | An array of direct playback URLs for the live stream&#39;s delivery protocols. Each protocol has a URL for the source and a URL for each output rendition. |  [optional]
**encoder** | [**EncoderEnum**](#EncoderEnum) | The video source for the live stream. Choose the type of camera or encoder you&#39;re using to connect to the Wowza Streaming Cloud transcoder. If your specific device isn&#39;t listed, choose **ipcamera**, **other_rtmp**, or **other_rtsp**. |  [optional]
**hostedPage** | **Boolean** | A web page hosted by Wowza Streaming Cloud that includes a player for the live stream. The default, **true**, creates a hosted page. Specify **false** to not create a hosted web page. |  [optional]
**hostedPageDescription** | **String** | A description that appears on the hosted page below the player. Can&#39;t include custom HTML, JavaScript, or other tags. |  [optional]
**hostedPageLogoImageUrl** | **String** | The path to a GIF, JPEG, or PNG logo file that appears in the upper-left corner of the hosted page. Logo file must be 2.5 MB or smaller. |  [optional]
**hostedPageSharingIcons** | **Boolean** | Icons that let viewers share the stream on Facebook, Google+, Twitter, and by email. The default, **true**, includes sharing icons on the hosted page. Specify **false** to omit sharing icons. |  [optional]
**hostedPageTitle** | **String** | A title for the page that appears above the player. Can&#39;t include custom HTML, JavaScript, or other tags. |  [optional]
**hostedPageUrl** | **String** | The URL of the Wowza Streaming Cloud-hosted webpage that viewers can visit to watch the stream. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the live stream. |  [optional]
**lowLatency** | **Boolean** | For streams whose *target_delivery_protocol* is **hls-https**. If **true**, turns off incoming and sort packet buffers and delivers smaller video packets to the player, which can reduce latency as long as networks can handle the increased overhead. The default is **false**.  This parameter only affects streams played over a target whose *type* is **WowzaStreamTarget** and whose *provider* is **akamai_cupertino**. It does *not* reduce latency in streams played over a hosted page and is unrelated to Wowza ultra low latency stream targets. |  [optional]
**name** | **String** | A descriptive name for the live stream. Maximum 200 characters. |  [optional]
**playerCountdown** | **Boolean** | A clock that appears in the player before the event and counts down to the start of the stream. Specify **true** to display the countdown clock. The default is **false**. |  [optional]
**playerCountdownAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the event starts, used by the countdown clock. Specify **YYYY-MM-DD HH:MM:SS**, where **HH** is a 24-hour clock in UTC. |  [optional]
**playerEmbedCode** | **String** | The HTML code that can be used in an external webpage to host the Wowza Streaming Cloud player. |  [optional]
**playerHdsPlaybackUrl** | **String** | The address that can be used to configure playback of the stream using the Adobe HDS protocol. |  [optional]
**playerHlsPlaybackUrl** | **String** | The address that can be used to configure playback of the stream using the Apple HLS protocol. |  [optional]
**playerId** | **String** | The unique alphanumeric string that identifies the player. |  [optional]
**playerLogoImageUrl** | **String** | The path to a GIF, JPEG, or PNG logo file that appears partially transparent in a corner of the player throughout playback. Logo file must be 2.5 MB or smaller. |  [optional]
**playerLogoPosition** | [**PlayerLogoPositionEnum**](#PlayerLogoPositionEnum) | The corner of the player in which you want the player logo to appear. The default is **top-left**. |  [optional]
**playerResponsive** | **Boolean** | A player whose size adjusts according to the device on which it&#39;s being viewed. If **true**, creates a responsive player. If **false**, specify a *player_width*. |  [optional]
**playerType** | **String** | The player you want to use. Valid values are **original_html5**, which provides HTML5 playback and falls back to Flash on older browsers, and **wowza_player**, which provides HTML5 playback over Apple HLS. **wowza_player** requires that **target_delivery_protocol** be **hls-https** and **closed_caption_type** be **none**. The default is **original_html5**. |  [optional]
**playerVideoPosterImageUrl** | **String** | The path to a GIF, JPEG, or PNG poster image that appears in the player before the stream begins. Poster image files must be 2.5 MB or smaller. |  [optional]
**playerWidth** | **Integer** | The width, in pixels, of a fixed-size player. The default is **640**. |  [optional]
**recording** | **Boolean** | If **true**, creates a recording of the live stream. The default is **false**. |  [optional]
**sourceConnectionInformation** | **Object** | Details that you can use to manually configure and connect a video source to the live stream. |  [optional]
**streamSourceId** | **String** | The unique alphanumeric string that identifies the stream source, if a stream source is used. |  [optional]
**streamTargets** | [**List&lt;StreamTargetsId**](StreamTargetsId.md) | An array of unique alphanumeric strings that identify the stream targets used by the live stream. |  [optional]
**targetDeliveryProtocol** | [**TargetDeliveryProtocolEnum**](#TargetDeliveryProtocolEnum) | The type of stream being delivered from Wowza Streaming Cloud. The default is **hls-https**. |  [optional]
**transcoderType** | [**TranscoderTypeEnum**](#TranscoderTypeEnum) | The type of transcoder, either **transcoded** for streams that are transcoded into adaptive bitrate renditions or **passthrough** for streams that aren&#39;t processed by the transcoder. The default is **transcoded**. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the live stream was updated. |  [optional]
**useStreamSource** | **Boolean** | If **true**, uses a stream source to deliver the stream to Wowza Streaming Cloud. The default, **false**, pushes directly to Wowza Streaming Cloud. |  [optional]


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


<a name="DeliveryTypeEnum"></a>
## Enum: DeliveryTypeEnum
Name | Value
---- | -----
SINGLE_BITRATE | &quot;single-bitrate&quot;
MULTI_BITRATE | &quot;multi-bitrate&quot;


<a name="EncoderEnum"></a>
## Enum: EncoderEnum
Name | Value
---- | -----
WOWZA_STREAMING_ENGINE | &quot;wowza_streaming_engine&quot;
WOWZA_GOCODER | &quot;wowza_gocoder&quot;
MEDIA_DS | &quot;media_ds&quot;
AXIS | &quot;axis&quot;
EPIPHAN | &quot;epiphan&quot;
HAUPPAUGE | &quot;hauppauge&quot;
JVC | &quot;jvc&quot;
LIVE_U | &quot;live_u&quot;
MATROX | &quot;matrox&quot;
NEWTEK_TRICASTER | &quot;newtek_tricaster&quot;
OSPREY | &quot;osprey&quot;
SONY | &quot;sony&quot;
TELESTREAM_WIRECAST | &quot;telestream_wirecast&quot;
TERADEK_CUBE | &quot;teradek_cube&quot;
VMIX | &quot;vmix&quot;
X_SPLIT | &quot;x_split&quot;
IPCAMERA | &quot;ipcamera&quot;
OTHER_RTMP | &quot;other_rtmp&quot;
OTHER_RTSP | &quot;other_rtsp&quot;


<a name="PlayerLogoPositionEnum"></a>
## Enum: PlayerLogoPositionEnum
Name | Value
---- | -----
TOP_LEFT | &quot;top-left&quot;
TOP_RIGHT | &quot;top-right&quot;
BOTTOM_LEFT | &quot;bottom-left&quot;
BOTTOM_RIGHT | &quot;bottom-right&quot;


<a name="TargetDeliveryProtocolEnum"></a>
## Enum: TargetDeliveryProtocolEnum
Name | Value
---- | -----
HTTPS | &quot;hls-https&quot;
HDS | &quot;hls-hds&quot;


<a name="TranscoderTypeEnum"></a>
## Enum: TranscoderTypeEnum
Name | Value
---- | -----
TRANSCODED | &quot;transcoded&quot;
PASSTHROUGH | &quot;passthrough&quot;



