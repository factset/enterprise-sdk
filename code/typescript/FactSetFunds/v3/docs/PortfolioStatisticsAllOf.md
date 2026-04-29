# factsetfunds.PortfolioStatisticsAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**concentration** | **String** | Returns a qualitative concentration label for the fund based on its R-squared value measured against its segment benchmark. Uses one-year total returns and segment benchmark from the start date. The label is assigned according to the R-squared value: - **Low:** for R-squared &lt; 0.02    - **&#39;Medium&#39;** for R-squared &lt; 0.04 - **&#39;High&#39;** for R-squared &gt; 0.04  | [optional] 
**dividendYield** | **Number** | Returns the fund&#39;s Dividend Yield provides an aggregate measure of dividends paid out relative to share prices. | [optional] 
**priceToBookRatio** | **Number** | Returns the fund&#39;s Price to Book Value Ratio provides a measure of how cheap or expensive an aggregate is. | [optional] 
**priceToCashFlowRatio** | **Number** | Returns the fund&#39;s Price to Cash flow Ratio. | [optional] 
**priceToEarningsRatio** | **Number** | Returns the fund&#39;s Price to Earnings Ratio provides a measure of how cheap or expensive an aggregate is. | [optional] 
**priceToSalesRatio** | **Number** | Returns the fund&#39;s Price to Sales Ratio provides a measure of how cheap or expensive an aggregate is. | [optional] 
**weightedAverageMarketCap** | **Number** | Returns the weighted average company market value. | [optional] 



## Enum: ConcentrationEnum


* `Low` (value: `"Low"`)

* `Medium` (value: `"Medium"`)

* `High` (value: `"High"`)




