# PostPricesTimeSeriesEodListDataPricesItems

A list of objects. For semantical context see the description of the parent array.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **date, none_type** | Date. | [optional] 
**first** | **float, none_type** | First price. | [optional] 
**last** | **float, none_type** | Last price. | [optional] 
**low** | **float, none_type** | Lowest price. | [optional] 
**high** | **float, none_type** | Highest price. | [optional] 
**trading_volume** | **float, none_type** | Number of units (e.g. shares) traded (price type trade and estimate), offered (price type ask), solicited (price type bid), or empty (price type yield). | [optional] 
**trading_value** | **float, none_type** | Monetary equivalent (cash value) of the trade. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit. Empty for price type yield. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


