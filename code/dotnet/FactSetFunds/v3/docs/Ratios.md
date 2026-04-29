# FactSet.SDK.FactSetFunds.Model.Ratios
Financial ratio metrics including P/E, P/S, P/B, P/CF, enterprise value ratios, ROE, and dividend yield

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**KeyItemsType** | **RatiosType** |  | 
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

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

