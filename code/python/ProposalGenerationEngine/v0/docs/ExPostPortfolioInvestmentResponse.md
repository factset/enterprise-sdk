# ExPostPortfolioInvestmentResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | the unique id of the investment - e.g. FactSet id | 
**weight** | **float** | the weight of the investment in hte portfolio | 
**sales_charge** | **float** | A representation of a portfolio constituent (investment) | [optional] 
**transaction_rules** | [**[TransactionRule]**](TransactionRule.md) | rules for adding/substracting amount from the portfolio at given periods | [optional] 
**security_details** | [**Investment**](Investment.md) |  | [optional] 
**stats** | [**TimeWindowStats**](TimeWindowStats.md) |  | [optional] 
**udfs** | **{str: (bool, date, datetime, dict, float, int, list, str, none_type)}** | portfolio UDFs map | [optional] 
**periods** | [**ExPostPeriodStats**](ExPostPeriodStats.md) |  | [optional] 
**backfill_data** | [**{str: (BackfillData,)}**](BackfillData.md) | a map from time window to backfill statistics | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


