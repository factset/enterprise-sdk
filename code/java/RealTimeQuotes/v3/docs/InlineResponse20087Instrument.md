

# InlineResponse20087Instrument

Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**name** | [**InlineResponse20067Name**](InlineResponse20067Name.md) |  |  [optional]
**isin** | **String** | International Securities Identification Number of the instrument. |  [optional]
**nsin** | [**InlineResponse20087InstrumentNsin**](InlineResponse20087InstrumentNsin.md) |  |  [optional]
**fsym** | [**InlineResponse20036Fsym**](InlineResponse20036Fsym.md) |  |  [optional]
**assetClass** | [**InlineResponse20067AssetClass**](InlineResponse20067AssetClass.md) |  |  [optional]
**instrumentCategory** | [**java.util.List&lt;InlineResponse20067Category&gt;**](InlineResponse20067Category.md) | Set of categories assigned to the instrument. The set of returned categories is limited to the values provided in the request parameter &#x60;category.restrict.ids.&#x60; Empty, if &#x60;category.restrict.ids&#x60; has not been used. |  [optional]


## Implemented Interfaces

* Serializable


