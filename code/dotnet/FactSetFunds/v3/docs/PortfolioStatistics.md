# FactSet.SDK.FactSetFunds.Model.PortfolioStatistics
Portfolio statistics including concentration, dividend yield, valuation ratios (P/E, P/B, P/S, P/CF), and weighted average market cap

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**Concentration** | **string** | Returns a qualitative concentration label for the fund based on its R-squared value measured against its segment benchmark. Uses one-year total returns and segment benchmark from the start date. The label is assigned according to the R-squared value: - **Low:** for R-squared &lt; 0.02    - **&#39;Medium&#39;** for R-squared &lt; 0.04 - **&#39;High&#39;** for R-squared &gt; 0.04  | [optional] 
**DividendYield** | **double?** | Returns the fund&#39;s Dividend Yield provides an aggregate measure of dividends paid out relative to share prices. | [optional] 
**PriceToBookRatio** | **double?** | Returns the fund&#39;s Price to Book Value Ratio provides a measure of how cheap or expensive an aggregate is. | [optional] 
**PriceToCashFlowRatio** | **double?** | Returns the fund&#39;s Price to Cash flow Ratio. | [optional] 
**PriceToEarningsRatio** | **double?** | Returns the fund&#39;s Price to Earnings Ratio provides a measure of how cheap or expensive an aggregate is. | [optional] 
**PriceToSalesRatio** | **double?** | Returns the fund&#39;s Price to Sales Ratio provides a measure of how cheap or expensive an aggregate is. | [optional] 
**WeightedAverageMarketCap** | **double?** | Returns the weighted average company market value. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

