# universalscreening.GroupingInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupingState** | **String** | Controls whether security data will be displayed or suppressed in the report output. The argument option specified will overwrite any group state saved in the screen. SHOW_ALL_GROUPS - No security data is displayed. Only group titles, group statistics, and overall statistics are visible. COLLAPSE_ALL - Only the highest-level group and overall statistics are visible. EXPAND_ALL - Security data is displayed, along with all group titles, group statistics, and overall statistics. | [optional] 
**customGrouping** | **[String]** | Specifies parameters to be used as the grouping for the securities in your screen. The grouping specified will replace all groupings saved in the screen. Limit of 7 parameters. | [optional] 



## Enum: GroupingStateEnum


* `SHOW_ALL_GROUPS` (value: `"SHOW_ALL_GROUPS"`)

* `COLLAPSE_ALL` (value: `"COLLAPSE_ALL"`)

* `EXPAND_ALL` (value: `"EXPAND_ALL"`)




