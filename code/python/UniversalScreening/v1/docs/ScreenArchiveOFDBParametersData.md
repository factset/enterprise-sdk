# ScreenArchiveOFDBParametersData

Object containing archive request payload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**screen_name** | **str** | File path to a valid screen | 
**archive_options** | [**ScreenArchiveOFDBParametersDataArchiveOptions**](ScreenArchiveOFDBParametersDataArchiveOptions.md) |  | [optional] 
**backtest_date** | **str** | Specifies the backtest date used when running the screen, replacing the backtest date saved in the screen, can be written in YYYYMMDD, MM/DD/YYYY or relative (0, -1, 0/-1/0) format. Requires addtional access to use. | [optional] 
**global_variables_map** | **{str: (str,)}** | Modifies existing global variables for this calculation request, temporarily adds them if they do not already exist Variable names can only contain the characters A-Z (case insensitive). Variable values must be non-empty. | [optional] 
**legacy_universe_type** | **str** |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


