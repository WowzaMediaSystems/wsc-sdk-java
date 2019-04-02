
# StreamTargetCustom

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupUrl** | **String** | Only for custom stream targets whose *provider* is *not* **akamai_cupertino**. The backup ingest URL for a custom stream target. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the custom stream target was created. |  [optional]
**hdsPlaybackUrl** | **String** | Only for custom stream targets whose *provider* is *not* **akamai_cupertino**. The web address that the custom stream target uses to play Adobe HDS streams. |  [optional]
**hlsPlaybackUrl** | **String** | The web address that the custom stream target uses to play Apple HLS streams. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the custom stream target. |  [optional]
**name** | **String** | A descriptive name for the custom stream target. Maximum 255 characters. |  [optional]
**password** | **String** | Only for custom stream targets whose *provider* is *not* **akamai_cupertino**. A *username* must also be present. The password associated with the target username for RTMP authentication. |  [optional]
**primaryUrl** | **String** | The primary ingest URL of the custom stream target. |  [optional]
**provider** | **String** | The CDN for the target. Values can be appended with **_mock** to use in the sandbox environment. |  [optional]
**rtmpPlaybackUrl** | **String** | The web address that the custom stream target uses to play RTMP streams. |  [optional]
**streamName** | **String** | The name of the stream being ingested into the target. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the custom stream target was updated. |  [optional]
**username** | **String** | Only for custom stream targets whose *provider* is *not* **akamai_cupertino**. The username or ID that the target uses for RTMP authentication. |  [optional]



