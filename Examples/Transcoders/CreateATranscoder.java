 /*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 */
package Transcoders;

import com.wowza.cloudsdk.client.*;
import com.wowza.cloudsdk.client.auth.*;
import com.wowza.cloudsdk.client.model.*;
import com.wowza.cloudsdk.client.api.*;

import java.io.File;
import java.util.*;

public class CreateATranscoderExample {

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

	String streamSourceId = "xxxxxx";

	TranscodersApi apiInstance = new TranscodersApi();
	Transcoder newTranscoder = new Transcoder();     
        newTranscoder.setBillingMode(Transcoder.BillingModeEnum.PAY_AS_YOU_GO);
        newTranscoder.setBroadcastLocation(Transcoder.BroadcastLocationEnum.EU_BELGIUM);
        newTranscoder.setDeliveryMethod(Transcoder.DeliveryMethodEnum.PULL);
        newTranscoder.setName("Transcoder Java SDK Example Name");
        newTranscoder.setProtocol(Transcoder.ProtocolEnum.RTMP);
        newTranscoder.setTranscoderType(Transcoder.TranscoderTypeEnum.TRANSCODED);
        newTranscoder.setClosedCaptionType(Transcoder.ClosedCaptionTypeEnum.CEA);
        newTranscoder.setBufferSize(Transcoder.BufferSizeEnum.NUMBER_4000);
        newTranscoder.setDescription("Transcoder Java SDK Example Description");
        newTranscoder.setDisableAuthentication(false);
        newTranscoder.setIdleTimeout(1200);
        newTranscoder.setLowLatency(false);
        newTranscoder.setPassword("0123456789abcdef");
        newTranscoder.setPlayMaximumConnections(Transcoder.PlayMaximumConnectionsEnum.NUMBER_20);
        newTranscoder.setRecording(false);
        newTranscoder.setSourceUrl("127.0.0.1/live/myStream@123456");
        newTranscoder.setStreamExtension(".magic");
        newTranscoder.setStreamSmoother(false);
        newTranscoder.setStreamSourceId(streamSourceId);
        newTranscoder.setSuppressStreamTargetStart(false);
        newTranscoder.setUsername("JavaSDKUserName");
        newTranscoder.setWatermark(false);
        newTranscoder.setWatermarkHeight(80);
        newTranscoder.setWatermarkWidth(100);
        newTranscoder.setWatermarkOpacity(Transcoder.WatermarkOpacityEnum.NUMBER_75);
        newTranscoder.setWatermarkPosition(Transcoder.WatermarkPositionEnum.BOTTOM_LEFT);
        newTranscoder.setWatermarkImageUrl("https://www.wowza.com/images/logo.jpg");
	try {
		    Transcoder result = apiInstance.createTranscoder(newTranscoder);
		    System.out.println(result);
		} catch (ApiException e) {
	    System.err.println("Exception when calling TranscodersApi#createTranscoder");
	    e.printStackTrace();
		}

    }

}

