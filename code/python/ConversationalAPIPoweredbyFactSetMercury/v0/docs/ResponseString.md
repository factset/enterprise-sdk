# ResponseString

Chat response to the query. Provides an answer to the question or references further attached data. `Value` property of parent FederationData contains a string with natural language. If the response text contains data citations for individual phrases, they will be included at the end of the phrase as `[ID]` where ID is an integer. The citation data will be mapped in the `citations` object, keyed by the citation ID. See the example `ResponseWithCitations` data for an example of how citations are referenced in the response. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | String containing chat response to the query | 
**type** | **str** | Datatype contained in this data object | defaults to "string"
**citations** | [**Citations**](Citations.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


