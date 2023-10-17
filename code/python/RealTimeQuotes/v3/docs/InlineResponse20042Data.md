# InlineResponse20042Data

Set of basic data for the instrument.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_instrument** | **str, none_type** | MDG identifier of the instrument. | [optional] 
**source_identifier** | **str, none_type** | Identifier used in the request. | [optional] 
**name** | **str, none_type** | Name of the instrument. | [optional] 
**short_name** | **str, none_type** | Short name of the instrument. | [optional] 
**isin** | **str, none_type** | International Securities Identification Number of the instrument. | [optional] 
**nsin** | [**InlineResponse20042DataNsin**](InlineResponse20042DataNsin.md) |  | [optional] 
**fsym** | [**InlineResponse20036Fsym**](InlineResponse20036Fsym.md) |  | [optional] 
**asset_class** | [**InlineResponse20042DataAssetClass**](InlineResponse20042DataAssetClass.md) |  | [optional] 
**type** | [**[InlineResponse20042DataType]**](InlineResponse20042DataType.md) | Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


