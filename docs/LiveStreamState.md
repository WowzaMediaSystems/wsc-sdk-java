
# LiveStreamState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipAddress** | **String** | Available from version 1.1. The IP address of the live stream instance. If the live stream *state* is anything other than **started**, the *ip_address* is **0.0.0.0**. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the live stream. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
STARTED | &quot;started&quot;
STOPPED | &quot;stopped&quot;
STARTING | &quot;starting&quot;
STOPPING | &quot;stopping&quot;
RESETTING | &quot;resetting&quot;



