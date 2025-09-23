# FactSet.SDK.UniversalScreening.Model.ScreenCalcParametersData
Object containing screen data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BacktestDate** | **string** | Specifies the backtest date used when running the screen, replacing the backtest date saved in the screen, can be written in YYYYMMDD, MM/DD/YYYY or relative (0, -1, 0/-1/0) format. Requires additional access to use. | [optional] 
**GlobalVariablesMap** | **Dictionary&lt;string, string&gt;** | Modifies existing global variables for this calculation request, temporarily adds them if they do not already exist Variable names can only contain the characters A-Z (case insensitive). Variable values must be non-empty. | [optional] 
**LegacyUniverseType** | **string** | Universe type to open a Screen 1.0 document with\\ &#x60;equity&#x60;: Uses the equity universe from the Screen 1.0 document.\\ &#x60;debt&#x60;: Uses the debt universe from the Screen 1.0 document.\\ &#x60;fund&#x60;: Uses the fund universe from the Screen 1.0 document. | [optional] [default to LegacyUniverseTypeEnum.Equity]
**ScreenName** | **string** | File path to a valid screen | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

