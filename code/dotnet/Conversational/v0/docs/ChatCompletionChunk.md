# FactSet.SDK.Conversational.Model.ChatCompletionChunk
One small piece of the streamed answer. The full answer is made up of many of these chunks, sent one after another.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | A unique id for this answer as a whole — the same value appears on every chunk that belongs to it. | [optional] 
**Object** | **string** | The object type, always \&quot;chat.completion.chunk\&quot;. | [optional] 
**Created** | **long** | The time this chunk was created, as a Unix timestamp (seconds since January 1, 1970). | [optional] 
**Model** | **string** | Which model generated this answer. | [optional] 
**ConversationId** | **Guid** | Only included on the very first chunk of the stream. Save this value and send it back as &#x60;factset_configuration.conversation_id&#x60; next time to continue this same conversation. | [optional] 
**Choices** | [**List&lt;ResponseChoices&gt;**](ResponseChoices.md) | A list of candidate answers for this chunk. This API only ever returns one, at index 0. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

