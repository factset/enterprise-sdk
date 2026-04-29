

# Trading

Fund trading metrics including trading volumes, spreads, premium/discount data, and impediments to creation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**date** | **LocalDate** | The date of the trading data in YYYY-MM-DD format |  [optional]
**dailyDollarTradingVolume** | **BigDecimal** | Daily $ Trading Volume |  [optional]
**dailyShareTradingVolume** | **BigDecimal** | Daily Share Trading Volume |  [optional]
**averageSpreadPercent** | **BigDecimal** | Average bid-ask spread (%). This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. |  [optional]
**averageSpreadDollar** | **BigDecimal** | Average bid-ask spread ($)This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. |  [optional]
**blockLiquidityScore** | **Integer** | Block liquidity score (0–5 scale).This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. |  [optional]
**underlyingVolumePer1M** | **BigDecimal** | Underlying volume per $1M. This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. |  [optional]
**marketHoursOverlapPercent** | **BigDecimal** | Market hours overlap (%). This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. |  [optional]
**creationFee** | **BigDecimal** | ETF creation fee ($) |  [optional]
**creationUnitSize** | **Integer** | Creation unit size (shares) |  [optional]
**impedimentsToCreation** | **String** | Impediments to ETF creation/redemption process |  [optional]
**medianPremiumDiscount12M** | **BigDecimal** | Median premium/discount over the last 12 months.This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. |  [optional]
**minPremiumDiscount12M** | **BigDecimal** | Minimum premium/discount over the last 12 months.This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. |  [optional]
**maxPremiumDiscount12M** | **BigDecimal** | Maximum premium/discount over the last 12 months.This data item is available only with the Analytics product package. If the product is not enabled, the field will be omitted from the response. |  [optional]


## Implemented Interfaces

* Serializable


