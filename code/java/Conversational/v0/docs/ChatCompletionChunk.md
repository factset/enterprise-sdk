

# ChatCompletionChunk

One small piece of the streamed answer. The full answer is made up of many of these chunks, sent one after another.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A unique id for this answer as a whole — the same value appears on every chunk that belongs to it. |  [optional]
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, always \&quot;chat.completion.chunk\&quot;. |  [optional]
**created** | **Long** | The time this chunk was created, as a Unix timestamp (seconds since January 1, 1970). |  [optional]
**model** | **String** | Which model generated this answer. |  [optional]
**conversationId** | **java.util.UUID** | Only included on the very first chunk of the stream. Save this value and send it back as &#x60;factset_configuration.conversation_id&#x60; next time to continue this same conversation. |  [optional]
**choices** | [**java.util.List&lt;ResponseChoices&gt;**](ResponseChoices.md) | A list of candidate answers for this chunk. This API only ever returns one, at index 0. |  [optional]



## Enum: ObjectEnum

Name | Value
---- | -----
CHAT_COMPLETION_CHUNK | &quot;chat.completion.chunk&quot;


## Implemented Interfaces

* Serializable


