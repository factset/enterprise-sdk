# SecuritizedDerivativeNotationRankingIntradayListDataUnderlying

Underlying selection. A list of underlyings can be selected by either using their instrument identifiers, see parameter `underlying.instrument.ids` or by using their notation identifiers, see parameter `underlying.notation.ids` but not both at the same time. Only one of the provided identifiers needs to be matched in order for a securitized derivative to be returned in the result. The list of underlyings is particularly useful to search for securitized derivatives that have very similar but not exactly the same underlyings such as futures with different maturities on a given commodity, e.g. brent crude oil.  For the selection of the effective underling of factor certificates, use `factorCertificates.effectiveUnderlying.instrument.ids`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | [**SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument**](SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument.md) |  | [optional] 
**notation** | [**SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation**](SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


