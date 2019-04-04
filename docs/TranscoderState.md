
# TranscoderState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipAddress** | **String** | Available from version 1.1. The IP address of the transcoder instance. If the transcoder *state* is anything other than **started**, the *ip_address* is **0.0.0.0**. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the transcoder. |  [optional]
**uptimeId** | **String** | The unique identifier associated with a specific uptime period of a transcoder. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
STARTING | &quot;starting&quot;
STOPPING | &quot;stopping&quot;
STARTED | &quot;started&quot;
STOPPED | &quot;stopped&quot;
RESETTING | &quot;resetting&quot;



