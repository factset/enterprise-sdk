# proposalgenerationengine.ExPostPortfolioInvestmentResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**weight** | **Number** | the weight of the investment in hte portfolio | [optional] 
**salesCharge** | **Number** | A representation of a portfolio constituent (investment) | [optional] 
**transactionRules** | [**[TransactionRule]**](TransactionRule.md) | rules for adding/substracting amount from the portfolio at given periods | [optional] 
**securityDetails** | [**Investment**](Investment.md) |  | [optional] 
**stats** | [**TimeWindowStats**](TimeWindowStats.md) |  | [optional] 
**udfs** | **Object** | portfolio UDFs map | [optional] 
**periods** | [**[ExPostPeriodStats]**](ExPostPeriodStats.md) |  | [optional] 
**backfillData** | [**{String: BackfillData}**](BackfillData.md) | a map from time window to backfill statistics | [optional] 


