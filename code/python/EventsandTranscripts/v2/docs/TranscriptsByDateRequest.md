# TranscriptsByDateRequest

Search criteria for transcripts based on date range and timeZone.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **date** | -  Start Date (YYYY-MM-DD). Data available from April 21st, 1999 onwards. - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used.* - If dates are not provided, default will return all files.    | [optional] 
**end_date** | **date** | - End Date (YYYY-MM-DD). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used.* - If dates are not provided, default will return all files.  | [optional] 
**start_date_relative** | **int** | - Start date relative to today (0&#x3D;today, -1&#x3D;yesterday). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used.* - If dates are not provided, default will return all files.  | [optional] 
**end_date_relative** | **int** | -  End date relative to today (0&#x3D;today, -1&#x3D;yesterday). -  *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used.* -  If dates are not provided, default will return all files.    | [optional] 
**time_zone** | **str** | Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. | [optional]  if omitted the server will use the default value of "America/New_York"
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


