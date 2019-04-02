# ViewerDataApi

All URIs are relative to *https://api.cloud.wowza.com/api/v1.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**showViewerDataStreamTarget**](ViewerDataApi.md#showViewerDataStreamTarget) | **GET**usage/viewer_data/stream_targets/{id} | Fetch viewer data for a stream target


<a name="showViewerDataStreamTarget"></a>
# **showViewerDataStreamTarget**
> ViewerDataApi showViewerDataStreamTarget(id, from, to)

Fetch viewer data for a stream target

This operation shows viewer data for a specific stream target. Viewer data provides insight into the number and types of requests that were made to play streams at a target. The default time frame is *from* the last billing date *to* the end of the current day.&lt;blockquote**Note:** Ultra low latency stream targets are available through subscription to &lt;a href&#x3D;&#39;https://www.wowza.com/products/streaming-cloud#ultra-low-latency&#39; target&#x3D;&#39;_blank&#39;Wowza Streaming Cloud with Ultra Low Latency&lt;/a. &lt;/blockquote

### Example
```java
// Import classes:
package ViewerData;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.ViewerDataApi;

import java.time.OffsetDateTime;

import java.io.File;
import java.util.*;

public class FetchViewDataStreamTarget {

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

	ViewerDataApi apiInstance = new ViewerDataApi();
	String streamTargetId = "xxxxxx"; 
	OffsetDateTime from = OffsetDateTime.now(); 
	OffsetDateTime to = OffsetDateTime.now(); 
	try {
	    ViewerDataStreamTarget result = apiInstance.showViewerDataStreamTarget(streamTargetId, from, to);
	    System.out.println(result);
	} catch (ApiException e) {
    	System.err.println("Exception when calling ViewerDataApi#showViewerDataStreamTarget");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the stream target. |
 **from** | **OffsetDateTime**| The start of the range of time you want to view. Specify **YYYY-MM-DD HH:MM:SS** where **HH** is a 24-hour clock in UTC. The *from* default is the last billing date. | [optional]
 **to** | **OffsetDateTime**| The end of the range of time you want to view. Specify **YYYY-MM-DD HH:MM:SS** where **HH** is a 24-hour clock in UTC. The *to* default is the end of the current day. | [optional]

### Return type

[**ViewerDataApi**](ViewerDataApi.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

