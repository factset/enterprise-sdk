# FactSet.SDK.EventsandTranscripts.Model.NrtCallsObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportId** | **int?** | The unique ID for an event. | [optional] 
**SourceCode** | **string** | Identifier for the source of how the event is recorded. PhoneReplay: Event is recorded through a phone replay Webcast: Event is recorded through a webcast. | [optional] 
**AudioSourceId** | **int?** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosourceIDs. | [optional] 
**Ticker** | **string** | Ticker-region identifier for the company hosting the event. | [optional] 
**EntityId** | **string** | Factset entity level identifier for the company hosting the event. | [optional] 
**EventType** | **string** | Refers to the various event types covered by FactSet CallStreet. | [optional] 
**EventTitle** | **string** | Title of the Event. | [optional] 
**CallStatus** | **string** | Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source. | [optional] 
**RecordingStartTime** | **DateTime?** |  | [optional] 
**EventDatetimeUtc** | **DateTime?** | The official UTC timestamp of the start of the event. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

