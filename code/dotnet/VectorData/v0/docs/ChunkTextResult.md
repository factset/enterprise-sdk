# FactSet.SDK.VectorData.Model.ChunkTextResult
Contains content and link for a single vector ID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VectorId** | **string** | Unique vector identifier associated with the document. | [optional] 
**Content** | **string** | Unique identifier for a document. | [optional] 
**StoryLink** | **string** | A secure HTTPS link for downloading the associated document. | [optional] 
**StoryDate** | **DateTime** | Date associated with the story. | [optional] 
**Themes** | **string** | Theme of the document. | [optional] 
**DocumentType** | **string** | Type of the document. | [optional] 
**Source** | **string** | Name of the source | [optional] 
**DocumentID** | **string** | Unique identifier for a document. | [optional] 
**Ids** | **List&lt;string&gt;** | List of related IDs. | [optional] 
**TextLength** | **int** | Length of the text. | [optional] 
**TokenCount** | **int** | Number of tokens. | [optional] 
**SpeakerId** | **int** | Unique identifier of the speaker. | [optional] 
**SpeakerName** | **string** | Name of the speaker. | [optional] 
**SpeakerType** | **string** | Type of the speaker. | [optional] 
**SpeakerTitle** | **string** | Actual title of the speaker. | [optional] 
**SpeakerCompanyName** | **string** | Name of the company the speaker belongs to. | [optional] 
**SpeakerCompanyEntityId** | **string** | Entity id of the company the speaker belongs to. | [optional] 
**SpeakerEntity** | **string** | Entity id of the speaker. | [optional] 
**DocType** | **string** | Type(s) of document chunk | [optional] 
**DocNum** | **string** | Alphanumeric id for the chunk. | [optional] 
**FinancialYear** | **string** | Financial year of the earnings call. | [optional] 
**FinancialQuarter** | **string** | Financial quarter(s) of the earnings call | [optional] 
**SectionName** | **string** | Name of the filing section. | [optional] 
**SectionNumber** | **string** | Bullet numeric representing the filing section. | [optional] 
**TableText** | **string** | Full table text for the chunk. Can contain multiple lines and repeated entries. | [optional] 
**Sentiment** | **string** | Sentiment is the measure of expressed attitude or opinion of the document, such as \&quot;Negative\&quot; or \&quot;Very Positive\&quot;. The &#x60;/meta/themes&#x60; endpoint gives list of all available sentiment values. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

