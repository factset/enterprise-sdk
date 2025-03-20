# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlying
Underlying selection. A list of underlyings can be selected by either using their instrument identifiers, see parameter `underlying.instrument.ids` or by using their notation identifiers, see parameter `underlying.notation.ids` but not both at the same time. Only one of the provided identifiers needs to be matched in order for a securitized derivative to be returned in the result. The list of underlyings is particularly useful to search for securitized derivatives that have very similar but not exactly the same underlyings such as futures with different maturities on a given commodity, e.g. brent crude oil.  For the selection of the effective underling of factor certificates, use `factorCertificates.effectiveUnderlying.instrument.ids`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Instrument** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlyingInstrument**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlyingInstrument.md) |  | [optional] 
**Notation** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlyingNotation**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlyingNotation.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

