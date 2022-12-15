

# PostStockNotationScreenerValueRangesGetRequestData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**validation** | [**PostStockNotationScreenerSearchRequestDataValidation**](PostStockNotationScreenerSearchRequestDataValidation.md) |  |  [optional]
**stockType** | [**java.util.Set&lt;StockTypeEnum&gt;**](#java.util.Set&lt;StockTypeEnum&gt;) | Type of stock. |  [optional]
**industryClassification** | [**PostStockNotationScreenerSearchRequestDataIndustryClassification**](PostStockNotationScreenerSearchRequestDataIndustryClassification.md) |  |  [optional]
**company** | [**PostStockNotationScreenerSearchRequestDataCompany**](PostStockNotationScreenerSearchRequestDataCompany.md) |  |  [optional]
**indexMembership** | [**PostStockNotationScreenerSearchRequestDataIndexMembership**](PostStockNotationScreenerSearchRequestDataIndexMembership.md) |  |  [optional]
**compliance** | [**PostStockNotationScreenerSearchRequestDataCompliance**](PostStockNotationScreenerSearchRequestDataCompliance.md) |  |  [optional]
**reportedKeyFigures** | [**java.util.List&lt;PostStockNotationScreenerSearchRequestDataReportedKeyFigures&gt;**](PostStockNotationScreenerSearchRequestDataReportedKeyFigures.md) | Parameters for stock-specific key figures as reported for a fiscal year. |  [optional]
**performance** | [**PostStockNotationScreenerSearchRequestDataPerformance**](PostStockNotationScreenerSearchRequestDataPerformance.md) |  |  [optional]
**volatility** | [**PostStockNotationScreenerSearchRequestDataVolatility**](PostStockNotationScreenerSearchRequestDataVolatility.md) |  |  [optional]
**tradingValue** | [**PostStockNotationScreenerSearchRequestDataTradingValue**](PostStockNotationScreenerSearchRequestDataTradingValue.md) |  |  [optional]
**simpleMovingAverage** | [**PostStockNotationScreenerSearchRequestDataSimpleMovingAverage**](PostStockNotationScreenerSearchRequestDataSimpleMovingAverage.md) |  |  [optional]
**rsiWilder** | [**PostStockNotationScreenerSearchRequestDataRsiWilder**](PostStockNotationScreenerSearchRequestDataRsiWilder.md) |  |  [optional]
**recommendation** | [**PostStockNotationScreenerValueRangesGetRequestDataRecommendation**](PostStockNotationScreenerValueRangesGetRequestDataRecommendation.md) |  |  [optional]
**estimates** | [**java.util.List&lt;PostStockNotationScreenerSearchRequestDataEstimates&gt;**](PostStockNotationScreenerSearchRequestDataEstimates.md) | Parameters for stock-specific consolidated estimates for a fiscal year. |  [optional]



## Enum: java.util.Set&lt;StockTypeEnum&gt;

Name | Value
---- | -----
COMMON | &quot;common&quot;
PREFERRED | &quot;preferred&quot;
DEPOSITORYRECEIPT | &quot;depositoryReceipt&quot;
OTHER | &quot;other&quot;


## Implemented Interfaces

* Serializable


