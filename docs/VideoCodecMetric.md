
# VideoCodecMetric

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The status of the current key. Possible values are **normal** (everything is fine), **warning** (something may be misconfigured), and **no_data** (no data was returned, perhaps because the instance isn&#39;t running). |  [optional]
**text** | **String** | A message related to the value and status of the current key. Usually blank unless there&#39;s a warning status. |  [optional]
**units** | **String** | The unit of the returned value, such as **Kbps**, **bps**, **%**, **FPS**, or **GOP**. |  [optional]
**value** | **String** | The value of the associated key. |  [optional]



