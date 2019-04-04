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

public class CreateASchedule{

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

        LocalDate today = LocalDate.now();

	String transcoderId = "xxxxxx";
	SchedulesApi apiInstance = new SchedulesApi();

        Schedule schedule = new Schedule(); // Schedule | Provide the details of the schedule to create in the body of the request.

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
		System.err.println("Exception when calling SchedulesApi#CreateAScheduleExample:"+e.getResponseBody());
		System.err.println("Exception when calling SchedulesApi#CreateAScheduleExample");
		e.printStackTrace();
	}
    }
}

