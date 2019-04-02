 /*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 */
package LiveStreams;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.LiveStreamsApi;

import java.io.File;
import java.util.*;

public class CreateALiveStreamExample {

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

	LiveStreamsApi apiInstance = new LiveStreamsApi();

	LiveStream liveStream = new LiveStream(); // LiveStream | Provide the details of the live stream to create in the body of the request.
        liveStream.setName("JavaSDKCreate"+System.currentTimeMillis());
	liveStream.setAspectRatioHeight(1080);
        liveStream.setAspectRatioWidth(1920);
        liveStream.setBillingMode(LiveStream.BillingModeEnum.PAY_AS_YOU_GO);
        liveStream.setBroadcastLocation(LiveStream.BroadcastLocationEnum.EU_GERMANY);
        liveStream.setClosedCaptionType(LiveStream.ClosedCaptionTypeEnum.NONE);
        liveStream.setDeliveryMethod(LiveStream.DeliveryMethodEnum.PUSH);
        liveStream.setDeliveryType(LiveStream.DeliveryTypeEnum.SINGLE_BITRATE);
        liveStream.setEncoder(LiveStream.EncoderEnum.WOWZA_GOCODER);
        liveStream.setHostedPage(false);

        /**
        liveStream.setHostedPageDescription("hostedDescription");
        liveStream.setHostedPageLogoImageUrl("http://www.wowza.com/imageURL");
        liveStream.setHostedPageSharingIcons(true);
        liveStream.setHostedPageTitle("pageTitleHERE");
        liveStream.setHostedPageUrl("http://www.wowza.com/pageURL");
        **/

        //liveStream.setLowLatency(true);
        liveStream.setPlayerWidth(720);
        liveStream.setTargetDeliveryProtocol(LiveStream.TargetDeliveryProtocolEnum.HTTPS);
        liveStream.setRecording(false);
        liveStream.setTranscoderType(LiveStream.TranscoderTypeEnum.TRANSCODED);
        liveStream.setUseStreamSource(false);
        List<String> deliveryProtocols = new ArrayList<String>();
        deliveryProtocols.add("rtmp");
        deliveryProtocols.add("rtsp");
        deliveryProtocols.add("wowz");
        liveStream.setDeliveryProtocols(deliveryProtocols);
        liveStream.hostedPage(true);
        liveStream.hostedPageDescription("My JavaSDKCreate");
        liveStream.hostedPageSharingIcons(true);
        liveStream.hostedPageTitle("Title host JavaSDKCreate");
        liveStream.lowLatency(false);
        liveStream.playerCountdown(false);
        liveStream.playerResponsive(false);
        liveStream.playerType("wowza_player");
        liveStream.playerWidth(640);
        liveStream.recording(false);
        liveStream.useStreamSource(false);
        liveStream.setTargetDeliveryProtocol(LiveStream.TargetDeliveryProtocolEnum.HTTPS);
	liveStream.setDisableAuthentication(false);
        liveStream.setUsername("java);
        liveStream.setPassword("tseTKDSavaJ");

	try {
	    LiveStream result = apiInstance.createLiveStream(liveStream);
	    System.out.println(result);
	} catch (ApiException e) {
	    System.err.println("Exception when calling LiveStreamsApi#createLiveStream");
	    e.printStackTrace();
	}
    }
}

