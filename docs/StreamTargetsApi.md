# StreamTargetsApi

All URIs are relative to *https://api.cloud.wowza.com/api/v1.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomStreamTarget**](StreamTargetsApi.md#createCustomStreamTarget) | **POST**stream_targets/custom | Create a custom stream target
[**createStreamTargetGeoblock**](StreamTargetsApi.md#createStreamTargetGeoblock) | **POST**stream_targets/{stream_target_id}/geoblock | Create geo-blocking for a Wowza stream target
[**createStreamTargetProperty**](StreamTargetsApi.md#createStreamTargetProperty) | **POST**stream_targets/{stream_target_id}/properties | Configure a property for a stream target
[**createStreamTargetTokenAuth**](StreamTargetsApi.md#createStreamTargetTokenAuth) | **POST**stream_targets/{stream_target_id}/token_auth | Create token authorization for a Wowza stream target
[**createUllStreamTarget**](StreamTargetsApi.md#createUllStreamTarget) | **POST**stream_targets/ull | Create an ultra low latency stream target
[**createWowzaStreamTarget**](StreamTargetsApi.md#createWowzaStreamTarget) | **POST**stream_targets/wowza | Create a Wowza stream target
[**deleteCustomStreamTarget**](StreamTargetsApi.md#deleteCustomStreamTarget) | **DELETE**stream_targets/custom/{id} | Delete a custom stream target
[**deleteStreamTargetProperty**](StreamTargetsApi.md#deleteStreamTargetProperty) | **DELETE**stream_targets/{stream_target_id}/properties/{id} | Delete a stream target property
[**deleteUllStreamTarget**](StreamTargetsApi.md#deleteUllStreamTarget) | **DELETE**stream_targets/ull/{id} | Delete an ultra low latency stream target
[**deleteWowzaStreamTarget**](StreamTargetsApi.md#deleteWowzaStreamTarget) | **DELETE**stream_targets/wowza/{id} | Delete a Wowza stream target
[**listCustomStreamTargets**](StreamTargetsApi.md#listCustomStreamTargets) | **GET**stream_targets/custom | Fetch all custom stream targets
[**listStreamTargetProperties**](StreamTargetsApi.md#listStreamTargetProperties) | **GET**stream_targets/{stream_target_id}/properties | Fetch all properties of a stream target
[**listStreamTargets**](StreamTargetsApi.md#listStreamTargets) | **GET**stream_targets | Fetch all stream targets
[**listUllStreamTargets**](StreamTargetsApi.md#listUllStreamTargets) | **GET**stream_targets/ull | Fetch all ultra low latency stream targets
[**listWowzaStreamTargets**](StreamTargetsApi.md#listWowzaStreamTargets) | **GET**stream_targets/wowza | Fetch all Wowza stream targets
[**regenerateConnectionCodeStreamTarget**](StreamTargetsApi.md#regenerateConnectionCodeStreamTarget) | **PUT**stream_targets/{id}/regenerate_connection_code | Regenerate the connection code for any stream target
[**showCustomStreamTarget**](StreamTargetsApi.md#showCustomStreamTarget) | **GET**stream_targets/custom/{id} | Fetch a custom stream target
[**showStreamTargetGeoblock**](StreamTargetsApi.md#showStreamTargetGeoblock) | **GET**stream_targets/{stream_target_id}/geoblock | Fetch geo-blocking for a Wowza stream target
[**showStreamTargetMetricsCurrent**](StreamTargetsApi.md#showStreamTargetMetricsCurrent) | **GET**stream_targets/{id}/metrics/current | Fetch current health metrics for an active ultra low latency stream target
[**showStreamTargetMetricsHistoric**](StreamTargetsApi.md#showStreamTargetMetricsHistoric) | **GET**stream_targets/{id}/metrics/historic | Fetch historic health metrics for an ultra low latency stream target
[**showStreamTargetProperty**](StreamTargetsApi.md#showStreamTargetProperty) | **GET**stream_targets/{stream_target_id}/properties/{id} | Fetch a property of a stream target
[**showStreamTargetTokenAuth**](StreamTargetsApi.md#showStreamTargetTokenAuth) | **GET**stream_targets/{stream_target_id}/token_auth | Fetch token authorization for a Wowza stream target
[**showUllStreamTarget**](StreamTargetsApi.md#showUllStreamTarget) | **GET**stream_targets/ull/{id} | Fetch an ultra low latency stream target
[**showWowzaStreamTarget**](StreamTargetsApi.md#showWowzaStreamTarget) | **GET**stream_targets/wowza/{id} | Fetch a Wowza stream target
[**updateCustomStreamTarget**](StreamTargetsApi.md#updateCustomStreamTarget) | **PATCH**stream_targets/custom/{id} | Update a custom stream target
[**updateStreamTargetGeoblock**](StreamTargetsApi.md#updateStreamTargetGeoblock) | **PATCH**stream_targets/{stream_target_id}/geoblock | Update geo-blocking for a Wowza stream target
[**updateStreamTargetTokenAuth**](StreamTargetsApi.md#updateStreamTargetTokenAuth) | **PATCH**stream_targets/{stream_target_id}/token_auth | Update token authorization for a Wowza stream target
[**updateUllStreamTarget**](StreamTargetsApi.md#updateUllStreamTarget) | **PATCH**stream_targets/ull/{id} | Update an ultra low latency stream target
[**updateWowzaStreamTarget**](StreamTargetsApi.md#updateWowzaStreamTarget) | **PATCH**stream_targets/wowza/{id} | Update a Wowza stream target


<a name="createCustomStreamTarget"></a>
# **createCustomStreamTarget**
> StreamTargetCustom createCustomStreamTarget(streamTargetCustom)

Create a custom stream target

(Available from version 1.2) This operation creates a custom stream target for an external, third-party destination.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class CreateACustomStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
        StreamTargetCustom targetCustom = new StreamTargetCustom();
        targetCustom.setName("Java SDK custom stream target");
        targetCustom.setPrimaryUrl("rtmp://mydomainofsomeusetome.net/pathrequired");
        targetCustom.setProvider("rtmp");
        targetCustom.setStreamName("12345678");
	targetCustom.setUsername("javaSDKUsername");
	targetCustom.setPassword("javaSDKPassword");


	try {
		StreamTargetCustom result = apiInstance.createCustomStreamTarget(targetCustom);
		System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#createCustomStreamTarget");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetCustom** | [**StreamTargetCustom**](StreamTargetCustom.md)| Provide the details of the custom stream target. |

### Return type

[**StreamTargetCustom**](StreamTargetCustom.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createStreamTargetGeoblock"></a>
# **createStreamTargetGeoblock**
> Geoblock createStreamTargetGeoblock(streamTargetId, geoblock)

Create geo-blocking for a Wowza stream target

This operation allows you to block or whitelist viewing of a stream target by geographic location. Only Wowza stream targets can be geo-blocked. For more information see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-geo-block-stream-targets-by-using-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;Geo-block stream targets with the Wowza Streaming Cloud REST API&lt;/a.  **Important:** After configuring geo-blocking, you must [contact Support](https://www.wowza.com/portal/help) in order for your changes to take effect.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;
import java.util.ArrayList;

public class CreateGeoBlockingForAWowzaStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";

	Geoblock newGeoblock = new Geoblock();
	newGeoblock.setType(Geoblock.TypeEnum.DENY);
	List<String> whiteList = new ArrayList<String>();
	whiteList.add("10.1.1.0");
	whiteList.add("192.168.1.0");
	newGeoblock.setWhitelist(whiteList);
	List<String> countryList = new ArrayList<String>();
	countryList.add("FR");
	newGeoblock.setCountries(countryList);

	try {
	    Geoblock result = apiInstance.createStreamTargetGeoblock(streamTargetId,newGeoblock);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#createStreamTargetGeoblock");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |
 **geoblock** | [**Geoblock**](Geoblock.md)| Provide the details of the geo-blocking to create. |

### Return type

[**Geoblock**](Geoblock.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createStreamTargetProperty"></a>
# **createStreamTargetProperty**
> StreamTargetProperty createStreamTargetProperty(streamTargetId, property)

Configure a property for a stream target

This operation configures a property for a stream target. Properties are available for a custom stream target or Wowza stream target whose *provider* is **akamai_cupertino**. For more information see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-set-advanced-properties-by-using-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;Set advanced properties with the Wowza Streaming Cloud REST API&lt;/a.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class ConfigureAPropertyForAStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	
	StreamTargetProperty newProp = new StreamTargetProperty();
        newProp.setKey(StreamTargetProperty.KeyEnum.CHUNKSIZE);
        newProp.setSection(StreamTargetProperty.SectionEnum.HLS);
        newProp.setValue("4");
 
	try {
	    StreamTargetProperty result = apiInstance.createStreamTargetProperty(streamTargetId, newProp);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#createStreamTargetProperty");
            System.err.println("Exception when calling StreamTargetsApi#Code:"+e.getCode());
            System.err.println("Exception when calling StreamTargetsApi#ResponseBody:"+e.getResponseBody());

	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |
 **property** | [**StreamTargetProperty**](StreamTargetProperty.md)| Provide the details of the property to configure. |

### Return type

[**StreamTargetProperty**](StreamTargetProperty.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createStreamTargetTokenAuth"></a>
# **createStreamTargetTokenAuth**
> TokenAuth createStreamTargetTokenAuth(streamTargetId, tokenAuth)

Create token authorization for a Wowza stream target

This operation creates token authorization for a stream target. Only Wowza stream targets can use token authorization. For more information see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-protect-streams-with-token-authorization-by-using-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;Protect stream targets with token authorization using the Wowza Streaming Cloud REST API&lt;/a.  **Important:** After creating token authorization, you must [contact Support](https://www.wowza.com/portal/help) in order for your changes to take effect.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;
import java.util.ArrayList;

public class CreateTokenAuthorizationForAWowzaStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";

        TokenAuth newAuth = new TokenAuth();
        newAuth.setEnabled(true);
        newAuth.setTrustedSharedSecret("1234567890abcdef");

	try {
	    TokenAuth result = apiInstance.createStreamTargetTokenAuth(streamTargetId,newAuth);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#createStreamTargetTokenAuth");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |
 **tokenAuth** | [**TokenAuth**](TokenAuth.md)| Provide the details of the token authorization to create. |

### Return type

[**TokenAuth**](TokenAuth.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUllStreamTarget"></a>
# **createUllStreamTarget**
> StreamTargetUll createUllStreamTarget(streamTargetUll)

Create an ultra low latency stream target

(Available from version 1.2) This operation creates an ultra low latency stream target. Ultra low latency stream targets are available through subscription to &lt;a href&#x3D;&#39;https://www.wowza.com/products/streaming-cloud#ultra-low-latency&#39; target&#x3D;&#39;_blank&#39;Wowza Streaming Cloud with Ultra Low Latency&lt;/a.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class CreateAnUltraLowLatencyStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();

       StreamTargetUll targetUll = new StreamTargetUll();

        targetUll.setName("MyJava");
        targetUll.setSourceDeliveryMethod(StreamTargetUll.SourceDeliveryMethodEnum.PULL);
        targetUll.setSourceUrl("rtmp://10.0.0.1/livelivelivelive/myStream");
        targetUll.setEnableHls(true);

	try {
		StreamTargetUll result = apiInstance.createUllStreamTarget(targetUll);
		System.out.println(result);
	} catch (ApiException e) {
            System.err.println("Exception when calling StreamTargetsApi#createUllStreamTarget");
            System.err.println("Exception when calling StreamTargetsApi#Code:"+e.getCode());
            System.err.println("Exception when calling StreamTargetsApi#ResponseBody:"+e.getResponseBody());
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamTargetUll** | [**StreamTargetUll**](StreamTargetUll.md)| Provide the details of the ultra low latency stream target to create. |

### Return type

[**StreamTargetUll**](StreamTargetUll.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWowzaStreamTarget"></a>
# **createWowzaStreamTarget**
> StreamTargetWowza createWowzaStreamTarget(streamTargetWowza)

Create a Wowza stream target

(Available from version 1.2) This operation creates a Wowza stream target for a Wowza CDN.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class CreateAWowzaStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();

        StreamTargetWowza targetWowza = new StreamTargetWowza();
        targetWowza.setName("Wowza Target SDK Java");
        targetWowza.setProvider(StreamTargetWowza.ProviderEnum.AKAMAI);
        targetWowza.setLocation(StreamTargetWowza.LocationEnum.EU_GERMANY);

	try {
		StreamTargetWowza result = apiInstance.createWowzaStreamTarget(targetWowza);
		System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#createWowzaStreamTarget");
            System.err.println("Exception when calling StreamTargetsApi#Code:"+e.getCode());
            System.err.println("Exception when calling StreamTargetsApi#ResponseBody:"+e.getResponseBody());
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamTargetWowza** | [**StreamTargetWowza**](StreamTargetWowza.md)| Provide the details of the Wowza stream target to create. |

### Return type

[**StreamTargetWowza**](StreamTargetWowza.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomStreamTarget"></a>
# **deleteCustomStreamTarget**
> deleteCustomStreamTarget(id)

Delete a custom stream target

(Available from version 1.2) This operation deletes a custom stream target.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class DeleteACustomStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	try {
	    apiInstance.deleteCustomStreamTarget(streamTargetId);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#deleteCustomStreamTarget");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the custom stream target. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStreamTargetProperty"></a>
# **deleteStreamTargetProperty**
> deleteStreamTargetProperty(streamTargetId, id)

Delete a stream target property

This operation removes a property from a stream target.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class DeleteAPropertyForAStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	String propertyId = "hls-chunkSize";
	try {
	    apiInstance.deleteStreamTargetProperty(streamTargetId, propertyId);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#deleteStreamTargetProperty");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |
 **propertyId** | **String**| The unique string that identifies the stream target property. The string contains the *section* and the *key*, connected by a dash. For example, **hls-chunkSize**. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUllStreamTarget"></a>
# **deleteUllStreamTarget**
> deleteUllStreamTarget(id)

Delete an ultra low latency stream target

(Available from version 1.2) This operation deletes an ultra low latency stream target. Ultra low latency stream targets are available through subscription to &lt;a href&#x3D;&#39;https://www.wowza.com/products/streaming-cloud#ultra-low-latency&#39; target&#x3D;&#39;_blank&#39;Wowza Streaming Cloud with Ultra Low Latency&lt;/a.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class DeleteAnUltraLowLatencyStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	try {
	    apiInstance.deleteUllStreamTarget(streamTargetId);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#deleteUllStreamTarget");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the ultra low latency stream target. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWowzaStreamTarget"></a>
# **deleteWowzaStreamTarget**
> deleteWowzaStreamTarget(id)

Delete a Wowza stream target

(Available from version 1.2) This operation deletes a Wowza stream target.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class DeleteAWowzaStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	try {
	    apiInstance.deleteWowzaStreamTarget(streamTargetId);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#deleteWowzaStreamTarget");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the stream target. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCustomStreamTargets"></a>
# **listCustomStreamTargets**
> List<IndexCustomStreamTarget> listCustomStreamTargets(page, perPage)

Fetch all custom stream targets

(Available from version 1.2) This operation lists limited details for all of your custom stream targets. For detailed information, fetch a single custom stream target.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class FetchAllCustomStreamTargets {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	Integer page = 1; 
	Integer perPage = 56; 
	try {
	    List<IndexCustomStreamTarget> result = apiInstance.listCustomStreamTargets(page, perPage);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#listCustomStreamTargets");
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

[**List<IndexCustomStreamTarget>**](IndexCustomStreamTarget.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listStreamTargetProperties"></a>
# **listStreamTargetProperties**
> List<StreamTargetProperty> listStreamTargetProperties(streamTargetId)

Fetch all properties of a stream target

This operation shows the details of all of the properties assigned to a specific stream target. Properties can be applied to a custom stream target or Wowza stream target whose *provider* is **akamai_cupertino**.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class FetchAllPropertiesForAStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	try {
	    List<StreamTargetProperty> result = apiInstance.listStreamTargetProperties(streamTargetId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#listStreamTargetProperties");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |

### Return type

[**List<StreamTargetProperty>**](StreamTargetProperty.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listStreamTargets"></a>
# **listStreamTargets**
> List<IndexStreamTarget> listStreamTargets(page, perPage)

Fetch all stream targets

This operation lists limited details for custom stream targets, ultra low latency stream targets, and Wowza stream targets. For detailed information, fetch a single stream target of a specific type.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class FetchAllStreamTargets {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	Integer page = 1; 
	Integer perPage = 56; 
	try {
	    List<IndexStreamTarget> result = apiInstance.listStreamTargets(page, perPage);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#listStreamTargets");
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

[**List<IndexStreamTarget>**](IndexStreamTarget.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUllStreamTargets"></a>
# **listUllStreamTargets**
> List<IndexUllStreamTarget> listUllStreamTargets(page, perPage)

Fetch all ultra low latency stream targets

(Available from version 1.2) This operation lists limited details for all of your ultra low latency stream targets. For detailed information, fetch a single ultra low latency stream target. Ultra low latency stream targets are available through subscription to &lt;a href&#x3D;&#39;https://www.wowza.com/products/streaming-cloud#ultra-low-latency&#39; target&#x3D;&#39;_blank&#39;Wowza Streaming Cloud with Ultra Low Latency&lt;/a.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class FetchAllUltraLowLatencyStreamTargets {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	Integer page = 1; 
	Integer perPage = 56; 
	try {
	    List<IndexUllStreamTarget> result = apiInstance.listUllStreamTargets(page, perPage);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#listUllStreamTargets");
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

[**List<IndexUllStreamTarget>**](IndexUllStreamTarget.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listWowzaStreamTargets"></a>
# **listWowzaStreamTargets**
> List<IndexWowzaStreamTarget> listWowzaStreamTargets(page, perPage)

Fetch all Wowza stream targets

(Available from version 1.2) This operation lists limited details for all of your Wowza stream targets. For detailed information, fetch a single Wowza stream target.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class FetchAllWowzaStreamTargets {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	Integer page = 1; 
	Integer perPage = 56; 
	try {
	    List<IndexWowzaStreamTarget> result = apiInstance.listWowzaStreamTargets(page, perPage);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#listWowzaStreamTargets");
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

[**List<IndexWowzaStreamTarget>**](IndexWowzaStreamTarget.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="regenerateConnectionCodeStreamTarget"></a>
# **regenerateConnectionCodeStreamTarget**
> StreamTargetConnectioncode regenerateConnectionCodeStreamTarget(id)

Regenerate the connection code for any stream target

This operation regenerates the connection code of any kind of stream target.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class RegenerateConnectionCodeForAnyStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	try {
	    StreamTargetConnectioncode result = apiInstance.regenerateConnectionCodeStreamTarget(streamTargetId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#regenerateConnectionCodeStreamTarget");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the stream target. |

### Return type

[**StreamTargetConnectioncode**](StreamTargetConnectioncode.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showCustomStreamTarget"></a>
# **showCustomStreamTarget**
> StreamTargetCustom showCustomStreamTarget(id)

Fetch a custom stream target

(Available from version 1.2) This operation shows the details of a specific custom stream target.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class FetchACustomStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	try {
	    StreamTargetCustom result = apiInstance.showCustomStreamTarget(streamTargetId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#showCustomStreamTarget");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the custom stream target. |

### Return type

[**StreamTargetCustom**](StreamTargetCustom.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showStreamTargetGeoblock"></a>
# **showStreamTargetGeoblock**
> Geoblock showStreamTargetGeoblock(streamTargetId)

Fetch geo-blocking for a Wowza stream target

This operation shows the details of geo-blocking applied to a specific stream target. Only Wowza stream targets can be geo-blocked.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class FetchGeoBlockingForAWowzaStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	try {
	    Geoblock result = apiInstance.showStreamTargetGeoblock(streamTargetId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#showStreamTargetGeoblock");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |

### Return type

[**Geoblock**](Geoblock.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showStreamTargetMetricsCurrent"></a>
# **showStreamTargetMetricsCurrent**
> StreamTargetMetricsResponse showStreamTargetMetricsCurrent(id) - MARKERNOTDONE

Fetch current health metrics for an active ultra low latency stream target

This operation returns a snapshot of the current connection and throughput details for an active ultra low latency stream target. The interval for current metrics is 30 seconds from the moment of the query.    &lt;blockquote**Note:** Ultra low latency stream targets are available through subscription to &lt;a href&#x3D;&#39;https://www.wowza.com/products/streaming-cloud#ultra-low-latency&#39; target&#x3D;&#39;_blank&#39;Wowza Streaming Cloud with Ultra Low Latency&lt;/a. &lt;/blockquote

### Example
```java
// Import classes:
import com.wowza.cloudsdk.client.ApiClient;
import com.wowza.cloudsdk.client.ApiException;
import com.wowza.cloudsdk.client.Configuration;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.api.StreamTargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: wsc-access-key
ApiKeyAuth wscaccesskey = (ApiKeyAuth) defaultClient.getAuthentication("wsc-access-key");
wscaccesskey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//wscaccesskey.setApiKeyPrefix("Token");

// Configure API key authorization: wsc-api-key
ApiKeyAuth wscapikey = (ApiKeyAuth) defaultClient.getAuthentication("wsc-api-key");
wscapikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//wscapikey.setApiKeyPrefix("Token");

// Configure API key authorization: wsc-signature
ApiKeyAuth wscsignature = (ApiKeyAuth) defaultClient.getAuthentication("wsc-signature");
wscsignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//wscsignature.setApiKeyPrefix("Token");

// Configure API key authorization: wsc-timestamp
ApiKeyAuth wsctimestamp = (ApiKeyAuth) defaultClient.getAuthentication("wsc-timestamp");
wsctimestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//wsctimestamp.setApiKeyPrefix("Token");

StreamTargetsApi apiInstance = new StreamTargetsApi();
String id = "id_example";/ String | The unique alphanumeric string that identifies the stream target.
try {
    StreamTargetMetricsResponse result = apiInstance.showStreamTargetMetricsCurrent(id_example);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamTargetsApi#showStreamTargetMetricsCurrent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the stream target. |

### Return type

[**StreamTargetMetricsResponse**](StreamTargetMetricsResponse.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showStreamTargetMetricsHistoric"></a>
# **showStreamTargetMetricsHistoric**
> StreamTargetMetricsResponse showStreamTargetMetricsHistoric(id, from, to, interval) - MARKERNOTDONE

Fetch historic health metrics for an ultra low latency stream target

This operation shows historic connection and throughput details for an ultra low latency stream target.  &lt;blockquote**Note:** Ultra low latency stream targets are available through subscription to &lt;a href&#x3D;&#39;https://www.wowza.com/products/streaming-cloud#ultra-low-latency&#39; target&#x3D;&#39;_blank&#39;Wowza Streaming Cloud with Ultra Low Latency&lt;/a. &lt;/blockquote

### Example
```java
// Import classes:
import com.wowza.cloudsdk.client.ApiClient;
import com.wowza.cloudsdk.client.ApiException;
import com.wowza.cloudsdk.client.Configuration;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.api.StreamTargetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: wsc-access-key
ApiKeyAuth wscaccesskey = (ApiKeyAuth) defaultClient.getAuthentication("wsc-access-key");
wscaccesskey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//wscaccesskey.setApiKeyPrefix("Token");

// Configure API key authorization: wsc-api-key
ApiKeyAuth wscapikey = (ApiKeyAuth) defaultClient.getAuthentication("wsc-api-key");
wscapikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//wscapikey.setApiKeyPrefix("Token");

// Configure API key authorization: wsc-signature
ApiKeyAuth wscsignature = (ApiKeyAuth) defaultClient.getAuthentication("wsc-signature");
wscsignature.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//wscsignature.setApiKeyPrefix("Token");

// Configure API key authorization: wsc-timestamp
ApiKeyAuth wsctimestamp = (ApiKeyAuth) defaultClient.getAuthentication("wsc-timestamp");
wsctimestamp.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//wsctimestamp.setApiKeyPrefix("Token");

StreamTargetsApi apiInstance = new StreamTargetsApi();
String id = "id_example";/ String | The unique alphanumeric string that identifies the stream target.
String from = "from_example";/ String | The start of the range of time used to aggregate the metrics. Express the value by using the ISO 8601 standard of <strong>YYYY-MM-DDTHH:MM:SSZ</strong> where <strong>HH</strong> is a 24-hour clock in UTC.
String to = "to_example";/ String | The end of the range of time used to aggregate the metrics. Express the value by using the ISO 8601 standard of <strong>YYYY-MM-DDTHH:MM:SSZ</strong> where <strong>HH</strong> is a 24-hour clock in UTC.
String interval = "interval_example";/ String | The length of time for a block of metrics. The default is **10m** (10 minutes).
try {
    StreamTargetMetricsResponse result = apiInstance.showStreamTargetMetricsHistoric(id, from, to, interval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamTargetsApi#showStreamTargetMetricsHistoric");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the stream target. |
 **from** | **String**| The start of the range of time used to aggregate the metrics. Express the value by using the ISO 8601 standard of **YYYY-MM-DDTHH:MM:SSZ** where **HH** is a 24-hour clock in UTC. | [optional]
 **to** | **String**| The end of the range of time used to aggregate the metrics. Express the value by using the ISO 8601 standard of **YYYY-MM-DDTHH:MM:SSZ** where **HH** is a 24-hour clock in UTC. | [optional]
 **interval** | **String**| The length of time for a block of metrics. The default is **10m** (10 minutes). | [optional] [enum: second, minute, hour, day, month, #s, #m, #h, #d]

### Return type

[**StreamTargetMetricsResponse**](StreamTargetMetricsResponse.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showStreamTargetProperty"></a>
# **showStreamTargetProperty**
> StreamTargetProperty showStreamTargetProperty(streamTargetId, id)

Fetch a property of a stream target

This operation shows the details of a specific property assigned to a specific stream target. Properties can be applied to a custom stream target or Wowza stream target whose *provider* is **akamai_cupertino**.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class FetchAPropertyForAStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	String propertyId = "hls-chunkSize";
	try {
	    StreamTargetProperty result = apiInstance.showStreamTargetProperty(streamTargetId, propertyId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#showStreamTargetProperty");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |
 **propertyId** | **String**| The unique string that identifies the stream target property. The string contains the *section* and the *key*, connected by a dash. For example, **hls-chunkSize**. |

### Return type

[**StreamTargetProperty**](StreamTargetProperty.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showStreamTargetTokenAuth"></a>
# **showStreamTargetTokenAuth**
> TokenAuth showStreamTargetTokenAuth(streamTargetId)

Fetch token authorization for a Wowza stream target

This operation shows the details of the token authorization applied to a stream target. Only Wowza stream targets can use token authorization.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class FetchTokenAuthorizationForAWowzaStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	try {
	    TokenAuth result = apiInstance.showStreamTargetTokenAuth(streamTargetId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#showStreamTargetTokenAuth");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |

### Return type

[**TokenAuth**](TokenAuth.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showUllStreamTarget"></a>
# **showUllStreamTarget**
> StreamTargetUll showUllStreamTarget(id)

Fetch an ultra low latency stream target

(Available from version 1.2) This operation shows the details of a specific ultra low latency stream target. Ultra low latency stream targets are available through subscription to &lt;a href&#x3D;&#39;https://www.wowza.com/products/streaming-cloud#ultra-low-latency&#39; target&#x3D;&#39;_blank&#39;Wowza Streaming Cloud with Ultra Low Latency&lt;/a.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class FetchAnUltraLowLatencyStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String ullStreamTargetId = "xxxxxx";
	try {
	    StreamTargetUll result = apiInstance.showUllStreamTarget(ullStreamTargetId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#listStreamTargets");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the ultra low latency stream target. |

### Return type

[**StreamTargetUll**](StreamTargetUll.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showWowzaStreamTarget"></a>
# **showWowzaStreamTarget**
> StreamTargetWowza showWowzaStreamTarget(id)

Fetch a Wowza stream target

(Available from version 1.2) This operation shows the details of a specific Wowza stream target.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class FetchAWowzaStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxX";
	try {
	    StreamTargetWowza result = apiInstance.showWowzaStreamTarget(streamTargetId);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#showWowzaStreamTarget");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the stream target. |

### Return type

[**StreamTargetWowza**](StreamTargetWowza.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomStreamTarget"></a>
# **updateCustomStreamTarget**
> StreamTargetCustom updateCustomStreamTarget(id, streamTargetUll)

Update a custom stream target

(Available from version 1.2) This operation updates a custom stream target.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class UpdateACustomStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();

	String streamTargetId = "xxxxxx";
        try {
		StreamTargetCustom result = apiInstance.showCustomStreamTarget(streamTargetId);
		System.out.println(result);

		result.setUsername("javaSDKUsernameUpdate");
		result.setPassword("javaSDKPasswordUpdate");

		StreamTargetCustom newResult = apiInstance.updateCustomStreamTarget(streamTargetId,result);
		System.out.println(newResult);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#createCustomStreamTarget");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the custom stream target. |
 **streamTargetCustom** | [**StreamTargetCustom**](StreamTargetCustom.md)| Provide the details of the custom stream target to update. |

### Return type

[**StreamTargetCustom**](StreamTargetCustom.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStreamTargetGeoblock"></a>
# **updateStreamTargetGeoblock**
> Geoblock updateStreamTargetGeoblock(streamTargetId, geoblock)

Update geo-blocking for a Wowza stream target

This operation updates the geo-blocking applied to a stream target. Only Wowza stream targets can be geo-blocked.  **Important:** After updating geo-blocking, you must [contact Support](https://www.wowza.com/portal/help) in order for your changes to take effect.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;
import java.util.ArrayList;

public class UpdateGeoBlockingForAWowzaStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";

	try {
		Geoblock result = apiInstance.showStreamTargetGeoblock(streamTargetId);
		System.out.println(result);
		result.setType(Geoblock.TypeEnum.DISABLED);
		Geoblock newResult = apiInstance.updateStreamTargetGeoblock(streamTargetId,result);
		System.out.println(newResult);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#updateStreamTargetGeoblock");
            System.err.println("Exception when calling StreamTargetsApi#Code:"+e.getCode());
            System.err.println("Exception when calling StreamTargetsApi#ResponseBody:"+e.getResponseBody());

	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |
 **geoblock** | [**Geoblock**](Geoblock.md)| Provide the details of the geo-blocking to update. |

### Return type

[**Geoblock**](Geoblock.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStreamTargetTokenAuth"></a>
# **updateStreamTargetTokenAuth**
> TokenAuth updateStreamTargetTokenAuth(streamTargetId, tokenAuth)

Update token authorization for a Wowza stream target

This operation updates the token authorization applied to a stream target. Only Wowza stream targets can use token authorization.  **Important:** After updating token authorization, you must [contact Support](https://www.wowza.com/portal/help) in order for your changes to take effect.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class UpdateTokenAuthorizationForAWowzaStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	try {
		TokenAuth result = apiInstance.showStreamTargetTokenAuth(streamTargetId);
		System.out.println(result);
		result.setTrustedSharedSecret("AABBCCDD");
		TokenAuth newResult = apiInstance.updateStreamTargetTokenAuth(streamTargetId,result);
		System.out.println(newResult);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#updateStreamTargetTokenAuth");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamTargetId** | **String**| The unique alphanumeric string that identifies the stream target. |
 **tokenAuth** | [**TokenAuth**](TokenAuth.md)| Provide the details of the token authorization to update. |

### Return type

[**TokenAuth**](TokenAuth.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUllStreamTarget"></a>
# **updateUllStreamTarget**
> StreamTargetUll updateUllStreamTarget(id, streamTargetUll)

Update an ultra low latency stream target

(Available from version 1.2) This operation updates an ultra low latency stream target. Ultra low latency stream targets are available through subscription to &lt;a href&#x3D;&#39;https://www.wowza.com/products/streaming-cloud#ultra-low-latency&#39; target&#x3D;&#39;_blank&#39;Wowza Streaming Cloud with Ultra Low Latency&lt;/a.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class UpdateAnUltraLowLatencyStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();

        String ullStreamTargetId = "xxxxxx";
        try {
		StreamTargetUll result = apiInstance.showUllStreamTarget(ullStreamTargetId);
		System.out.println(result);

		result.setName("javaSDKNameUpdate");

		StreamTargetUll newResult = apiInstance.updateUllStreamTarget(ullStreamTargetId,result);
		System.out.println(newResult);
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#updateUllStreamTarget");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the ultra low latency stream target. |
 **streamTargetUll** | [**StreamTargetUll**](StreamTargetUll.md)| Provide the details of the ultra low latency stream target to update. |

### Return type

[**StreamTargetUll**](StreamTargetUll.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWowzaStreamTarget"></a>
# **updateWowzaStreamTarget**
> StreamTargetWowza updateWowzaStreamTarget(id, streamTargetWowza)

Update a Wowza stream target

(Available from version 1.2) This operation updates a Wowza stream target.

### Example
```java
// Import classes:
package StreamTargets;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.auth.*;

import java.util.List;

public class UpdateAWowzaStreamTarget {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	StreamTargetsApi apiInstance = new StreamTargetsApi();
	String streamTargetId = "xxxxxx";
	try {
		StreamTargetWowza result = apiInstance.showWowzaStreamTarget(streamTargetId);
		System.out.println(result);
		result.setName("Updated Wowza Stream Target Java SDK");
		StreamTargetWowza newResult = apiInstance.updateWowzaStreamTarget(streamTargetId,result);
		System.out.println(newResult);
		
	} catch (ApiException e) {
	    System.err.println("Exception when calling StreamTargetsApi#updateWowzaStreamTarget");
	    e.printStackTrace();
		}
	}
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the stream target. |
 **streamTargetWowza** | [**StreamTargetWowza**](StreamTargetWowza.md)| Provide the details of the Wowza stream target to update in the body of the request. |

### Return type

[**StreamTargetWowza**](StreamTargetWowza.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

