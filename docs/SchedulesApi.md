# SchedulesApi

All URIs are relative to *https://api.cloud.wowza.com/api/v1.3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSchedule**](SchedulesApi.md#createSchedule) | **POST**schedules | Create a schedule
[**deleteSchedule**](SchedulesApi.md#deleteSchedule) | **DELETE**schedules/{id} | Delete a schedule
[**disableSchedule**](SchedulesApi.md#disableSchedule) | **PUT**schedules/{id}/disable | Disable a schedule
[**enableSchedule**](SchedulesApi.md#enableSchedule) | **PUT**schedules/{id}/enable | Enable a schedule
[**listSchedules**](SchedulesApi.md#listSchedules) | **GET**schedules | Fetch all schedules
[**showSchedule**](SchedulesApi.md#showSchedule) | **GET**schedules/{id} | Fetch a schedule
[**showScheduleState**](SchedulesApi.md#showScheduleState) | **GET**schedules/{id}/state | Fetch the state of a schedule
[**updateSchedule**](SchedulesApi.md#updateSchedule) | **PATCH**schedules/{id} | Update a schedule


<a name="createSchedule"></a>
# **createSchedule**
> Schedule createSchedule(schedule)

Create a schedule

This operation creates a schedule.

### Example
```java
// Import classes:
package Schedule;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.SchedulesApi;

import java.io.File;
import java.util.*;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class CreateASchedule{

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

        LocalDate today = LocalDate.now();

	String transcoderId = "xxxxxx";
	SchedulesApi apiInstance = new SchedulesApi();

        Schedule schedule = new Schedule();/ Schedule | Provide the details of the schedule to create in the body of the request.

        OffsetDateTime startTranscoder = OffsetDateTime.of(LocalDateTime.of(2019, 03, 20, 00, 00), ZoneOffset.ofHoursMinutes(0, 0));
        schedule.setStartTranscoder(startTranscoder);
        OffsetDateTime endTranscoder = OffsetDateTime.of(LocalDateTime.of(2019, 03, 25, 00, 00), ZoneOffset.ofHoursMinutes(0, 0));
        schedule.setStopTranscoder(endTranscoder);

        schedule.actionType(Schedule.ActionTypeEnum.START_STOP);
        schedule.setName("Schedule Java SDK Test");
        String recurrence = Schedule.RecurrenceDataEnum.FRIDAY.toString();
        schedule.recurrenceData(recurrence);
        schedule.recurrenceType(Schedule.RecurrenceTypeEnum.ONCE);
        schedule.startRepeat(today.plus(1, ChronoUnit.DAYS));
        schedule.setState(Schedule.StateEnum.ENABLED);
        schedule.setTranscoderId(transcoderId);

	try {
	    Schedule result = apiInstance.createSchedule(schedule);
	    System.out.println(result);
	} catch (ApiException e) {
		System.out.println("Code: "+e.getCode());
		System.err.println("Exception when calling SchedulesApi#CreateASchedule:"+e.getResponseBody());
		System.err.println("Exception when calling SchedulesApi#CreateASchedule");
		e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule** | [**Schedule**](Schedule.md)| Provide the details of the schedule to create in the body of the request. |

### Return type

[**Schedule**](Schedule.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSchedule"></a>
# **deleteSchedule**
> deleteSchedule(id)

Delete a schedule

This operation deletes a schedule.

### Example
```java
// Import classes:
package Schedule;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.SchedulesApi;

import java.io.File;
import java.util.*;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class DeleteASchedule {

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

	SchedulesApi apiInstance = new SchedulesApi();
	String scheduleId = "xxxxxx";

	try {
	    apiInstance.deleteSchedule(scheduleId);
	} catch (ApiException e) {
		System.err.println("Exception when calling SchedulesApi#deleteSchedule");
		System.out.println("Code: "+e.getCode());
		System.err.println("Exception when calling SchedulesApi#deleteSchedule:"+e.getResponseBody());
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the schedule. |

### Return type

null (empty response body)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableSchedule"></a>
# **disableSchedule**
> ScheduleState disableSchedule(id)

Disable a schedule

This operation disables a schedule.

### Example
```java
// Import classes:
package Schedule;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.SchedulesApi;

import java.io.File;
import java.util.*;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class DisableASchedule {

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

	SchedulesApi apiInstance = new SchedulesApi();
	String scheduleId = "xxxxxxx";

	try {
		ScheduleState result = apiInstance.disableSchedule(scheduleId);
		System.out.println(result);

	} catch (ApiException e) {
		System.err.println("Exception when calling SchedulesApi#disableSchedule");
		System.out.println("Code: "+e.getCode());
		System.err.println("Exception when calling SchedulesApi#disableSchedule:"+e.getResponseBody());
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the schedule. |

### Return type

[**ScheduleState**](ScheduleState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enableSchedule"></a>
# **enableSchedule**
> ScheduleState enableSchedule(id)

Enable a schedule

This operation enables a schedule.

### Example
```java
// Import classes:
package Schedule;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.SchedulesApi;

import java.io.File;
import java.util.*;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class EnableASchedule {

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

	SchedulesApi apiInstance = new SchedulesApi();
	String scheduleId = "xxxxxx";

	try {
		ScheduleState result = apiInstance.enableSchedule(scheduleId);
		System.out.println(result);

	} catch (ApiException e) {
		System.err.println("Exception when calling SchedulesApi#enableSchedule");
		System.out.println("Code: "+e.getCode());
		System.err.println("Exception when calling SchedulesApi#enableSchedule:"+e.getResponseBody());
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the schedule. |

### Return type

[**ScheduleState**](ScheduleState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSchedules"></a>
# **listSchedules**
> List<Schedule> listSchedules(page, perPage)

Fetch all schedules

This operation shows the details of all of your schedules.

### Example
```java
// Import classes:
package Schedule;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.SchedulesApi;

import java.io.File;
import java.util.*;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class FetchAllSchedules {

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

	SchedulesApi apiInstance = new SchedulesApi();
	Integer page = 1;
	Integer perPage = 56;

	try {
	    List<Schedule> result = apiInstance.listSchedules(page,perPage);
	    System.out.println(result);
	} catch (ApiException e) {
		System.err.println("Exception when calling SchedulesApi#listSchedules");
		System.out.println("Code: "+e.getCode());
		System.err.println("Exception when calling SchedulesApi#listSchedules:"+e.getResponseBody());
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

[**List<Schedule>**](Schedule.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showSchedule"></a>
# **showSchedule**
> Schedule showSchedule(id)

Fetch a schedule

This operation shows the details of a specific schedule.

### Example
```java
// Import classes:
package Schedule;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.SchedulesApi;

import java.io.File;
import java.util.*;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class FetchASchedule {

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

	SchedulesApi apiInstance = new SchedulesApi();
	String scheduleId = "xxxxxx";

	try {
	    Schedule result = apiInstance.showSchedule(scheduleId);
	    System.out.println(result);
	} catch (ApiException e) {
		System.err.println("Exception when calling SchedulesApi#showSchedule");
		System.out.println("Code: "+e.getCode());
		System.err.println("Exception when calling SchedulesApi#showSchedule:"+e.getResponseBody());
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the schedule. |

### Return type

[**Schedule**](Schedule.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="showScheduleState"></a>
# **showScheduleState**
> ScheduleState showScheduleState(id)

Fetch the state of a schedule

This operation shows the current state of a schedule.

### Example
```java
// Import classes:
package Schedule;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.SchedulesApi;

import java.io.File;
import java.util.*;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class FetchStateOfSchedule {

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

	SchedulesApi apiInstance = new SchedulesApi();
	String scheduleId = "xxxxxx";

	try {
		ScheduleState result = apiInstance.showScheduleState(scheduleId);
		System.out.println(result);

	} catch (ApiException e) {
		System.err.println("Exception when calling SchedulesApi#showScheduleState");
		System.out.println("Code: "+e.getCode());
		System.err.println("Exception when calling SchedulesApi#showScheduleState:"+e.getResponseBody());
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the schedule. |

### Return type

[**ScheduleState**](ScheduleState.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSchedule"></a>
# **updateSchedule**
> Schedule updateSchedule(id, schedule)

Update a schedule

This operation updates a schedule.

### Example
```java
// Import classes:
package Schedule;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.SchedulesApi;

import java.io.File;
import java.util.*;

import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class UpdateASchedule {

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

	SchedulesApi apiInstance = new SchedulesApi();
	String scheduleId = "xxxxxx";

	try {
		Schedule result = apiInstance.showSchedule(scheduleId);
		System.out.println(result);
		result.setName("Schedule Updated by Java SDK");
		Schedule newResult = apiInstance.updateSchedule(scheduleId,result);
		System.out.println(newResult);

	} catch (ApiException e) {
		System.err.println("Exception when calling SchedulesApi#showSchedule");
		System.out.println("Code: "+e.getCode());
		System.err.println("Exception when calling SchedulesApi#showSchedule:"+e.getResponseBody());
	    e.printStackTrace();
	}
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The unique alphanumeric string that identifies the schedule. |
 **schedule** | [**Schedule**](Schedule.md)| Provide the details of the schedule to update in the body of the request. |

### Return type

[**Schedule**](Schedule.md)

### Authorization

[wsc-access-key](../README.md#wsc-access-key), [wsc-api-key](../README.md#wsc-api-key), [wsc-signature](../README.md#wsc-signature), [wsc-timestamp](../README.md#wsc-timestamp)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

