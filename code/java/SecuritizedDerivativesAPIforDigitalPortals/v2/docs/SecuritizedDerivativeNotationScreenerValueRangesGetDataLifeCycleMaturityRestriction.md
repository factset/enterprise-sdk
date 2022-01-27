

# SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction

The maturity can be restricted by using one of the parameters `date` or `remainingTermDays` but not both at the same time. If a maturity restriction is set, perpetual instruments, i.e. such that do not mature, are not included in the result unless the parameter `perpetual` is set to `include`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionDate**](SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionDate.md) |  |  [optional]
**remainingTermDays** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays**](SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays.md) |  |  [optional]


## Implemented Interfaces

* Serializable


