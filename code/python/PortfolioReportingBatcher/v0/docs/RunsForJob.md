# RunsForJob

Provides full details of when the job has been run

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_time** | **datetime** | The date and time the job was finished processing | [optional] 
**id** | **str** | The ID of the run | [optional] 
**is_api_triggered** | **bool** | Indicates whether the job was triggered via the PRB API | [optional] 
**prb_status** | [**PrbStatus**](PrbStatus.md) |  | [optional] 
**run_duration** | **float** | Number of seconds between startTime and endTime | [optional] 
**start_time** | **datetime** | The date and time the job started running after being submitted and potentially waiting in any queue | [optional] 
**status** | [**Status**](Status.md) |  | [optional] 
**status_description** | [**StatusDescription**](StatusDescription.md) |  | [optional] 
**submit_time** | **datetime** | The date and time the job was submitted | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


