# TranscodersApi

All URIs are relative to *https://api.cloud.wowza.com/api/v1.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTranscoder**](TranscodersApi.md#createTranscoder) | **POST**transcoders | Create a transcoder
[**createTranscoderOutput**](TranscodersApi.md#createTranscoderOutput) | **POST**transcoders/{transcoder_id}/outputs | Create an output
[**createTranscoderOutputOutputStreamTarget**](TranscodersApi.md#createTranscoderOutputOutputStreamTarget) | **POST**transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets | Create an output stream target
[**createTranscoderProperty**](TranscodersApi.md#createTranscoderProperty) | **POST**transcoders/{transcoder_id}/properties | Configure a property for a transcoder
[**deleteTranscoder**](TranscodersApi.md#deleteTranscoder) | **DELETE**transcoders/{id} | Delete a transcoder
[**deleteTranscoderOutput**](TranscodersApi.md#deleteTranscoderOutput) | **DELETE**transcoders/{transcoder_id}/outputs/{id} | Delete an output
[**deleteTranscoderOutputOutputStreamTarget**](TranscodersApi.md#deleteTranscoderOutputOutputStreamTarget) | **DELETE**transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets/{stream_target_id} | Delete an output stream target
[**deleteTranscoderProperty**](TranscodersApi.md#deleteTranscoderProperty) | **DELETE**transcoders/{transcoder_id}/properties/{id} | Delete a transcoder&#39;s property
[**disableAllStreamTargetsTranscoder**](TranscodersApi.md#disableAllStreamTargetsTranscoder) | **PUT**transcoders/{id}/disable_all_stream_targets | Disable a transcoder&#39;s stream targets
[**disableTranscoderOutputOutputStreamTarget**](TranscodersApi.md#disableTranscoderOutputOutputStreamTarget) | **PUT**transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets/{stream_target_id}/disable | Disable an output stream target
[**enableAllStreamTargetsTranscoder**](TranscodersApi.md#enableAllStreamTargetsTranscoder) | **PUT**transcoders/{id}/enable_all_stream_targets | Enable a transcoder&#39;s stream targets
[**enableTranscoderOutputOutputStreamTarget**](TranscodersApi.md#enableTranscoderOutputOutputStreamTarget) | **PUT**transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets/{stream_target_id}/enable | Enable an output stream target
[**indexUptimes**](TranscodersApi.md#indexUptimes) | **GET**transcoders/{transcoder_id}/uptimes | Fetch all uptime records for a transcoder
[**listTranscoderOutputOutputStreamTargets**](TranscodersApi.md#listTranscoderOutputOutputStreamTargets) | **GET**transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets | Fetch all output stream targets of an output of a transcoder
[**listTranscoderOutputs**](TranscodersApi.md#listTranscoderOutputs) | **GET**transcoders/{transcoder_id}/outputs | Fetch all outputs of a transcoder
[**listTranscoderProperties**](TranscodersApi.md#listTranscoderProperties) | **GET**transcoders/{transcoder_id}/properties | Fetch a transcoder&#39;s properties
[**listTranscoderRecordings**](TranscodersApi.md#listTranscoderRecordings) | **GET**transcoders/{id}/recordings | Fetch a transcoder&#39;s recordings
[**listTranscoderSchedules**](TranscodersApi.md#listTranscoderSchedules) | **GET**transcoders/{id}/schedules | Fetch transcoder&#39;s schedules
[**listTranscoders**](TranscodersApi.md#listTranscoders) | **GET**transcoders | Fetch all transcoders
[**resetTranscoder**](TranscodersApi.md#resetTranscoder) | **PUT**transcoders/{id}/reset | Reset a transcoder
[**restartTranscoderOutputOutputStreamTarget**](TranscodersApi.md#restartTranscoderOutputOutputStreamTarget) | **PUT**transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets/{stream_target_id}/restart | Restart an output stream target
[**showTranscoder**](TranscodersApi.md#showTranscoder) | **GET**transcoders/{id} | Fetch a transcoder
[**showTranscoderOutput**](TranscodersApi.md#showTranscoderOutput) | **GET**transcoders/{transcoder_id}/outputs/{id} | Fetch an output
[**showTranscoderOutputOutputStreamTarget**](TranscodersApi.md#showTranscoderOutputOutputStreamTarget) | **GET**transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets/{stream_target_id} | Fetch an output stream target
[**showTranscoderProperty**](TranscodersApi.md#showTranscoderProperty) | **GET**transcoders/{transcoder_id}/properties/{id} | Fetch a property for a transcoder
[**showTranscoderState**](TranscodersApi.md#showTranscoderState) | **GET**transcoders/{id}/state | Fetch the state and uptime ID of a transcoder
[**showTranscoderStats**](TranscodersApi.md#showTranscoderStats) | **GET**transcoders/{id}/stats | Fetch statistics for a current transcoder
[**showTranscoderThumbnailUrl**](TranscodersApi.md#showTranscoderThumbnailUrl) | **GET**transcoders/{id}/thumbnail_url | Fetch the thumbnail URL of a transcoder
[**showUptime**](TranscodersApi.md#showUptime) | **GET**transcoders/{transcoder_id}/uptimes/{id} | Fetch an uptime record
[**showUptimeMetricsCurrent**](TranscodersApi.md#showUptimeMetricsCurrent) | **GET**transcoders/{transcoder_id}/uptimes/{id}/metrics/current | Fetch current stream health metrics for an active transcoder
[**showUptimeMetricsHistoric**](TranscodersApi.md#showUptimeMetricsHistoric) | **GET**transcoders/{transcoder_id}/uptimes/{id}/metrics/historic | Fetch historic stream health metrics for a transcoder
[**startTranscoder**](TranscodersApi.md#startTranscoder) | **PUT**transcoders/{id}/start | Start a transcoder
[**stopTranscoder**](TranscodersApi.md#stopTranscoder) | **PUT**transcoders/{id}/stop | Stop a transcoder
[**updateTranscoder**](TranscodersApi.md#updateTranscoder) | **PATCH**transcoders/{id} | Update a transcoder
[**updateTranscoderOutput**](TranscodersApi.md#updateTranscoderOutput) | **PATCH**transcoders/{transcoder_id}/outputs/{id} | Update an output
[**updateTranscoderOutputOutputStreamTarget**](TranscodersApi.md#updateTranscoderOutputOutputStreamTarget) | **PATCH**transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets/{stream_target_id} | Update an output stream target


<a name="createTranscoder"></a>
# **createTranscoder**
> Transcoder createTranscoder(transcoder)

Create a transcoder

This operation creates a transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class CreateATranscoderExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	String streamSourceId = "xxxxxx";

	TranscodersApi apiInstance = new TranscodersApi();
	Transcoder newTranscoder = new Transcoder();     
        newTranscoder.setBillingMode(Transcoder.BillingModeEnum.PAY_AS_YOU_GO);
        newTranscoder.setBroadcastLocation(Transcoder.BroadcastLocationEnum.EU_BELGIUM);
        newTranscoder.setDeliveryMethod(Transcoder.DeliveryMethodEnum.PULL);
        newTranscoder.setName("Transcoder Java SDK Example Name");
        newTranscoder.setProtocol(Transcoder.ProtocolEnum.RTMP);
        newTranscoder.setTranscoderType(Transcoder.TranscoderTypeEnum.TRANSCODED);
        newTranscoder.setClosedCaptionType(Transcoder.ClosedCaptionTypeEnum.CEA);
        newTranscoder.setBufferSize(Transcoder.BufferSizeEnum.NUMBER_4000);
        newTranscoder.setDescription("Transcoder Java SDK Example Description");
        newTranscoder.setDisableAuthentication(false);
        newTranscoder.setIdleTimeout(1200);
        newTranscoder.setLowLatency(false);
        newTranscoder.setPassword("0123456789abcdef");
        newTranscoder.setPlayMaximumConnections(Transcoder.PlayMaximumConnectionsEnum.NUMBER_20);
        newTranscoder.setRecording(false);
        newTranscoder.setSourceUrl("127.0.0.1/live/myStream@123456");
        newTranscoder.setStreamExtension(".magic");
        newTranscoder.setStreamSmoother(false);
        newTranscoder.setStreamSourceId(streamSourceId);
        newTranscoder.setSuppressStreamTargetStart(false);
        newTranscoder.setUsername("JavaSDKUserName");
        newTranscoder.setWatermark(false);
        newTranscoder.setWatermarkHeight(80);
        newTranscoder.setWatermarkWidth(100);
        newTranscoder.setWatermarkOpacity(Transcoder.WatermarkOpacityEnum.NUMBER_75);
        newTranscoder.setWatermarkPosition(Transcoder.WatermarkPositionEnum.BOTTOM_LEFT);
        newTranscoder.setWatermarkImageUrl("https://www.wowza.com/images/logo.jpg");
	try {
		    Transcoder result = apiInstance.createTranscoder(newTranscoder);
		    System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#createTranscoder");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoder** | [**Transcoder**](Transcoder.md)| Provide the details of the transcoder to create. |

### Return type

[**Transcoder**](Transcoder.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTranscoderOutput"></a>
# **createTranscoderOutput**
> Output createTranscoderOutput(transcoderId, output)

Create an output

This operation creates an output rendition for a specific transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class CreateOutputForTranscoder {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";

	Output newOutput = new Output();
        newOutput.setStreamFormat(Output.StreamFormatEnum.AUDIOVIDEO);
        newOutput.setAspectRatioHeight(240);
        newOutput.setAspectRatioWidth(480);
        newOutput.setBitrateAudio(192);
        newOutput.setBitrateVideo(2400);
        newOutput.setH264Profile(Output.H264ProfileEnum.BASELINE);
        newOutput.setKeyframes(Output.KeyframesEnum.FOLLOW_SOURCE);
        newOutput.setPassthroughAudio(true);
        newOutput.setPassthroughVideo(false);

	try {
		Output result = apiInstance.createTranscoderOutput(transcoderId,newOutput);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#createTranscoderOutput");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **output** | [**Output**](Output.md)| Provide the details of the output rendition to create. |

### Return type

[**Output**](Output.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTranscoderOutputOutputStreamTarget"></a>
# **createTranscoderOutputOutputStreamTarget**
> OutputStreamTarget createTranscoderOutputOutputStreamTarget(transcoderId, outputId, outputStreamTarget)

Create an output stream target

This operation creates an output stream target. Ultra low latency stream targets can&#39;t be added to output renditions.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class CreateOutputStreamTargetForTranscoder {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	String outputId = "xxxxxx";
	String streamTargetId = "xxxxxx";

        OutputStreamTarget newOutputTarget = new OutputStreamTarget();
        
	newOutputTarget.setStreamTargetId(streamTargetId);
        newOutputTarget.setUseStreamTargetBackupUrl(false);

	try {
		OutputStreamTarget result = apiInstance.createTranscoderOutputOutputStreamTarget(transcoderId,outputId, newOutputTarget);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#createTranscoderOutputOutputStreamTarget");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **outputId** | **String**| The unique alphanumeric string that identifies the output rendition. |
 **outputStreamTarget** | [**OutputStreamTarget**](OutputStreamTarget.md)| Provide the details of the output stream target to create. Ultra low latency stream targets can&#39;t be added to output renditions. |

### Return type

[**OutputStreamTarget**](OutputStreamTarget.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTranscoderProperty"></a>
# **createTranscoderProperty**
> TranscoderProperty createTranscoderProperty(transcoderId, property)

Configure a property for a transcoder

This operation configures a property for a transcoder. For more information see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-set-advanced-properties-by-using-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;Set advanced properties with the Wowza Streaming Cloud REST API&lt;/a.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class ConfigureATranscoderProperty {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	String transcoderPropertyId = "cupertino-cupertinoProgramDateTimeOffset";

	TranscoderProperty transProp = new TranscoderProperty();
       transProp.setKey("debugRtspSession");
        transProp.setSection("rtsp");
        transProp.setValue("true");

	try {
		TranscoderProperty result = apiInstance.createTranscoderProperty(transcoderId,transProp);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#createTranscoderProperty");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **property** | [**TranscoderProperty**](TranscoderProperty.md)| Provide the details of the property to configure. |

### Return type

[**TranscoderProperty**](TranscoderProperty.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTranscoder"></a>
# **deleteTranscoder**
> deleteTranscoder(id)

Delete a transcoder

This operation deletes a transcoder, including all of its assigned output renditions and stream targets.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class DeleteATranscoderExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";

	try {
			apiInstance.deleteTranscoder(transcoderId);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#deleteTranscoder");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTranscoderOutput"></a>
# **deleteTranscoderOutput**
> deleteTranscoderOutput(transcoderId, id)

Delete an output

This operation deletes an output, including all of its assigned targets.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class DeleteATranscoderOutput {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	String outputId = "xxxxxx";

	try {
		apiInstance.deleteTranscoderOutput(transcoderId,outputId);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#deleteTranscoderOutput");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **id** | **String**| The unique alphanumeric string that identifies the output rendition. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTranscoderOutputOutputStreamTarget"></a>
# **deleteTranscoderOutputOutputStreamTarget**
> deleteTranscoderOutputOutputStreamTarget(transcoderId, outputId, streamTargetId)

Delete an output stream target

This operation deletes an output stream target, including all of its assigned targets.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class DeleteATranscoderOutputStreamTarget {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
        String outputId = "xxxxxx";
        String streamTargetId = "xxxxxx";

	try {
		apiInstance.deleteTranscoderOutputOutputStreamTarget(transcoderId,outputId,streamTargetId);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#deleteTranscoderOutputOutputStreamTarget");
            System.err.println("Exception when calling TranscodersApi#Code:"+e.getCode());
            System.err.println("Exception when calling TranscodersApi#ResponseBody:"+e.getResponseBody());
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **outputId** | **String**| The unique alphanumeric string that identifies the output rendition. |
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTranscoderProperty"></a>
# **deleteTranscoderProperty**
> deleteTranscoderProperty(transcoderId, id)

Delete a transcoder&#39;s property

This operation deletes a specific property from a specific transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class DeleteATranscoderProperty {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	String transcoderPropertyId = "rtsp-debugRtspSession";

	try {
		apiInstance.deleteTranscoderProperty(transcoderId,transcoderPropertyId);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#deleteTranscoderProperty");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **transcoderPropertyId** | **String**| The unique string that identifies the transcoder property. The string contains the section and the key, connected by a dash. For example, cupertino-cupertinoProgramDateTimeOffset. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableAllStreamTargetsTranscoder"></a>
# **disableAllStreamTargetsTranscoder**
> StreamTargetsState disableAllStreamTargetsTranscoder(id)

Disable a transcoder&#39;s stream targets

This operation disables all of the stream targets assigned to a specific transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class DisableATranscoderStreamTargets {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";

	try {
		    StreamTargetsState result = apiInstance.disableAllStreamTargetsTranscoder(transcoderId);
		    System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#disableAllStreamTargetsTranscoder");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**StreamTargetsState**](StreamTargetsState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableTranscoderOutputOutputStreamTarget"></a>
# **disableTranscoderOutputOutputStreamTarget**
> StreamTargetState disableTranscoderOutputOutputStreamTarget(transcoderId, outputId, streamTargetId)

Disable an output stream target

This operation disables an output stream target.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class DisableATranscoderOutputStreamTarget {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
        String outputId = "xxxxxx";
        String streamTargetId = "xxxxxx";

	try {
		StreamTargetState result = apiInstance.disableTranscoderOutputOutputStreamTarget(transcoderId,outputId,streamTargetId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#disableTranscoderOutputOutputStreamTarget");
            System.err.println("Exception when calling TranscodersApi#Code:"+e.getCode());
            System.err.println("Exception when calling TranscodersApi#ResponseBody:"+e.getResponseBody());
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **outputId** | **String**| The unique alphanumeric string that identifies the output rendition. |
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |

### Return type

[**StreamTargetState**](StreamTargetState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enableAllStreamTargetsTranscoder"></a>
# **enableAllStreamTargetsTranscoder**
> StreamTargetsState enableAllStreamTargetsTranscoder(id)

Enable a transcoder&#39;s stream targets

This operation enables all of the stream targets assigned to a specific transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class EnableATranscoderStreamTargets {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	try {
		    StreamTargetsState result = apiInstance.enableAllStreamTargetsTranscoder(transcoderId);
		    System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#enableAllStreamTargetsTranscoder");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**StreamTargetsState**](StreamTargetsState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enableTranscoderOutputOutputStreamTarget"></a>
# **enableTranscoderOutputOutputStreamTarget**
> StreamTargetState enableTranscoderOutputOutputStreamTarget(transcoderId, outputId, streamTargetId)

Enable an output stream target

This operation enables an output stream target.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class EnableATranscoderOutputStreamTarget {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
        String outputId = "xxxxxx";
        String streamTargetId = "xxxxxx";

	try {
		StreamTargetState result = apiInstance.enableTranscoderOutputOutputStreamTarget(transcoderId,outputId,streamTargetId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#enableTranscoderOutputOutputStreamTarget");
            System.err.println("Exception when calling TranscodersApi#Code:"+e.getCode());
            System.err.println("Exception when calling TranscodersApi#ResponseBody:"+e.getResponseBody());
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **outputId** | **String**| The unique alphanumeric string that identifies the output rendition. |
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |

### Return type

[**StreamTargetState**](StreamTargetState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="indexUptimes"></a>
# **indexUptimes**
> List<Uptime> indexUptimes(transcoderId, page, perPage)

Fetch all uptime records for a transcoder

This operation shows all of the uptime records for a specific transcoder. An *uptime record* identifies a specific transcoding session.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchAllTranscoderUptimeRecords {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	Integer page = 1;
        Integer perPage = 56;
	String transcoderId = "xxxxxx";

	try {
		List<Uptime> result = apiInstance.indexUptimes(transcoderId,page,perPage);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#indexUptimes");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **page** | **Integer**| Returns a paginated view of results from the HTTP request. Specify a positive integer to indicate which page of the results should be displayed. The default is **1**. For more information and examples, see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-get-paginated-query-results-with-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;Get paginated query results with the Wowza Streaming Cloud REST API&lt;/a. | [optional]
 **perPage** | **Integer**| For use with the *page* parameter. Indicates how many records should be included in a page of results. A valid value is any positive integer. The default and maximum value is **1000**. | [optional]

### Return type

[**List<Uptime>**](Uptime.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTranscoderOutputOutputStreamTargets"></a>
# **listTranscoderOutputOutputStreamTargets**
> List<OutputStreamTarget> listTranscoderOutputOutputStreamTargets(transcoderId, outputId)

Fetch all output stream targets of an output of a transcoder

This operation shows the details of all of the output stream targets of an output of a transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchAllTranscoderStreamTargetsForOutput {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	String outputId = "xxxxxx";

	try {
		List<OutputStreamTarget> result = apiInstance.listTranscoderOutputOutputStreamTargets(transcoderId,outputId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#listTranscoderOutputOutputStreamTargets");
	    e.printStackTrace();
		}

    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **outputId** | **String**| The unique alphanumeric string that identifies the output rendition. |

### Return type

[**List<OutputStreamTarget>**](OutputStreamTarget.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTranscoderOutputs"></a>
# **listTranscoderOutputs**
> List<Output> listTranscoderOutputs(transcoderId)

Fetch all outputs of a transcoder

This operation shows the details of all of the output renditions of a specific transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchAllTranscoderOutputs {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
        String transcoderId = "xxxxxx";

	try {
		List<Output> result = apiInstance.listTranscoderOutputs(transcoderId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#listTranscoderOutputs");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**List<Output>**](Output.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTranscoderProperties"></a>
# **listTranscoderProperties**
> List<TranscoderProperty> listTranscoderProperties(transcoderId)

Fetch a transcoder&#39;s properties

This operation shows all of the properties of a specific transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchAllTranscoderProperties {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
        String transcoderId = "xxxxxx";

	try {
		List<TranscoderProperty> result = apiInstance.listTranscoderProperties(transcoderId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#listTranscoderProperties");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**List<TranscoderProperty>**](TranscoderProperty.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTranscoderRecordings"></a>
# **listTranscoderRecordings**
> List<Recording> listTranscoderRecordings(id)

Fetch a transcoder&#39;s recordings

This operation shows the details of all of the recordings for a specific transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchATranscoderRecordings {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";

	try {
		List<Recording> result = apiInstance.listTranscoderRecordings(transcoderId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#listTranscoderRecordings");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**List<Recording>**](Recording.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTranscoderSchedules"></a>
# **listTranscoderSchedules**
> List<Schedule> listTranscoderSchedules(id)

Fetch transcoder&#39;s schedules

This operation shows the details of all of the schedules for a specific transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchATranscoderSchedules {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";

	try {
		List<Schedule> result = apiInstance.listTranscoderSchedules(transcoderId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#listTranscoderSchedules");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**List<Schedule>**](Schedule.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTranscoders"></a>
# **listTranscoders**
> List<IndexTranscoder> listTranscoders(filter, page, perPage)

Fetch all transcoders

This operation shows limited details for all of your transcoders. For detailed information, fetch a single transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchAllTranscodersExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	Integer page = 1;
	Integer perPage = 1;
	try {
		    List<IndexTranscoder> result = apiInstance.listTranscoders(null, page, perPage);
		    System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#listTranscoders");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Restricts the data that gets returned by filtering on one or more values associated with a field. Construct a filter using a two-part expression that specifies the field on which to filter and the logic to use to filter.  Valid filter fields are **created_at**, **id**, **name**, and **state**.  Valid filter operators are **eq** (equals), which accepts one value, and **in** (equals any of), which accepts a comma-separated string of values.  Filters use a zero-based index.  For example:  **filter[0][field]&#x3D;state&amp;filter[0][eq]&#x3D;stopped**  For more information and examples, see the technical article [How to get filtered query results with the Wowza Streaming Cloud REST API](https://www.wowza.com/docs/how-to-get-filtered-query-results-with-the-wowza-streaming-cloud-rest-api). | [optional]
 **page** | **Integer**| Returns a paginated view of results from the HTTP request. Specify a positive integer to indicate which page of the results should be displayed. The default is **1**. For more information and examples, see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-get-paginated-query-results-with-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;Get paginated query results with the Wowza Streaming Cloud REST API&lt;/a. | [optional]
 **perPage** | **Integer**| For use with the *page* parameter. Indicates how many records should be included in a page of results. A valid value is any positive integer. The default and maximum value is **1000**. | [optional]

### Return type

[**List<IndexTranscoder>**](IndexTranscoder.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetTranscoder"></a>
# **resetTranscoder**
> TranscoderState resetTranscoder(id)

Reset a transcoder

This operation resets a transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class ResetATranscoderExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";

	try {
		TranscoderState result = apiInstance.resetTranscoder(transcoderId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#resetTranscoder");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**TranscoderState**](TranscoderState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="restartTranscoderOutputOutputStreamTarget"></a>
# **restartTranscoderOutputOutputStreamTarget**
> StreamTargetState restartTranscoderOutputOutputStreamTarget(transcoderId, outputId, streamTargetId)

Restart an output stream target

This operation restarts an output stream target.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class RestartATranscoderOutputStreamTarget {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
        String outputId = "xxxxxx";
        String streamTargetId = "xxxxxx";

	try {
		StreamTargetState result = apiInstance.restartTranscoderOutputOutputStreamTarget(transcoderId,outputId,streamTargetId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#restartTranscoderOutputOutputStreamTarget");
            System.err.println("Exception when calling TranscodersApi#Code:"+e.getCode());
            System.err.println("Exception when calling TranscodersApi#ResponseBody:"+e.getResponseBody());
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **outputId** | **String**| The unique alphanumeric string that identifies the output rendition. |
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |

### Return type

[**StreamTargetState**](StreamTargetState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTranscoder"></a>
# **showTranscoder**
> Transcoder showTranscoder(id)

Fetch a transcoder

This operation shows the details of a specific transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchATranscoder {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	try {
		    Transcoder result = apiInstance.showTranscoder(transcoderId);
		    System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#showTranscoder");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**Transcoder**](Transcoder.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTranscoderOutput"></a>
# **showTranscoderOutput**
> Output showTranscoderOutput(transcoderId, id)

Fetch an output

This operation shows the details of a specific output rendition for a specific transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchATranscoderOutput {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	String outputId = "xxxxxx";

	try {
		Output result = apiInstance.showTranscoderOutput(transcoderId,outputId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#showTranscoderOutput");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **id** | **String**| The unique alphanumeric string that identifies the output rendition. |

### Return type

[**Output**](Output.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTranscoderOutputOutputStreamTarget"></a>
# **showTranscoderOutputOutputStreamTarget**
> OutputStreamTarget showTranscoderOutputOutputStreamTarget(transcoderId, outputId, streamTargetId)

Fetch an output stream target

This operation shows the details of an output stream target.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchATranscoderOutputStreamTarget {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	String outputId = "xxxxxx";
	String streamTargetId = "xxxxxx";

	try {
		OutputStreamTarget result = apiInstance.showTranscoderOutputOutputStreamTarget(transcoderId,outputId,streamTargetId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#showTranscoderOutputOutputStreamTarget");
	    e.printStackTrace();
		}

    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **outputId** | **String**| The unique alphanumeric string that identifies the output rendition. |
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |

### Return type

[**OutputStreamTarget**](OutputStreamTarget.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTranscoderProperty"></a>
# **showTranscoderProperty**
> TranscoderProperty showTranscoderProperty(transcoderId, id)

Fetch a property for a transcoder

This operation shows the details of a specific property for a specific transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchATranscoderProperty {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	String transcoderPropertyId = "cupertino-cupertinoProgramDateTimeOffset";

	try {
		TranscoderProperty result = apiInstance.showTranscoderProperty(transcoderId,transcoderPropertyId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#showTranscoderProperty");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **id** | **String**| The unique string that identifies the transcoder property. The string contains the section and the key, connected by a dash. For example, cupertino-cupertinoProgramDateTimeOffset. |

### Return type

[**TranscoderProperty**](TranscoderProperty.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTranscoderState"></a>
# **showTranscoderState**
> TranscoderState showTranscoderState(id)

Fetch the state and uptime ID of a transcoder

This operation shows the current state and uptime ID of a transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchATranscoderStateUptimeID {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	try {
		    TranscoderState result = apiInstance.showTranscoderState(transcoderId);
		    System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#showTranscoderState");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**TranscoderState**](TranscoderState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTranscoderStats"></a>
# **showTranscoderStats**
> ShmMetrics showTranscoderStats(id)

Fetch statistics for a current transcoder

This operation responds with a hash of metrics (keys) for a currently running transcoder. Each key has a **status**, **text** (description), **units**, and **value**.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchATranscoderStatistics {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";

	try {
		ShmMetrics result = apiInstance.showTranscoderStats(transcoderId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#showTranscoderStats");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**ShmMetrics**](ShmMetrics.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showTranscoderThumbnailUrl"></a>
# **showTranscoderThumbnailUrl**
> LiveStreamThumbnail showTranscoderThumbnailUrl(id)

Fetch the thumbnail URL of a transcoder

This operation shows the thumbnail URL of a started transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchATranscoderThumbnailUrl {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	try {
		    LiveStreamThumbnail result = apiInstance.showTranscoderThumbnailUrl(transcoderId);
		    System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#showTranscoderThumbnailUrl");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**LiveStreamThumbnail**](LiveStreamThumbnail.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showUptime"></a>
# **showUptime**
> Uptime showUptime(transcoderId, id)

Fetch an uptime record

This operation shows the details of a specific uptime record for a specific transcoder. An *uptime record* identifies a transcoding session.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchATranscoderUptimeRecord {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	String uptimeId = "xxxxxx";

	try {
		Uptime result = apiInstance.showUptime(transcoderId,uptimeId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#showUptime");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **id** | **String**| The unique alphanumeric string that identifies the uptime record. |

### Return type

[**Uptime**](Uptime.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showUptimeMetricsCurrent"></a>
# **showUptimeMetricsCurrent**
> LimitsResponse showUptimeMetricsCurrent(transcoderId, id, fields)

Fetch current stream health metrics for an active transcoder

This operation returns a snapshot of the current source connection and processing details of an active (running) transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchATranscoderStreamHealth {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
        String uptimeId = "xxxxxx";

	try {
		LimitsResponse result = apiInstance.showUptimeMetricsCurrent(transcoderId,uptimeId,null);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#showUptimeMetricsCurrent");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **id** | **String**| The unique alphanumeric string that identifies the uptime record. |
 **fields** | **String**| A comma-separated list of fields to return. | [optional]

### Return type

[**LimitsResponse**](LimitsResponse.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showUptimeMetricsHistoric"></a>
# **showUptimeMetricsHistoric**
> LimitsResponse showUptimeMetricsHistoric(transcoderId, id, fields, from, to)

Fetch historic stream health metrics for a transcoder

This operation shows the historic source connection and processing details for a transcoding session (uptime record). The transcoder can be running or stopped. Metrics are recorded every 20 seconds.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class FetchATranscoderHistoricHealth {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
        String uptimeId = "xxxxxx";

	String fromTime = "2017-07-06T14:20:00Z";
	String toTime = "2019-07-06T14:20:00Z";
	try {
		LimitsResponse result = apiInstance.showUptimeMetricsHistoric(transcoderId,uptimeId,null,null,null);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#showUptimeMetricsHistoric");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **id** | **String**| The unique alphanumeric string that identifies the uptime record. |
 **fields** | **String**| A comma-separated list of fields to return. | [optional]
 **from** | **String**| The start of the range of time used to aggregate the metrics. Express the value by using the ISO 8601 standard of **YYYY-MM-DDTHH:MM:SSZ** where **HH** is a 24-hour clock in UTC. | [optional]
 **to** | **String**| The end of the range of time used to aggregate the metrics. Express the value by using the ISO 8601 standard of **YYYY-MM-DDTHH:MM:SSZ** where **HH** is a 24-hour clock in UTC. | [optional]

### Return type

[**LimitsResponse**](LimitsResponse.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startTranscoder"></a>
# **startTranscoder**
> TranscoderState startTranscoder(id)

Start a transcoder

This operation starts a transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class StartATranscoderExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";

	try {
		TranscoderState result = apiInstance.startTranscoder(transcoderId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#startTranscoder");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**TranscoderState**](TranscoderState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stopTranscoder"></a>
# **stopTranscoder**
> TranscoderState stopTranscoder(id)

Stop a transcoder

This operation stops a transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class StopATranscoderExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";

	try {
		TranscoderState result = apiInstance.stopTranscoder(transcoderId);
		System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#stopTranscoder");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the transcoder. |

### Return type

[**TranscoderState**](TranscoderState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTranscoder"></a>
# **updateTranscoder**
> Transcoder updateTranscoder(id, transcoder)

Update a transcoder

This operation updates a transcoder.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class UpdateATranscoder {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	try {
		Transcoder result = apiInstance.showTranscoder(transcoderId);
		result.setName("Transcoder Name Updated - Java SDK");
		Transcoder newResult = apiInstance.updateTranscoder(transcoderId,result);
		System.out.println(newResult);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#updateTranscoder");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **transcoder** | [**Transcoder**](Transcoder.md)| Provide the details of the transcoder to update. |

### Return type

[**Transcoder**](Transcoder.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTranscoderOutput"></a>
# **updateTranscoderOutput**
> Output updateTranscoderOutput(transcoderId, id, output)

Update an output

This operation updates an output rendition.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class UpdateATranscoderOutput {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	String outputId = "xxxxxx";

	try {
		Output result = apiInstance.showTranscoderOutput(transcoderId,outputId);
		System.out.println(result);
		result.setBitrateVideo(1400);

		Output newResult = apiInstance.updateTranscoderOutput(transcoderId,outputId,result);
		System.out.println(newResult);

		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#updateTranscoderOutput");
	    e.printStackTrace();
		}

    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **id** | **String**| The unique alphanumeric string that identifies the output rendition. |
 **output** | [**Output**](Output.md)| Provide the details of the output rendition to update in the body of the request. |

### Return type

[**Output**](Output.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTranscoderOutputOutputStreamTarget"></a>
# **updateTranscoderOutputOutputStreamTarget**
> OutputStreamTarget updateTranscoderOutputOutputStreamTarget(transcoderId, outputId, streamTargetId, outputStreamTarget)

Update an output stream target

This operation updates an output stream target.

### Example
```java
// Import classes:
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class UpdateATranscoderOutputStreamTarget {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

       / Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-access-key.setApiKeyPrefix("Token");

       / Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
       / Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
       /wsc-api-key.setApiKeyPrefix("Token");

	TranscodersApi apiInstance = new TranscodersApi();
	String transcoderId = "xxxxxx";
	String outputId = "xxxxxx";
	String streamTargetId = "xxxxxx";

	try {
		OutputStreamTarget result = apiInstance.showTranscoderOutputOutputStreamTarget(transcoderId,outputId,streamTargetId);
		System.out.println(result);

		result.setUseStreamTargetBackupUrl(true);

		OutputStreamTarget newResult = apiInstance.updateTranscoderOutputOutputStreamTarget(transcoderId,outputId,streamTargetId,result);
		System.out.println(newResult);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#updateTranscoderOutputOutputStreamTarget");
	    e.printStackTrace();
		}

    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transcoderId** | **String**| The unique alphanumeric string that identifies the transcoder. |
 **outputId** | **String**| The unique alphanumeric string that identifies the output rendition. |
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |
 **outputStreamTarget** | [**OutputStreamTarget**](OutputStreamTarget.md)| Provide the details of the output stream target to update. |

### Return type

[**OutputStreamTarget**](OutputStreamTarget.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

