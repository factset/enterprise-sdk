# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.ChatCompletionChunk
A single streamed chunk of a chat completion response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique identifier for the completion. | [optional] 
**Object** | **string** | The object type, always \&quot;chat.completion.chunk\&quot;. | [optional] 
**Created** | **long** | Unix timestamp indicating when the response was created. | [optional] 
**Model** | **string** | The model used to generate the completion. | [optional] 
**Choices** | [**List&lt;ResponseChoices&gt;**](ResponseChoices.md) | Array of completion choices. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

