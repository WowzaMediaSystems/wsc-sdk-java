# NetworkApi

All URIs are relative to *https://api.cloud.wowza.com/api/v1.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageNetworkStreamSourcesIndex**](NetworkApi.md#usageNetworkStreamSourcesIndex) | **GET**usage/network/stream_sources | Fetch network usage for all stream sources
[**usageNetworkStreamTargetsIndex**](NetworkApi.md#usageNetworkStreamTargetsIndex) | **GET**usage/network/stream_targets | Fetch network usage for all stream targets
[**usageNetworkTranscodersIndex**](NetworkApi.md#usageNetworkTranscodersIndex) | **GET**usage/network/transcoders | Fetch network usage for all transcoders


<a name="usageNetworkStreamSourcesIndex"></a>
# **usageNetworkStreamSourcesIndex**
> List<UsageNetworkStreamSource> usageNetworkStreamSourcesIndex(from, to)

Fetch network usage for all stream sources

This operation shows the amount of network usage for all stream sources in the account. The default time frame is *from* the last billing date *to* the end of the current day.

### Example
```java
// Import classes:
package Network;

import com.wowza.cloudsdk.client.ApiClient;
import com.wowza.cloudsdk.client.ApiException;
import com.wowza.cloudsdk.client.Configuration;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;

import java.util.List;

import java.time.OffsetDateTime;

public class FetchNetworkUsageAllTranscoders {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	NetworkApi apiInstance = new NetworkApi();
	OffsetDateTime from = OffsetDateTime.now(); 
	OffsetDateTime to = OffsetDateTime.now();
	try {
    		List<UsageNetworkTranscoder> result = apiInstance.usageNetworkTranscodersIndex(from, to, "transcoded", "pay_as_you_go");
    		System.out.println(result);
		} catch (ApiException e) {
    	System.err.println("Exception when calling NetworkApi#usageNetworkTranscodersIndex");
    	e.printStackTrace();
		}

	}

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **OffsetDateTime**| The start of the range of time you want to view. Specify **YYYY-MM-DD HH:MM:SS** where **HH** is a 24-hour clock in UTC. The *from* default is the last billing date. | [optional]
 **to** | **OffsetDateTime**| The end of the range of time you want to view. Specify **YYYY-MM-DD HH:MM:SS** where **HH** is a 24-hour clock in UTC. The *to* default is the end of the current day. | [optional]

### Return type

[**List<UsageNetworkStreamSource>**](UsageNetworkStreamSource.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usageNetworkStreamTargetsIndex"></a>
# **usageNetworkStreamTargetsIndex**
> UsageNetworkStreamTargets usageNetworkStreamTargetsIndex(from, to)

Fetch network usage for all stream targets

This operation shows the amount of network usage for all stream targets in the account cumulatively and individually. The default time frame is *from* the last billing date *to* the end of the current day.&lt;blockquote**Note:** Ultra low latency stream targets are available through subscription to &lt;a href&#x3D;&#39;https://www.wowza.com/products/streaming-cloud#ultra-low-latency&#39; target&#x3D;&#39;_blank&#39;Wowza Streaming Cloud with Ultra Low Latency&lt;/a. &lt;/blockquote

### Example
```java
// Import classes:
package Network;

import com.wowza.cloudsdk.client.ApiClient;
import com.wowza.cloudsdk.client.ApiException;
import com.wowza.cloudsdk.client.Configuration;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;

import java.time.OffsetDateTime;

public class FetchNetworkUsageAllStreamTargets {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	NetworkApi apiInstance = new NetworkApi();
	OffsetDateTime from = OffsetDateTime.now(); 
	OffsetDateTime to = OffsetDateTime.now();
	try {
    		UsageNetworkStreamTargets result = apiInstance.usageNetworkStreamTargetsIndex(from, to);
    		System.out.println(result);
		} catch (ApiException e) {
    	System.err.println("Exception when calling NetworkApi#usageNetworkStreamTargetsIndex");
    	e.printStackTrace();
		}

	}

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **OffsetDateTime**| The start of the range of time you want to view. Specify **YYYY-MM-DD HH:MM:SS** where **HH** is a 24-hour clock in UTC. The *from* default is the last billing date. | [optional]
 **to** | **OffsetDateTime**| The end of the range of time you want to view. Specify **YYYY-MM-DD HH:MM:SS** where **HH** is a 24-hour clock in UTC. The *to* default is the end of the current day. | [optional]

### Return type

[**UsageNetworkStreamTargets**](UsageNetworkStreamTargets.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usageNetworkTranscodersIndex"></a>
# **usageNetworkTranscodersIndex**
> List<UsageNetworkTranscoder> usageNetworkTranscodersIndex(from, to, transcoderType, billingMode)

Fetch network usage for all transcoders

This operation shows the amount of network usage (egress) for all transcoders in the account. The default time frame is *from* the last billing date *to* the end of the current day.

### Example
```java
// Import classes:
package Network;

import com.wowza.cloudsdk.client.ApiClient;
import com.wowza.cloudsdk.client.ApiException;
import com.wowza.cloudsdk.client.Configuration;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;

import java.util.List;

import java.time.OffsetDateTime;

public class FetchNetworkUsageAllTranscoders {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	NetworkApi apiInstance = new NetworkApi();
	OffsetDateTime from = OffsetDateTime.now(); 
	OffsetDateTime to = OffsetDateTime.now();
	String transcoderType = "transcoded";
	String billingMode = "pay_as_you_go";

	try {
    		List<UsageNetworkTranscoder> result = apiInstance.usageNetworkTranscodersIndex(from, to, transcoderType, billingMode);
    		System.out.println(result);
		} catch (ApiException e) {
    	System.err.println("Exception when calling NetworkApi#usageNetworkTranscodersIndex");
    	e.printStackTrace();
		}

	}

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **OffsetDateTime**| The start of the range of time you want to view. Specify **YYYY-MM-DD HH:MM:SS** where **HH** is a 24-hour clock in UTC. The *from* default is the last billing date. | [optional]
 **to** | **OffsetDateTime**| The end of the range of time you want to view. Specify **YYYY-MM-DD HH:MM:SS** where **HH** is a 24-hour clock in UTC. The *to* default is the end of the current day. | [optional]
 **transcoderType** | **String**| The type of transcoder. The default is **transcoded**. | [optional] [enum: transcoded, passthrough]
 **billingMode** | **String**| The billing mode for the transcoder. The default is **pay_as_you_go**. | [optional] [enum: pay_as_you_go, twentyfour_seven]

### Return type

[**List<UsageNetworkTranscoder>**](UsageNetworkTranscoder.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

