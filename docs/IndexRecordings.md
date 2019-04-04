
# IndexRecordings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the recording was created. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the recording. |  [optional]
**reason** | **String** | The reason that a recording has the state **failed**. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the recording. |  [optional]
**transcoderId** | **String** | The unique alphanumeric string that identifies the transcoder that was recorded. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the recording was updated. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
UPLOADING | &quot;uploading&quot;
CONVERTING | &quot;converting&quot;
REMOVING | &quot;removing&quot;
COMPLETED | &quot;completed&quot;
FAILED | &quot;failed&quot;



