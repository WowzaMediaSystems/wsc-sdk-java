
# StreamTarget

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupUrl** | **String** | Only for targets whose whose *provider* is *not* **akamai_cupertino**. The backup RTMP ingest URL of the stream target. |  [optional]
**connectionCode** | **String** | A six-character, alphanumeric string that allows select encoders, such as Wowza Streaming Engine or the Wowza GoCoder app, to send an encoded stream to a stream target in Wowza Streaming Cloud. The code can be used once and expires 24 hours after it&#39;s created. |  [optional]
**connectionCodeExpiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the *connection_code* expires. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the stream target was created. |  [optional]
**hdsPlaybackUrl** | **String** | The web address that the target uses to play Adobe HDS streams. |  [optional]
**hlsPlaybackUrl** | **String** | Only for targets whose *provider* is **akamai_cupertino**. The web address that the target uses to play Apple HLS streams. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the stream target. |  [optional]
**location** | [**LocationEnum**](#LocationEnum) | Only for targets whose *type* is **WowzaStreamTarget** and *provider* is *not* **akamai_cupertino**. Choose a location as close as possible to your video source. |  [optional]
**name** | **String** | A descriptive name for the stream target. Maximum 255 characters. |  [optional]
**password** | **String** | Only for targets whose *type* is **CustomStreamTarget** and *provider* is *not* **akamai_cupertino**. A *username* must also be present. The password associated with the target username for RTMP authentication. |  [optional]
**primaryUrl** | **String** | The primary ingest URL of the target. |  [optional]
**provider** | **String** | The CDN for the target.  Required for targets whose *type* is **CustomStreamTarget**. Valid values for **CustomStreamTarget** are **akamai**, **akamai_cupertino**, **akamai_rtmp**, **limelight**, **rtmp**, and **ustream**. Values can be appended with **_mock** to use in the sandbox environment.  Valid values for **WowzaStreamTarget** are **akamai**, **akamai_cupertino** (default), and **akamai_legacy_rtmp**. |  [optional]
**rtmpPlaybackUrl** | **String** | Only for targets whose *type* is **CustomStreamTarget**. The web address that the target uses to play RTMP streams. |  [optional]
**secureIngestQueryParam** | **String** | Only for targets whose *use_secure_ingest* is **true**. The query parameter needed for secure stream delivery between the transcoder and the target. |  [optional]
**streamName** | **String** | The name of the stream being ingested into the target. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | **WowzaStreamTarget** is a Wowza CDN target. **CustomStreamTarget** (the default) is an external, third-party destination, and **UltraLowLatencyStreamTarget** is an ultra low latency stream target. &lt;!--and **FacebookStreamTarget** (a Facebook Live target).-- |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the stream target was updated. |  [optional]
**useCors** | **Boolean** | Only for targets whose *type* is **WowzaStreamTarget** and *provider* is **akamai_cupertino**. CORS, or cross-origin resource sharing, allows streams to be sent to providers such as Peer5, Viblast, and Streamroot, which implement a peer-to-peer grid delivery system. |  [optional]
**useSecureIngest** | **Boolean** | Only for targets whose *type* is **WowzaStreamTarget** and *provider* is **akamai_cupertino**. If **true**, generates a *secure_ingest_query_param* to securely deliver the stream from the transcoder to the provider. |  [optional]
**username** | **String** | Only for targets whose *type* is **CustomStreamTarget** and *provider* is *not* **akamai_cupertino**. The username or ID that the target uses for RTMP authentication. |  [optional]


<a name="LocationEnum"></a>
## Enum: LocationEnum
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


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
WOWZASTREAMTARGET | &quot;WowzaStreamTarget&quot;
CUSTOMSTREAMTARGET | &quot;CustomStreamTarget&quot;



