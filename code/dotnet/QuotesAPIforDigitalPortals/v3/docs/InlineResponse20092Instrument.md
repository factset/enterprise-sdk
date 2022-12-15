# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20092Instrument
Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the instrument. | [optional] 
**Name** | [**InlineResponse20092InstrumentName**](InlineResponse20092InstrumentName.md) |  | [optional] 
**Isin** | **string** | International Securities Identification Number of the instrument. | [optional] 
**Nsin** | [**InlineResponse20091InstrumentNsin**](InlineResponse20091InstrumentNsin.md) |  | [optional] 
**Fsym** | [**InlineResponse20036Fsym**](InlineResponse20036Fsym.md) |  | [optional] 
**AssetClass** | [**InlineResponse20092InstrumentAssetClass**](InlineResponse20092InstrumentAssetClass.md) |  | [optional] 
**Type** | [**List&lt;InlineResponse20038DataCategories&gt;**](InlineResponse20038DataCategories.md) | Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity. See endpoint &#x60;/category/listBySystem&#x60; for category systems 18 for possible values. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

