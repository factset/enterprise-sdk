# securitizedderivativesapifordigitalportals.SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**restriction** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction**](SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction.md) |  | [optional] 
**perpetual** | **String** | Defines whether or not perpetual securitized derivatives, i.e. such that do not mature, are included in the result. The value &#x60;only&#x60; can be used if both parameters &#x60;maturity.restriction.date&#x60; and &#x60;maturity.restriction.remainingTermDays&#x60; are not set. | [optional] 



## Enum: PerpetualEnum


* `only` (value: `"only"`)

* `include` (value: `"include"`)

* `exclude` (value: `"exclude"`)




