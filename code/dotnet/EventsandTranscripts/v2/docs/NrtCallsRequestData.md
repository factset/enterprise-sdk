# FactSet.SDK.EventsandTranscripts.Model.NrtCallsRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ticker** | **string** | Ticker-region identifier for the company hosting the event. | [optional] 
**EntityId** | **string** | FactSet entity level identifier for the company hosting the event. | [optional] 
**CallStatus** | **string** | Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source. | [optional] 
**AudioSourceId** | **int** | Unique ID for the specific internal recording. | [optional] 
**ReportId** | **int** | Unique identifier for the event. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

