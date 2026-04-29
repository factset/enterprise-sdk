

# Ratios

Financial ratio metrics including P/E, P/S, P/B, P/CF, enterprise value ratios, ROE, and dividend yield

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**date** | **LocalDate** | The date in YYYY-MM-DD format. |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**keyItemsType** | **RatiosType** |  | 
**priceToEarnings** | **Double** | Price to Earnings Ratio |  [optional]
**priceToEarningsExclNegatives** | **Double** | Price to Earnings Excl Negatives Ratio |  [optional]
**priceToSales** | **Double** | Price to Sales Ratio |  [optional]
**priceToBookValue** | **Double** | Price to Book Value Ratio |  [optional]
**priceToCashFlow** | **Double** | Price to Cash Flow Ratio |  [optional]
**priceToCashFlowExclNegatives** | **Double** | Price to Cash Flow Excl Negatives |  [optional]
**priceToFreeCashFlow** | **Double** | Price to Free Cash Flow Ratio |  [optional]
**enterpriseValueEbit** | **Double** | Enterprise Value EBIT |  [optional]
**enterpriseValueEbitda** | **Double** | Enterprise Value EBITDA |  [optional]
**enterpriseValueSales** | **Double** | Enterprise Value Sales |  [optional]
**returnOnEquity** | **Double** | Return on Equity |  [optional]
**dividendYield** | **Double** | Dividend Yield |  [optional]


## Implemented Interfaces

* Serializable


