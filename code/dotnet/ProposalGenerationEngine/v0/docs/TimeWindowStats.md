# FactSet.SDK.ProposalGenerationEngine.Model.TimeWindowStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AsOfDate** | **string** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client | [optional] 
**TimeWindow** | [**Dictionary&lt;string, EntityStats&gt;**](EntityStats.md) | a map from time window to ex-post stats. The keys correspond to the time windows, specified in data.settings.timeWindow property in the request | [optional] 
**Generic** | [**TimeWindowStatsGeneric**](TimeWindowStatsGeneric.md) |  | [optional] 
**Currency** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

