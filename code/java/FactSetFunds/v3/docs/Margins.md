

# Margins

Financial margin metrics including gross, EBIT, EBITDA, pretax, net, and free cash flow margins

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**date** | **LocalDate** | The date in YYYY-MM-DD format. |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**keyItemsType** | **MarginsType** |  | 
**grossMargin** | **Double** | Gross Margin |  [optional]
**ebitMargin** | **Double** | EBIT Margin |  [optional]
**ebitdaMargin** | **Double** | EBITDA Margin |  [optional]
**pretaxMargin** | **Double** | Pre Tax Margin |  [optional]
**netMargin** | **Double** | Net Margin |  [optional]
**freeCashFlowMargin** | **Double** | Free Cash Flow Margin |  [optional]


## Implemented Interfaces

* Serializable


