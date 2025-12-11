

# ChunkTextResult

Contains content and link for a single vector ID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vectorId** | **String** | Unique vector identifier associated with the document. |  [optional]
**content** | **String** | Unique identifier for a document. |  [optional]
**storyLink** | **String** | A secure HTTPS link for downloading the associated document. |  [optional]
**storyDate** | **LocalDate** | Date associated with the story. |  [optional]
**themes** | **String** | Theme of the document. |  [optional]
**documentType** | **String** | Type of the document. |  [optional]
**source** | **String** | Name of the source |  [optional]
**documentID** | **String** | Unique identifier for a document. |  [optional]
**ids** | **java.util.List&lt;String&gt;** | List of related IDs. |  [optional]
**textLength** | **Integer** | Length of the text. |  [optional]
**tokenCount** | **Integer** | Number of tokens. |  [optional]
**speakerId** | **Integer** | Unique identifier of the speaker. |  [optional]
**speakerName** | **String** | Name of the speaker. |  [optional]
**speakerType** | **String** | Type of the speaker. |  [optional]
**speakerTitle** | **String** | Actual title of the speaker. |  [optional]
**speakerCompanyName** | **String** | Name of the company the speaker belongs to. |  [optional]
**speakerCompanyEntityId** | **String** | Entity id of the company the speaker belongs to. |  [optional]
**speakerEntity** | **String** | Entity id of the speaker. |  [optional]
**docType** | **String** | Type(s) of document chunk |  [optional]
**docNum** | **String** | Alphanumeric id for the chunk. |  [optional]
**financialYear** | **String** | Financial year of the earnings call. |  [optional]
**financialQuarter** | **String** | Financial quarter(s) of the earnings call |  [optional]
**sectionName** | **String** | Name of the filing section. |  [optional]
**sectionNumber** | **String** | Bullet numeric representing the filing section. |  [optional]
**tableText** | **String** | Full table text for the chunk. Can contain multiple lines and repeated entries. |  [optional]
**sentiment** | **String** | Sentiment is the measure of expressed attitude or opinion of the document, such as \&quot;Negative\&quot; or \&quot;Very Positive\&quot;. The &#x60;/meta/themes&#x60; endpoint gives list of all available sentiment values. |  [optional]


## Implemented Interfaces

* Serializable


