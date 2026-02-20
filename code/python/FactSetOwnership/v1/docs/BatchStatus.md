# BatchStatus

Details the current status of a given batch request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | the id of batch request. | [optional] 
**start_time** | **datetime** | The time when the batch request was initiated. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601. | [optional] 
**end_time** | **datetime, none_type** | The time when the batch request was completed. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601. | [optional] 
**status** | **str** | The status signifies the current state of the batch request that can be &#39;queued&#39;, &#39;executing&#39;, &#39;created&#39;, or &#39;failed&#39;. | [optional] 
**error** | [**BatchErrorObject**](BatchErrorObject.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


