

# InlineResponse20021Data

Distribution.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dividend** | [**InlineResponse20021DataDividend**](InlineResponse20021DataDividend.md) |  |  [optional]
**capitalGains** | [**InlineResponse20021DataCapitalGains**](InlineResponse20021DataCapitalGains.md) |  |  [optional]
**totalDistribution** | **BigDecimal** | Total Distribution on exDividend-date. Values are in the ETP&#39;s listing currency in the ISO 4217 format. This data is available for all regions. Please refer currency.listing in /factset/etf/getBySymbol for currency value. |  [optional]
**distributionYield** | **BigDecimal** | Total 12-month distribution of the ETP multiplied by split factor then divided by its net asset value. Data is split adjusted. This data is available for the US regions. |  [optional]


## Implemented Interfaces

* Serializable


