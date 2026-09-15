# PowerPriceRecord

Spot power price record.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**location_id** | **str** | Location identifier, as submitted in the request. | 
**category** | [**CategoryPower**](CategoryPower.md) |  | 
**location_name** | **str, none_type** | Full location name. | [optional] 
**iso_code** | **str, none_type** | ISO/TSO market code. | [optional] 
**price_date** | **date, none_type** | Trade or settlement date (YYYY-MM-DD). | [optional] 
**on_peak_price_mwh** | **float, none_type** | On-peak spot power price in $/MWh. | [optional] 
**off_peak_price_mwh** | **float, none_type** | Off-peak spot power price in $/MWh. | [optional] 
**around_the_clock_price_mwh** | **float, none_type** | Around-the-clock (flat) spot power price in $/MWh. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


