# FactSet.SDK.PortfolioReportingBatcher.Model.RunsForJob
Provides full details of when the job has been run

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EndTime** | **DateTime** | The date and time the job was finished processing | [optional] 
**Id** | **string** | The ID of the run | [optional] 
**IsApiTriggered** | **bool** | Indicates whether the job was triggered via the PRB API | [optional] 
**PrbStatus** | **PrbStatus** |  | [optional] 
**RunDuration** | **decimal** | Number of seconds between startTime and endTime | [optional] 
**StartTime** | **DateTime** | The date and time the job started running after being submitted and potentially waiting in any queue | [optional] 
**Status** | **Status** |  | [optional] 
**StatusDescription** | **string** | Further details on the job&#39;s status | [optional] 
**SubmitTime** | **DateTime** | The date and time the job was submitted | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

