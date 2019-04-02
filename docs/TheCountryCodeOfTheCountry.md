
# TheCountryCodeOfTheCountry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the country. |  [optional]
**percentageViewers** | **Integer** | Total percentage of requests to play content (**100**). |  [optional]
**percentageViewingTime** | **Integer** | The percentage of total time that the protocol or rendition was played. Always **100** for *stream_target*. |  [optional]
**protocols** | [**UsageViewerDataProtocols**](UsageViewerDataProtocols.md) | An array of the protocols that were requested. |  [optional]
**secondsAvgViewingTime** | **Integer** | The average length of time, in seconds, that the stream was played at the target. |  [optional]
**secondsTotalViewingTime** | **Integer** | The total length of time, in seconds, that the stream was played at the target. May be longer than the duration of the stream. |  [optional]
**totalUniqueViewers** | **Integer** | The total number of requests to download at least one chunk of the stream at the target (for HTTP streams) or requests to connect to and play the stream (for ultra low latency streams). A unique viewer is a single IP address; multiple users that share the same IP address are counted once. |  [optional]



