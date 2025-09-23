# DelimitedOptions

Options applied to delimited output.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_database** | **bool** | Output will be returned in a legacy database format.  Will be ignored if file type of \&quot;text/csv\&quot; is requested.  Default is false.  Additional access is required for this format. | [optional]  if omitted the server will use the default value of False
**delimiter** | **str, none_type** | Specifies the delimiter used between each data point.  A comma is the default delimiter; if this argument is not specified, a comma delimiter will be used.  If the file type of \&quot;text/csv\&quot; is requested, this field will be ignored and a comma will be used. | [optional]  if omitted the server will use the default value of ","
**hide_header_rows** | **bool, none_type** | Specifies whether column column headers should be included in the output. By default, the option is set to true. | [optional]  if omitted the server will use the default value of True
**apply_quoted_strings** | **bool, none_type** | Specifies whether textual data should have quotes around it (i.e., true will include quotes around textual values). By default, the option is set to true. | [optional]  if omitted the server will use the default value of True
**apply_saved_na_formatting** | **bool, none_type** | Specifies that the NA formatting specified in the column format menu will be used to indicate unavailable data in your output. By default, this option is set to false, which means \&quot;NA\&quot; will be used to indicate the data that is not available. | [optional]  if omitted the server will use the default value of False
**apply_filters** | **bool, none_type** | Specifies whether the filters present in the screen should be applied to the output. By default, this option is set to false, which means that filters will not be applied and all securities passing the screen will be included in the output. | [optional]  if omitted the server will use the default value of False
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


