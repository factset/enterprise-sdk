# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.Download
Action containing a file ID to download a file associated with the response. Files will be available for download from the `/download/file` endpoint for 24 hours after generation.  If there was an error while generating the downloadable file, it will be detailed in the `error` field for the specific download action. Please reach out to your FactSet Support Team representative if you are seeing this error persistently.  

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | **string** | Type of action | 
**Name** | **string** | Name of the download type | 
**Label** | **string** | Label associated with the download | 
**Category** | **string** | Category of associated file | [optional] 
**Location** | **string** | Endpoint where file can be found | [optional] 
**FileId** | **Guid** | Id of associated file | [optional] 
**ContentType** | **string** | ContentType of associated file | [optional] 
**FileName** | **string** | Name of associated file | [optional] 
**Error** | [**FileGenerationErrorObject**](FileGenerationErrorObject.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

