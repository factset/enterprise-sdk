

# AudioByUploadTimeRequest

Search criteria for audio files based on upload time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uploadTime** | **Integer** | Filter data based on uploadTime relative to the current time, in hours (e.g., -15 for the last 15 hours). Minimum -1, Maximum -168.  |  [optional]
**audioSource** | [**AudioSourceEnum**](#AudioSourceEnum) | Source of the Audio file: * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay           |  [optional]
**ids** | **java.util.List&lt;String&gt;** | Filter results based on ticker-region or Entity ID. |  [optional]
**trimmed** | **Boolean** | Search for trimmed audio files (non-speaking portions removed). |  [optional]



## Enum: AudioSourceEnum

Name | Value
---- | -----
PHONE | &quot;Phone&quot;
WEBCAST | &quot;Webcast&quot;
VENDOR | &quot;Vendor&quot;
WEBCASTREPLAY | &quot;WebcastReplay&quot;
FLASH | &quot;Flash&quot;
REPLAY | &quot;Replay&quot;


## Implemented Interfaces

* Serializable


