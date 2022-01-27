# InlineResponse2007DataSubsamples


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **date** | Date of the start of the subsample. | [optional] 
**first** | **float** | First price of the subsample. | [optional] 
**last** | **float** | Last price of the subsample. | [optional] 
**low** | **float** | Lowest price of the subsample. | [optional] 
**high** | **float** | Highest price of the subsample. | [optional] 
**trading_volume** | **float** | Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. | [optional] 
**trading_value** | **float** | Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


