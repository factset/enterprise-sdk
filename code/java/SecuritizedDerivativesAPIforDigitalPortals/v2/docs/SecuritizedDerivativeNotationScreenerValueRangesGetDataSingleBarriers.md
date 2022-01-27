

# SecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriers


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of the barrier. See endpoint &#x60;/securitizedDerivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter. |  [optional]
**observation** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation**](SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation.md) |  |  [optional]
**level** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel**](SecuritizedDerivativeNotationScreenerValueRangesGetDataLevel.md) |  |  [optional]
**distance** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance**](SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance.md) |  |  [optional]
**breach** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach**](SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach.md) |  |  [optional]
**cashFlow** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow**](SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
STRIKE | &quot;strike&quot;
BONUSLEVEL | &quot;bonusLevel&quot;
CAP | &quot;cap&quot;
KNOCKOUT | &quot;knockOut&quot;
KNOCKIN | &quot;knockIn&quot;
LOCKOUT | &quot;lockOut&quot;
LOCKIN | &quot;lockIn&quot;
CAPITALGUARANTEE | &quot;capitalGuarantee&quot;
COUPONTRIGGERLEVEL | &quot;couponTriggerLevel&quot;


## Implemented Interfaces

* Serializable


