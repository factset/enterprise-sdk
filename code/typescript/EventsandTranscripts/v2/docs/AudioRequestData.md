# eventsandtranscripts.AudioRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **Date** | The earliest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - Data available from 10th May 2011 onwards.  | [optional] 
**endDate** | **Date** | The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.*  | [optional] 
**startDateRelative** | **Number** | The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#39;0&#39; for today, &#39;-1&#39; for yesterday, etc.). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.*  | [optional] 
**endDateRelative** | **Number** | The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#39;0&#39; for today, &#39;-1&#39; for yesterday, etc.). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.*  | [optional] 
**audioSource** | **String** | Source of the Audio file: * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay           | [optional] 
**ids** | **[String]** | Filter results based on ticker-region or Entity ID. | [optional] 
**trimmed** | **Boolean** | Search for trimmed audio files. | [optional] [default to false]
**uploadTime** | **Number** | Filter data based on uploadTime relative to the current time, in hours (e.g., -15 for the last 15 hours). Minimum -1, Maximum -168.  | [optional] 
**fileName** | **String** | The exact file name to search for. | [optional] 
**reportId** | **Number** | Unique identifier for the event transcript/audio. | [optional] 
**audioSourceId** | **Number** | Unique ID for the specific internal recording for the reportId. | [optional] 



## Enum: AudioSourceEnum


* `Phone` (value: `"Phone"`)

* `Webcast` (value: `"Webcast"`)

* `Vendor` (value: `"Vendor"`)

* `WebcastReplay` (value: `"WebcastReplay"`)

* `Flash` (value: `"Flash"`)

* `Replay` (value: `"Replay"`)




