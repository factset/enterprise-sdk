# factsetfunds.Margins

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**date** | **Date** | The date in YYYY-MM-DD format. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**keyItemsType** | [**MarginsType**](MarginsType.md) |  | 
**grossMargin** | **Number** | Gross Margin | [optional] 
**ebitMargin** | **Number** | EBIT Margin | [optional] 
**ebitdaMargin** | **Number** | EBITDA Margin | [optional] 
**pretaxMargin** | **Number** | Pre Tax Margin | [optional] 
**netMargin** | **Number** | Net Margin | [optional] 
**freeCashFlowMargin** | **Number** | Free Cash Flow Margin | [optional] 


