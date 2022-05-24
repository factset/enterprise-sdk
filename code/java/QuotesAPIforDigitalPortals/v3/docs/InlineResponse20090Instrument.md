

# InlineResponse20090Instrument

Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**name** | **String** | Name of the instrument. |  [optional]
**isin** | **String** | International Securities Identification Number of the instrument. |  [optional]
**nsin** | [**InlineResponse20088InstrumentNsin**](InlineResponse20088InstrumentNsin.md) |  |  [optional]
**assetClass** | **String** | Name of the asset class of the instrument. Possible values are listed in the enumeration in the parameter description. |  [optional]
**type** | [**java.util.List&lt;InlineResponse20038DataCategories&gt;**](InlineResponse20038DataCategories.md) | Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). |  [optional]


## Implemented Interfaces

* Serializable


