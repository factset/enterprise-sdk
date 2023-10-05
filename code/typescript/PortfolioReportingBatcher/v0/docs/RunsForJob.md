# portfolioreportingbatcher.RunsForJob

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endTime** | **Date** | The date and time the job was finished processing | [optional] 
**id** | **String** | The ID of the run | [optional] 
**isApiTriggered** | **Boolean** | Indicates whether the job was triggered via the PRB API | [optional] 
**prbStatus** | [**PrbStatus**](PrbStatus.md) |  | [optional] 
**runDuration** | **Number** | Number of seconds between startTime and endTime | [optional] 
**startTime** | **Date** | The date and time the job started running after being submitted and potentially waiting in any queue | [optional] 
**status** | [**Status**](Status.md) |  | [optional] 
**statusDescription** | **String** | Further details on the job&#39;s status | [optional] 
**submitTime** | **Date** | The date and time the job was submitted | [optional] 


