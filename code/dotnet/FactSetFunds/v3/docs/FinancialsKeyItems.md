# FactSet.SDK.FactSetFunds.Model.FinancialsKeyItems
Financial Key Items Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**KeyItemsType** | **PerShareType** |  | 
**SalesAndRevenueGrowth** | **double?** | 1-year (YoY) percentage change in aggregated sales and revenue across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**CogsGrowth** | **double?** | 1-year (YoY) percentage change in aggregated cost of goods sold (COGS) across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**GrossIncomeGrowth** | **double?** | 1-year (YoY) percentage change in aggregated gross income across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**SgaGrowth** | **double?** | 1-year (YoY) percentage change in aggregated SG&amp;A across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**EbitGrowth** | **double?** | 1-year (YoY) percentage change in aggregated earnings before interest and taxes (EBIT) across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**EbitdaGrowth** | **double?** | 1-year (YoY) percentage change in aggregated earnings before interest, taxes, depreciation, and amortization (EBITDA) across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**PreTaxIncomeGrowth** | **double?** | 1-year (YoY) percentage change in aggregated pre-tax income across a defined universe (e.g., index, sector,portfolio etc). The value represents a rate and is expressed in percentage points. | [optional] 
**GrossMargin** | **double?** | Gross Margin | [optional] 
**EbitMargin** | **double?** | EBIT Margin | [optional] 
**EbitdaMargin** | **double?** | EBITDA Margin | [optional] 
**PretaxMargin** | **double?** | Pre Tax Margin | [optional] 
**NetMargin** | **double?** | Net Margin | [optional] 
**FreeCashFlowMargin** | **double?** | Free Cash Flow Margin | [optional] 
**PriceToEarnings** | **double?** | Price to Earnings Ratio | [optional] 
**PriceToEarningsExclNegatives** | **double?** | Price to Earnings Excl Negatives Ratio | [optional] 
**PriceToSales** | **double?** | Price to Sales Ratio | [optional] 
**PriceToBookValue** | **double?** | Price to Book Value Ratio | [optional] 
**PriceToCashFlow** | **double?** | Price to Cash Flow Ratio | [optional] 
**PriceToCashFlowExclNegatives** | **double?** | Price to Cash Flow Excl Negatives | [optional] 
**PriceToFreeCashFlow** | **double?** | Price to Free Cash Flow Ratio | [optional] 
**EnterpriseValueEbit** | **double?** | Enterprise Value EBIT | [optional] 
**EnterpriseValueEbitda** | **double?** | Enterprise Value EBITDA | [optional] 
**EnterpriseValueSales** | **double?** | Enterprise Value Sales | [optional] 
**ReturnOnEquity** | **double?** | Return on Equity | [optional] 
**DividendYield** | **double?** | Dividend Yield | [optional] 
**EpsRecurrentEarnings** | **double?** | EPS Recurrent Earnings | [optional] 
**SalesPerShare** | **double?** | Sales Per Share | [optional] 
**DividendsPerShare** | **double?** | Dividends Per Share | [optional] 
**FreeCashFlowPerShare** | **double?** | Free CashFlow Per Share | [optional] 
**BookValuePerShare** | **double?** | Book Value Per Share | [optional] 
**CashFlowPerShare** | **double?** | Cash Flow Per Share | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

