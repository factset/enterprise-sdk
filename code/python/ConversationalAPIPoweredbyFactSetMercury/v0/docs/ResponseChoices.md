# ResponseChoices

A choice within a completion chunk.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of this choice within the choices array. | [optional] 
**delta** | [**ResponseChoicesDelta**](ResponseChoicesDelta.md) |  | [optional] 
**finish_reason** | **str, none_type** | The reason the model stopped generating tokens (stop, error, or null if incomplete). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


