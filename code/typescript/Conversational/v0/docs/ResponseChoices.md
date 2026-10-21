# conversational.ResponseChoices

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Number** | The position of this choice within the &#x60;choices&#x60; array. Always &#x60;0&#x60; for this API. | [optional] 
**delta** | [**ResponseChoicesDelta**](ResponseChoicesDelta.md) |  | [optional] 
**finishReason** | **String** | Why the stream ended. It&#39;s &#x60;null&#x60; while the answer is still being generated, and &#x60;\&quot;stop\&quot;&#x60; on the final chunk when the answer finished normally. If something goes wrong partway through generation, there is no closing chunk at all — the stream (and the underlying HTTP connection) simply ends without a &#x60;finish_reason&#x60; or a &#x60;data: [DONE]&#x60; line, so clients should treat an unexpected stream close the same way they&#39;d treat an error. | [optional] 



## Enum: FinishReasonEnum


* `stop` (value: `"stop"`)




