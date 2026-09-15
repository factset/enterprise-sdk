# FactSet.SDK.ProposalGenerationEngine.Model.RollingStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | **string** |  | [optional] 
**AsOfDate** | **string** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client | [optional] 
**TimeWindow** | [**Dictionary&lt;string, RollingStatsPerTimeWindow&gt;**](RollingStatsPerTimeWindow.md) | a map from time window to rolling stats. The keys correspond to the time windows, specified in data.settings.timeWindow property in the request | [optional] 
**RollingTimeWindow** | **int** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

