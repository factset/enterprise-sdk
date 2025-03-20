# securitizedderivativesapifordigitalportals.PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of the barrier. See endpoint &#x60;/securitized-derivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter. | Value | Description | | --- | --- | | strike | Represents the underlying level that needs to be reached in order for the securitized derivative to yield a profit; particularly relevant for reverse convertible bonds, sprint/outperformance certificates, capital-protection certificates, warrants and knock-out certificates. | | bonusLevel | Represents the underlying level considered for repayment if the knock-in barrier is intact; particularly relevant for bonus certificates. | | cap | Represents the maximum underlying level considered for repayment; particularly relevant for discount certificates, bonus certificates, and capital-protection certificates. | | knockOut | Represents the underlying level where a securitized derivative is terminated and becomes (nearly) worthless; particularly relevant for knock-out certificates. | | knockIn | Represents the underling level at which a certain product feature (such as a bonus payment) is lost; particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. | | lockOut | Represents the underlying level at which the securitized derivative is terminated yielding a predefined amount; particularly relevant for capital-protection certificates and express certificates but currently not supported for the latter. | | lockIn | Represents the underlying level at which a certain repayment at maturity is ensured; particularly relevant for capital-protection certificates and express certificates but currently not supported for the latter. | | capitalGuarantee | Represents the underlying level corresponding to a guranteed repayment; particularly relevant for capital-protection certificates. | | couponTriggerLevel | Represents the underlying level at which a partial payment (such as a conditional coupon) is lost; particularly relevant for capital-protection certificates and express certificates but currently not supported for the latter. |   | [optional] 
**observation** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsObservation**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsObservation.md) |  | [optional] 
**level** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsLevel**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsLevel.md) |  | [optional] 
**distance** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsDistance**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsDistance.md) |  | [optional] 
**breach** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach.md) |  | [optional] 
**cashFlow** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsCashFlow**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsCashFlow.md) |  | [optional] 



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




