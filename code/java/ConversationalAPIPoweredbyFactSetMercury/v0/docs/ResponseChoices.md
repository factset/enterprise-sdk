

# ResponseChoices

A choice within a completion chunk.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** | The index of this choice within the choices array. |  [optional]
**delta** | [**ResponseChoicesDelta**](ResponseChoicesDelta.md) |  |  [optional]
**finishReason** | [**FinishReasonEnum**](#FinishReasonEnum) | The reason the model stopped generating tokens (stop, error, or null if incomplete). |  [optional]



## Enum: FinishReasonEnum

Name | Value
---- | -----
STOP | &quot;stop&quot;
ERROR | &quot;error&quot;
NULL | &quot;null&quot;


## Implemented Interfaces

* Serializable


