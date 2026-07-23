# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.ChatCompletionRequest
A request to generate a chat completion.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Model** | **string** | Echoed in response chunks. | 
**Stream** | **bool** | Ignored; the endpoint always streams. | [optional] 
**Messages** | [**List&lt;ChatMessage&gt;**](ChatMessage.md) | Only the last message with &#x60;role: user&#x60; is used. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

