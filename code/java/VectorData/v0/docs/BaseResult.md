

# BaseResult

Common fields shared across all search results regardless of source.

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


## Implemented Interfaces

* Serializable


