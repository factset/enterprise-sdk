# FactSet.SDK.VectorData.Model.IdsDocumentSearchResult
A single search result returned by the document search endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChunkId** | **string** | Unique identifier for the document chunk. | [optional] 
**DocumentID** | **string** | Unique identifier for the source document. | [optional] 
**SimilarityScore** | **double** | Similarity score between the query and this result (0-1). | [optional] 
**Content** | **string** | Text content of the document chunk. | [optional] 
**DocumentLink** | **string** | Secure HTTPS link to the full source document. | [optional] 
**Source** | **string** | Data source identifier. | [optional] 
**TextLength** | **int?** | Character length of the content field. | [optional] 
**FileName** | **string** | name of the file. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

