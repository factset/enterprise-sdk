# ChatCompletionChunk

A single streamed chunk of a chat completion response.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier for the completion. | [optional] 
**object** | **str** | The object type, always \&quot;chat.completion.chunk\&quot;. | [optional]  if omitted the server will use the default value of "chat.completion.chunk"
**created** | **int** | Unix timestamp indicating when the response was created. | [optional] 
**model** | **str** | The model used to generate the completion. | [optional] 
**choices** | [**[ResponseChoices]**](ResponseChoices.md) | Array of completion choices. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


