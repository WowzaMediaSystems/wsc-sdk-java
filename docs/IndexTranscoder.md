
# IndexTranscoder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the transcoder was created. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the transcoder. |  [optional]
**name** | **String** | A descriptive name for the transcoder. Maximum 200 characters. |  [optional]
**workflow** | [**WorkflowEnum**](#WorkflowEnum) | The method by which the transcoder was created, either **transcoder** for a transcoder created through the transcoder workflow or **live_stream** for a transcoder created automatically as part of the live stream workflow. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the transcoder was updated. |  [optional]


<a name="WorkflowEnum"></a>
## Enum: WorkflowEnum
Name | Value
---- | -----
LIVE_STREAM | &quot;live_stream&quot;
TRANSCODER | &quot;transcoder&quot;



