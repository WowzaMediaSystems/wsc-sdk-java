
# IndexStreamTarget

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the stream target was created. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the stream target. |  [optional]
**name** | **String** | A descriptive name for the stream target. Maximum 255 characters. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | **WowzaStreamTarget** is a Wowza CDN target. **CustomStreamTarget** (the default) is an external, third-party destination, and **UltraLowLatencyStreamTarget** is an ultra low latency stream target. &lt;!--and **FacebookStreamTarget** (a Facebook Live target).-- |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the stream target was updated. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
WOWZASTREAMTARGET | &quot;WowzaStreamTarget&quot;
CUSTOMSTREAMTARGET | &quot;CustomStreamTarget&quot;
ULTRALOWLATENCYSTREAMTARGET | &quot;UltraLowLatencyStreamTarget&quot;



