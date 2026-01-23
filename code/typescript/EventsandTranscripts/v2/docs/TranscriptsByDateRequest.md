# eventsandtranscripts.TranscriptsByDateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **Date** | -  Start Date (YYYY-MM-DD). Data available from April 21st, 1999 onwards. - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used.* - If dates are not provided, default will return all files.    | [optional] 
**endDate** | **Date** | - End Date (YYYY-MM-DD). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used.* - If dates are not provided, default will return all files.  | [optional] 
**startDateRelative** | **Number** | - Start date relative to today (0&#x3D;today, -1&#x3D;yesterday). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used.* - If dates are not provided, default will return all files.  | [optional] 
**endDateRelative** | **Number** | -  End date relative to today (0&#x3D;today, -1&#x3D;yesterday). -  *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used.* -  If dates are not provided, default will return all files.    | [optional] 
**timeZone** | **String** | Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. | [optional] [default to &#39;America/New_York&#39;]


