

# StockNotationScreenerSearchData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**validation** | [**StockNotationScreenerSearchDataValidation**](StockNotationScreenerSearchDataValidation.md) |  |  [optional]
**stockType** | [**java.util.Set&lt;StockTypeEnum&gt;**](#java.util.Set&lt;StockTypeEnum&gt;) | Type of stock. |  [optional]
**industryClassification** | [**StockNotationScreenerSearchDataIndustryClassification**](StockNotationScreenerSearchDataIndustryClassification.md) |  |  [optional]
**company** | [**StockNotationScreenerSearchDataCompany**](StockNotationScreenerSearchDataCompany.md) |  |  [optional]
**indexMembership** | [**StockNotationScreenerSearchDataIndexMembership**](StockNotationScreenerSearchDataIndexMembership.md) |  |  [optional]
**compliance** | [**StockNotationScreenerSearchDataCompliance**](StockNotationScreenerSearchDataCompliance.md) |  |  [optional]
**reportedKeyFigures** | [**java.util.List&lt;StockNotationScreenerSearchDataReportedKeyFigures&gt;**](StockNotationScreenerSearchDataReportedKeyFigures.md) | Parameters for stock-specific key figures as reported for a fiscal year. |  [optional]
**performance** | [**StockNotationScreenerSearchDataPerformance**](StockNotationScreenerSearchDataPerformance.md) |  |  [optional]
**volatility** | [**StockNotationScreenerSearchDataVolatility**](StockNotationScreenerSearchDataVolatility.md) |  |  [optional]
**tradingValue** | [**StockNotationScreenerSearchDataTradingValue**](StockNotationScreenerSearchDataTradingValue.md) |  |  [optional]
**simpleMovingAverage** | [**StockNotationScreenerSearchDataSimpleMovingAverage**](StockNotationScreenerSearchDataSimpleMovingAverage.md) |  |  [optional]
**rsiWilder** | [**StockNotationScreenerSearchDataRsiWilder**](StockNotationScreenerSearchDataRsiWilder.md) |  |  [optional]
**recommendation** | [**StockNotationScreenerSearchDataRecommendation**](StockNotationScreenerSearchDataRecommendation.md) |  |  [optional]
**estimates** | [**java.util.List&lt;StockNotationScreenerSearchDataEstimates&gt;**](StockNotationScreenerSearchDataEstimates.md) | Parameters for stock-specific consolidated estimates for a fiscal year. |  [optional]



## Enum: java.util.Set&lt;StockTypeEnum&gt;

Name | Value
---- | -----
COMMON | &quot;common&quot;
PREFERRED | &quot;preferred&quot;
DEPOSITORYRECEIPT | &quot;depositoryReceipt&quot;
OTHER | &quot;other&quot;


## Implemented Interfaces

* Serializable


