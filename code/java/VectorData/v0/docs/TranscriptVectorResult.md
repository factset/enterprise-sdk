

# TranscriptVectorResult

Vector result from transcript sources with vector embeddings and speaker metadata.

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
**source** | **TranscriptVector** |  | 
**vector** | **java.util.List&lt;Float&gt;** | Vector embedding array. Omitted when trimmed&#x3D;true. |  [optional]
**trimmed** | **Boolean** | Indicates whether vector embeddings are included. |  [optional]
**uploadDateTime** | **OffsetDateTime** | Date and time when the document was uploaded to the system. |  [optional]
**speakerId** | **Integer** | Unique identifier of the speaker. |  [optional]
**speakerName** | **String** | Name of the speaker. |  [optional]
**speakerType** | **String** | Type of speaker (e.g., corprep, analyst). |  [optional]
**speakerTitle** | **String** | Title of the speaker. |  [optional]
**speakerCompanyName** | **String** | Company name of the speaker. |  [optional]
**speakerCompanyEntityId** | **String** | FactSet entity ID of speaker&#39;s company. |  [optional]
**speakerEntity** | **String** | FactSet entity ID of the speaker. |  [optional]
**docType** | **String** | Type of document chunk. |  [optional]
**docNum** | **String** | Sequential chunk identifier within the document. |  [optional]
**financialYear** | **String** | Financial year. |  [optional]
**financialQuarter** | **String** | Financial quarter. |  [optional]


## Implemented Interfaces

* Serializable


