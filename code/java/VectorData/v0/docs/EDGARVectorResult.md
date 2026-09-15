

# EDGARVectorResult

Vector result from EDGAR filing sources with vector embeddings and filing-specific metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vectorId** | **String** | Unique vector identifier associated with the document. |  [optional]
**content** | **String** | The text content of the document chunk. |  [optional]
**storyLink** | **String** | Secure HTTPS link to the full document. |  [optional]
**viewUrl** | **String** | Secure HTTPS Web-friendly format link rendered in a browser. |  [optional]
**storyDateTime** | **OffsetDateTime** | Date associated with the story. |  [optional]
**headline** | **String** | Headline of the story |  [optional]
**documentID** | **String** | Unique identifier for the document. |  [optional]
**ids** | **java.util.List&lt;String&gt;** | List of related IDs. |  [optional]
**textLength** | **Integer** | Character length of the content. |  [optional]
**tokenCount** | **Integer** | Token count of the content. |  [optional]
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  |  [optional]
**source** | **EDGARVector** |  | 
**vector** | **java.util.List&lt;Float&gt;** | Vector embedding array. Omitted when trimmed&#x3D;true. |  [optional]
**trimmed** | **Boolean** | Indicates whether vector embeddings are included. |  [optional]
**formType** | **String** | Document form type (e.g., 10-K, 10-Q, 8-K). |  [optional]
**sectionName** | **String** | Name of the filing section. |  [optional]
**sectionNumber** | **String** | Section number in the filing. |  [optional]
**docType** | **String** | Type of document chunk. |  [optional]
**tableText** | **String** | Full table text if chunk contains tabular data. |  [optional]


## Implemented Interfaces

* Serializable


