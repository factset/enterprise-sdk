# ScreenExportParametersData

Object containing screen and export data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**screen_name** | **str** | File path to a valid screen | 
**file** | **bool, date, datetime, dict, float, int, list, str, none_type** | Data required for file export. | 
**backtest_date** | **str, none_type** | Specifies the backtest date used when running the screen, replacing the backtest date saved in the screen, can be written in YYYYMMDD, MM/DD/YYYY or relative (0, -1, 0/-1/0) format. Requires additional access to use. | [optional] 
**global_variables_map** | **{str: (str,)}** | Modifies existing global variables for this calculation request, temporarily adds them if they do not already exist Variable names can only contain the characters A-Z (case insensitive). Variable values must be non-empty. | [optional] 
**legacy_universe_type** | **str, none_type** | Universe type to open a Screen 1.0 document (.usscreen) with\\ &#x60;equity&#x60;: Uses the equity universe from the Screen 1.0 document.\\ &#x60;debt&#x60;: Uses the debt universe from the Screen 1.0 document.\\ &#x60;fund&#x60;: Uses the fund universe from the Screen 1.0 document. | [optional]  if omitted the server will use the default value of "equity"
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


