# StorageApi

All URIs are relative to *https://api.cloud.wowza.com/api/v1.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageStoragePeakRecordingIndex**](StorageApi.md#usageStoragePeakRecordingIndex) | **GET**usage/storage/peak_recording | Fetch peak recording storage


<a name="usageStoragePeakRecordingIndex"></a>
# **usageStoragePeakRecordingIndex**
> PeakRecording usageStoragePeakRecordingIndex(from, to)

Fetch peak recording storage

This operation shows the amount of peak recording storage used for the account. The default time frame is *from* the last billing date *to* the end of the current day.

### Example
```java
// Import classes:
package Storage;

import com.wowza.cloudsdk.client.ApiClient;
import com.wowza.cloudsdk.client.ApiException;
import com.wowza.cloudsdk.client.Configuration;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.api.*;
import com.wowza.cloudsdk.client.model.*;

import java.time.OffsetDateTime;

public class FetchPeakRecordingStorage {

    public static void main(String[] args) {

	ApiClient defaultClient = Configuration.getDefaultApiClient();

	ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
	wscaccesskey.setApiKey("YOUR API KEY");

	ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
	wscapikey.setApiKey("YOUR API KEY");

	StorageApi apiInstance = new StorageApi();
	OffsetDateTime from = OffsetDateTime.now();
	OffsetDateTime to = OffsetDateTime.now();

	try {
		    PeakRecording result = apiInstance.usageStoragePeakRecordingIndex(from, to);
		    System.out.println(result);
		} 
	catch (ApiException e) {
	    System.err.println("Exception when calling StorageApi#usageStoragePeakRecordingIndex");
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

[**PeakRecording**](PeakRecording.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

