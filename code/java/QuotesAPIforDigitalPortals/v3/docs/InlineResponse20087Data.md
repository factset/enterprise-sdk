

# InlineResponse20087Data

The data member contains a list of the matching instruments

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**name** | **String** | Asset class-unspecific name in English. |  [optional]
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. |  [optional]
**nsin** | [**InlineResponse20042DataNsin**](InlineResponse20042DataNsin.md) |  |  [optional]
**fsym** | [**InlineResponse20036Fsym**](InlineResponse20036Fsym.md) |  |  [optional]
**assetClass** | **String** | Name of the asset class of the instrument. Possible values are listed in the enumeration in the parameter description. |  [optional]
**type** | [**java.util.List&lt;InlineResponse20038DataCategories&gt;**](InlineResponse20038DataCategories.md) | Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). |  [optional]


## Implemented Interfaces

* Serializable


