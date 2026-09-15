# FactSet.SDK.ProposalGenerationEngine.Model.RollingSeries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | **string** |  | [optional] 
**RollingTimeWindow** | **int** |  | [optional] 
**AsOfDate** | **string** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client | [optional] 
**TimeWindow** | [**Dictionary&lt;string, RollingSeriesPerTimeWindow&gt;**](RollingSeriesPerTimeWindow.md) | a map from time window to rolling series. The keys correspond to the time windows, specified in data.settings.timeWindow property in the request | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

