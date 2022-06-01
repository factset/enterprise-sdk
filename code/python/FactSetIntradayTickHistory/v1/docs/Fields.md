# Fields

All available fields in service. FID = Field ID Number.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_1** | **float** | The last bid price or last bid price in an interval. FID # 100 | [optional] 
**bid_vol_1** | **int** | The volume of the last bid in an interval. FID # 104 | [optional] 
**bid_exch_1** | **str** | The volume of the last bid or last bid in an interval. FID # 107. Enumeration Table 7 | [optional] 
**ask_1** | **float** | The last ask price or last ask price in an interval. FID # 200 | [optional] 
**ask_vol_1** | **int** | The volume of the last ask or last ask in an interval. FID # 204 | [optional] 
**ask_exch_1** | **str** | The exchange of the last ask or last ask in an interval. FID # 207. Enumeration Table 7. | [optional] 
**last_1** | **float** | The last trade price or last trade price in an interval. FID # 300 | [optional] 
**last_date_1** | **str** | The date of the last trade or last trade in an interval. FID # 301 | [optional] 
**last_time_1** | **str** | The time of the last trade or last trade in an interval. FID # 302 | [optional] 
**last_vol_1** | **int** | The trade volume, or the sum of all trade volumes inside a bin. FID # 304 | [optional] 
**last_exch_1** | **str** | The exchange of the last trade or last trade in an interval. FID # 307. Enumeration Table 7 | [optional] 
**cum_vol** | **int** | The symbol&#39;s daily cumulative volume, or the last cumulative volume in an interval. FID # 601 | [optional] 
**vwap** | **float** | The daily volume weighted average price, or the last VWAP in an interval. FID # 603 | [optional] 
**open_1** | **float** | The first trade of an interval. FID # 710 | [optional] 
**high_1** | **float** | The highest trade price in an interval. FID # 720 | [optional] 
**low_1** | **float** | The lowest trade price in an interval. FID # 723 | [optional] 
**trade_condition** | **str** | Trade Condition. FID # 2709 | [optional] 
**gmt_offset** | **int** | GMT Offset in Minutes. FID # 2037 | [optional] 
**price_currency** | **str** | Price Currency Code. FID # 2032 | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


