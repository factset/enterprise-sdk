

# ChatCompletionRequest

The request body you send to ask a question and get an answer.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**ModelEnum**](#ModelEnum) | Which model to use for this request — see &#x60;GET .../models&#x60; for the list of valid values. Use &#x60;fds-web-answer-2.0&#x60; if you also want the assistant to search the public web; otherwise use &#x60;fds-answer-2.0&#x60;. Everything else about the request and response is the same either way. | 
**stream** | **Boolean** | Accepted for compatibility with OpenAI clients, but has no effect — this API always streams its response no matter what you set here. |  [optional]
**messages** | [**java.util.List&lt;ChatMessage&gt;**](ChatMessage.md) | The conversation so far, in OpenAI&#39;s message format. Only the most recent message with &#x60;role: \&quot;user\&quot;&#x60; is actually used as the question being asked; anything else in this list is ignored. | 
**factsetConfiguration** | [**FactSetConfiguration**](FactSetConfiguration.md) |  |  [optional]



## Enum: ModelEnum

Name | Value
---- | -----
ANSWER_2_0 | &quot;fds-answer-2.0&quot;
WEB_ANSWER_2_0 | &quot;fds-web-answer-2.0&quot;


## Implemented Interfaces

* Serializable


