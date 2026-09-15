# proposalgenerationengine.TimeWindowStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **String** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client | [optional] 
**timeWindow** | [**{String: EntityStats}**](EntityStats.md) | a map from time window to ex-post stats. The keys correspond to the time windows, specified in data.settings.timeWindow property in the request | [optional] 
**generic** | [**TimeWindowStatsGeneric**](TimeWindowStatsGeneric.md) |  | [optional] 
**currency** | **String** |  | [optional] 


