# eventsandtranscripts.AudioByUploadTimeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uploadTime** | **Number** | Filter data based on uploadTime relative to the current time, in hours (e.g., -15 for the last 15 hours). Minimum -1, Maximum -168.  | [optional] 
**audioSource** | **String** | Source of the Audio file: * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay           | [optional] 
**ids** | **[String]** | Filter results based on ticker-region or Entity ID. | [optional] 
**trimmed** | **Boolean** | Search for trimmed audio files (non-speaking portions removed). | [optional] [default to false]



## Enum: AudioSourceEnum


* `Phone` (value: `"Phone"`)

* `Webcast` (value: `"Webcast"`)

* `Vendor` (value: `"Vendor"`)

* `WebcastReplay` (value: `"WebcastReplay"`)

* `Flash` (value: `"Flash"`)

* `Replay` (value: `"Replay"`)




