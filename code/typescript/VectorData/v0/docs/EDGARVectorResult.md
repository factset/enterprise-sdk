# vectordata.EDGARVectorResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vectorId** | **String** | Unique vector identifier associated with the document. | [optional] 
**content** | **String** | The text content of the document chunk. | [optional] 
**storyLink** | **String** | Secure HTTPS link to the full document. | [optional] 
**viewUrl** | **String** | Secure HTTPS Web-friendly format link rendered in a browser. | [optional] 
**storyDateTime** | **Date** | Date associated with the story. | [optional] 
**headline** | **String** | Headline of the story | [optional] 
**documentID** | **String** | Unique identifier for the document. | [optional] 
**ids** | **[String]** | List of related IDs. | [optional] 
**textLength** | **Number** | Character length of the content. | [optional] 
**tokenCount** | **Number** | Token count of the content. | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 
**source** | [**EDGARVector**](EDGARVector.md) |  | 
**vector** | **[Number]** | Vector embedding array. Omitted when trimmed&#x3D;true. | [optional] 
**trimmed** | **Boolean** | Indicates whether vector embeddings are included. | [optional] 
**formType** | **String** | Document form type (e.g., 10-K, 10-Q, 8-K). | [optional] 
**sectionName** | **String** | Name of the filing section. | [optional] 
**sectionNumber** | **String** | Section number in the filing. | [optional] 
**docType** | **String** | Type of document chunk. | [optional] 
**tableText** | **String** | Full table text if chunk contains tabular data. | [optional] 


