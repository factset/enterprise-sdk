# ExPostStatsCorrelationsSettings


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**as_of_date** | **str** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client | [optional] 
**returns_preferences** | **str** | code of preconfigured analysis settings&lt;br&gt; Note: the setup of these settings is done by PGE administrator | [optional] 
**validate_portfolio** | **bool** | a flag controlling whether to perform validations on the portfolio and its holdings (e.g. whether they have valid historical data). If set to false it is possible that call might not return user-friendly error message, however the call will be faster | [optional]  if omitted the server will use the default value of False
**time_windows** | **[str]** |  | [optional] 
**stats** | **[str]** |  | [optional] 
**holdings_limit** | **int** |  | [optional] 
**fund_correlations_only** | **bool** |  | [optional] 
**show_benchmark** | **bool** |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


