# NextStepItem

A single action item associated with the query response. The current supported actions are as below: * OpenUrl: Contains a URL to open relevant supporting content in the FactSet Workstation or other FactSet applications * Download: Contains a file ID to download a file associated with the response 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | Type of action | defaults to "Download"
**category** | **str, none_type** | Category of associated file | [optional] 
**location** | **str** | Endpoint where file can be found | [optional]  if omitted the server will use the default value of "/download/file"
**file_id** | **str** | Id of associated file | [optional] 
**content_type** | **str** | ContentType of associated file | [optional]  if omitted the server will use the default value of "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
**file_name** | **str** | Name of associated file | [optional] 
**name** | **str, none_type** | Name of the download type | [optional] 
**label** | **str** | Label associated with the download | [optional] 
**url** | [**OpenUrlUrl**](OpenUrlUrl.md) |  | [optional] 
**error** | [**FileGenerationErrorObject**](FileGenerationErrorObject.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


