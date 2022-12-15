# InlineResponse20092Instrument

Instrument data of the notation.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str, none_type** | Identifier of the instrument. | [optional] 
**name** | [**InlineResponse20092InstrumentName**](InlineResponse20092InstrumentName.md) |  | [optional] 
**isin** | **str, none_type** | International Securities Identification Number of the instrument. | [optional] 
**nsin** | [**InlineResponse20091InstrumentNsin**](InlineResponse20091InstrumentNsin.md) |  | [optional] 
**fsym** | [**InlineResponse20036Fsym**](InlineResponse20036Fsym.md) |  | [optional] 
**asset_class** | [**InlineResponse20092InstrumentAssetClass**](InlineResponse20092InstrumentAssetClass.md) |  | [optional] 
**type** | [**[InlineResponse20038DataCategories]**](InlineResponse20038DataCategories.md) | Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity. See endpoint &#x60;/category/listBySystem&#x60; for category systems 18 for possible values. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


