# FactSet.SDK.FactSetFunds.Model.RateRisk
Interest rate risk analytics including effective duration and weighted average life (WAL) with breakdown

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**RiskType** | **RateRiskType** |  | 
**WeightedAverageLifeBreakdown** | [**List&lt;WAL&gt;**](WAL.md) | The Weighted Average Life(WAL)  Breakdown for the fund. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

