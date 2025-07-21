# eventsandtranscripts.NrtCallsRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ticker** | **String** | Ticker-region identifier for the company hosting the event. | [optional] 
**entityId** | **String** | FactSet entity level identifier for the company hosting the event. | [optional] 
**callStatus** | **String** | Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source. | [optional] 
**audioSourceId** | **Number** | Unique ID for the specific internal recording. | [optional] 
**reportId** | **Number** | Unique identifier for the event. | [optional] 



## Enum: CallStatusEnum


* `InProgress` (value: `"InProgress"`)

* `Ended` (value: `"Ended"`)

* `EWN` (value: `"EWN"`)

* `IssueAtSource` (value: `"IssueAtSource"`)




