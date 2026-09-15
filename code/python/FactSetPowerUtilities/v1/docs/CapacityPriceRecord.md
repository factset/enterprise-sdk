# CapacityPriceRecord

Capacity auction clearing price record.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**location_id** | **str** | Location identifier, as submitted in the request. | 
**category** | [**CategoryCapacity**](CategoryCapacity.md) |  | 
**location_name** | **str, none_type** | Full location name. | [optional] 
**iso_code** | **str, none_type** | ISO/TSO market code. | [optional] 
**mnemonic** | **str, none_type** | FactSet-assigned code for this price series. | [optional] 
**auction_type** | **str, none_type** | Type of capacity auction. | [optional] 
**auction_date** | **date, none_type** | Date of the capacity auction. | [optional] 
**delivery_year** | **int, none_type** | Capacity delivery year, derived from the price effective date. | [optional] 
**auction_price_mw** | **float, none_type** | Capacity auction clearing price in $/MW-day. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


