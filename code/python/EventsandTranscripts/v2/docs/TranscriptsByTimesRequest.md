# TranscriptsByTimesRequest

Search criteria for transcripts based on date-time

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date_time** | **datetime** | The date from which data is required. If dates are not provided, default will return all files.  | [optional] 
**end_date_time** | **datetime** | The date to which data is required. If dates are not provided, default will return all files.  | [optional] 
**time_zone** | **str** | Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. | [optional]  if omitted the server will use the default value of "America/New_York"
**date_type** | **str** | &lt;p&gt;&#39;dateType&#x3D;storyDateTime&#39; Enables filtering of transcripts based on their storyDateTime&lt;/p&gt; &lt;p&gt;&#39;dateType&#x3D;uploadDateTime&#39; Enables filtering of transcripts based on their uploadDateTime&lt;/p&gt;  &lt;p&gt;Default value is set to storyDateTime.&lt;/p&gt;  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


