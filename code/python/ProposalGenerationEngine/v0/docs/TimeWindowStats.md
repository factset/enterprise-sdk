# TimeWindowStats


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**as_of_date** | **str** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client | [optional] 
**time_window** | [**{str: (EntityStats,)}**](EntityStats.md) | a map from time window to ex-post stats. The keys correspond to the time windows, specified in data.settings.timeWindow property in the request | [optional] 
**generic** | [**TimeWindowStatsGeneric**](TimeWindowStatsGeneric.md) |  | [optional] 
**currency** | **str** |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


