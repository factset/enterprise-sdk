# FactSet.SDK.ProposalGenerationEngine.Model.ExPostPortfolioInvestmentSeriesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | the unique id of the investment - e.g. FactSet id | 
**Weight** | **decimal** | the weight of the investment in hte portfolio | 
**SalesCharge** | **decimal** | A representation of a portfolio constituent (investment) | [optional] 
**TransactionRules** | [**List&lt;TransactionRule&gt;**](TransactionRule.md) | rules for adding/substracting amount from the portfolio at given periods | [optional] 
**SecurityDetails** | [**Investment**](Investment.md) |  | [optional] 
**Series** | [**TimeWindowSeries**](TimeWindowSeries.md) |  | [optional] 
**Periods** | [**PeriodSeries**](PeriodSeries.md) |  | [optional] 
**BackfillData** | [**Dictionary&lt;string, BackfillData&gt;**](BackfillData.md) | a map from time window to backfill statistics | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

