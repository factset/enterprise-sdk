

# IdsDocumentSearchResult

A single search result returned by the document search endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chunkId** | **String** | Unique identifier for the document chunk. |  [optional]
**documentID** | **String** | Unique identifier for the source document. |  [optional]
**similarityScore** | **Double** | Similarity score between the query and this result (0-1). |  [optional]
**content** | **String** | Text content of the document chunk. |  [optional]
**documentLink** | **String** | Secure HTTPS link to the full source document. |  [optional]
**source** | **String** | Data source identifier. |  [optional]
**textLength** | **Integer** | Character length of the content field. |  [optional]
**fileName** | **String** | name of the file. |  [optional]


## Implemented Interfaces

* Serializable


