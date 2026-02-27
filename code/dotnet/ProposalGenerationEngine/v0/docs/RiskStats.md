# FactSet.SDK.ProposalGenerationEngine.Model.RiskStats
Risk statistics holder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AnnStDev** | **decimal** | Annualized Standard deviation | [optional] 
**AnnLossStDev** | **decimal** | Annualized Loss Standard deviation | [optional] 
**Etl** | **Dictionary&lt;string, decimal&gt;** | a map from confidence level (e.g. \&quot;95%\&quot;) to a numeric value | [optional] 
**StDev** | **decimal** | Standard deviation | [optional] 
**Skewness** | **decimal** | Skewness | [optional] 
**ExcessKurtosis** | **decimal** | ExcessKurtosis | [optional] 
**Var** | **Dictionary&lt;string, decimal&gt;** | a map from confidence level (e.g. \&quot;95%\&quot;) to a numeric value | [optional] 
**PositiveReturnsRatio** | **decimal** | Positive Returns Ratio | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

