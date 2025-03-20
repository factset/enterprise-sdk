# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationRankingIntradayListDataItemsUnderlyingNotationInstrument
Instrument of the underlying.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the instrument. | [optional] 
**TypeComposite** | **string** | Type of composite instrument, in case the underlying is a composite instrument. | Value | Description | | - -- | - -- | | basket | A basket is a composite instrument which consists of several components. Its value is calculated as the weighted combination of the levels of the components. All weights are positive. | | alphaStructure | An alpha structure is a composite instrument which consists of two components. Its value is calculated as the difference of the performances of the components. The performances are measured starting at the date specified in the conditions of the securitized derivative. | | futuresSpread | A futures spread is a composite instrument which is built of two or more different futures contracts as its components. | | factorIndex | A factor index is a composite instrument that reflects the day-to-day performance of its component, multiplied with a constant factor. The related capital costs and fees for calculation and administration are not represented. |   | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

