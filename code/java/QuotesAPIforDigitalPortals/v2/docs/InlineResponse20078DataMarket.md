

# InlineResponse20078DataMarket

Market of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **BigDecimal** | Identifier of the market. See endpoint &#x60;/basic/market/list&#x60; for possible values.  |  [optional]
**isOpen** | **Boolean** | Indicates whether the market of the notation is currently open, that is, the current time is between the open and adjusted close of the notation&#39;s market, see endpoint &#x60;/prices/tradingSchedule/event/list&#x60; for the trading schedule of the notation&#39;s market. The adjusted close is later than the official closing time specified by the market and includes the time after closing when trades might still be reported. Breaks such as a lunch break are not considered. |  [optional]
**phase** | **String** | Market-specific code of the current market phase. |  [optional]


## Implemented Interfaces

* Serializable


