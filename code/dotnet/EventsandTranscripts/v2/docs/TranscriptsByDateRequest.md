# FactSet.SDK.EventsandTranscripts.Model.TranscriptsByDateRequest
Search criteria for transcripts based on date range and timeZone.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **DateTime** | Start Date (YYYY-MM-DD). Data available from April 21st, 1999 onwards. *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used.*  | [optional] 
**EndDate** | **DateTime** | End Date (YYYY-MM-DD). *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used.*  | [optional] 
**StartDateRelative** | **int** | Start date relative to today (0&#x3D;today, -1&#x3D;yesterday). *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used.*  | [optional] 
**EndDateRelative** | **int** | End date relative to today (0&#x3D;today, -1&#x3D;yesterday). *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used.*  | [optional] 
**TimeZone** | **string** | Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. | [optional] [default to "America/New_York"]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

