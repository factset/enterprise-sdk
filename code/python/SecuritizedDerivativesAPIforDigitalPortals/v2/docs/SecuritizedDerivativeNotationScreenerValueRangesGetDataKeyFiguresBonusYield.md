# SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYield

Bonus yield. It represents the bonus level adjusted for the cover ratio and currency cross rate minus the ask price of the securitized derivative. The value can become negative (e.g. for uncapped products), which does not mean that the investor will necessarily suffer a loss buying it. This key figure is calculated for bonus certificates with an intact knock-in barrier only. To restrict the result to bonus certificates with an intact knock in barrier, the parameter `singleBarriers.type` must be set to `knockIn` and the parameter `singleBarriers.breach.breached` must be set to `false`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absolute** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYieldAbsolute**](SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYieldAbsolute.md) |  | [optional] 
**relative** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYieldRelative**](SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYieldRelative.md) |  | [optional] 
**annualized** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYieldAnnualized**](SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresBonusYieldAnnualized.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


