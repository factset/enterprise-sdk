# PriceRecord

A single power market price record. Record shape matches the requested `category`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | [**CategoryForward**](CategoryForward.md) |  | 
**location_name** | **str, none_type** | Full location name. | [optional] 
**iso_code** | **str, none_type** | ISO/TSO market code. | [optional] 
**price_date** | **date, none_type** | Trade or settlement date (YYYY-MM-DD). | [optional] 
**on_peak_price_mwh** | **float, none_type** | On-peak spot power price in $/MWh. | [optional] 
**off_peak_price_mwh** | **float, none_type** | Off-peak spot power price in $/MWh. | [optional] 
**around_the_clock_price_mwh** | **float, none_type** | Around-the-clock (flat) spot power price in $/MWh. | [optional] 
**ngi_loc_name** | **str, none_type** | Corresponding natural gas delivery point name, as given by Natural Gas Intelligence. | [optional] 
**spark_spread_type** | **str, none_type** | Spark spread type. | [optional] 
**spark_spread_prices_mwh** | [**SparkSpreadPricesMwh**](SparkSpreadPricesMwh.md) |  | [optional] 
**mnemonic** | **str, none_type** | FactSet-assigned code for this price series. | [optional] 
**auction_type** | **str, none_type** | Type of capacity auction. | [optional] 
**auction_date** | **date, none_type** | Date of the capacity auction. | [optional] 
**delivery_year** | **int, none_type** | Delivery year, derived from the delivery start date. | [optional] 
**auction_price_mw** | **float, none_type** | Capacity auction clearing price in $/MW-day. | [optional] 
**delivery_month** | **int, none_type** | Delivery month (1–12), derived from the delivery start date. | [optional] 
**interconnection** | **str, none_type** | Higher-level US power market region the location belongs to. | [optional] 
**period_type** | **str, none_type** | Term type of the forward delivery period. | [optional] 
**price_type** | **str, none_type** | Forward price type. | [optional] 
**avg_forward_price_mwh** | **float, none_type** | Forward price in $/MWh, reported as a rolling 3-day average. | [optional] 
**request_id** | **str** | The identifier as submitted in the request. Duplicates &#x60;locationId&#x60;. | [optional] 
**location_id** | **str** | Location identifier, as submitted in the request. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


