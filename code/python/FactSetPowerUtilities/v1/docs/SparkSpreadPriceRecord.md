# SparkSpreadPriceRecord

Natural gas spark spread price record.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**location_id** | **str** | Location identifier, as submitted in the request. | 
**category** | [**CategorySparkSpread**](CategorySparkSpread.md) |  | 
**location_name** | **str, none_type** | Full location name. | [optional] 
**iso_code** | **str, none_type** | ISO/TSO market code. | [optional] 
**price_date** | **date, none_type** | Trade or settlement date (YYYY-MM-DD). | [optional] 
**ngi_loc_name** | **str, none_type** | Corresponding natural gas delivery point name, as given by Natural Gas Intelligence. | [optional] 
**spark_spread_type** | **str, none_type** | Spark spread type. | [optional] 
**spark_spread_prices_mwh** | [**SparkSpreadPricesMwh**](SparkSpreadPricesMwh.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


