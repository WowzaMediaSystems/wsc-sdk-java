 /*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 */
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
