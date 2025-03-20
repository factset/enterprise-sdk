# PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresAgio

Agio. For plain vanilla warrants, it represents the difference between the ask price of the derivative and its parity (see attribute `parity`). Thus, for those with exercise right `call`, the agio indicates how much more expensive would it be to obtain the underlying through purchasing and exercising the warrant compared to directly purchasing the underlying. For those with exercise right `put`, the above consideration is applied inversely. For other types of securitized derivatives, the calculation and interpretation of the agio depends on their category. Negative values are possible.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absolute** | **float, none_type** | Agio in absolute terms. | [optional] 
**relative** | **float, none_type** | Agio relative to the underlying level. | [optional] 
**annualized** | **float, none_type** | Annualized agio relative to the underlying level. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


