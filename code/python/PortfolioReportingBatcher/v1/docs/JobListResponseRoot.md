# JobListResponseRoot

Available details of a PRB job, please note limited details are available if the job has not been run before, please see the examples

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**run_id** | **str** | Latest run ID for the job | [optional] 
**is_api_triggered** | **bool** | Indicates if the latest run was triggered by this API | [optional] 
**name** | **str** | The name of the job | [optional] 
**serial_number** | **str** | The FactSet serial number which identifies the person or account the job is assigned to | [optional] 
**status** | [**Status**](Status.md) |  | [optional] 
**type** | [**JobTypes**](JobTypes.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


