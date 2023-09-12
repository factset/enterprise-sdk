# Task

Schema that represents a long-running process/task.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The task identifier | 
**started_at** | **datetime** | The date time the task started (UTC). | 
**status** | **str** |  Completion status of the task.  The detailed description of each of the statuses is as follows: |Status|Description| |--------|--------| |queued|The task did not start yet.| |created|The task is completed and the underlying resource is created.| |failed|The task has failed and consequently the creation of the resource failed.| |executing|The task is executing.| |cancelled|The task is cancelled and the creation of the underlying resource was cancelled before it could finish.| | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


