# Fields

All available fields in service. FID = Field ID Number.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid** | **float** | The last bid price or last bid price in an interval. FID # 509 | [optional] 
**bid_vol** | **int** | The volume of the last bid in an interval. FID # 505 | [optional] 
**bid_exch** | **str** | The volume of the last bid or last bid in an interval. FID # 506. | [optional] 
**ask** | **float** | The last ask price or last ask price in an interval. FID # 609 | [optional] 
**ask_vol** | **int** | The volume of the last ask or last ask in an interval. FID # 605 | [optional] 
**ask_exch** | **str** | The exchange of the last ask or last ask in an interval. FID # 606. | [optional] 
**last_price** | **float** | The last trade price or last trade price in an interval. FID # 50 | [optional] 
**last_date** | **str** | The date of the last trade or last trade in an interval. FID # 384 | [optional] 
**last_time** | **str** | The time of the last trade or last trade in an interval. FID # 383 | [optional] 
**last_vol** | **int** | The trade volume, or the sum of all trade volumes inside a bin. FID # 31 | [optional] 
**last_exch** | **str** | The exchange of the last trade or last trade in an interval. FID # 33. | [optional] 
**cvol** | **int** | The symbol&#39;s daily cumulative volume, or the last cumulative volume in an interval. FID # 132 | [optional] 
**vwap** | **float** | The daily volume weighted average price, or the last VWAP in an interval. FID # 780 | [optional] 
**open** | **float** | The first trade of an interval. FID # 158 | [optional] 
**high** | **float** | The highest trade price in an interval. FID # 107 | [optional] 
**low** | **float** | The lowest trade price in an interval. FID # 307 | [optional] 
**trade_condition** | **str** | Trade Condition. FID # 174 | [optional] 
**gmt_offset** | **int** | GMT Offset in Minutes. FID # 389 | [optional] 
**price_currency** | **str** | Price Currency Code. FID # 62 | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


