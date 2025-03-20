

# PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturity

Parameters related to the maturity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**restriction** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturityRestriction**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturityRestriction.md) |  |  [optional]
**perpetual** | [**PerpetualEnum**](#PerpetualEnum) | Defines whether or not perpetual securitized derivatives, i.e. such that do not mature, are included in the result. The value &#x60;only&#x60; can be used if both parameters &#x60;maturity.restriction.date&#x60; and &#x60;maturity.restriction.remainingTermDays&#x60; are not set. | Value | Description | | --- | --- | | only | Only perpetual securitized derivatives are included in the result. | | include | Perpetual securitized derivatives are included in the result even if one of the parameters &#x60;maturity.restriction.date&#x60; or &#x60;maturity.restriction.remainingTermDays&#x60; is set. | | exclude | Perpetual securitized derivatives are excluded from the result. |   |  [optional]



## Enum: PerpetualEnum

Name | Value
---- | -----
ONLY | &quot;only&quot;
INCLUDE | &quot;include&quot;
EXCLUDE | &quot;exclude&quot;


## Implemented Interfaces

* Serializable


