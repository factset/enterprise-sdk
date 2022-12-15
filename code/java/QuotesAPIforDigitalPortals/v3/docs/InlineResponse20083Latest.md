

# InlineResponse20083Latest

Most recent trade or price of the trading day.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **String** | Date and time. |  [optional]
**price** | **BigDecimal** | Price value. See attribute &#x60;valueUnit&#x60; for its unit. |  [optional]
**quoteCondition** | **String** | Quote condition. Possible values depend on the values delivered by the supplier of the price information. |  [optional]
**tradingVolume** | **BigDecimal** | Number of units (e.g. shares) traded. |  [optional]
**tradingValue** | **BigDecimal** | Monetary equivalent (cash value) of the trade. See attribute &#x60;currency&#x60; for its unit. |  [optional]
**performance** | [**InlineResponse20083LatestPerformance**](InlineResponse20083LatestPerformance.md) |  |  [optional]


## Implemented Interfaces

* Serializable


