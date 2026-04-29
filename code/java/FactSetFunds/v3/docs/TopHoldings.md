

# TopHoldings

Fund top holdings including names, tickers, weights, and total number of holdings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**date** | **LocalDate** | The date in YYYY-MM-DD format. |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**numberOfHoldings** | **Integer** | Total number of holdings considered. |  [optional]
**holdingsPercentWeight** | **Double** | Combined weight of top holdings. |  [optional]
**holdings** | [**java.util.List&lt;Holdings&gt;**](Holdings.md) | List of top holdings with name, ticker, and weight. |  [optional]


## Implemented Interfaces

* Serializable


