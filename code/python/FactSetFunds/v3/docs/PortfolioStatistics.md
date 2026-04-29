# PortfolioStatistics

Portfolio statistics including concentration, dividend yield, valuation ratios (P/E, P/B, P/S, P/CF), and weighted average market cap

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**date** | **date, none_type** | The date in YYYY-MM-DD format. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**concentration** | **str, none_type** | Returns a qualitative concentration label for the fund based on its R-squared value measured against its segment benchmark. Uses one-year total returns and segment benchmark from the start date. The label is assigned according to the R-squared value: - **Low:** for R-squared &lt; 0.02    - **&#39;Medium&#39;** for R-squared &lt; 0.04 - **&#39;High&#39;** for R-squared &gt; 0.04  | [optional] 
**dividend_yield** | **float, none_type** | Returns the fund&#39;s Dividend Yield provides an aggregate measure of dividends paid out relative to share prices. | [optional] 
**price_to_book_ratio** | **float, none_type** | Returns the fund&#39;s Price to Book Value Ratio provides a measure of how cheap or expensive an aggregate is. | [optional] 
**price_to_cash_flow_ratio** | **float, none_type** | Returns the fund&#39;s Price to Cash flow Ratio. | [optional] 
**price_to_earnings_ratio** | **float, none_type** | Returns the fund&#39;s Price to Earnings Ratio provides a measure of how cheap or expensive an aggregate is. | [optional] 
**price_to_sales_ratio** | **float, none_type** | Returns the fund&#39;s Price to Sales Ratio provides a measure of how cheap or expensive an aggregate is. | [optional] 
**weighted_average_market_cap** | **float, none_type** | Returns the weighted average company market value. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


