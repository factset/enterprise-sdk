# InlineResponse2009DataSubsample

Single summary record. For the attributes first, last, low, high, see attribute `valueUnit` in endpoint `/prices/get` for their unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **str, none_type** | Date and time of the start of the subsample. | [optional] 
**first** | **float, none_type** | First price of the subsample. | [optional] 
**last** | **float, none_type** | Last price of the subsample. | [optional] 
**low** | **float, none_type** | Lowest price of the subsample. | [optional] 
**high** | **float, none_type** | Highest price of the subsample. | [optional] 
**trading_volume** | **float, none_type** | Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. | [optional] 
**trading_value** | **float, none_type** | Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


