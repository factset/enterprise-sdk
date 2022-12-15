

# InlineResponse20092Instrument

Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**name** | [**InlineResponse20092InstrumentName**](InlineResponse20092InstrumentName.md) |  |  [optional]
**isin** | **String** | International Securities Identification Number of the instrument. |  [optional]
**nsin** | [**InlineResponse20091InstrumentNsin**](InlineResponse20091InstrumentNsin.md) |  |  [optional]
**fsym** | [**InlineResponse20036Fsym**](InlineResponse20036Fsym.md) |  |  [optional]
**assetClass** | [**InlineResponse20092InstrumentAssetClass**](InlineResponse20092InstrumentAssetClass.md) |  |  [optional]
**type** | [**java.util.List&lt;InlineResponse20038DataCategories&gt;**](InlineResponse20038DataCategories.md) | Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity. See endpoint &#x60;/category/listBySystem&#x60; for category systems 18 for possible values. |  [optional]


## Implemented Interfaces

* Serializable


