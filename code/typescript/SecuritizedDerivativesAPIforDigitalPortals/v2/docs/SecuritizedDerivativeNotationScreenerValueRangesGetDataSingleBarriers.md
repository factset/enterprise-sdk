# securitizedderivativesapifordigitalportals.SecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of the barrier. See endpoint &#x60;/securitizedDerivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter. | [optional] 
**observation** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation**](SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation.md) |  | [optional] 
**level** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel**](SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel.md) |  | [optional] 
**distance** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance**](SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance.md) |  | [optional] 
**breach** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach**](SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach.md) |  | [optional] 
**cashFlow** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow**](SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow.md) |  | [optional] 



## Enum: TypeEnum


* `strike` (value: `"strike"`)

* `bonusLevel` (value: `"bonusLevel"`)

* `cap` (value: `"cap"`)

* `knockOut` (value: `"knockOut"`)

* `knockIn` (value: `"knockIn"`)

* `lockOut` (value: `"lockOut"`)

* `lockIn` (value: `"lockIn"`)

* `capitalGuarantee` (value: `"capitalGuarantee"`)

* `couponTriggerLevel` (value: `"couponTriggerLevel"`)




