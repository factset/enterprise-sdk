# FactSet.SDK.VectorData.Model.NewsSearchResult
Search result from news sources with minimal additional metadata.

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
**Source** | **NewsSearch** |  | 
**SimilarityScore** | **decimal** | Score indicating the similarity between the query and the result (0-1). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

