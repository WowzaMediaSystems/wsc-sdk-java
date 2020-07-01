**Interested in maintaining this SDK? Please respond to [this issue](https://github.com/WowzaMediaSystems/wsc-sdk-java/issues/4) if you'd like to support and developer this SDK moving forward. If not, the next new version of the API making this SDK out of date, we will archive and eventually remove this SDK.**

![wowza streaming cloud java sdk logo](images/wsc-java-1800x400.png)
# Wowza Streaming Cloud Java SDK


Welcome to the official Wowza Streaming Cloud Java SDK. We help developers bring live streaming into their applications - for any size audience, anywhere in the world. This SDK leverages the Wowza Streaming Cloud REST API to programmatically control live streaming workflows.

Need the basics? Get to know [Wowza Streaming Cloud](https://www.wowza.com/products/streaming-cloud) and the [Wowza Streaming Cloud REST API](https://www.wowza.com/docs/wowza-streaming-cloud-rest-api).

### SDK version 

v1.3.1 (references Wowza Streaming Cloud REST API version 1.3)

## Contents

- [Examples](#examples)
- [Requirements](#requirements)
- [Installation](#installation)
- [Get your API key and generate an access key](#get-your-api-key-and-generate-an-access-key)
- [Getting started](#getting-started)
- [Documentation for API endpoints](#documentation-for-api-endpoints)
- [Documentation for authorization](#documentation-for-authorization)
- [Recommendation](#recommendation)
- [Contribute](#contribute)
- [Feedback](#feedback)
- [Support](#support)
- [Code of conduct](#code-of-conduct)
- [License](#license)

## Examples

Check out [example files](/Examples) to help you get started.

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.wowza.cloudsdk</groupId>
  <artifactId>WowzaCloudSDK-java-client</artifactId>
  <version>1.3.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.wowza.cloudsdk:WowzaCloudSDK-java-client:1.3.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/WowzaCloudSDK-java-client-1.3.1.jar`
* `target/lib/*.jar`

## Get your API key and generate an access key

Start by getting an API key and access key to authenticate requests. You'll find them in the Wowza Streaming Cloud user interface.

1. Sign in to [Wowza Streaming Cloud](https://cloud.wowza.com).

2. In the menu bar, click your user name and choose **API Access**.

See [Locate an API key and generate an access key](https://www.wowza.com/docs/how-to-use-the-wowza-streaming-cloud-rest-api#keys) for more information.

3. You do not need to supply the wsc-signature or wsc-timestamp authentication options as these are calculated automatically for each request.

## Getting Started

Please follow the [installation](#installation) instructions and execute the following Java code:

```java
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
        liveStream.setName("JavaStreamCreate"+System.currentTimeMillis());
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
        liveStream.hostedPageDescription("My JavaStreamCreate");
        liveStream.hostedPageSharingIcons(true);
        liveStream.hostedPageTitle("Title host JavaStreamCreate");
        liveStream.lowLatency(false);
        liveStream.playerCountdown(false);
        liveStream.playerResponsive(false);
        liveStream.playerType("wowza_player");
        liveStream.playerWidth(640);
        liveStream.recording(false);
        liveStream.useStreamSource(false);
        liveStream.setTargetDeliveryProtocol(LiveStream.TargetDeliveryProtocolEnum.HTTPS);
        liveStream.setDisableAuthentication(false);
        liveStream.setUsername("java");
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
```

## Documentation for API Endpoints

All URIs are relative to *https://api.cloud.wowza.com/api/v1.3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*LiveStreamsApi* | [**createLiveStream**](docs/LiveStreamsApi.md#createLiveStream) | **POST** /live_streams | Create a live stream
*LiveStreamsApi* | [**deleteLiveStream**](docs/LiveStreamsApi.md#deleteLiveStream) | **DELETE** /live_streams/{id} | Delete a live stream
*LiveStreamsApi* | [**listLiveStreams**](docs/LiveStreamsApi.md#listLiveStreams) | **GET** /live_streams | Fetch all live streams
*LiveStreamsApi* | [**regenerateConnectionCodeLiveStream**](docs/LiveStreamsApi.md#regenerateConnectionCodeLiveStream) | **PUT** /live_streams/{id}/regenerate_connection_code | Regenerate the connection code for a live stream
*LiveStreamsApi* | [**resetLiveStream**](docs/LiveStreamsApi.md#resetLiveStream) | **PUT** /live_streams/{id}/reset | Reset a live stream
*LiveStreamsApi* | [**showLiveStream**](docs/LiveStreamsApi.md#showLiveStream) | **GET** /live_streams/{id} | Fetch a live stream
*LiveStreamsApi* | [**showLiveStreamState**](docs/LiveStreamsApi.md#showLiveStreamState) | **GET** /live_streams/{id}/state | Fetch the state of a live stream
*LiveStreamsApi* | [**showLiveStreamStats**](docs/LiveStreamsApi.md#showLiveStreamStats) | **GET** /live_streams/{id}/stats | Fetch metrics for an active live stream
*LiveStreamsApi* | [**showLiveStreamThumbnailUrl**](docs/LiveStreamsApi.md#showLiveStreamThumbnailUrl) | **GET** /live_streams/{id}/thumbnail_url | Fetch the thumbnail URL of a live stream
*LiveStreamsApi* | [**startLiveStream**](docs/LiveStreamsApi.md#startLiveStream) | **PUT** /live_streams/{id}/start | Start a live stream
*LiveStreamsApi* | [**stopLiveStream**](docs/LiveStreamsApi.md#stopLiveStream) | **PUT** /live_streams/{id}/stop | Stop a live stream
*LiveStreamsApi* | [**updateLiveStream**](docs/LiveStreamsApi.md#updateLiveStream) | **PATCH** /live_streams/{id} | Update a live stream
*NetworkApi* | [**usageNetworkStreamSourcesIndex**](docs/NetworkApi.md#usageNetworkStreamSourcesIndex) | **GET** /usage/network/stream_sources | Fetch network usage for all stream sources
*NetworkApi* | [**usageNetworkStreamTargetsIndex**](docs/NetworkApi.md#usageNetworkStreamTargetsIndex) | **GET** /usage/network/stream_targets | Fetch network usage for all stream targets
*NetworkApi* | [**usageNetworkTranscodersIndex**](docs/NetworkApi.md#usageNetworkTranscodersIndex) | **GET** /usage/network/transcoders | Fetch network usage for all transcoders
*PlayersApi* | [**createPlayerUrl**](docs/PlayersApi.md#createPlayerUrl) | **POST** /players/{player_id}/urls | Create a player URL
*PlayersApi* | [**deletePlayerUrl**](docs/PlayersApi.md#deletePlayerUrl) | **DELETE** /players/{player_id}/urls/{id} | Delete a player URL
*PlayersApi* | [**listPlayerUrls**](docs/PlayersApi.md#listPlayerUrls) | **GET** /players/{player_id}/urls | Fetch all player URLs
*PlayersApi* | [**listPlayers**](docs/PlayersApi.md#listPlayers) | **GET** /players | Fetch all players
*PlayersApi* | [**requestPlayerRebuild**](docs/PlayersApi.md#requestPlayerRebuild) | **POST** /players/{id}/rebuild | Rebuild player code
*PlayersApi* | [**showPlayer**](docs/PlayersApi.md#showPlayer) | **GET** /players/{id} | Fetch a player
*PlayersApi* | [**showPlayerState**](docs/PlayersApi.md#showPlayerState) | **GET** /players/{id}/state | Fetch the state of a player
*PlayersApi* | [**showPlayerUrl**](docs/PlayersApi.md#showPlayerUrl) | **GET** /players/{player_id}/urls/{id} | Fetch a player URL
*PlayersApi* | [**updatePlayer**](docs/PlayersApi.md#updatePlayer) | **PATCH** /players/{id} | Update a player
*PlayersApi* | [**updatePlayerUrl**](docs/PlayersApi.md#updatePlayerUrl) | **PATCH** /players/{player_id}/urls/{id} | Update a player URL
*ProcessingTimeApi* | [**usageTimeTranscodersIndex**](docs/ProcessingTimeApi.md#usageTimeTranscodersIndex) | **GET** /usage/time/transcoders | Fetch stream processing time
*RecordingsApi* | [**deleteRecording**](docs/RecordingsApi.md#deleteRecording) | **DELETE** /recordings/{id} | Delete a recording
*RecordingsApi* | [**listRecordings**](docs/RecordingsApi.md#listRecordings) | **GET** /recordings | Fetch all recordings
*RecordingsApi* | [**showRecording**](docs/RecordingsApi.md#showRecording) | **GET** /recordings/{id} | Fetch a recording
*RecordingsApi* | [**showRecordingState**](docs/RecordingsApi.md#showRecordingState) | **GET** /recordings/{id}/state | Fetch the state of a recording
*SchedulesApi* | [**createSchedule**](docs/SchedulesApi.md#createSchedule) | **POST** /schedules | Create a schedule
*SchedulesApi* | [**deleteSchedule**](docs/SchedulesApi.md#deleteSchedule) | **DELETE** /schedules/{id} | Delete a schedule
*SchedulesApi* | [**disableSchedule**](docs/SchedulesApi.md#disableSchedule) | **PUT** /schedules/{id}/disable | Disable a schedule
*SchedulesApi* | [**enableSchedule**](docs/SchedulesApi.md#enableSchedule) | **PUT** /schedules/{id}/enable | Enable a schedule
*SchedulesApi* | [**listSchedules**](docs/SchedulesApi.md#listSchedules) | **GET** /schedules | Fetch all schedules
*SchedulesApi* | [**showSchedule**](docs/SchedulesApi.md#showSchedule) | **GET** /schedules/{id} | Fetch a schedule
*SchedulesApi* | [**showScheduleState**](docs/SchedulesApi.md#showScheduleState) | **GET** /schedules/{id}/state | Fetch the state of a schedule
*SchedulesApi* | [**updateSchedule**](docs/SchedulesApi.md#updateSchedule) | **PATCH** /schedules/{id} | Update a schedule
*StorageApi* | [**usageStoragePeakRecordingIndex**](docs/StorageApi.md#usageStoragePeakRecordingIndex) | **GET** /usage/storage/peak_recording | Fetch peak recording storage
*StreamSourcesApi* | [**createakamaiStreamSource**](docs/StreamSourcesApi.md#createakamaiStreamSource) | **POST** /stream_sources/akamai | Create an Akamai stream source
*StreamSourcesApi* | [**deleteakamaiStreamSource**](docs/StreamSourcesApi.md#deleteakamaiStreamSource) | **DELETE** /stream_sources/akamai/{id} | Delete an Akamai stream source
*StreamSourcesApi* | [**listAkamaiStreamSources**](docs/StreamSourcesApi.md#listAkamaiStreamSources) | **GET** /stream_sources/akamai | Fetch all Akamai stream sources
*StreamSourcesApi* | [**listStreamSources**](docs/StreamSourcesApi.md#listStreamSources) | **GET** /stream_sources | Fetch all stream sources
*StreamSourcesApi* | [**showAkamaiStreamSource**](docs/StreamSourcesApi.md#showAkamaiStreamSource) | **GET** /stream_sources/akamai/{id} | Fetch an Akamai stream source
*StreamSourcesApi* | [**updateAkamaiStreamSource**](docs/StreamSourcesApi.md#updateAkamaiStreamSource) | **PATCH** /stream_sources/akamai/{id} | Update an Akamai stream source
*StreamTargetsApi* | [**createCustomStreamTarget**](docs/StreamTargetsApi.md#createCustomStreamTarget) | **POST** /stream_targets/custom | Create a custom stream target
*StreamTargetsApi* | [**createStreamTargetGeoblock**](docs/StreamTargetsApi.md#createStreamTargetGeoblock) | **POST** /stream_targets/{stream_target_id}/geoblock | Create geo-blocking for a Wowza stream target
*StreamTargetsApi* | [**createStreamTargetProperty**](docs/StreamTargetsApi.md#createStreamTargetProperty) | **POST** /stream_targets/{stream_target_id}/properties | Configure a property for a stream target
*StreamTargetsApi* | [**createStreamTargetTokenAuth**](docs/StreamTargetsApi.md#createStreamTargetTokenAuth) | **POST** /stream_targets/{stream_target_id}/token_auth | Create token authorization for a Wowza stream target
*StreamTargetsApi* | [**createUllStreamTarget**](docs/StreamTargetsApi.md#createUllStreamTarget) | **POST** /stream_targets/ull | Create an ultra low latency stream target
*StreamTargetsApi* | [**createWowzaStreamTarget**](docs/StreamTargetsApi.md#createWowzaStreamTarget) | **POST** /stream_targets/wowza | Create a Wowza stream target
*StreamTargetsApi* | [**deleteCustomStreamTarget**](docs/StreamTargetsApi.md#deleteCustomStreamTarget) | **DELETE** /stream_targets/custom/{id} | Delete a custom stream target
*StreamTargetsApi* | [**deleteStreamTargetProperty**](docs/StreamTargetsApi.md#deleteStreamTargetProperty) | **DELETE** /stream_targets/{stream_target_id}/properties/{id} | Delete a stream target property
*StreamTargetsApi* | [**deleteUllStreamTarget**](docs/StreamTargetsApi.md#deleteUllStreamTarget) | **DELETE** /stream_targets/ull/{id} | Delete an ultra low latency stream target
*StreamTargetsApi* | [**deleteWowzaStreamTarget**](docs/StreamTargetsApi.md#deleteWowzaStreamTarget) | **DELETE** /stream_targets/wowza/{id} | Delete a Wowza stream target
*StreamTargetsApi* | [**listCustomStreamTargets**](docs/StreamTargetsApi.md#listCustomStreamTargets) | **GET** /stream_targets/custom | Fetch all custom stream targets
*StreamTargetsApi* | [**listStreamTargetProperties**](docs/StreamTargetsApi.md#listStreamTargetProperties) | **GET** /stream_targets/{stream_target_id}/properties | Fetch all properties of a stream target
*StreamTargetsApi* | [**listStreamTargets**](docs/StreamTargetsApi.md#listStreamTargets) | **GET** /stream_targets | Fetch all stream targets
*StreamTargetsApi* | [**listUllStreamTargets**](docs/StreamTargetsApi.md#listUllStreamTargets) | **GET** /stream_targets/ull | Fetch all ultra low latency stream targets
*StreamTargetsApi* | [**listWowzaStreamTargets**](docs/StreamTargetsApi.md#listWowzaStreamTargets) | **GET** /stream_targets/wowza | Fetch all Wowza stream targets
*StreamTargetsApi* | [**regenerateConnectionCodeStreamTarget**](docs/StreamTargetsApi.md#regenerateConnectionCodeStreamTarget) | **PUT** /stream_targets/{id}/regenerate_connection_code | Regenerate the connection code for any stream target
*StreamTargetsApi* | [**showCustomStreamTarget**](docs/StreamTargetsApi.md#showCustomStreamTarget) | **GET** /stream_targets/custom/{id} | Fetch a custom stream target
*StreamTargetsApi* | [**showStreamTargetGeoblock**](docs/StreamTargetsApi.md#showStreamTargetGeoblock) | **GET** /stream_targets/{stream_target_id}/geoblock | Fetch geo-blocking for a Wowza stream target
*StreamTargetsApi* | [**showStreamTargetMetricsCurrent**](docs/StreamTargetsApi.md#showStreamTargetMetricsCurrent) | **GET** /stream_targets/{id}/metrics/current | Fetch current health metrics for an active ultra low latency stream target
*StreamTargetsApi* | [**showStreamTargetMetricsHistoric**](docs/StreamTargetsApi.md#showStreamTargetMetricsHistoric) | **GET** /stream_targets/{id}/metrics/historic | Fetch historic health metrics for an ultra low latency stream target
*StreamTargetsApi* | [**showStreamTargetProperty**](docs/StreamTargetsApi.md#showStreamTargetProperty) | **GET** /stream_targets/{stream_target_id}/properties/{id} | Fetch a property of a stream target
*StreamTargetsApi* | [**showStreamTargetTokenAuth**](docs/StreamTargetsApi.md#showStreamTargetTokenAuth) | **GET** /stream_targets/{stream_target_id}/token_auth | Fetch token authorization for a Wowza stream target
*StreamTargetsApi* | [**showUllStreamTarget**](docs/StreamTargetsApi.md#showUllStreamTarget) | **GET** /stream_targets/ull/{id} | Fetch an ultra low latency stream target
*StreamTargetsApi* | [**showWowzaStreamTarget**](docs/StreamTargetsApi.md#showWowzaStreamTarget) | **GET** /stream_targets/wowza/{id} | Fetch a Wowza stream target
*StreamTargetsApi* | [**updateCustomStreamTarget**](docs/StreamTargetsApi.md#updateCustomStreamTarget) | **PATCH** /stream_targets/custom/{id} | Update a custom stream target
*StreamTargetsApi* | [**updateStreamTargetGeoblock**](docs/StreamTargetsApi.md#updateStreamTargetGeoblock) | **PATCH** /stream_targets/{stream_target_id}/geoblock | Update geo-blocking for a Wowza stream target
*StreamTargetsApi* | [**updateStreamTargetTokenAuth**](docs/StreamTargetsApi.md#updateStreamTargetTokenAuth) | **PATCH** /stream_targets/{stream_target_id}/token_auth | Update token authorization for a Wowza stream target
*StreamTargetsApi* | [**updateUllStreamTarget**](docs/StreamTargetsApi.md#updateUllStreamTarget) | **PATCH** /stream_targets/ull/{id} | Update an ultra low latency stream target
*StreamTargetsApi* | [**updateWowzaStreamTarget**](docs/StreamTargetsApi.md#updateWowzaStreamTarget) | **PATCH** /stream_targets/wowza/{id} | Update a Wowza stream target
*TranscodersApi* | [**createTranscoder**](docs/TranscodersApi.md#createTranscoder) | **POST** /transcoders | Create a transcoder
*TranscodersApi* | [**createTranscoderOutput**](docs/TranscodersApi.md#createTranscoderOutput) | **POST** /transcoders/{transcoder_id}/outputs | Create an output
*TranscodersApi* | [**createTranscoderOutputOutputStreamTarget**](docs/TranscodersApi.md#createTranscoderOutputOutputStreamTarget) | **POST** /transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets | Create an output stream target
*TranscodersApi* | [**createTranscoderProperty**](docs/TranscodersApi.md#createTranscoderProperty) | **POST** /transcoders/{transcoder_id}/properties | Configure a property for a transcoder
*TranscodersApi* | [**deleteTranscoder**](docs/TranscodersApi.md#deleteTranscoder) | **DELETE** /transcoders/{id} | Delete a transcoder
*TranscodersApi* | [**deleteTranscoderOutput**](docs/TranscodersApi.md#deleteTranscoderOutput) | **DELETE** /transcoders/{transcoder_id}/outputs/{id} | Delete an output
*TranscodersApi* | [**deleteTranscoderOutputOutputStreamTarget**](docs/TranscodersApi.md#deleteTranscoderOutputOutputStreamTarget) | **DELETE** /transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets/{stream_target_id} | Delete an output stream target
*TranscodersApi* | [**deleteTranscoderProperty**](docs/TranscodersApi.md#deleteTranscoderProperty) | **DELETE** /transcoders/{transcoder_id}/properties/{id} | Delete a transcoder&#39;s property
*TranscodersApi* | [**disableAllStreamTargetsTranscoder**](docs/TranscodersApi.md#disableAllStreamTargetsTranscoder) | **PUT** /transcoders/{id}/disable_all_stream_targets | Disable a transcoder&#39;s stream targets
*TranscodersApi* | [**disableTranscoderOutputOutputStreamTarget**](docs/TranscodersApi.md#disableTranscoderOutputOutputStreamTarget) | **PUT** /transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets/{stream_target_id}/disable | Disable an output stream target
*TranscodersApi* | [**enableAllStreamTargetsTranscoder**](docs/TranscodersApi.md#enableAllStreamTargetsTranscoder) | **PUT** /transcoders/{id}/enable_all_stream_targets | Enable a transcoder&#39;s stream targets
*TranscodersApi* | [**enableTranscoderOutputOutputStreamTarget**](docs/TranscodersApi.md#enableTranscoderOutputOutputStreamTarget) | **PUT** /transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets/{stream_target_id}/enable | Enable an output stream target
*TranscodersApi* | [**indexUptimes**](docs/TranscodersApi.md#indexUptimes) | **GET** /transcoders/{transcoder_id}/uptimes | Fetch all uptime records for a transcoder
*TranscodersApi* | [**listTranscoderOutputOutputStreamTargets**](docs/TranscodersApi.md#listTranscoderOutputOutputStreamTargets) | **GET** /transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets | Fetch all output stream targets of an output of a transcoder
*TranscodersApi* | [**listTranscoderOutputs**](docs/TranscodersApi.md#listTranscoderOutputs) | **GET** /transcoders/{transcoder_id}/outputs | Fetch all outputs of a transcoder
*TranscodersApi* | [**listTranscoderProperties**](docs/TranscodersApi.md#listTranscoderProperties) | **GET** /transcoders/{transcoder_id}/properties | Fetch a transcoder&#39;s properties
*TranscodersApi* | [**listTranscoderRecordings**](docs/TranscodersApi.md#listTranscoderRecordings) | **GET** /transcoders/{id}/recordings | Fetch a transcoder&#39;s recordings
*TranscodersApi* | [**listTranscoderSchedules**](docs/TranscodersApi.md#listTranscoderSchedules) | **GET** /transcoders/{id}/schedules | Fetch transcoder&#39;s schedules
*TranscodersApi* | [**listTranscoders**](docs/TranscodersApi.md#listTranscoders) | **GET** /transcoders | Fetch all transcoders
*TranscodersApi* | [**resetTranscoder**](docs/TranscodersApi.md#resetTranscoder) | **PUT** /transcoders/{id}/reset | Reset a transcoder
*TranscodersApi* | [**restartTranscoderOutputOutputStreamTarget**](docs/TranscodersApi.md#restartTranscoderOutputOutputStreamTarget) | **PUT** /transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets/{stream_target_id}/restart | Restart an output stream target
*TranscodersApi* | [**showTranscoder**](docs/TranscodersApi.md#showTranscoder) | **GET** /transcoders/{id} | Fetch a transcoder
*TranscodersApi* | [**showTranscoderOutput**](docs/TranscodersApi.md#showTranscoderOutput) | **GET** /transcoders/{transcoder_id}/outputs/{id} | Fetch an output
*TranscodersApi* | [**showTranscoderOutputOutputStreamTarget**](docs/TranscodersApi.md#showTranscoderOutputOutputStreamTarget) | **GET** /transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets/{stream_target_id} | Fetch an output stream target
*TranscodersApi* | [**showTranscoderProperty**](docs/TranscodersApi.md#showTranscoderProperty) | **GET** /transcoders/{transcoder_id}/properties/{id} | Fetch a property for a transcoder
*TranscodersApi* | [**showTranscoderState**](docs/TranscodersApi.md#showTranscoderState) | **GET** /transcoders/{id}/state | Fetch the state and uptime ID of a transcoder
*TranscodersApi* | [**showTranscoderStats**](docs/TranscodersApi.md#showTranscoderStats) | **GET** /transcoders/{id}/stats | Fetch statistics for a current transcoder
*TranscodersApi* | [**showTranscoderThumbnailUrl**](docs/TranscodersApi.md#showTranscoderThumbnailUrl) | **GET** /transcoders/{id}/thumbnail_url | Fetch the thumbnail URL of a transcoder
*TranscodersApi* | [**showUptime**](docs/TranscodersApi.md#showUptime) | **GET** /transcoders/{transcoder_id}/uptimes/{id} | Fetch an uptime record
*TranscodersApi* | [**showUptimeMetricsCurrent**](docs/TranscodersApi.md#showUptimeMetricsCurrent) | **GET** /transcoders/{transcoder_id}/uptimes/{id}/metrics/current | Fetch current stream health metrics for an active transcoder
*TranscodersApi* | [**showUptimeMetricsHistoric**](docs/TranscodersApi.md#showUptimeMetricsHistoric) | **GET** /transcoders/{transcoder_id}/uptimes/{id}/metrics/historic | Fetch historic stream health metrics for a transcoder
*TranscodersApi* | [**startTranscoder**](docs/TranscodersApi.md#startTranscoder) | **PUT** /transcoders/{id}/start | Start a transcoder
*TranscodersApi* | [**stopTranscoder**](docs/TranscodersApi.md#stopTranscoder) | **PUT** /transcoders/{id}/stop | Stop a transcoder
*TranscodersApi* | [**updateTranscoder**](docs/TranscodersApi.md#updateTranscoder) | **PATCH** /transcoders/{id} | Update a transcoder
*TranscodersApi* | [**updateTranscoderOutput**](docs/TranscodersApi.md#updateTranscoderOutput) | **PATCH** /transcoders/{transcoder_id}/outputs/{id} | Update an output
*TranscodersApi* | [**updateTranscoderOutputOutputStreamTarget**](docs/TranscodersApi.md#updateTranscoderOutputOutputStreamTarget) | **PATCH** /transcoders/{transcoder_id}/outputs/{output_id}/output_stream_targets/{stream_target_id} | Update an output stream target
*ViewerDataApi* | [**showViewerDataStreamTarget**](docs/ViewerDataApi.md#showViewerDataStreamTarget) | **GET** /usage/viewer_data/stream_targets/{id} | Fetch viewer data for a stream target


## Documentation for Models

 - [AkamaiStreamSourceCreateInput](docs/AkamaiStreamSourceCreateInput.md)
 - [AudioCodecMetric](docs/AudioCodecMetric.md)
 - [BitsInRateMetric](docs/BitsInRateMetric.md)
 - [BitsOutRateMetric](docs/BitsOutRateMetric.md)
 - [BytesInRateMetric](docs/BytesInRateMetric.md)
 - [BytesOutRateMetric](docs/BytesOutRateMetric.md)
 - [ConfiguredBytesOutRateMetric](docs/ConfiguredBytesOutRateMetric.md)
 - [ConnectedMetric](docs/ConnectedMetric.md)
 - [CountryObject](docs/CountryObject.md)
 - [CpuIdleMetric](docs/CpuIdleMetric.md)
 - [CpuMetric](docs/CpuMetric.md)
 - [CustomStreamTargetInput](docs/CustomStreamTargetInput.md)
 - [CustomStreamTargetCreateInput](docs/CustomStreamTargetCreateInput.md)
 - [FrameRateMetric](docs/FrameRateMetric.md)
 - [FrameSizeMetric](docs/FrameSizeMetric.md)
 - [Geoblock](docs/Geoblock.md)
 - [Geoblock](docs/GeoblockCreateInput.md)
 - [GeoblockInput](docs/GeoblockInput.md)
 - [GpuDecoderUsageMetric](docs/GpuDecoderUsageMetric.md)
 - [GpuDriverVersionMetric](docs/GpuDriverVersionMetric.md)
 - [GpuEncoderUsageMetric](docs/GpuEncoderUsageMetric.md)
 - [GpuMemoryUsageMetric](docs/GpuMemoryUsageMetric.md)
 - [GpuUsageMetric](docs/GpuUsageMetric.md)
 - [HashOfPlaybackURLs](docs/HashOfPlaybackURLs.md)
 - [HashOfProtocols](docs/HashOfProtocols.md)
 - [HashOfTotals](docs/HashOfTotals.md)
 - [HashOfZones](docs/HashOfZones.md)
 - [HeightMetric](docs/HeightMetric.md)
 - [IndexAkamaiStreamSource](docs/IndexAkamaiStreamSource.md)
 - [IndexCustomStreamTarget](docs/IndexCustomStreamTarget.md)
 - [IndexLiveStream](docs/IndexLiveStream.md)
 - [IndexPlayer](docs/IndexPlayer.md)
 - [IndexRecordings](docs/IndexRecordings.md)
 - [IndexStreamSource](docs/IndexStreamSource.md)
 - [IndexStreamTarget](docs/IndexStreamTarget.md)
 - [IndexTranscoder](docs/IndexTranscoder.md)
 - [IndexUllStreamTarget](docs/IndexUllStreamTarget.md)
 - [IndexWowzaStreamTarget](docs/IndexWowzaStreamTarget.md)
 - [KeyframeIntervalMetric](docs/KeyframeIntervalMetric.md)
 - [Limits](docs/Limits.md)
 - [Limits](docs/LimitsResponse.md)
 - [LiveStream](docs/LiveStream.md)
 - [LiveStreamActionState](docs/LiveStreamActionState.md)
 - [LiveStreamConnectioncode](docs/LiveStreamConnectioncode.md)
 - [LiveStreamCreateActionState](docs/LiveStreamCreateActionState.md)
 - [LiveStreamCreateConnectioncode](docs/LiveStreamCreateConnectioncode.md)
 - [LiveStreamCreateInput](docs/LiveStreamCreateInput.md)
 - [LiveStreamCreateMetrics](docs/LiveStreamCreateMetrics.md)
 - [LiveStreamCreateState](docs/LiveStreamCreateState.md)
 - [LiveStreamCreateThumbnail](docs/LiveStreamCreateThumbnail.md)
 - [LiveStreamState](docs/LiveStreamState.md)
 - [LiveStreamThumbnail](docs/LiveStreamThumbnail.md)
 - [LiveStreams](docs/LiveStreams.md)
 - [Meta](docs/Meta.md)
 - [Output](docs/Output.md)
 - [OutputCreateInput](docs/OutputCreateInput.md)
 - [OutputInput](docs/OutputInput.md)
 - [OutputStreamTarget](docs/OutputStreamTarget.md)
 - [OutputStreamTargetCreateInput](docs/OutputStreamTargetCreateInput.md)
 - [OutputStreamTargetInput](docs/OutputStreamTargetInput.md)
 - [OutputStreamTargets](docs/OutputStreamTargets.md)
 - [Outputs](docs/Outputs.md)
 - [PeakRecording](docs/PeakRecording.md)
 - [PlaybackUrl](docs/PlaybackUrl.md)
 - [Player](docs/Player.md)
 - [PlayerCreate](docs/PlayerCreate.md)
 - [PlayerCreateState](docs/PlayerCreateState.md)
 - [PlayerCreateInput](docs/PlayerCreateInput.md)
 - [PlayerUpdateInput](docs/PlayerUpdateInput.md)
 - [Players](docs/Players.md)
 - [Property](docs/Property.md)
 - [ProtocolObject](docs/ProtocolObject.md)
 - [Recording](docs/Recording.md)
 - [RecordingCreateState](docs/RecordingCreateState.md)
 - [RecordingState](docs/RecordingState.md)
 - [Recordings](docs/Recordings.md)
 - [RenditionObject](docs/RenditionObject.md)
 - [Schedule](docs/Schedule.md)
 - [ScheduleCreateInput](docs/ScheduleCreateInput.md)
 - [ScheduleCreateState](docs/ScheduleCreateState.md)
 - [ScheduleState](docs/ScheduleState.md)
 - [Schedules](docs/Schedules.md)
 - [ShmMetrics](docs/ShmMetrics.md)
 - [StreamSource](docs/StreamSource.md)
 - [StreamSourceAkamai](docs/StreamSourceAkamai.md)
 - [StreamSourceCreateInput](docs/StreamSourceCreateInput.md)
 - [StreamSources](docs/StreamSources.md)
 - [StreamSourcesAkamai](docs/StreamSourcesAkamai.md)
 - [StreamTarget](docs/StreamTarget.md)
 - [StreamTargetConnectioncode](docs/StreamTargetConnectioncode.md)
 - [StreamTargetCreateConnectioncode](docs/StreamTargetCreateConnectioncode.md)
 - [StreamTargetCreateInput](docs/StreamTargetCreateInput.md)
 - [StreamTargetCreateState](docs/StreamTargetCreateState.md)
 - [StreamTargetCustom](docs/StreamTargetCustom.md)
 - [StreamTargetInput](docs/StreamTargetInput.md)
 - [StreamTargetMetrics](docs/StreamTargetMetrics.md)
 - [StreamTargetMetricsResponse](docs/StreamTargetMetricsResponse.md)
 - [StreamTargetProperties](docs/StreamTargetProperties.md)
 - [StreamTargetProperty](docs/StreamTargetProperty.md)
 - [StreamTargetPropertyCreateInput](docs/StreamTargetPropertyCreateInput.md)
 - [StreamTargetState](docs/StreamTargetState.md)
 - [StreamTargetStatusOUTPUTIDXSTREAMTARGETIDXMetric](docs/StreamTargetStatusOUTPUTIDXSTREAMTARGETIDXMetric.md)
 - [StreamTargetUll](docs/StreamTargetUll.md)
 - [StreamTargetWowza](docs/StreamTargetWowza.md)
 - [StreamTargets](docs/StreamTargets.md)
 - [StreamTargetsCustom](docs/StreamTargetsCustom.md)
 - [StreamTargetsId](docs/StreamTargetsId.md)
 - [StreamTargetsState](docs/StreamTargetsState.md)
 - [StreamTargetsUll](docs/StreamTargetsUll.md)
 - [StreamTargetsWowza](docs/StreamTargetsWowza.md)
 - [TheCountryCodeOfTheCountry](docs/TheCountryCodeOfTheCountry.md)
 - [TheNameOfTheProtocol](docs/TheNameOfTheProtocol.md)
 - [TheNameOfTheRendition](docs/TheNameOfTheRendition.md)
 - [TokenAuth](docs/TokenAuth.md)
 - [TokenAuthCreateInput](docs/TokenAuthCreateInput.md)
 - [Transcoder](docs/Transcoder.md)
 - [TranscoderCreateInput](docs/TranscoderCreateInput.md)
 - [TranscoderCreateRecordings](docs/TranscoderCreateRecordings.md)
 - [TranscoderCreateShmMetrics](docs/TranscoderCreateShmMetrics.md)
 - [TranscoderCreateState](docs/TranscoderCreateState.md)
 - [TranscoderCreateStreamTargetState](docs/TranscoderCreateStreamTargetState.md)
 - [TranscoderCreateThumbnail](docs/TranscoderCreateThumbnail.md)
 - [TranscoderCreateUptime](docs/TranscoderCreateUptime.md)
 - [TranscoderProperties](docs/TranscoderProperties.md)
 - [TranscoderProperty](docs/TranscoderProperty.md)
 - [TranscoderPropertyCreateInput](docs/TranscoderPropertyCreateInput.md)
 - [TranscoderState](docs/TranscoderState.md)
 - [TranscoderStreamTargetState](docs/TranscoderStreamTargetState.md)
 - [Transcoders](docs/Transcoders.md)
 - [UllStreamTargetCreateInput](docs/UllStreamTargetCreateInput.md)
 - [UllStreamTargetInput](docs/UllStreamTargetInput.md)
 - [UniqueViewsMetric](docs/UniqueViewsMetric.md)
 - [Uptime](docs/Uptime.md)
 - [Uptimes](docs/Uptimes.md)
 - [Url](docs/Url.md)
 - [UrlCreateInput](docs/UrlCreateInput.md)
 - [UrlInput](docs/UrlInput.md)
 - [Urls](docs/Urls.md)
 - [UsageNetworkStreamSource](docs/UsageNetworkStreamSource.md)
 - [UsageNetworkStreamSources](docs/UsageNetworkStreamSources.md)
 - [UsageNetworkStreamTarget](docs/UsageNetworkStreamTarget.md)
 - [UsageNetworkStreamTargets](docs/UsageNetworkStreamTargets.md)
 - [UsageNetworkTranscoder](docs/UsageNetworkTranscoder.md)
 - [UsageNetworkTranscoders](docs/UsageNetworkTranscoders.md)
 - [UsageStoragePeakRecording](docs/UsageStoragePeakRecording.md)
 - [UsageTimeTranscoder](docs/UsageTimeTranscoder.md)
 - [UsageTimeTranscoders](docs/UsageTimeTranscoders.md)
 - [UsageViewerDataCountries](docs/UsageViewerDataCountries.md)
 - [UsageViewerDataProtocols](docs/UsageViewerDataProtocols.md)
 - [UsageViewerDataRenditions](docs/UsageViewerDataRenditions.md)
 - [UsageViewerDataStreamTarget](docs/UsageViewerDataStreamTarget.md)
 - [VersionNumber](docs/VersionNumber.md)
 - [VideoCodecMetric](docs/VideoCodecMetric.md)
 - [WidthMetric](docs/WidthMetric.md)
 - [WowzaStreamTargetCreateInput](docs/WowzaStreamTargetCreateInput.md)
 - [WowzaStreamTargetInput](docs/WowzaStreamTargetInput.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### wsc-access-key

- **Type**: API key, HMAC
- **API key parameter name**: wsc-access-key
- **Location**: HTTP header

### wsc-api-key

- **Type**: API key, HMAC
- **API key parameter name**: wsc-api-key
- **Location**: HTTP header

### wsc-signature

- **Type**: HMAC
- **API key parameter name**: wsc-signature
- **Location**: HTTP header

### wsc-timestamp

- **Type**: HMAC
- **API key parameter name**: wsc-timestamp
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Contribute

For the moment, we're not accepting public contributions for the Wowza Streaming Cloud Java SDK. We may open the code up to contributions in the future. For now, relay your concerns and things you'd like to see added by emailing us at [cloud-feedback@wowza.com](mailto:cloud-feedback@wowza.com).

## Feedback

We welcome your feedback on the SDK, its documentation, and the experience of using it. For now, we have disabled GitHub issues for this repo. To provide feedback or address concerns, email us at [cloud-feedback@wowza.com](mailto:cloud-feedback@wowza.com).

## Support

For now, we have disabled GitHub issues for this repo. To request assistance with the SDK, open a support ticket with [Wowza Support](https://www.wowza.com/portal/help).

## Code of conduct

Please adhere to the guidelines described in the [license](#license) for this SDK.

## License

This code is distributed under the [BSD-3 License](LICENSE.txt).

![alt tag](http://wowzalogs.com/stats/githubimage.php?plugin=wsc-java-sdk-main)
