# GroupingInfo

Options for setting and displaying groups

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grouping_state** | **str, none_type** | Controls whether security data will be displayed or suppressed in the report output. The argument option specified will overwrite any group state saved in the screen. SHOW_ALL_GROUPS - No security data is displayed. Only group titles, group statistics, and overall statistics are visible. COLLAPSE_ALL - Only the highest-level group and overall statistics are visible. EXPAND_ALL - Security data is displayed, along with all group titles, group statistics, and overall statistics. | [optional] 
**custom_grouping** | **[str]** | Specifies parameters to be used as the grouping for the securities in your screen. The grouping specified will replace all groupings saved in the screen. Limit of 7 parameters. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


