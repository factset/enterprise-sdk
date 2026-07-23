# ChatCompletionRequest

A request to generate a chat completion.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **str** | Echoed in response chunks. | 
**messages** | [**[ChatMessage]**](ChatMessage.md) | Only the last message with &#x60;role: user&#x60; is used. | 
**stream** | **bool** | Ignored; the endpoint always streams. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


