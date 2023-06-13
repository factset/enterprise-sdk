# InlineResponse20074Data

Instrument data with a list of regional-level data and assigned listing-level data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_instrument** | **str, none_type** | MDG identifier of the instrument. | [optional] 
**source_identifier** | **str, none_type** | Identifier used in the request. | [optional] 
**permanent_identifier** | **str, none_type** | FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S). | [optional] 
**regional** | [**[InlineResponse20073DataRegional]**](InlineResponse20073DataRegional.md) | Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


