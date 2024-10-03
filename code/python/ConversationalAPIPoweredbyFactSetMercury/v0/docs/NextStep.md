# NextStep

A serialized list of `action` items, which are directives to a front-end application to perform a certain task i.e. open a FactSet application or component, download an Excel file. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Datatype contained in this data object | [optional]  if omitted the server will use the default value of "NextStep"
**value** | [**[NextStepItem]**](NextStepItem.md) | List of NextStep items | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


