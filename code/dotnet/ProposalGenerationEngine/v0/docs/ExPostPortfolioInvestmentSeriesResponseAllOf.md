# FactSet.SDK.ProposalGenerationEngine.Model.ExPostPortfolioInvestmentSeriesResponseAllOf
when the settings.periods property is provided in the request then the periods property is populated instead of stats property

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SecurityDetails** | [**Investment**](Investment.md) |  | [optional] 
**Series** | [**TimeWindowSeries**](TimeWindowSeries.md) |  | [optional] 
**Periods** | [**PeriodSeries**](PeriodSeries.md) |  | [optional] 
**BackfillData** | [**Dictionary&lt;string, BackfillData&gt;**](BackfillData.md) | a map from time window to backfill statistics | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

