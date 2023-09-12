# StartJobRunResponseData

The main object within the startJobRunResponse schema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The run ID for the job that has been triggered which is used in the /runs/{id}/status endpoint | 
**job_name** | **str** | Name of the job | 
**prb_status** | [**PrbStatus**](PrbStatus.md) |  | 
**status** | [**Status**](Status.md) |  | 
**job_type** | [**JobTypes**](JobTypes.md) |  | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


