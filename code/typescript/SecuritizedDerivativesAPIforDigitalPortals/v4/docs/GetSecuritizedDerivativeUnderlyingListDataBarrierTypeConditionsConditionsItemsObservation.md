# securitizedderivativesapifordigitalportals.GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsConditionsItemsObservation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Identifier of the type of observation during the observation period. | Value | Description | | --- | --- | | continuous | The barrier is active, i.e. observed on a continuous basis (intraday prices are relevant). | | eod | The barrier is active, i.e. observed  only at the end of the final auction for the underlying on the relevant exchange (intraday prices are of no relevance). |   | [optional] 
**period** | [**GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsConditionsItemsObservationPeriod**](GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsConditionsItemsObservationPeriod.md) |  | [optional] 



## Enum: TypeEnum


* `continuous` (value: `"continuous"`)

* `eod` (value: `"eod"`)




