# FactSet.SDK.EventsandTranscripts.Model.TranscriptsByIdsResponse
The data being returned in the search response are search results, and under each search result, the documents are organized by requested identifiers. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TranscriptResponseType** | **string** | The data being returned in the search response based on the requested IDs. | [optional] 
**RequestId** | **string** | The requested identifier associated with this group of documents. | 
**Documents** | [**List&lt;DocumentResult&gt;**](DocumentResult.md) | Contains list of documents | [optional] 
**Error** | [**InvalidIdErrorData**](InvalidIdErrorData.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

