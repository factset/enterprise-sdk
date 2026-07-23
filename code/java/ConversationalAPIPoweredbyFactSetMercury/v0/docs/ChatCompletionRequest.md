

# ChatCompletionRequest

A request to generate a chat completion.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **String** | Echoed in response chunks. | 
**stream** | **Boolean** | Ignored; the endpoint always streams. |  [optional]
**messages** | [**java.util.List&lt;ChatMessage&gt;**](ChatMessage.md) | Only the last message with &#x60;role: user&#x60; is used. | 


## Implemented Interfaces

* Serializable


