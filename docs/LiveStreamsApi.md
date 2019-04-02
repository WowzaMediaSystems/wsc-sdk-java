# LiveStreamsApi

All URIs are relative to *https://api.cloud.wowza.com/api/v1.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLiveStream**](LiveStreamsApi.md#createLiveStream) | **POST**live_streams | Create a live stream
[**deleteLiveStream**](LiveStreamsApi.md#deleteLiveStream) | **DELETE**live_streams/{id} | Delete a live stream
[**listLiveStreams**](LiveStreamsApi.md#listLiveStreams) | **GET**live_streams | Fetch all live streams
[**regenerateConnectionCodeLiveStream**](LiveStreamsApi.md#regenerateConnectionCodeLiveStream) | **PUT**live_streams/{id}/regenerate_connection_code | Regenerate the connection code for a live stream
[**resetLiveStream**](LiveStreamsApi.md#resetLiveStream) | **PUT**live_streams/{id}/reset | Reset a live stream
[**showLiveStream**](LiveStreamsApi.md#showLiveStream) | **GET**live_streams/{id} | Fetch a live stream
[**showLiveStreamState**](LiveStreamsApi.md#showLiveStreamState) | **GET**live_streams/{id}/state | Fetch the state of a live stream
[**showLiveStreamStats**](LiveStreamsApi.md#showLiveStreamStats) | **GET**live_streams/{id}/stats | Fetch metrics for an active live stream
[**showLiveStreamThumbnailUrl**](LiveStreamsApi.md#showLiveStreamThumbnailUrl) | **GET**live_streams/{id}/thumbnail_url | Fetch the thumbnail URL of a live stream
[**startLiveStream**](LiveStreamsApi.md#startLiveStream) | **PUT**live_streams/{id}/start | Start a live stream
[**stopLiveStream**](LiveStreamsApi.md#stopLiveStream) | **PUT**live_streams/{id}/stop | Stop a live stream
[**updateLiveStream**](LiveStreamsApi.md#updateLiveStream) | **PATCH**live_streams/{id} | Update a live stream


<a name="createLiveStream"></a>
# **createLiveStream**
> LiveStream createLiveStream(liveStream)

Create a live stream

This operation creates a live stream.

### Example
```java
// Import classes:
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class CreateALiveStreamExample {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();

	LiveStream liveStream = new LiveStream();/ LiveStream | Provide the details of the live stream to create in the body of the request.
        liveStream.setName("JavaSDKCreate"+System.currentTimeMillis());
	liveStream.setAspectRatioHeight(1080);
        liveStream.setAspectRatioWidth(1920);
        liveStream.setBillingMode(LiveStream.BillingModeEnum.PAY_AS_YOU_GO);
        liveStream.setBroadcastLocation(LiveStream.BroadcastLocationEnum.EU_GERMANY);
        liveStream.setClosedCaptionType(LiveStream.ClosedCaptionTypeEnum.NONE);
        liveStream.setDeliveryMethod(LiveStream.DeliveryMethodEnum.PUSH);
        liveStream.setDeliveryType(LiveStream.DeliveryTypeEnum.SINGLE_BITRATE);
        liveStream.setEncoder(LiveStream.EncoderEnum.WOWZA_GOCODER);
        liveStream.setHostedPage(false);

       **
        liveStream.setHostedPageDescription("hostedDescription");
        liveStream.setHostedPageLogoImageUrl("http://www.wowza.com/imageURL");
        liveStream.setHostedPageSharingIcons(true);
        liveStream.setHostedPageTitle("pageTitleHERE");
        liveStream.setHostedPageUrl("http://www.wowza.com/pageURL");
        **/

       /liveStream.setLowLatency(true);
        liveStream.setPlayerWidth(720);
        liveStream.setTargetDeliveryProtocol(LiveStream.TargetDeliveryProtocolEnum.HTTPS);
        liveStream.setRecording(false);
        liveStream.setTranscoderType(LiveStream.TranscoderTypeEnum.TRANSCODED);
        liveStream.setUseStreamSource(false);
        List<String> deliveryProtocols = new ArrayList<String>();
        deliveryProtocols.add("rtmp");
        deliveryProtocols.add("rtsp");
        deliveryProtocols.add("wowz");
        liveStream.setDeliveryProtocols(deliveryProtocols);
        liveStream.hostedPage(true);
        liveStream.hostedPageDescription("My JavaSDKCreate");
        liveStream.hostedPageSharingIcons(true);
        liveStream.hostedPageTitle("Title host JavaSDKCreate");
        liveStream.lowLatency(false);
        liveStream.playerCountdown(false);
        liveStream.playerResponsive(false);
        liveStream.playerType("wowza_player");
        liveStream.playerWidth(640);
        liveStream.recording(false);
        liveStream.useStreamSource(false);
        liveStream.setTargetDeliveryProtocol(LiveStream.TargetDeliveryProtocolEnum.HTTPS);
	liveStream.setDisableAuthentication(false);
        liveStream.setUsername("java);
        liveStream.setPassword("tseTKDSavaJ");

	try {
	    LiveStream result = apiInstance.createLiveStream(liveStream);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#createLiveStream");
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveStream** | [**LiveStream**](LiveStream.md)| Provide the details of the live stream to create. |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLiveStream"></a>
# **deleteLiveStream**
> deleteLiveStream(id)

Delete a live stream

This operation deletes a live stream, including all assigned outputs and targets.

### Example
```java
// Import classes:
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class DeleteALiveStreamExample {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();
	String streamId = "xxxxxx";
	try {
	    apiInstance.deleteLiveStream(streamId);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#deleteLiveStream");
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamId** | **String**| The unique alphanumeric string that identifies the live stream. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listLiveStreams"></a>
# **listLiveStreams**
> LiveStreams listLiveStreams(page, perPage)

Fetch all live streams

This operation shows limited details for all of your live streams. For detailed information, fetch a single live stream.

### Example
```java
// Import classes:
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class FetchAllLiveStreamsExample {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();
	Integer page = 1; 
	Integer perPage = 56; 
	try {
	    LiveStreams result = apiInstance.listLiveStreams(page, perPage);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#listLiveStreams");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Returns a paginated view of results from the HTTP request. Specify a positive integer to indicate which page of the results should be displayed. The default is **1**. For more information and examples, see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-get-paginated-query-results-with-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;Get paginated query results with the Wowza Streaming Cloud REST API&lt;/a. | [optional]
 **perPage** | **Integer**| For use with the *page* parameter. Indicates how many records should be included in a page of results. A valid value is any positive integer. The default and maximum value is **1000**. | [optional]

### Return type

[**LiveStreams**](LiveStreams.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="regenerateConnectionCodeLiveStream"></a>
# **regenerateConnectionCodeLiveStream**
> LiveStreamConnectioncode regenerateConnectionCodeLiveStream(id)

Regenerate the connection code for a live stream

This operation regenerates the connection code of a live stream.

### Example
```java
// Import classes:
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class RegenerateConnectionCodeLiveStreamExample {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();
	String streamId = "xxxxxx";
	try {
	    LiveStreamConnectioncode result = apiInstance.regenerateConnectionCodeLiveStream(streamId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#regenerateConnectionCodeLiveStream");
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the live stream. |

### Return type

[**LiveStreamConnectioncode**](LiveStreamConnectioncode.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetLiveStream"></a>
# **resetLiveStream**
> LiveStreamActionState resetLiveStream(id)

Reset a live stream

This operation resets a live stream.

### Example
```java
// Import classes:
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class ResetALiveStream {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();
	String streamId = "xxxxxx";
	try {
	    LiveStreamActionState result = apiInstance.resetLiveStream(streamId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#resetALiveStream");
	    System.err.println("Exception when calling LiveStreamsApi#Code:"+e.getCode());
	    System.err.println("Exception when calling LiveStreamsApi#ResponseBody:"+e.getResponseBody());
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the live stream. |

### Return type

[**LiveStreamActionState**](InlineResponse200.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showLiveStream"></a>
# **showLiveStream**
> LiveStream showLiveStream(id)

Fetch a live stream

This operation shows the details of a specific live stream.

### Example
```java
// Import classes:
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class FetchALiveStreamExample {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();
	String streamId = "xxxxxx";
	try {
	    LiveStream result = apiInstance.showLiveStream(streamId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#showLiveStreams");
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the live stream. |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showLiveStreamState"></a>
# **showLiveStreamState**
> LiveStreamState showLiveStreamState(id)

Fetch the state of a live stream

This operation shows the current state of a live stream.

### Example
```java
// Import classes:
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class FetchALiveStreamState {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();
	String streamId = "xxxxxx";
	try {
	    LiveStreamState result = apiInstance.showLiveStreamState(streamId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#showLiveStreamState");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the live stream. |

### Return type

[**LiveStreamState**](LiveStreamState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showLiveStreamStats"></a>
# **showLiveStreamStats**
> ShmMetrics showLiveStreamStats(id)

Fetch metrics for an active live stream

This operation returns a hash of metrics keys, each of which identifies a status, text description, unit, and value.

### Example
```java
// Import classes:
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class FetchALiveStreamMetrics {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();
	String streamId = "xxxxxx";
	try {
	    ShmMetrics result = apiInstance.showLiveStreamStats(streamId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#showLiveStreamStats");
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the live stream. |

### Return type

[**ShmMetrics**](ShmMetrics.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showLiveStreamThumbnailUrl"></a>
# **showLiveStreamThumbnailUrl**
> LiveStreamThumbnail showLiveStreamThumbnailUrl(id)

Fetch the thumbnail URL of a live stream

This operation shows the thumbnail URL of a started live stream.

### Example
```java
// Import classes:
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class FetchALiveStreamThumbnail {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();
	String streamId = "xxxxxx";
	try {
	    LiveStreamThumbnail result = apiInstance.showLiveStreamThumbnailUrl(streamId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#showLiveStreamThumbnailUrl");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the live stream. |

### Return type

[**LiveStreamThumbnail**](LiveStreamThumbnail.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startLiveStream"></a>
# **startLiveStream**
> LiveStreamActionState startLiveStream(id)

Start a live stream

This operation starts a live stream.

### Example
```java
// Import classes:
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class StartALiveStream {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();
	String streamId = "xxxxxx";
	try {
	    LiveStreamActionState result = apiInstance.startLiveStream(streamId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#startLiveStream");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the live stream. |

### Return type

[**LiveStreamActionState**](LiveStreamActionState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stopLiveStream"></a>
# **stopLiveStream**
> LiveStreamActionState stopLiveStream(id)

Stop a live stream

This operation stops a live stream.

### Example
```java
// Import classes:
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class StopALiveStream {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();
	String streamId = "xxxxxx";
	try {
	    LiveStreamActionState result = apiInstance.stopLiveStream(streamId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#stopLiveStream");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the live stream. |

### Return type

[**LiveStreamActionState**](LiveStreamActionState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLiveStream"></a>
# **updateLiveStream**
> LiveStream updateLiveStream(id, liveStream)

Update a live stream

This operation updates a live stream.

### Example
```java
// Import classes:
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class UpdateALiveStreamExample {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();

	LiveStream liveStream = new LiveStream(); 
        liveStream.setName("UpdatetreamCreate"+System.currentTimeMillis());
	String streamId = "xxxxxx";

	try {
	    LiveStream result = apiInstance.updateLiveStream(streamId,liveStream);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#updateLiveStream");
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the live stream. |
 **liveStream** | [**LiveStream**](LiveStream.md)| Provide the details of the live stream to update. |

### Return type

[**LiveStream**](LiveStream.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

