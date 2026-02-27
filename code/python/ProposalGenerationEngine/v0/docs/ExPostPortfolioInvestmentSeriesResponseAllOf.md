# ExPostPortfolioInvestmentSeriesResponseAllOf

when the settings.periods property is provided in the request then the periods property is populated instead of stats property

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**security_details** | [**Investment**](Investment.md) |  | [optional] 
**series** | [**TimeWindowSeries**](TimeWindowSeries.md) |  | [optional] 
**periods** | [**PeriodSeries**](PeriodSeries.md) |  | [optional] 
**backfill_data** | [**{str: (BackfillData,)}**](BackfillData.md) | a map from time window to backfill statistics | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


