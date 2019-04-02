
# Geoblock

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countries** | **List&lt;String** | Required when *type* is **allow** or **deny**. The locations affected by the geo-blocking. Enter a comma-separated list (an array) of two-letter ISO 3166-1 country codes. For a list, see &lt;a href&#x3D;&#39;https://en.wikipedia.org/wiki/ISO_3166-1&#39; target&#x3D;&#39;_blank&#39;ISO 3166-1&lt;/a on wikipedia. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the geo-blocking rendition was created. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the geo-blocking. |  [optional]
**streamTargetId** | **String** | The unique alphanumeric string that identifies the stream target. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of geo-blocking to apply. The value **allow** permits viewing only in the locations specified by the *countries* parameter. The value **deny** prohibits viewing in the locations specified by the *countries* parameter. The value **disabled** (the default) permits viewing everywhere. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the geo-blocking rendition was updated. |  [optional]
**whitelist** | **List&lt;String** | Whitelisted addresses can be viewed even if they&#39;re within a geo-blocked location. Enter a comma-separated list (an array) of IP addresses that always allow streaming. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
REQUESTED | &quot;requested&quot;
ACTIVATED | &quot;activated&quot;
UPDATE_REQUESTED | &quot;update_requested&quot;
DELETE_REQUESTED | &quot;delete_requested&quot;
FAILED | &quot;failed&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DISABLED | &quot;disabled&quot;
ALLOW | &quot;allow&quot;
DENY | &quot;deny&quot;



