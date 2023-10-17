

# InlineResponse20099Instrument

Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**name** | [**InlineResponse20099InstrumentName**](InlineResponse20099InstrumentName.md) |  |  [optional]
**isin** | **String** | International Securities Identification Number of the instrument. |  [optional]
**nsin** | [**InlineResponse20067Nsin**](InlineResponse20067Nsin.md) |  |  [optional]
**normalizedSymbol** | **String** | Symbol of an option or a future, as normalized by FactSet. |  [optional]
**fsym** | [**InlineResponse20036Fsym**](InlineResponse20036Fsym.md) |  |  [optional]
**assetClass** | [**InlineResponse20099InstrumentAssetClass**](InlineResponse20099InstrumentAssetClass.md) |  |  [optional]
**instrumentCategory** | [**java.util.List&lt;InlineResponse20038DataCategories&gt;**](InlineResponse20038DataCategories.md) | Set of categories assigned to the instrument. The set of returned categories is limited to the values provided in the request parameter &#x60;category.restrict.ids&#x60;. Empty, if &#x60;category.restrict.ids&#x60; has not been used. |  [optional]


## Implemented Interfaces

* Serializable


