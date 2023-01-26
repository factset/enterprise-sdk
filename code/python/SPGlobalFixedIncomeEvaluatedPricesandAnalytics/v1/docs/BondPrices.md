# BondPrices


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**currency** | **str, none_type** | Returns the coupon currency .Available only  available for &#x60;corporate and asset-backed security bonds&#x60;. | [optional] 
**date** | **date, none_type** | The date on which the price is calculated. | [optional] 
**clean_bid_price** | **float, none_type** | The bid price of the instrument. | [optional] 
**clean_mid_price** | **float, none_type** | The bid price of the instrument. | [optional] 
**clean_ask_price** | **float, none_type** | The bid price of the instrument. | [optional] 
**dirty_bid_price** | **float, none_type** | The price of the bond plus the interest that is accrued between coupon payments, based on the bid price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**dirty_mid_price** | **float, none_type** | The price of the bond plus the interest that is accrued between coupon payments, based on the mid price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**dirty_ask_price** | **float, none_type** | The price of the bond plus the interest that is accrued between coupon payments, based on the bid price. Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**pv** | **float, none_type** | The present variation per one basis point change in yield, based on the mid price .Available only  for &#x60;corporate bonds&#x60;. | [optional] 
**bid_price_date** | **date, none_type** | The date the bid price is valued to. Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**mid_price_date** | **date, none_type** | The date the mid price is valued to. Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**ask_price_date** | **date, none_type** | The date the ask price is valued to. Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**bid_price_type** | **str, none_type** | Bid price type for the given identifier. Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**mid_price_type** | **str** | Mid price type for the given identifier .Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**ask_price_type** | **str, none_type** | Ask price type for the given identifier .Available only  for &#x60;municipal bonds&#x60;. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


