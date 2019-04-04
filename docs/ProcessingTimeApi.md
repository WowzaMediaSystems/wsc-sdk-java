# ProcessingTimeApi

All URIs are relative to *https://api.cloud.wowza.com/api/v1.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageTimeTranscodersIndex**](ProcessingTimeApi.md#usageTimeTranscodersIndex) | **GET**usage/time/transcoders | Fetch stream processing time


<a name="usageTimeTranscodersIndex"></a>
# **usageTimeTranscodersIndex**
> List<UsageTimeTranscoder> usageTimeTranscodersIndex(from, to, transcoderType, billingMode)

Fetch stream processing time

This operation shows the amount of stream processing time used by all transcoders in the account. The default time frame is *from* the last billing date *to* the end of the current day.

### Example
```java
// Import classes:
package ProcessingTime;

import com.wowza.cloudsdk.client.ApiClient;
import com.wowza.cloudsdk.client.ApiException;
import com.wowza.cloudsdk.client.Configuration;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;

import java.time.OffsetDateTime;
import java.util.List;

public class FetchStreamProcessingTime {

    public static void main(String[] args) {

        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");

        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");

	ProcessingTimeApi apiInstance = new ProcessingTimeApi();
	OffsetDateTime from = OffsetDateTime.now(); 
	OffsetDateTime to = OffsetDateTime.now();
	try {
    		List<UsageTimeTranscoder> result = apiInstance.usageTimeTranscodersIndex(from, to, null, null);
    		System.out.println(result);
		} catch (ApiException e) {
    	System.err.println("Exception when calling ProcessingTimeApi#usageTimeTranscodersIndex");
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

[**List<UsageTimeTranscoder>**](UsageTimeTranscoder.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

