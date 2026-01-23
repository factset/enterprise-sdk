# PdfOptions

Options applied to PDF output.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apply_alternate_row_shading** | **bool, none_type** | Specifies whether every other row shading should be applied to the output. By default, this option is set to false, which means that every other row shading will not be included in the download. | [optional]  if omitted the server will use the default value of False
**apply_filters** | **bool, none_type** | Specifies whether the filters present in the screen should be applied to the output. By default, this option is set to false, which means that filters will not be applied and all securities passing the screen will be included in the output. | [optional]  if omitted the server will use the default value of False
**apply_text_wrapping** | **bool, none_type** | Specifies that the text in cells be wrapped if there are more characters than can fit in the space available. By default, this option is set to true. | [optional]  if omitted the server will use the default value of True
**orientation_landscape** | **bool, none_type** | Specifies the page orientation of the downloaded file. Value true for Landscape, false for Portrait. By default this is set to false. | [optional]  if omitted the server will use the default value of False
**custom_title** | **str, none_type** | Sets a custom title for the download. | [optional] 
**custom_subtitle** | **str, none_type** | Sets a custom subtitle for the download. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


