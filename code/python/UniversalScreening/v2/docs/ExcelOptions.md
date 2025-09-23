# ExcelOptions

Options applied to Excel output.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_summary** | **bool, none_type** | Specifies that a summary will be generated instead of the full results output. Only the \&quot;applyFilters\&quot; option will have any affect if this is true. By default this option is set to false. | [optional]  if omitted the server will use the default value of False
**apply_saved_na_formatting** | **bool, none_type** | Specifies that the NA formatting specified in the column format menu will be used to indicate unavailable data in your output. By default, this option is set to false, which means \&quot;NA\&quot; will be used to indicate the data that is not available. | [optional]  if omitted the server will use the default value of False
**apply_filters** | **bool, none_type** | Specifies whether the filters present in the screen should be applied to the output. By default, this option is set to false, which means that filters will not be applied and all securities passing the screen will be included in the output. | [optional]  if omitted the server will use the default value of False
**apply_alternate_row_shading** | **bool, none_type** | Specifies whether every other row shading should be applied to the output. By default, this option is set to false, which means that every other row shading will not be included in the download. | [optional]  if omitted the server will use the default value of False
**apply_excel_outlining** | **bool, none_type** | Specifies that the Download Outline feature will be used when putting the screen&#39;s groupings into an Excel spreadsheet. By default, this option is set to false. | [optional]  if omitted the server will use the default value of False
**condense_tabs_to_one_sheet** | **bool, none_type** | Specifies whether the report will be downloaded into a single spreadsheet, or into separate sheets following the tabs in the report. By default, this option is set to false. | [optional]  if omitted the server will use the default value of False
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


