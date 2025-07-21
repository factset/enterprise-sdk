

# AudioByDateRequest

Search criteria for audio files based on date range.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **LocalDate** | The earliest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - Data available from 10th May 2011 onwards.  |  [optional]
**endDate** | **LocalDate** | The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.*  |  [optional]
**startDateRelative** | **Integer** | The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#39;0&#39; for today, &#39;-1&#39; for yesterday, etc.). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.*  |  [optional]
**endDateRelative** | **Integer** | The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#39;0&#39; for today, &#39;-1&#39; for yesterday, etc.). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.*  |  [optional]
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


