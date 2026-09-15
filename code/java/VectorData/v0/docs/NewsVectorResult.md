

# NewsVectorResult

Vector result from news sources with vector embeddings and minimal additional metadata.

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
**source** | **NewsVector** |  | 
**vector** | **java.util.List&lt;Float&gt;** | Vector embedding array. Omitted when trimmed&#x3D;true. |  [optional]
**trimmed** | **Boolean** | Indicates whether vector embeddings are included. |  [optional]


## Implemented Interfaces

* Serializable


