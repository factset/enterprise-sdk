# ChatCompletionChunk

One small piece of the streamed answer. The full answer is made up of many of these chunks, sent one after another.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | A unique id for this answer as a whole — the same value appears on every chunk that belongs to it. | [optional] 
**object** | **str** | The object type, always \&quot;chat.completion.chunk\&quot;. | [optional]  if omitted the server will use the default value of "chat.completion.chunk"
**created** | **int** | The time this chunk was created, as a Unix timestamp (seconds since January 1, 1970). | [optional] 
**model** | **str** | Which model generated this answer. | [optional] 
**conversation_id** | **str** | Only included on the very first chunk of the stream. Save this value and send it back as &#x60;factset_configuration.conversation_id&#x60; next time to continue this same conversation. | [optional] 
**choices** | [**[ResponseChoices]**](ResponseChoices.md) | A list of candidate answers for this chunk. This API only ever returns one, at index 0. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


