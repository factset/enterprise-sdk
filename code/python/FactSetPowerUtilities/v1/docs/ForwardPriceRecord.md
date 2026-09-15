# ForwardPriceRecord

Forward power price curve record.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | 
**location_id** | **str** | Location identifier, as submitted in the request. | 
**category** | [**CategoryForward**](CategoryForward.md) |  | 
**location_name** | **str, none_type** | Full location name. | [optional] 
**iso_code** | **str, none_type** | ISO/TSO market code. | [optional] 
**price_date** | **date, none_type** | Trade or settlement date (YYYY-MM-DD). | [optional] 
**delivery_year** | **int, none_type** | Delivery year, derived from the delivery start date. | [optional] 
**delivery_month** | **int, none_type** | Delivery month (1–12), derived from the delivery start date. | [optional] 
**interconnection** | **str, none_type** | Higher-level US power market region the location belongs to. | [optional] 
**period_type** | **str, none_type** | Term type of the forward delivery period. | [optional] 
**price_type** | **str, none_type** | Forward price type. | [optional] 
**avg_forward_price_mwh** | **float, none_type** | Forward price in $/MWh, reported as a rolling 3-day average. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


