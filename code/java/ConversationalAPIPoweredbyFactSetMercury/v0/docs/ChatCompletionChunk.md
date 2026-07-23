

# ChatCompletionChunk

A single streamed chunk of a chat completion response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the completion. |  [optional]
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, always \&quot;chat.completion.chunk\&quot;. |  [optional]
**created** | **Long** | Unix timestamp indicating when the response was created. |  [optional]
**model** | **String** | The model used to generate the completion. |  [optional]
**choices** | [**java.util.List&lt;ResponseChoices&gt;**](ResponseChoices.md) | Array of completion choices. |  [optional]



## Enum: ObjectEnum

Name | Value
---- | -----
CHAT_COMPLETION_CHUNK | &quot;chat.completion.chunk&quot;


## Implemented Interfaces

* Serializable


