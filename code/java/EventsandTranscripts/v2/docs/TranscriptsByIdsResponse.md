

# TranscriptsByIdsResponse

The data being returned in the search response are search results, and under each search result, the documents are organized by requested identifiers. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transcriptResponseType** | [**TranscriptResponseTypeEnum**](#TranscriptResponseTypeEnum) | The data being returned in the search response based on the requested IDs. |  [optional]
**requestId** | **String** | The requested identifier associated with this group of documents. | 
**documents** | [**java.util.List&lt;DocumentResult&gt;**](DocumentResult.md) | Contains list of documents |  [optional]
**error** | [**InvalidIdErrorData**](InvalidIdErrorData.md) |  |  [optional]



## Enum: TranscriptResponseTypeEnum

Name | Value
---- | -----
TRANSCRIPTBYID | &quot;transcriptById&quot;


## Implemented Interfaces

* Serializable


