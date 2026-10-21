# ResponseChoices

One candidate answer within a chunk. There's always exactly one of these (see the note on `choices` above).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The position of this choice within the &#x60;choices&#x60; array. Always &#x60;0&#x60; for this API. | [optional] 
**delta** | [**ResponseChoicesDelta**](ResponseChoicesDelta.md) |  | [optional] 
**finish_reason** | **str, none_type** | Why the stream ended. It&#39;s &#x60;null&#x60; while the answer is still being generated, and &#x60;\&quot;stop\&quot;&#x60; on the final chunk when the answer finished normally. If something goes wrong partway through generation, there is no closing chunk at all — the stream (and the underlying HTTP connection) simply ends without a &#x60;finish_reason&#x60; or a &#x60;data: [DONE]&#x60; line, so clients should treat an unexpected stream close the same way they&#39;d treat an error. | [optional]  if omitted the server will use the default value of "stop"
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


