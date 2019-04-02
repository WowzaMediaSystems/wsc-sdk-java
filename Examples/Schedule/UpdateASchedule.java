 /*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 */
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

        // Configure API key authorization: wsc-access-key
        ApiKeyAuth wscaccesskey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-access-key");
        wscaccesskey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //wsc-access-key.setApiKeyPrefix("Token");

        // Configure API key authorization: wsc-api-key
        ApiKeyAuth wscapikey = (ApiKeyAuth)defaultClient.getAuthentication("wsc-api-key");
        wscapikey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //wsc-api-key.setApiKeyPrefix("Token");

	SchedulesApi apiInstance = new SchedulesApi();
	String scheduleId = "xxxxxx";

	try {
		Schedule result = apiInstance.showSchedule(scheduleId);
		System.out.println(result);
		result.setName("Schedule Updated by Java SDK");
		Schedule newResult = apiInstance.updateSchedule(scheduleId,result);
		System.out.println(newResult);

	} catch (ApiException e) {
		System.err.println("Exception when calling SchedulesApi#updateSchedule");
		System.out.println("Code: "+e.getCode());
		System.err.println("Exception when calling SchedulesApi#updateSchedule:"+e.getResponseBody());
	    e.printStackTrace();
	}
    }
}

