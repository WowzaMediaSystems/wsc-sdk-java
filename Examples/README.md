![wowza streaming cloud java sdk logo](/images/wsc-java-1800x400.png)
# Wowza Streaming Cloud Java SDK

Welcome to the official Wowza Streaming Cloud Java SDK. We help developers bring live streaming into their applications - for any size audience, anywhere in the world. This SDK leverages the Wowza Streaming Cloud REST API to programmatically control live streaming workflows.

## Examples

- [Work with live streams](LiveStreams)
- [Work with transcoders](Transcoders)
- [Work with stream targets](StreamTargets)
- [Work with stream sources](StreamSources)
- [Fetch usage information](Network)
- [Fetch viewer data](ViewerData)
- [Work with recordings](Recordings) and [Fetch recording storage](Storage)
- [Work with players](Players)
- [Work with schedules](Schedule)

## Build the Examples via command line

First, you need to have the Java SDK installed.

Clone the repository:

```shell
git clone https://github.com/WowzaMediaSystems/wsc-sdk-java.git
```

This will create a folder called `wsc-sdk-java`. Change your working directory into to this folder and then the `Examples` folder.

```shell
cd wsc-sdk-java/Examples
```

Next, update the examples with your access key and API key. 
Each example has a section outlining where to add your own keys. See [Locate an API key and generate an access key](https://www.wowza.com/docs/how-to-use-the-wowza-streaming-cloud-rest-api#keys) for more information.

Using javac, issue the following to build against the examples in each folder

```shell
javac -cp "../target/*:../target/lib/*:./" <example folder name>/<example file>.java
```

Finally, you can run each example with this:

```shell
java -cp "../target/*:../target/lib/*:./" <example folder name>/<example file>
```

### Example workflow

Edit the `Schedule/FetchAllSchedules.java` with your API key and access key.

Build the `Schedule/FetchAllSchedules.java` example.

```shell
javac -cp "../target/*:../target/lib/*:./" Schedule/FetchAllSchedules.java
```

Run the `Schedule/FetchAllSchedules` example.

```shell
java -cp "../target/*:../target/lib/*:./" Schedule/FetchAllSchedules
```

If you have correctly configured your API keys, you will either get an empty list, if you do not
have any schedules, or you will get your current schedules.

If you have not correctly configured your API keys, you will get the following:

```shell
Exception when calling SchedulesApi#listSchedules
Code: 401
Exception when calling SchedulesApi#listSchedules:{"meta":{"status":401,"code":"ERR-401-InvalidKeyLength","title":"Invalid Key Length Error","message":"Invalid key length.","description":"","links":[]}}
com.wowza.cloudsdk.client.ApiException: Unauthorized
        at com.wowza.cloudsdk.client.ApiClient.handleResponse(ApiClient.java:932)
        at com.wowza.cloudsdk.client.ApiClient.execute(ApiClient.java:848)
        at com.wowza.cloudsdk.client.api.SchedulesApi.listSchedulesWithHttpInfo(SchedulesApi.java:685)
        at com.wowza.cloudsdk.client.api.SchedulesApi.listSchedulesTransport(SchedulesApi.java:670)
        at com.wowza.cloudsdk.client.api.SchedulesApi.listSchedules(SchedulesApi.java:657)
        at Schedule.FetchAllSchedules.main(FetchAllSchedules.java:40)
```

## Contribute

For the moment, we're not accepting public contributions for the Wowza Streaming Cloud Java SDK. We may open the code up to contributions in the future. For now, relay your concerns and things you'd like to see added by emailing us at [cloud-feedback@wowza.com](mailto:cloud-feedback@wowza.com).

## Feedback

We welcome your feedback on the SDK, its documentation, and the experience of using it. For now, we have disabled GitHub issues for this repo. To provide feedback or address concerns, email us at [cloud-feedback@wowza.com](mailto:cloud-feedback@wowza.com).

## Support

For now, we have disabled GitHub issues for this repo. To request assistance with the SDK, open a support ticket with [Wowza Support](https://www.wowza.com/portal/help).

## Code of conduct

Please adhere to the guidelines described in the [license](#license) for this SDK.

## License

This code is distributed under the [BSD-3 License](../LICENSE.txt).

![alt tag](http://wowzalogs.com/stats/githubimage.php?plugin=wsc-java-sdk-examples)