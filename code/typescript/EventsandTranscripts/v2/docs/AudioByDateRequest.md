# eventsandtranscripts.AudioByDateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **Date** | The earliest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - Data available from 10th May 2011 onwards. - If dates are not provided, default will return all files.  | [optional] 
**endDate** | **Date** | The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - If dates are not provided, default will return all files.  | [optional] 
**startDateRelative** | **Number** | The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#39;0&#39; for today, &#39;-1&#39; for yesterday, etc.). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - If dates are not provided, default will return all files.  | [optional] 
**endDateRelative** | **Number** | The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#39;0&#39; for today, &#39;-1&#39; for yesterday, etc.). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - If dates are not provided, default will return all files.  | [optional] 
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




