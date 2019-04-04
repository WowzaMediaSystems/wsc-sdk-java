
# Url

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bitrate** | **Integer** | The video bitrate, in kilobits per second (Kbps), of the output rendition that will be played at the URL. May correspond to the bitrate of an output rendition being used by the live stream or transcoder. Must be greater than **0**. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the player URL was created. |  [optional]
**height** | **Integer** | The height, in pixels, of the output rendition that will be played at the URL. May correspond to the height of an output rendition being used by the live stream or transcoder. Must be greater than **0**. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the player URL. |  [optional]
**label** | **String** | A descriptive name for the player URL. Maximum 255 characters. |  [optional]
**playerId** | **String** | The unique alphanumeric string that identifies the player. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the player URL was updated. |  [optional]
**url** | **String** | The URL of the player. If using a Wowza CDN target, the URL format is &#x60;http://[wowzasubdomain]-f.akamaihd.net/z/[stream_name]_[angle]@[stream_id]/manifest.f4m&#x60; for Adobe HDS playback or &#x60;http://[wowzasubdomain]-f.akamaihd.net/i/[stream_name]_[angle]@[stream_id]/master.m3u8&#x60; for Apple HLS playback. |  [optional]
**width** | **Integer** | The width, in pixels, of the output rendition that will be played at the URL. May correspond to the width of an output rendition being used by the live stream or transcoder. Must be greater than **0**. |  [optional]



