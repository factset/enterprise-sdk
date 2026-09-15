

# RollingStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** |  |  [optional]
**asOfDate** | **String** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client |  [optional]
**timeWindow** | [**Map&lt;String, RollingStatsPerTimeWindow&gt;**](RollingStatsPerTimeWindow.md) | a map from time window to rolling stats. The keys correspond to the time windows, specified in data.settings.timeWindow property in the request |  [optional]
**rollingTimeWindow** | **Integer** |  |  [optional]


## Implemented Interfaces

* Serializable


