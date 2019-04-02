/*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 *
 * OpenAPI spec version: v1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wowza.cloudsdk.client.api;

import com.wowza.cloudsdk.client.ApiCallback;
import com.wowza.cloudsdk.client.ApiClient;
import com.wowza.cloudsdk.client.ApiException;
import com.wowza.cloudsdk.client.ApiResponse;
import com.wowza.cloudsdk.client.Configuration;
import com.wowza.cloudsdk.client.Pair;
import com.wowza.cloudsdk.client.ProgressRequestBody;
import com.wowza.cloudsdk.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import java.time.OffsetDateTime;
import com.wowza.cloudsdk.client.model.UsageTimeTranscoders;
import com.wowza.cloudsdk.client.model.UsageTimeTranscoder;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessingTimeApi {
    private ApiClient apiClient;

    public ProcessingTimeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProcessingTimeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for usageTimeTranscodersIndex
     * @param from The start of the range of time you want to view. Specify &lt;strong&gt;YYYY-MM-DD HH:MM:SS&lt;/strong&gt; where &lt;strong&gt;HH&lt;/strong&gt; is a 24-hour clock in UTC. The &lt;em&gt;from&lt;/em&gt; default is the last billing date. (optional)
     * @param to The end of the range of time you want to view. Specify &lt;strong&gt;YYYY-MM-DD HH:MM:SS&lt;/strong&gt; where &lt;strong&gt;HH&lt;/strong&gt; is a 24-hour clock in UTC. The &lt;em&gt;to&lt;/em&gt; default is the end of the current day. (optional)
     * @param transcoderType The type of transcoder. The default is &lt;strong&gt;transcoded&lt;/strong&gt;. (optional)
     * @param billingMode The billing mode for the transcoder. The default is &lt;strong&gt;pay_as_you_go&lt;/strong&gt;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call usageTimeTranscodersIndexCall(OffsetDateTime from, OffsetDateTime to, String transcoderType, String billingMode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/usage/time/transcoders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
        if (to != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to", to));
        if (transcoderType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("transcoder_type", transcoderType));
        if (billingMode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("billing_mode", billingMode));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "wsc-access-key", "wsc-api-key", "wsc-signature", "wsc-timestamp" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call usageTimeTranscodersIndexValidateBeforeCall(OffsetDateTime from, OffsetDateTime to, String transcoderType, String billingMode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = usageTimeTranscodersIndexCall(from, to, transcoderType, billingMode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch stream processing time
     * This operation shows the amount of stream processing time used by all transcoders in the account. The default time frame is &lt;em&gt;from&lt;/em&gt; the last billing date &lt;em&gt;to&lt;/em&gt; the end of the current day.
     * @param from The start of the range of time you want to view. Specify &lt;strong&gt;YYYY-MM-DD HH:MM:SS&lt;/strong&gt; where &lt;strong&gt;HH&lt;/strong&gt; is a 24-hour clock in UTC. The &lt;em&gt;from&lt;/em&gt; default is the last billing date. (optional)
     * @param to The end of the range of time you want to view. Specify &lt;strong&gt;YYYY-MM-DD HH:MM:SS&lt;/strong&gt; where &lt;strong&gt;HH&lt;/strong&gt; is a 24-hour clock in UTC. The &lt;em&gt;to&lt;/em&gt; default is the end of the current day. (optional)
     * @param transcoderType The type of transcoder. The default is &lt;strong&gt;transcoded&lt;/strong&gt;. (optional)
     * @param billingMode The billing mode for the transcoder. The default is &lt;strong&gt;pay_as_you_go&lt;/strong&gt;. (optional)
     * @return List
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<UsageTimeTranscoder> usageTimeTranscodersIndex(OffsetDateTime from, OffsetDateTime to, String transcoderType, String billingMode) throws ApiException {
        UsageTimeTranscoders resp = usageTimeTranscodersIndexTransport(from, to, transcoderType, billingMode);
        return resp.getTranscoders();
    }

    /**
     * Fetch stream processing time - Transport Wrapped
     * This operation shows the amount of stream processing time used by all transcoders in the account. The default time frame is &lt;em&gt;from&lt;/em&gt; the last billing date &lt;em&gt;to&lt;/em&gt; the end of the current day.
     * @param from The start of the range of time you want to view. Specify &lt;strong&gt;YYYY-MM-DD HH:MM:SS&lt;/strong&gt; where &lt;strong&gt;HH&lt;/strong&gt; is a 24-hour clock in UTC. The &lt;em&gt;from&lt;/em&gt; default is the last billing date. (optional)
     * @param to The end of the range of time you want to view. Specify &lt;strong&gt;YYYY-MM-DD HH:MM:SS&lt;/strong&gt; where &lt;strong&gt;HH&lt;/strong&gt; is a 24-hour clock in UTC. The &lt;em&gt;to&lt;/em&gt; default is the end of the current day. (optional)
     * @param transcoderType The type of transcoder. The default is &lt;strong&gt;transcoded&lt;/strong&gt;. (optional)
     * @param billingMode The billing mode for the transcoder. The default is &lt;strong&gt;pay_as_you_go&lt;/strong&gt;. (optional)
     * @return UsageTimeTranscoders
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UsageTimeTranscoders usageTimeTranscodersIndexTransport(OffsetDateTime from, OffsetDateTime to, String transcoderType, String billingMode) throws ApiException {
        ApiResponse<UsageTimeTranscoders> resp = usageTimeTranscodersIndexWithHttpInfo(from, to, transcoderType, billingMode);
        return resp.getData();
    }

    /**
     * Fetch stream processing time
     * This operation shows the amount of stream processing time used by all transcoders in the account. The default time frame is &lt;em&gt;from&lt;/em&gt; the last billing date &lt;em&gt;to&lt;/em&gt; the end of the current day.
     * @param from The start of the range of time you want to view. Specify &lt;strong&gt;YYYY-MM-DD HH:MM:SS&lt;/strong&gt; where &lt;strong&gt;HH&lt;/strong&gt; is a 24-hour clock in UTC. The &lt;em&gt;from&lt;/em&gt; default is the last billing date. (optional)
     * @param to The end of the range of time you want to view. Specify &lt;strong&gt;YYYY-MM-DD HH:MM:SS&lt;/strong&gt; where &lt;strong&gt;HH&lt;/strong&gt; is a 24-hour clock in UTC. The &lt;em&gt;to&lt;/em&gt; default is the end of the current day. (optional)
     * @param transcoderType The type of transcoder. The default is &lt;strong&gt;transcoded&lt;/strong&gt;. (optional)
     * @param billingMode The billing mode for the transcoder. The default is &lt;strong&gt;pay_as_you_go&lt;/strong&gt;. (optional)
     * @return ApiResponse&lt;UsageTimeTranscoders&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UsageTimeTranscoders> usageTimeTranscodersIndexWithHttpInfo(OffsetDateTime from, OffsetDateTime to, String transcoderType, String billingMode) throws ApiException {
        com.squareup.okhttp.Call call = usageTimeTranscodersIndexValidateBeforeCall(from, to, transcoderType, billingMode, null, null);
        Type localVarReturnType = new TypeToken<UsageTimeTranscoders>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch stream processing time (asynchronously)
     * This operation shows the amount of stream processing time used by all transcoders in the account. The default time frame is &lt;em&gt;from&lt;/em&gt; the last billing date &lt;em&gt;to&lt;/em&gt; the end of the current day.
     * @param from The start of the range of time you want to view. Specify &lt;strong&gt;YYYY-MM-DD HH:MM:SS&lt;/strong&gt; where &lt;strong&gt;HH&lt;/strong&gt; is a 24-hour clock in UTC. The &lt;em&gt;from&lt;/em&gt; default is the last billing date. (optional)
     * @param to The end of the range of time you want to view. Specify &lt;strong&gt;YYYY-MM-DD HH:MM:SS&lt;/strong&gt; where &lt;strong&gt;HH&lt;/strong&gt; is a 24-hour clock in UTC. The &lt;em&gt;to&lt;/em&gt; default is the end of the current day. (optional)
     * @param transcoderType The type of transcoder. The default is &lt;strong&gt;transcoded&lt;/strong&gt;. (optional)
     * @param billingMode The billing mode for the transcoder. The default is &lt;strong&gt;pay_as_you_go&lt;/strong&gt;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call usageTimeTranscodersIndexAsync(OffsetDateTime from, OffsetDateTime to, String transcoderType, String billingMode, final ApiCallback<UsageTimeTranscoders> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = usageTimeTranscodersIndexValidateBeforeCall(from, to, transcoderType, billingMode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UsageTimeTranscoders>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}