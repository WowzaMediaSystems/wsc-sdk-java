
# StreamTargetWowza

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupUrl** | **String** | Only for Wowza stream targets whose *provider* is *not* **akamai_cupertino**. The backup RTMP ingest URL of the Wowza Stream Target. |  [optional]
**connectionCode** | **String** | A six-character, alphanumeric string that allows Wowza Streaming Engine to send a transcoded stream to a Wowza stream target. The code can be used once and expires 24 hours after it&#39;s created. |  [optional]
**connectionCodeExpiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the *connection_code* expires. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the stream target was created. |  [optional]
**hdsPlaybackUrl** | **String** | The web address that the target uses to play Adobe HDS streams. |  [optional]
**hlsPlaybackUrl** | **String** | Only for targets whose *provider* is **akamai_cupertino**. The web address that the target uses to play Apple HLS streams. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the stream target. |  [optional]
**location** | [**LocationEnum**](#LocationEnum) | Only for Wowza stream targets whose *provider* is *not* **akamai_cupertino**. Choose a location as close as possible to your video source. |  [optional]
**name** | **String** | A descriptive name for the stream target. Maximum 255 characters. |  [optional]
**primaryUrl** | **String** | The primary ingest URL of the target. |  [optional]
**provider** | **String** | The CDN for the target. |  [optional]
**secureIngestQueryParam** | **String** | Only for targets whose *use_secure_ingest* is **true**. The query parameter needed for secure stream delivery between the transcoder and the target. |  [optional]
**streamName** | **String** | The name of the stream being ingested into the target. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the stream target was updated. |  [optional]
**useCors** | **Boolean** | Only for Wowza stream targets whose *provider* is **akamai_cupertino**. CORS, or cross-origin resource sharing, allows streams to be safely delivered across domains. |  [optional]
**useSecureIngest** | **Boolean** | Only for Wowza stream targets whose *provider* is **akamai_cupertino**. If **true**, generates a *secure_ingest_query_param* to securely deliver the stream from the transcoder to the provider. |  [optional]


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



