
# StreamSourceAkamai

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupIpAddress** | **String** | If *location_method* is **ip_address**, the backup IP address of the source encoder. |  [optional]
**backupUrl** | **String** | The backup RTMP playback URL of the transcoded stream. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the Akamai stream source was created. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the Akamai stream source. |  [optional]
**ipAddress** | **String** | If *location_method* is **ip_address**, the primary IP address of the source encoder. |  [optional]
**location** | [**LocationEnum**](#LocationEnum) | If *location_method* is **region**, specify a location as close as possible to the source encoder. |  [optional]
**locationMethod** | [**LocationMethodEnum**](#LocationMethodEnum) | The method used to determine the location of the Akamai stream source, either by **region** or based on the source encoder&#39;s **ip_address**. |  [optional]
**name** | **String** | A descriptive name for the Akamai stream source. Maximum 255 characters. |  [optional]
**password** | **String** | The password that you can use to configure the source encoder to authenticate to the Akamai stream source. |  [optional]
**playbackUrl** | **String** | The full RTMP playback URL. |  [optional]
**primaryUrl** | **String** | The primary RTMP playback URL of the transcoded stream. |  [optional]
**provider** | **String** | The provider of the Akamai stream source. |  [optional]
**streamName** | **String** | The name of the stream that you can use to configure the source encoder to connect to the Akamai stream source. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the Akamai stream source was updated. |  [optional]
**username** | **String** | The username that you can use to configure the source encoder to authenticate to the Akamai stream source. |  [optional]


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


<a name="LocationMethodEnum"></a>
## Enum: LocationMethodEnum
Name | Value
---- | -----
REGION | &quot;region&quot;
IP_ADDRESS | &quot;ip_address&quot;



