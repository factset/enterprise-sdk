# FactSet.SDK.ProposalGenerationEngine.Model.TransactionRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** |  | [optional] 
**Amount** | **decimal** | absolute value in case the type is cash or percentage in the other 2 cases | [optional] 
**AmountType** | **string** |  | [optional] 
**AmountGrowth** | **decimal** | apply growth rate to the amount for each period expressed in percentage | [optional] 
**AmountGrowthType** | **string** |  | [optional] 
**AmountGrowthFrequency** | **int** |  | [optional] 
**AllowPartialAmount** | **bool** |  | [optional] [default to false]
**StartDate** | **DateTime** | initial date when the rule is applied | [optional] 
**EndDate** | **DateTime** | last date when the rule is applied | [optional] 
**Frequency** | **decimal** | monthly - 12, yearly - 1, quarterly - 4; only once &#x3D; endPeriod should be equal to startPeriod | [optional] 
**FrequencyAlignment** | **decimal** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

