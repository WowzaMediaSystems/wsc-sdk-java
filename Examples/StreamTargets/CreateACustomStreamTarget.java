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
