
# TranscoderProperty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the property.  For **rtsp**, valid values are **debugRtspSession**, **maxRtcpWaitTime**, **avSyncMethod**, **rtspValidationFrequency**, **rtpTransportMode**, **rtspFilterUnknownTracks**, **rtpIgnoreSpropParameterSets**, and **rtpIgnoreProfileLevelId**.  For **cupertino**, valid values are **cupertinoEnableProgramDateTime**, **cupertinoEnableId3ProgramDateTime**, and **cupertinoProgramDateTimeOffset**. |  [optional]
**section** | **String** | The section of the transcoder configuration table that contains the property. Valid values are **rtsp** and **cupertino**. |  [optional]
**value** | **String** | The value of the property.   For **debugRtspSession**, **avSyncMethod**, **rtspFilterUnknownTracks**, **rtpIgnoreSpropParameterSets**, **rtpIgnoreProfileLevelId**, **cupertinoEnableProgramDateTime**, and **cupertinoEnableId3ProgramDateTime**, valid values are the Booleans **true** and **false**.  For **maxRtcpWaitTime**, valid values are **0** (ms) and greater, expressed as an integer.  For **rtpTransportMode**, valid values are the strings **udp** and **interleave**.  For **rtspValidationFrequency**, valid values are **0** (ms) and greater, expressed as an integer.  For **cupertinoProgramDateTimeOffset**, valid values are any integer (ms), expressed as an integer. |  [optional]



