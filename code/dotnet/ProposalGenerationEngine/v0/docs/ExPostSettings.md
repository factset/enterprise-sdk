# FactSet.SDK.ProposalGenerationEngine.Model.ExPostSettings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AsOfDate** | **string** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client | [optional] 
**ReturnsPreferences** | **string** | code of preconfigured analysis settings&lt;br&gt; Note: the setup of these settings is done by PGE administrator | [optional] 
**ValidatePortfolio** | **bool** | a flag controlling whether to perform validations on the portfolio and its holdings (e.g. whether they have valid historical data). If set to false it is possible that call might not return user-friendly error message, however the call will be faster | [optional] [default to false]
**Levels** | **List&lt;string&gt;** |  | [optional] 
**ConfidenceLevels** | **List&lt;decimal&gt;** |  | [optional] 
**ReportingFrequency** | **decimal** |  | [optional] 
**TimeWindows** | **List&lt;string&gt;** |  | [optional] 
**Periods** | [**List&lt;Period&gt;**](Period.md) |  | [optional] 
**ReportingFrequencyAlignment** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

