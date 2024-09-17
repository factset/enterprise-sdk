# HitRateModelAnalytics


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **float** | The total number of positions used in the denominator of the hit rate calculation. | [optional] 
**losers** | [**HitRateModelAnalyticsLosers**](HitRateModelAnalyticsLosers.md) |  | [optional] 
**win_loss_ratio** | **float** | The win/loss ratio computes the relative benefit of winners versus losers. A win/loss ratio of greater than 100% indicates that the average winner generated greater benefit (i.e., positive contribution) then was lost by the average loser (i.e., negative contribution), and vice versa. This ratio may be examined at the portfolio level, or by classification. | [optional] 
**winners** | [**HitRateModelAnalyticsWinners**](HitRateModelAnalyticsWinners.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


