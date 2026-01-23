# FactSet.SDK.EventsandTranscripts.Model.AudioByDateRequest
Search criteria for audio files based on date range.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **DateTime** | The earliest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - Data available from 10th May 2011 onwards. - If dates are not provided, default will return all files.  | [optional] 
**EndDate** | **DateTime** | The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - If dates are not provided, default will return all files.  | [optional] 
**StartDateRelative** | **int** | The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#39;0&#39; for today, &#39;-1&#39; for yesterday, etc.). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - If dates are not provided, default will return all files.  | [optional] 
**EndDateRelative** | **int** | The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#39;0&#39; for today, &#39;-1&#39; for yesterday, etc.). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - If dates are not provided, default will return all files.  | [optional] 
**AudioSource** | **string** | Source of the Audio file: * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay           | [optional] 
**Ids** | **List&lt;string&gt;** | Filter results based on ticker-region or Entity ID. | [optional] 
**Trimmed** | **bool** | Search for trimmed audio files (non-speaking portions removed). | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

