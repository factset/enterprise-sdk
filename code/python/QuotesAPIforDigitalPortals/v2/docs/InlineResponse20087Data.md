# InlineResponse20087Data

The data member contains a list of the matching instruments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of the instrument. | [optional] 
**name** | **str** | Asset class-unspecific name in English. | [optional] 
**isin** | **str** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. | [optional] 
**nsin** | [**InlineResponse20042DataNsin**](InlineResponse20042DataNsin.md) |  | [optional] 
**asset_class** | **str** | Name of the asset class of the instrument. Possible values are listed in the enumeration in the parameter description. | [optional] 
**type** | [**[InlineResponse20038DataCategories]**](InlineResponse20038DataCategories.md) | Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


