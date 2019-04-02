
# Recording

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the recording was created. |  [optional]
**downloadUrl** | **String** | The URL that can be used to download the recording. |  [optional]
**duration** | **Long** | The length of the recording, in hours, minutes, and seconds. |  [optional]
**fileName** | **String** | The file name of the recording. |  [optional]
**fileSize** | **Long** | The file size of the recording. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the recording. |  [optional]
**reason** | **String** | The reason that a recording has the state **failed**. |  [optional]
**startsAt** | **String** | The date and time that the recording started. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the recording. |  [optional]
**transcoderId** | **String** | The unique alphanumeric string that identifies the transcoder that was recorded. |  [optional]
**transcoderName** | **String** | The descriptive name of the transcoder that was recorded. |  [optional]
**transcodingUptimeId** | [**OffsetDateTime**](OffsetDateTime.md) | The unique identifier associated with the transcoding uptime for this recording. |  [optional]
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



