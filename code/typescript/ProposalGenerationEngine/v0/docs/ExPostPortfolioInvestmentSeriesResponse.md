# proposalgenerationengine.ExPostPortfolioInvestmentSeriesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the unique id of the investment - e.g. FactSet id | 
**weight** | **Number** | the weight of the investment in hte portfolio | 
**salesCharge** | **Number** | A representation of a portfolio constituent (investment) | [optional] 
**transactionRules** | [**[TransactionRule]**](TransactionRule.md) | rules for adding/substracting amount from the portfolio at given periods | [optional] 
**securityDetails** | [**Investment**](Investment.md) |  | [optional] 
**series** | [**TimeWindowSeries**](TimeWindowSeries.md) |  | [optional] 
**periods** | [**PeriodSeries**](PeriodSeries.md) |  | [optional] 
**backfillData** | [**{String: BackfillData}**](BackfillData.md) | a map from time window to backfill statistics | [optional] 


