

# ExPostPortfolioInvestmentResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**weight** | **BigDecimal** | the weight of the investment in hte portfolio |  [optional]
**salesCharge** | **BigDecimal** | A representation of a portfolio constituent (investment) |  [optional]
**transactionRules** | [**java.util.List&lt;TransactionRule&gt;**](TransactionRule.md) | rules for adding/substracting amount from the portfolio at given periods |  [optional]
**securityDetails** | [**Investment**](Investment.md) |  |  [optional]
**stats** | [**TimeWindowStats**](TimeWindowStats.md) |  |  [optional]
**udfs** | **Object** | portfolio UDFs map |  [optional]
**periods** | [**java.util.List&lt;ExPostPeriodStats&gt;**](ExPostPeriodStats.md) |  |  [optional]
**backfillData** | [**Map&lt;String, BackfillData&gt;**](BackfillData.md) | a map from time window to backfill statistics |  [optional]


## Implemented Interfaces

* Serializable


