# BondYield


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **date, none_type** | The date on which the price is calculated. | [optional] 
**bid_yield_to_maturity** | **float, none_type** | The yield to maturity of the bid price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. | [optional] 
**mid_yield_to_maturity** | **float, none_type** | The yield to maturity of the mid price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;asset-backed security bonds&#x60;. | [optional] 
**ask_yield_to_maturity** | **float, none_type** | The yield to maturity of the ask price of the instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**bid_yield_to_worst** | **float, none_type** | The lowest yield, under all possible scenarios, of the bid price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**mid_yield_to_worst** | **float, none_type** | The lowest yield, under all possible scenarios, of the mid price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**ask_yield_to_worst** | **float, none_type** | The lowest yield, under all possible scenarios, of the ask price of the instrument. Available only for &#x60;corporate bonds&#x60; and &#x60;municipal bonds&#x60;. | [optional] 
**benchmark_bid_yield_to_maturity** | **float, none_type** | The bid yield to maturity of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**benchmark_mid_yield_to_maturity** | **float, none_type** | The mid yield to maturity of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**benchmark_ask_yield_to_maturity** | **float, none_type** | The ask yield to maturity of the benchmark instrument. Available only for &#x60;corporate bonds&#x60;. | [optional] 
**bid_yield_to_call** | **float, none_type** | The yield to call of the bid price of the instrument. Available only for &#x60;asset-backed security bonds&#x60;. | [optional] 
**mid_yield_to_call** | **float, none_type** | The yield to call of the mid price of the instrument. Available only for &#x60;asset-backed security bonds&#x60;. | [optional] 
**yield_tw_date** | **date, none_type** | The date used in the yield to worst calculation. Available only for &#39;corporate bonds&#39;. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


