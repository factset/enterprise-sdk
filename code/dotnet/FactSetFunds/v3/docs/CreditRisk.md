# FactSet.SDK.FactSetFunds.Model.CreditRisk
Credit risk analytics including option-adjusted spread (OAS) and its breakdown distribution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**RiskType** | **CreditRiskType** |  | 
**OptionAdjustedSpreadBreakdown** | [**List&lt;OAS&gt;**](OAS.md) | The Option Adjusted Spread Breakdown for the fund. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

