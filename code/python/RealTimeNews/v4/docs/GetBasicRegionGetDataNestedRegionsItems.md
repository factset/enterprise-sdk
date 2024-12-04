# GetBasicRegionGetDataNestedRegionsItems

A list of objects. For semantical context see the description of the parent array.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float, none_type** | Identifier of a region. | [optional] 
**code** | **str, none_type** | ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types. | [optional] 
**name** | **str, none_type** | Name of the region. | [optional] 
**type** | **str, none_type** | Type of the region. | Value | Description | | --- | --- | | continent | Regions that are considered to be a continent in the context of the Market Data Gateway. | | country | A region that represents a country that has been assigned an official ISO 3166-1 code. | | subdivision | A region that represents a subdivision of a country that has been assigned an official ISO 3166-2 code. | | misc | A miscellaneous region represents a region that is neither a continent, nor a country, nor a subdivision of a country. | | compound | A compound miscellaneous region consists of member regions which are uniquely and undoubtedly defined. |   | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


