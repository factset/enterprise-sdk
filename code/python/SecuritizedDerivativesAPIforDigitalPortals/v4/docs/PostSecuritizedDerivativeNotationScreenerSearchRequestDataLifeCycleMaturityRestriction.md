# PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturityRestriction

The maturity can be restricted by using one of the parameters `date` or `remainingTermDays` but not both at the same time. If a maturity restriction is set, perpetual instruments, i.e. such that do not mature, are not included in the result unless the parameter `perpetual` is set to `include`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturityRestrictionDate**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturityRestrictionDate.md) |  | [optional] 
**remaining_term_days** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturityRestrictionRemainingTermDays**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycleMaturityRestrictionRemainingTermDays.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


