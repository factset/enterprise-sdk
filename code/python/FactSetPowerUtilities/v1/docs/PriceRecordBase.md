# PriceRecordBase

Fields common to every power market price record. Record shape matches the requested `category` — see `PowerPriceRecord`, `SparkSpreadPriceRecord`, `CapacityPriceRecord`, and `ForwardPriceRecord` for the category-specific fields layered on top via `allOf`. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**location_id** | **str** | Location identifier, as submitted in the request. | 
**location_name** | **str, none_type** | Full location name. | [optional] 
**iso_code** | **str, none_type** | ISO/TSO market code. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


