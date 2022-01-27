# FactSet.SDK.BondsAPIforDigitalPortals.Model.DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestriction
The maturity can be restricted by using one of the parameters `date` or `remainingTermYears` but not both at the same time. If a maturity restriction is set, perpetual instruments, i.e. such that do not mature, are not included in the result unless the parameter `perpetual` is set to \"include\".

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Date** | [**DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionDate**](DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionDate.md) |  | [optional] 
**RemainingTermYears** | [**DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYears**](DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYears.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

