# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.NextStepItem
A single action item associated with the query response. The current supported actions are as below: * OpenUrl: Contains a URL to open relevant supporting content in the FactSet Workstation or other FactSet applications * Download: Contains a file ID to download a file associated with the response 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | **string** | Type of action | 
**Name** | **string** | Name of the download type | 
**Label** | **string** | Label associated with the download | 
**Category** | **string** | Category of associated file | [optional] 
**Url** | [**OpenUrlUrl**](OpenUrlUrl.md) |  | 
**Location** | **string** | Endpoint where file can be found | [optional] 
**FileId** | **Guid** | Id of associated file | [optional] 
**ContentType** | **string** | ContentType of associated file | [optional] 
**FileName** | **string** | Name of associated file | [optional] 
**Error** | [**FileGenerationErrorObject**](FileGenerationErrorObject.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

