# InlineResponse20099Instrument

Instrument data of the notation.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str, none_type** | Identifier of the instrument. | [optional] 
**name** | [**InlineResponse20099InstrumentName**](InlineResponse20099InstrumentName.md) |  | [optional] 
**isin** | **str, none_type** | International Securities Identification Number of the instrument. | [optional] 
**nsin** | [**InlineResponse20067Nsin**](InlineResponse20067Nsin.md) |  | [optional] 
**normalized_symbol** | **str, none_type** | Symbol of an option or a future, as normalized by FactSet. | [optional] 
**fsym** | [**InlineResponse20036Fsym**](InlineResponse20036Fsym.md) |  | [optional] 
**asset_class** | [**InlineResponse20099InstrumentAssetClass**](InlineResponse20099InstrumentAssetClass.md) |  | [optional] 
**instrument_category** | [**[InlineResponse20038DataCategories]**](InlineResponse20038DataCategories.md) | Set of categories assigned to the instrument. The set of returned categories is limited to the values provided in the request parameter &#x60;category.restrict.ids&#x60;. Empty, if &#x60;category.restrict.ids&#x60; has not been used. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


