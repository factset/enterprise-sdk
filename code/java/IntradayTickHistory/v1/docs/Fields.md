

# Fields

All available fields in service. FID = Field ID Number.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BID_1** | **Float** | The last bid price or last bid price in an interval. FID # 100 |  [optional]
**BID_VOL_1** | **Integer** | The volume of the last bid in an interval. FID # 104 |  [optional]
**BID_EXCH_1** | **String** | The volume of the last bid or last bid in an interval. FID # 107. Enumeration Table 7 |  [optional]
**ASK_1** | **Float** | The last ask price or last ask price in an interval. FID # 200 |  [optional]
**ASK_VOL_1** | **Integer** | The volume of the last ask or last ask in an interval. FID # 204 |  [optional]
**ASK_EXCH_1** | **String** | The exchange of the last ask or last ask in an interval. FID # 207. Enumeration Table 7. |  [optional]
**LAST_1** | **Float** | The last trade price or last trade price in an interval. FID # 300 |  [optional]
**LAST_DATE_1** | **String** | The date of the last trade or last trade in an interval. FID # 301 |  [optional]
**LAST_TIME_1** | **String** | The time of the last trade or last trade in an interval. FID # 302 |  [optional]
**LAST_VOL_1** | **Integer** | The trade volume, or the sum of all trade volumes inside a bin. FID # 304 |  [optional]
**LAST_EXCH_1** | **String** | The exchange of the last trade or last trade in an interval. FID # 307. Enumeration Table 7 |  [optional]
**CUM_VOL** | **Integer** | The symbol&#39;s daily cumulative volume, or the last cumulative volume in an interval. FID # 601 |  [optional]
**VWAP** | **Float** | The daily volume weighted average price, or the last VWAP in an interval. FID # 603 |  [optional]
**OPEN_1** | **Float** | The first trade of an interval. FID # 710 |  [optional]
**HIGH_1** | **Float** | The highest trade price in an interval. FID # 720 |  [optional]
**LOW_1** | **Float** | The lowest trade price in an interval. FID # 723 |  [optional]
**TRADE_CONDITION** | **String** | Trade Condition. FID # 2709 |  [optional]
**GMT_OFFSET** | **Integer** | GMT Offset in Minutes. FID # 2037 |  [optional]
**PRICE_CURRENCY** | **String** | Price Currency Code. FID # 2032 |  [optional]


## Implemented Interfaces

* Serializable


