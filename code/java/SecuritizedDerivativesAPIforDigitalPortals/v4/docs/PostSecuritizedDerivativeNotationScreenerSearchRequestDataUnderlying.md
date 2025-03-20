

# PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlying

Underlying selection. A list of underlyings can be selected by either using their instrument identifiers, see parameter `underlying.instrument.ids` or by using their notation identifiers, see parameter `underlying.notation.ids` but not both at the same time. Only one of the provided identifiers needs to be matched in order for a securitized derivative to be returned in the result.   The list of underlyings is particularly useful to search for securitized derivatives that have very similar but not exactly the same underlyings such as futures with different maturities on a given commodity, e.g. brent crude oil. For such a list of underlyings, a barrier restriction in absolute terms, see for example parameter `singleBarriers.level.absolute` or `rangeBarriers.upper.level.absolute`, will provide a meaningful result, whereas for a list of non-similar underlyings, such as different stocks, a barrier restriction in absolute terms will not provide a meaningful result. This is due to the fact that futures on the same commodity are comparable in regards to their prices while two different stocks are not comparable.   Parameters in relative terms, see for example parameter `singleBarriers.distance.relative`, are generally comparable and will provide meaningful result for a list of similar as well as for a list of non-similar underlyings.   For the selection of the effective underling of factor certificates, use `factorCertificates.effectiveUnderlying.instrument.ids`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlyingInstrument**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlyingInstrument.md) |  |  [optional]
**notation** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlyingNotation**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlyingNotation.md) |  |  [optional]


## Implemented Interfaces

* Serializable


