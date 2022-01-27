

# DebtInstrumentNotationScreenerSearchDataLifeCycleMaturity

Parameters related to the maturity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**restriction** | [**DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestriction**](DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestriction.md) |  |  [optional]
**perpetual** | [**PerpetualEnum**](#PerpetualEnum) | Defines whether or not perpetual debt instruments, i.e. such that do not mature, are included in the result. The value \&quot;only\&quot; can be used if both parameters &#x60;maturity.restriction.date&#x60; and &#x60;maturity.restriction.remainingTermYears&#x60; are not set. |  [optional]



## Enum: PerpetualEnum

Name | Value
---- | -----
ONLY | &quot;only&quot;
INCLUDE | &quot;include&quot;
EXCLUDE | &quot;exclude&quot;


## Implemented Interfaces

* Serializable


