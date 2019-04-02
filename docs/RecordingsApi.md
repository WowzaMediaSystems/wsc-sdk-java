# RecordingsApi

All URIs are relative to *https://api.cloud.wowza.com/api/v1.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRecording**](RecordingsApi.md#deleteRecording) | **DELETE**recordings/{id} | Delete a recording
[**listRecordings**](RecordingsApi.md#listRecordings) | **GET**recordings | Fetch all recordings
[**showRecording**](RecordingsApi.md#showRecording) | **GET**recordings/{id} | Fetch a recording
[**showRecordingState**](RecordingsApi.md#showRecordingState) | **GET**recordings/{id}/state | Fetch the state of a recording


<a name="deleteRecording"></a>
# **deleteRecording**
> deleteRecording(id)

Delete a recording

This operation deletes a recording.

### Example
```java
// Import classes:
package Recordings;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.RecordingsApi;

import java.io.File;
import java.util.*;

public class DeleteARecording {

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

	RecordingsApi apiInstance = new RecordingsApi();

	String recordingId = "xxxxxx";

        try {
            apiInstance.deleteRecording(recordingId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordingsApi#deleteRecording");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the recording. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listRecordings"></a>
# **listRecordings**
> List<IndexRecordings> listRecordings(page, perPage)

Fetch all recordings

This operation shows limited details for all of your recordings. For detailed information, fetch a single recording.

### Example
```java
// Import classes:
package Recordings;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.RecordingsApi;

import java.io.File;
import java.util.*;

public class FetchAllRecordings {

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

	RecordingsApi apiInstance = new RecordingsApi();

        Integer page = 1;
        Integer perPage = 56;
        try {
            List<IndexRecordings> result = apiInstance.listRecordings(page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordingsApi#listRecordings");
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

[**List<IndexRecordings>**](IndexRecordings.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showRecording"></a>
# **showRecording**
> Recording showRecording(id)

Fetch a recording

This operation shows the details of a specific recording.

### Example
```java
// Import classes:
package Recordings;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.RecordingsApi;

import java.io.File;
import java.util.*;

public class FetchARecording {

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

	RecordingsApi apiInstance = new RecordingsApi();

	String recordingId = "xxxxxx";

        try {
            Recording result = apiInstance.showRecording(recordingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordingsApi#showRecording");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the recording. |

### Return type

[**Recording**](Recording.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showRecordingState"></a>
# **showRecordingState**
> RecordingState showRecordingState(id)

Fetch the state of a recording

This operation shows the current state of a recording.

### Example
```java
// Import classes:
package Recordings;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.RecordingsApi;

import java.io.File;
import java.util.*;

public class FetchStateOfRecording {

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

	RecordingsApi apiInstance = new RecordingsApi();

	String recordingId = "xxxxxx";

        try {
            RecordingState result = apiInstance.showRecordingState(recordingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordingsApi#showRecordingState");
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the recording. |

### Return type

[**RecordingState**](RecordingState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

