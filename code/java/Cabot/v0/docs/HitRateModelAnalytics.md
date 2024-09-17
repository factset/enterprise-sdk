

# HitRateModelAnalytics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **BigDecimal** | The total number of positions used in the denominator of the hit rate calculation. |  [optional]
**losers** | [**HitRateModelAnalyticsLosers**](HitRateModelAnalyticsLosers.md) |  |  [optional]
**winLossRatio** | **BigDecimal** | The win/loss ratio computes the relative benefit of winners versus losers. A win/loss ratio of greater than 100% indicates that the average winner generated greater benefit (i.e., positive contribution) then was lost by the average loser (i.e., negative contribution), and vice versa. This ratio may be examined at the portfolio level, or by classification. |  [optional]
**winners** | [**HitRateModelAnalyticsWinners**](HitRateModelAnalyticsWinners.md) |  |  [optional]


## Implemented Interfaces

* Serializable


