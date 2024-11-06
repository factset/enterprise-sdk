# FederationData

Data surfaced by processing the query through FactSet Mercury. Contains financial data, if accessible and available, as well as natural language answer to the query

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Datatype contained in this data object | defaults to "SuggestedPrompts"
**citations** | [**Citations**](Citations.md) |  | [optional] 
**value** | [**[PromptItem]**](PromptItem.md) | List of suggested prompts | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


