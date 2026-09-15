# ExchangeItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exchange_code** | **int** | Unique code for the exchange. | [optional] 
**exchange_name** | **str** | Name of the exchange. | [optional] 
**market_open** | **int, none_type** | Market open time in hours and minutes (HHMM). | [optional] 
**market_close** | **int, none_type** | Market close time in hours and minutes (HHMM). | [optional] 
**timezone** | **str** | Timezone in which the exchange operates. | [optional] 
**iso_code** | **str** | ISO code for the exchange. | [optional] 
**delay_time** | **int** | Delay time in minutes. | [optional] 
**products** | [**[ExchangeProductItem]**](ExchangeProductItem.md) | List of Level 1 and Level 2 products available for this exchange. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


