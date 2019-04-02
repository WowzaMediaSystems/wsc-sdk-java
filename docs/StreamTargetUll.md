
# StreamTargetUll

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the ultra low latency stream target was created. |  [optional]
**connectionCode** | **String** | A six-character, alphanumeric string that allows the Wowza GoCoder app to send an encoded stream to an ultra low latency stream target. The code can be used once and expires 24 hours after it&#39;s created. |  [optional]
**connectionCodeExpiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the *connection_code* expires. |  [optional]
**enabled** | **Boolean** | If **true** (the default), the source stream is ready to be ingested. If **false**, the source stream won&#39;t be ingested by the target&#39;s origin server. |  [optional]
**enableHls** | **Boolean** | If **true**, creates an Apple HLS URL for playback on iOS devices. The default is **false**. The HLS stream has the **convertAMFData** stream target property enabled by default. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the ultra low latency stream target. |  [optional]
**ingestIpWhitelist** | **List&lt;String** | Only for ultra low latency stream targets whose *source_delivery_method* is **push**. An array  of IP addresses in dot-decimal notation that can be used to connect to the target&#39;s origin server. Wildcards (*) are accepted for the final value in the IP address only. |  [optional]
**name** | **String** | A descriptive name for the ultra low latency stream target. Maximum 255 characters. |  [optional]
**playbackUrls** | [**HashOfPlaybackURLs**](HashOfPlaybackURLs.md) |  |  [optional]
**primaryUrl** | **String** | Only for ultra low latency stream targets whose *source_delivery_method* is **push**.The primary ingest URL of the target. |  [optional]
**regionOverride** | [**RegionOverrideEnum**](#RegionOverrideEnum) | Only for ultra low latency stream targets whose *source_delivery_method* is **pull**. The location of the ultra low latency stream target&#39;s origin server. If unspecified, Wowza Streaming Cloud determines the optimal region for the origin server. |  [optional]
**sourceDeliveryMethod** | [**SourceDeliveryMethodEnum**](#SourceDeliveryMethodEnum) | The type of connection between the stream source and the ultra low latency stream target. **push** instructs the source to push the stream to the stream target. **pull** instructs the stream target to pull the stream from the source. |  [optional]
**sourceUrl** | **String** | Only for ultra low latency stream targets whose *source_delivery_method* is **pull**. The URL of a source IP camera or encoder connecting to the stream target. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the ultra low latency stream target. |  [optional]
**streamName** | **String** | The name of the stream being ingested into the target. Returned only for ultra low latency stream targets whose *source_delivery_method* is **push**. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the ultra low latency stream target was updated. |  [optional]


<a name="RegionOverrideEnum"></a>
## Enum: RegionOverrideEnum
Name | Value
---- | -----
ORIGIN_NL_CENTRAL1_CDN_WOWZA_COM | &quot;origin-nl-central1.cdn.wowza.com&quot;
ORIGIN_US_CENTRAL2_CDN_WOWZA_COM | &quot;origin-us-central2.cdn.wowza.com&quot;
ORIGIN_IN_WEST1_CDN_WOWZA_COM | &quot;origin-in-west1.cdn.wowza.com&quot;
ORIGIN_HK_CENTRAL1_CDN_WOWZA_COM | &quot;origin-hk-central1.cdn.wowza.com&quot;
ORIGIN_JP_EAST1_CDN_WOWZA_COM | &quot;origin-jp-east1.cdn.wowza.com&quot;
NULL | &quot;null&quot;


<a name="SourceDeliveryMethodEnum"></a>
## Enum: SourceDeliveryMethodEnum
Name | Value
---- | -----
PUSH | &quot;push&quot;
PULL | &quot;pull&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
STARTED | &quot;started&quot;
STOPPED | &quot;stopped&quot;
ERROR | &quot;error&quot;



