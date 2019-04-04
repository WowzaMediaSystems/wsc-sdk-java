
# Player

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countdown** | **Boolean** | A clock that appears in the player before the event and counts down to the start of the stream. Specify **true** to display the countdown clock. The default is **false**. |  [optional]
**countdownAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the event starts, used by the countdown clock. Enter **YYYY-MM-DD HH:MM:SS** where **HH** is a 24-hour clock in UTC. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the player was created. |  [optional]
**embedCode** | **String** | The HTML code that can be used in an external webpage to host the Wowza Streaming Cloud player. |  [optional]
**hdsPlaybackUrl** | **String** | The address that can be used to configure playback of the stream using the Adobe HDS protocol. |  [optional]
**hlsPlaybackUrl** | **String** | The address that can be used to configure playback of the stream using the Apple HLS protocol. |  [optional]
**hostedPage** | **Boolean** | A web page hosted by Wowza Streaming Cloud that includes a player for the live stream. The default, **true**, creates a hosted page. Specify **false** to not create a hosted web page. |  [optional]
**hostedPageDescription** | **String** | A description that appears on the hosted page below the player. Can&#39;t include custom HTML, JavaScript, or other tags. |  [optional]
**hostedPageLogoImageUrl** | **String** | The path to a GIF, JPEG, or PNG logo file that appears in the upper-left corner of the hosted page. Logo file must be 2.5 MB or smaller. |  [optional]
**hostedPageSharingIcons** | **String** | Icons that let viewers share the stream on Facebook, Google+, Twitter, and by email. The default, **true**, includes sharing icons on the hosted page. Specify **false** to omit sharing icons. |  [optional]
**hostedPageTitle** | **String** | A title for the page that appears above the player. Can&#39;t include custom HTML, JavaScript, or other tags. |  [optional]
**hostedPageUrl** | **String** | The URL of the Wowza Streaming Cloud-hosted webpage that viewers can visit to watch the stream. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the player. |  [optional]
**logoImageUrl** | **String** | The path to a GIF, JPEG, or PNG logo file that appears partially transparent in a corner of the player throughout playback. Logo file must be 2.5 MB or smaller. |  [optional]
**logoPosition** | **String** | The corner of the player in which you want the player logo to appear. The default is **top-left**. |  [optional]
**responsive** | **Boolean** | A player whose size adjusts according to the device on which it&#39;s being viewed. If **true**, creates a responsive player. If **false**, specify a **width**. |  [optional]
**transcoderId** | **String** | The unique alphanumeric string that identifies the transcoder. |  [optional]
**type** | **String** | The player you want to use. Valid values are **original_html5**, which provides HTML5 playback and falls back to Flash on older browsers, and **wowza_player**, which provides HTML5 playback over Apple HLS. **wowza_player** requires that *target_delivery_protocol* be **hls-https** and *closed_caption_type* be **none**. The default is **original_html5**. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the player was updated. |  [optional]
**videoPosterImageUrl** | **String** | The path to a GIF, JPEG, or PNG poster image that appears in the player before the stream begins. Poster image files must be 2.5 MB or smaller. |  [optional]
**width** | **Integer** | The width, in pixels, of a fixed-size player. The default is **640**. |  [optional]



