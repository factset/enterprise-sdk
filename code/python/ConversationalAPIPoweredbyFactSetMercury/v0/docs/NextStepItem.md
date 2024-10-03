# NextStepItem

Directives to a front-end application to perform a certain task i.e. open a FactSet application or component, download an Excel file. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | Type of action | [optional]  if omitted the server will use the default value of "Download"
**name** | **str, none_type** | Name of the download type | [optional] 
**label** | **str** | Label associated with the download | [optional] 
**category** | **str, none_type** | Category of associated file | [optional] 
**url** | [**OpenUrlUrl**](OpenUrlUrl.md) |  | [optional] 
**location** | **str** | Endpoint where file can be found | [optional]  if omitted the server will use the default value of "/download/file"
**file_id** | **str** | Id of associated file | [optional] 
**content_type** | **str** | ContentType of associated file | [optional] 
**file_name** | **str** | Name of associated file | [optional] 
**error_message** | **str** | Error message detailing the error in generating the downloadable file | [optional] 
**error** | **bool** | Boolean representing if there was an error generating the downloadable file | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


