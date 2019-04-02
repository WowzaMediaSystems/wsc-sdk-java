# StreamSourcesApi

All URIs are relative to *https://api.cloud.wowza.com/api/v1.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAkamaiStreamSource**](StreamSourcesApi.md#createAkamaiStreamSource) | **POST**stream_sources/akamai | Create an Akamai stream source
[**deleteAkamaiStreamSource**](StreamSourcesApi.md#deleteAkamaiStreamSource) | **DELETE**stream_sources/akamai/{id} | Delete an Akamai stream source
[**listAkamaiStreamSources**](StreamSourcesApi.md#listAkamaiStreamSources) | **GET**stream_sources/akamai | Fetch all Akamai stream sources
[**listStreamSources**](StreamSourcesApi.md#listStreamSources) | **GET**stream_sources | Fetch all stream sources
[**showAkamaiStreamSource**](StreamSourcesApi.md#showAkamaiStreamSource) | **GET**stream_sources/akamai/{id} | Fetch an Akamai stream source
[**updateAkamaiStreamSource**](StreamSourcesApi.md#updateAkamaiStreamSource) | **PATCH**stream_sources/akamai/{id} | Update an Akamai stream source


<a name="createAkamaiStreamSource"></a>
# **createAkamaiStreamSource**
> StreamSourceAkamai createAkamaiStreamSource(streamSourceAkamai)

Create an Akamai stream source

(Available from version 1.3) This operation creates an Akamai stream source.  An Akamai stream source is an edge resource that sends a stream to a Wowza Streaming Cloud transcoder using the RTMP protocol.  &lt;blockquote**Note:** An Akamai stream source with a *location_method* of **ip_address** requires provisioning time of 15 to 45 minutes. Values for *backup_url*, *primary_url*, *username*, and *password* are available once the stream source is provisioned. We recommend sending GET requests to query for the Akamai stream source no less than five seconds apart.

### Example
```java
// Import classes:
package StreamSources;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.StreamSourcesApi;

import java.io.File;
import java.util.*;

public class CreateAnAkamaiStreamSource {

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

        StreamSourcesApi apiInstance = new StreamSourcesApi();

	StreamSourceAkamai sourceAkamai = new StreamSourceAkamai();

	sourceAkamai.setLocation(StreamSourceAkamai.LocationEnum.EU_GERMANY);
	sourceAkamai.setIpAddress("1.1.1.1");
	sourceAkamai.setName("Java SDK SourceAkamai creation");
	sourceAkamai.setBackupIpAddress("2.2.2.2");
	sourceAkamai.setLocationMethod(StreamSourceAkamai.LocationMethodEnum.REGION);

	try {
	    StreamSourceAkamai result = apiInstance.createAkamaiStreamSource(sourceAkamai);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamSourcesApi#createAkamaiStreamSource");
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamSourceAkamai** | [**StreamSourceAkamai**](StreamSourceAkamai.md)| Provide the details of the stream source to add.&lt;/blockquote |

### Return type

[**StreamSourceAkamai**](StreamSourceAkamai.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAkamaiStreamSource"></a>
# **deleteAkamaiStreamSource**
> deleteAkamaiStreamSource(id)

Delete an Akamai stream source

(Available from version 1.3) This operation deletes an Akamai stream source.

### Example
```java
// Import classes:
package StreamSources;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.StreamSourcesApi;

import java.io.File;
import java.util.*;

public class DeleteAnAkamaiStreamSource {

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

	StreamSourcesApi apiInstance = new StreamSourcesApi();
	String sourceId = "xxxxxx";
	try {
		apiInstance.deleteAkamaiStreamSource(sourceId);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamSourcesApi#deleteAkamaiStreamSource");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceId** | **String**| The unique alphanumeric string that identifies the Akamai stream source. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAkamaiStreamSources"></a>
# **listAkamaiStreamSources**
> List<IndexAkamaiStreamSource> listAkamaiStreamSources(page, perPage)

Fetch all Akamai stream sources

(Available from version 1.3) This operation shows limited details for all of your Akamai stream sources. An Akamai stream source is an edge resource that sends a stream to a Wowza Streaming Cloud transcoder using the RTMP protocol. For detailed information, fetch a single Akamai stream source.

### Example
```java
// Import classes:
package StreamSources;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.StreamSourcesApi;

import java.io.File;
import java.util.*;

public class FetchAllAkamaiStreamSources {

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

	StreamSourcesApi apiInstance = new StreamSourcesApi();
	Integer page = 1; 
	Integer perPage = 56; 
	try {
	    List<IndexAkamaiStreamSource> result = apiInstance.listAkamaiStreamSources(page, perPage);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamSourcesApi#listAkamaiStreamSources");
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

[**List<IndexAkamaiStreamSource>**](IndexAkamaiStreamSource.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listStreamSources"></a>
# **listStreamSources**
> List<IndexStreamSource> listStreamSources(page, perPage)

Fetch all stream sources

This operation shows limited details for all of your stream sources. For detailed information, fetch a single stream source of the appropriate type.

### Example
```java
// Import classes:
package StreamSources;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.StreamSourcesApi;

import java.io.File;
import java.util.*;

public class FetchAllStreamSourcesExample {

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

	StreamSourcesApi apiInstance = new StreamSourcesApi();
	Integer page = 1; 
	Integer perPage = 56; 
	try {
	    List<IndexStreamSource> result = apiInstance.listStreamSources(page, perPage);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamSourcesApi#listStreamSources");
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

[**List<IndexStreamSource>**](IndexStreamSource.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showAkamaiStreamSource"></a>
# **showAkamaiStreamSource**
> StreamSourceAkamai showAkamaiStreamSource(id)

Fetch an Akamai stream source

(Available from version 1.3) This operation shows details of a specific Akamai stream source.  An Akamai stream source is an edge resource that sends a stream to a Wowza Streaming Cloud transcoder using the RTMP protocol.

### Example
```java
// Import classes:
package StreamSources;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.StreamSourcesApi;

import java.io.File;
import java.util.*;

public class FetchAnAkamaiStreamSource {

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

	StreamSourcesApi apiInstance = new StreamSourcesApi();
	String sourceId = "xxxxxx";
	try {
	    StreamSourceAkamai result = apiInstance.showAkamaiStreamSource(sourceId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamSourcesApi#showAkamaiStreamSource");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the Akamai stream source. |

### Return type

[**StreamSourceAkamai**](StreamSourceAkamai.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAkamaiStreamSource"></a>
# **updateAkamaiStreamSource**
> StreamSourceAkamai updateAkamaiStreamSource(id, streamSourceAkamai)

Update an Akamai stream source

(Available from version 1.3) This operation updates an Akamai stream source.  An Akamai stream source is an edge resource that send a stream to a Wowza Streaming Cloud transcoder using the RTMP protocol.

### Example
```java
// Import classes:
package StreamSources;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.StreamSourcesApi;

import java.io.File;
import java.util.*;

public class UpdateAnAkamaiStreamSource {

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

	StreamSourcesApi apiInstance = new StreamSourcesApi();
	String sourceId = "xxxxxx";
	try {
		StreamSourceAkamai result = apiInstance.showAkamaiStreamSource(sourceId);
		System.out.println(result);
		result.setName("Update Akamai Stream Source Name");
		StreamSourceAkamai resultUpdate = apiInstance.updateAkamaiStreamSource(sourceId, result);
		System.out.println(resultUpdate);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamSourcesApi#updateAkamaiStreamSource");
	    e.printStackTrace();
	}
    }

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the Akamai stream source. |
 **streamSourceAkamai** | [**StreamSourceAkamai**](StreamSourceAkamai.md)| Provide the details of the stream source to update. |

### Return type

[**StreamSourceAkamai**](StreamSourceAkamai.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

