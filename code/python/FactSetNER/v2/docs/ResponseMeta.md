# ResponseMeta

Response metadata including model information and performance metrics.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **str** | The model used for this extraction (for Advanced this is one of the supported model names, e.g. \&quot;GPT 5.2\&quot;). | 
**model_duration** | **float** | Time spent by the model for inference, in milliseconds. | 
**task_duration** | **float** | Total time to process the request, including overhead, in milliseconds. | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


