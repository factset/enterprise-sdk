# bondsapifordigitalportals.DebtInstrumentNotationScreenerSearchDataLifeCycleMaturity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**restriction** | [**DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestriction**](DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestriction.md) |  | [optional] 
**perpetual** | **String** | Defines whether or not perpetual debt instruments, i.e. such that do not mature, are included in the result. The value \&quot;only\&quot; can be used if both parameters &#x60;maturity.restriction.date&#x60; and &#x60;maturity.restriction.remainingTermYears&#x60; are not set. | [optional] 



## Enum: PerpetualEnum


* `only` (value: `"only"`)

* `include` (value: `"include"`)

* `exclude` (value: `"exclude"`)




