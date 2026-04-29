

# PerShare

Per-share financial metrics including EPS, sales per share, dividends per share, and cash flow per share

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**date** | **LocalDate** | The date in YYYY-MM-DD format. |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**keyItemsType** | **PerShareType** |  | 
**epsRecurrentEarnings** | **Double** | EPS Recurrent Earnings |  [optional]
**salesPerShare** | **Double** | Sales Per Share |  [optional]
**dividendsPerShare** | **Double** | Dividends Per Share |  [optional]
**freeCashFlowPerShare** | **Double** | Free CashFlow Per Share |  [optional]
**bookValuePerShare** | **Double** | Book Value Per Share |  [optional]
**cashFlowPerShare** | **Double** | Cash Flow Per Share |  [optional]


## Implemented Interfaces

* Serializable


