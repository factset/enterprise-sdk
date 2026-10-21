# Download

Action containing a file ID to download a file associated with the response. Files will be available for download from the `/download/file` endpoint for 24 hours after generation.  If there was an error while generating the downloadable file, it will be detailed in the `error` field for the specific download action. Please reach out to your FactSet Support Team representative if you are seeing this error persistently.  

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str, none_type** | Name of the download type | 
**label** | **str** | Label associated with the download | 
**error** | [**FileGenerationErrorObject**](FileGenerationErrorObject.md) |  | 
**action** | **str** | Type of action | defaults to "Download"
**category** | **str, none_type** | Category of associated file | [optional] 
**location** | **str** | Endpoint where file can be found | [optional]  if omitted the server will use the default value of "/download/file"
**file_id** | **str** | Id of associated file | [optional] 
**content_type** | **str** | ContentType of associated file | [optional]  if omitted the server will use the default value of "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
**file_name** | **str** | Name of associated file | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


