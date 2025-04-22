

# SearchResult

The data being returned in the search response are search results, and under each search result, the documents are organized by requested identifiers. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The requested identifier associated with this group of documents. |  [optional]
**documents** | [**java.util.List&lt;Document&gt;**](Document.md) | Contains list of documents |  [optional]
**error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  |  [optional]


## Implemented Interfaces

* Serializable


