# FactSet.SDK.VectorData.Model.EDGARVectorResult
Vector result from EDGAR filing sources with vector embeddings and filing-specific metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VectorId** | **string** | Unique vector identifier associated with the document. | [optional] 
**Content** | **string** | The text content of the document chunk. | [optional] 
**StoryLink** | **string** | Secure HTTPS link to the full document. | [optional] 
**ViewUrl** | **string** | Secure HTTPS Web-friendly format link rendered in a browser. | [optional] 
**StoryDateTime** | **DateTime?** | Date associated with the story. | [optional] 
**Headline** | **string** | Headline of the story | [optional] 
**DocumentID** | **string** | Unique identifier for the document. | [optional] 
**Ids** | **List&lt;string&gt;** | List of related IDs. | [optional] 
**TextLength** | **int?** | Character length of the content. | [optional] 
**TokenCount** | **int?** | Token count of the content. | [optional] 
**Error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 
**Source** | **EDGARVector** |  | 
**Vector** | **List&lt;float&gt;** | Vector embedding array. Omitted when trimmed&#x3D;true. | [optional] 
**Trimmed** | **bool** | Indicates whether vector embeddings are included. | [optional] 
**FormType** | **string** | Document form type (e.g., 10-K, 10-Q, 8-K). | [optional] 
**SectionName** | **string** | Name of the filing section. | [optional] 
**SectionNumber** | **string** | Section number in the filing. | [optional] 
**DocType** | **string** | Type of document chunk. | [optional] 
**TableText** | **string** | Full table text if chunk contains tabular data. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

