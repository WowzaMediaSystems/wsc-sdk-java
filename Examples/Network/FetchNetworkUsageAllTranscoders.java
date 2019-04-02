 /*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 */
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
