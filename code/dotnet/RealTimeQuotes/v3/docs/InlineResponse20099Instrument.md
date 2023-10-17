# FactSet.SDK.RealTimeQuotes.Model.InlineResponse20099Instrument
Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the instrument. | [optional] 
**Name** | [**InlineResponse20099InstrumentName**](InlineResponse20099InstrumentName.md) |  | [optional] 
**Isin** | **string** | International Securities Identification Number of the instrument. | [optional] 
**Nsin** | [**InlineResponse20067Nsin**](InlineResponse20067Nsin.md) |  | [optional] 
**NormalizedSymbol** | **string** | Symbol of an option or a future, as normalized by FactSet. | [optional] 
**Fsym** | [**InlineResponse20036Fsym**](InlineResponse20036Fsym.md) |  | [optional] 
**AssetClass** | [**InlineResponse20099InstrumentAssetClass**](InlineResponse20099InstrumentAssetClass.md) |  | [optional] 
**InstrumentCategory** | [**List&lt;InlineResponse20038DataCategories&gt;**](InlineResponse20038DataCategories.md) | Set of categories assigned to the instrument. The set of returned categories is limited to the values provided in the request parameter &#x60;category.restrict.ids&#x60;. Empty, if &#x60;category.restrict.ids&#x60; has not been used. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

