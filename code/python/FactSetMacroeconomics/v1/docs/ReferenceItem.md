# ReferenceItem

Reference item representing either an indicator, country, FDS code, or timezone. The structure depends on the requested type parameter.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_type** | [**ItemTypeTimezone**](ItemTypeTimezone.md) |  | 
**description** | **str** | IANA time zone name or abbreviation representing the GMT offset. | [optional] 
**code** | **str** | Time zone value in GMT offset format for use with the &#x60;timeZone&#x60; parameter.  | [optional] 
**name** | **str** | Human-readable display name for the country. | [optional] 
**country** | **str** | Country name. | [optional] 
**event_name** | **str** | Name of the economic event associated with this FDS code. | [optional] 
**source_name** | **str** | Source organization or data provider. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


