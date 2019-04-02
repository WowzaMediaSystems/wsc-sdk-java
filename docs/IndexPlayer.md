
# IndexPlayer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the player was created. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the player. |  [optional]
**transcoderId** | **String** | The unique alphanumeric string that identifies the transcoder. |  [optional]
**type** | **String** | The player you want to use. Valid values are **original_html5**, which provides HTML5 playback and falls back to Flash on older browsers, and **wowza_player**, which provides HTML5 playback over Apple HLS. **wowza_player** requires that *target_delivery_protocol* be **hls-https** and *closed_caption_type* be **none**. The default is **original_html5**. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the player was updated. |  [optional]



