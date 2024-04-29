# NrtCallsObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_id** | **int, none_type** | The unique ID for an event. | [optional] 
**source_code** | **str, none_type** | Identifier for the source of how the event is recorded. PhoneReplay: Event is recorded through a phone replay Webcast: Event is recorded through a webcast. | [optional] 
**audio_source_id** | **int, none_type** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosourceIDs. | [optional] 
**ticker** | **str, none_type** | Ticker-region identifier for the company hosting the event. | [optional] 
**entity_id** | **str, none_type** | Factset entity level identifier for the company hosting the event. | [optional] 
**event_type** | **str, none_type** | Refers to the various event types covered by FactSet CallStreet. | [optional] 
**event_title** | **str, none_type** | Title of the Event. | [optional] 
**call_status** | **str, none_type** | Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source. | [optional] 
**recording_start_time** | **datetime, none_type** |  | [optional] 
**event_datetime_utc** | **datetime, none_type** | The official UTC timestamp of the start of the event. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


