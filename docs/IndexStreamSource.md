
# IndexStreamSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the stream source was created. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the stream source. |  [optional]
**name** | **String** | A descriptive name for the stream source. Maximum 255 characters. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | An **akamai** stream source is a Wowza Streaming Cloud edge resource that send streams to a Wowza Streaming Cloud transcoder using the RTMP protocol. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the stream source was updated. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
AKAMAI | &quot;akamai&quot;



