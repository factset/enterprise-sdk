# FactSet.SDK.FactSetFunds.Model.Margins
Financial margin metrics including gross, EBIT, EBITDA, pretax, net, and free cash flow margins

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**KeyItemsType** | **MarginsType** |  | 
**GrossMargin** | **double?** | Gross Margin | [optional] 
**EbitMargin** | **double?** | EBIT Margin | [optional] 
**EbitdaMargin** | **double?** | EBITDA Margin | [optional] 
**PretaxMargin** | **double?** | Pre Tax Margin | [optional] 
**NetMargin** | **double?** | Net Margin | [optional] 
**FreeCashFlowMargin** | **double?** | Free Cash Flow Margin | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

