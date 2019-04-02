
# Property

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | [**KeyEnum**](#KeyEnum) | **chunkSize** defines the duration of the time-based audio and video chunks that Wowza Streaming Cloud delivers to the target.  **convertAMFData** determines whether Wowza Streaming Cloud converts incoming AMF data into ID3 tags.  **sendSSL** determines whether Wowza Streaming Cloud sends the stream from the transcoder to the target by using SSL (HTTPS).  **playSSL** determines whether Wowza Streaming Cloud sends the stream from the target to the player by using SSL (HTTPS).  **playlistSeconds** defines the maximum allowable length of the playlist.  **redundantChunklists** determines whether Wowza Streaming Cloud creates redundant chunklists within a playlist. If a primary chunklist within a playlist fails, players that support redundancy during playback can switch to the redundant chunklist. **Note:** Enabling **redundantChunklists** increases playback reliability but doubles egress data usage and associated charges. **relativePlaylists** allows the viewer to watch the stream over HTTP and HTTPS, whichever protocol their browser calls. | 
**section** | [**SectionEnum**](#SectionEnum) | The section of the stream target configuration table that contains the property.  The valid value for **chunkSize**, **convertAMFData**, and **sendSSL** is **hls**.  The valid value for **playSSL**, **playlistSeconds**, **redundantChunklists**, and **relativePlaylists** is **playlist**. | 
**value** | **String** | For **chunkSize**, use **2**, **4**, **6**, **8**, or **10**, expressed as a string or an integer.  For **convertAMFData**, **sendSSL**, **playSSL**, **redundantChunklists**, and **relativePlaylists** use **true** or **false**, expressed as a string or a Boolean.  For **playlistSeconds**, use any value between **6** and **200**, expressed as a string or an integer. | 


<a name="KeyEnum"></a>
## Enum: KeyEnum
Name | Value
---- | -----
CHUNKSIZE | &quot;chunkSize&quot;
CONVERTAMFDATA | &quot;convertAMFData&quot;
SENDSSL | &quot;sendSSL&quot;
PLAYSSL | &quot;playSSL&quot;
PLAYLISTSECONDS | &quot;playlistSeconds&quot;
REDUNDANTCHUNKLISTS | &quot;redundantChunklists&quot;
RELATIVEPLAYLISTS | &quot;relativePlaylists&quot;


<a name="SectionEnum"></a>
## Enum: SectionEnum
Name | Value
---- | -----
HLS | &quot;hls&quot;
PLAYLIST | &quot;playlist&quot;



