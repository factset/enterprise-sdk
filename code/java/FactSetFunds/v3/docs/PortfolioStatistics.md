

# PortfolioStatistics

Portfolio statistics including concentration, dividend yield, valuation ratios (P/E, P/B, P/S, P/CF), and weighted average market cap

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**date** | **LocalDate** | The date in YYYY-MM-DD format. |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**concentration** | [**ConcentrationEnum**](#ConcentrationEnum) | Returns a qualitative concentration label for the fund based on its R-squared value measured against its segment benchmark. Uses one-year total returns and segment benchmark from the start date. The label is assigned according to the R-squared value: - **Low:** for R-squared &lt; 0.02    - **&#39;Medium&#39;** for R-squared &lt; 0.04 - **&#39;High&#39;** for R-squared &gt; 0.04  |  [optional]
**dividendYield** | **Double** | Returns the fund&#39;s Dividend Yield provides an aggregate measure of dividends paid out relative to share prices. |  [optional]
**priceToBookRatio** | **Double** | Returns the fund&#39;s Price to Book Value Ratio provides a measure of how cheap or expensive an aggregate is. |  [optional]
**priceToCashFlowRatio** | **Double** | Returns the fund&#39;s Price to Cash flow Ratio. |  [optional]
**priceToEarningsRatio** | **Double** | Returns the fund&#39;s Price to Earnings Ratio provides a measure of how cheap or expensive an aggregate is. |  [optional]
**priceToSalesRatio** | **Double** | Returns the fund&#39;s Price to Sales Ratio provides a measure of how cheap or expensive an aggregate is. |  [optional]
**weightedAverageMarketCap** | **Double** | Returns the weighted average company market value. |  [optional]



## Enum: ConcentrationEnum

Name | Value
---- | -----
LOW | &quot;Low&quot;
MEDIUM | &quot;Medium&quot;
HIGH | &quot;High&quot;


## Implemented Interfaces

* Serializable


