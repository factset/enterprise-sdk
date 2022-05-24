

# InlineResponse20089Instrument

Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**name** | [**InlineResponse20089InstrumentName**](InlineResponse20089InstrumentName.md) |  |  [optional]
**isin** | **String** | International Securities Identification Number of the instrument. |  [optional]
**nsin** | [**InlineResponse20088InstrumentNsin**](InlineResponse20088InstrumentNsin.md) |  |  [optional]
**fsym** | [**InlineResponse20036Fsym**](InlineResponse20036Fsym.md) |  |  [optional]
**assetClass** | [**InlineResponse20089InstrumentAssetClass**](InlineResponse20089InstrumentAssetClass.md) |  |  [optional]
**type** | [**java.util.List&lt;InlineResponse20038DataCategories&gt;**](InlineResponse20038DataCategories.md) | Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity. See endpoint &#x60;/category/listBySystem&#x60; for category systems 18 for possible values. |  [optional]


## Implemented Interfaces

* Serializable


