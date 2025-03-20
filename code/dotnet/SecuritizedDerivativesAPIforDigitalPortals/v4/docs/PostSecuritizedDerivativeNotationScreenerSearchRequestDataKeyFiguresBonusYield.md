# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBonusYield
Bonus yield. It represents the bonus level adjusted for the cover ratio and currency cross rate minus the ask price of the securitized derivative. The value can become negative (e.g. for uncapped products), which does not mean that the investor will necessarily suffer a loss buying it. This key figure is calculated for bonus certificates with an intact knock-in barrier only. To restrict the result to bonus certificates with an intact knock in barrier, the parameter `singleBarriers.type` must be set to `knockIn` and the parameter `singleBarriers.breach.breached` must be set to `false`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Absolute** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBonusYieldAbsolute**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBonusYieldAbsolute.md) |  | [optional] 
**Relative** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBonusYieldRelative**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBonusYieldRelative.md) |  | [optional] 
**Annualized** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBonusYieldAnnualized**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFiguresBonusYieldAnnualized.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

