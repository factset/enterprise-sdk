

# ExPostPortfolioInvestmentResponseAllOf

when the settings.periods property is provided in the request then the periods property is populated instead of stats property

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**securityDetails** | [**Investment**](Investment.md) |  |  [optional]
**stats** | [**TimeWindowStats**](TimeWindowStats.md) |  |  [optional]
**udfs** | **Object** | portfolio UDFs map |  [optional]
**periods** | [**ExPostPeriodStats**](ExPostPeriodStats.md) |  |  [optional]
**backfillData** | [**Map&lt;String, BackfillData&gt;**](BackfillData.md) | a map from time window to backfill statistics |  [optional]


## Implemented Interfaces

* Serializable


