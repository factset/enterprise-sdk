# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgio
Agio. For plain vanilla warrants, it represents the difference between the ask price of the derivative and its parity (see attribute `parity`). Thus, for those with exercise right `call`, the agio indicates how much more expensive would it be to obtain the underlying through purchasing and exercising the warrant compared to directly purchasing the underlying. For those with exercise right `put`, the above consideration is applied inversely. For other types of securitized derivatives, the calculation and interpretation of the agio depends on their category. Negative values are possible.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Absolute** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgioAbsolute**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgioAbsolute.md) |  | [optional] 
**Relative** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgioRelative**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgioRelative.md) |  | [optional] 
**Annualized** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgioAnnualized**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFiguresAgioAnnualized.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

