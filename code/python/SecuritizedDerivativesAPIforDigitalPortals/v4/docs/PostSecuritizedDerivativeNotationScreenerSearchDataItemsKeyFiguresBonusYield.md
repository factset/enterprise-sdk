# PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresBonusYield

Bonus yield. It represents the bonus level adjusted for the cover ratio and currency cross rate minus the ask price of the securitized derivative. The value can become negative (e.g. for uncapped products), which does not mean that the investor will necessarily suffer a loss buying it. This key figure is calculated for bonus certificates with an intact knock-in barrier only, i.e. the attribute `knockIn.breach.breached` is false.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absolute** | **float, none_type** | Bonus yield in absolute terms. | [optional] 
**relative** | **float, none_type** | Bonus yield relative to the ask price. | [optional] 
**annualized** | **float, none_type** | Annualized bonus yield relative to the ask price. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


