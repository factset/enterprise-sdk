# ChunkTextResult

Contains content and link for a single vector ID.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vector_id** | **str** | Unique vector identifier associated with the document. | [optional] 
**content** | **str** | Unique identifier for a document. | [optional] 
**story_link** | **str** | A secure HTTPS link for downloading the associated document. | [optional] 
**story_date** | **date** | Date associated with the story. | [optional] 
**themes** | **str** | Theme of the document. | [optional] 
**document_type** | **str** | Type of the document. | [optional] 
**source** | **str** | Name of the source | [optional] 
**document_id** | **str** | Unique identifier for a document. | [optional] 
**ids** | **[str]** | List of related IDs. | [optional] 
**text_length** | **int** | Length of the text. | [optional] 
**token_count** | **int** | Number of tokens. | [optional] 
**speaker_id** | **int** | Unique identifier of the speaker. | [optional] 
**speaker_name** | **str** | Name of the speaker. | [optional] 
**speaker_type** | **str** | Type of the speaker. | [optional] 
**speaker_title** | **str** | Actual title of the speaker. | [optional] 
**speaker_company_name** | **str** | Name of the company the speaker belongs to. | [optional] 
**speaker_company_entity_id** | **str** | Entity id of the company the speaker belongs to. | [optional] 
**speaker_entity** | **str** | Entity id of the speaker. | [optional] 
**doc_type** | **str** | Type(s) of document chunk | [optional] 
**doc_num** | **str** | Alphanumeric id for the chunk. | [optional] 
**financial_year** | **str** | Financial year of the earnings call. | [optional] 
**financial_quarter** | **str** | Financial quarter(s) of the earnings call | [optional] 
**section_name** | **str** | Name of the filing section. | [optional] 
**section_number** | **str** | Bullet numeric representing the filing section. | [optional] 
**table_text** | **str** | Full table text for the chunk. Can contain multiple lines and repeated entries. | [optional] 
**sentiment** | **str** | Sentiment is the measure of expressed attitude or opinion of the document, such as \&quot;Negative\&quot; or \&quot;Very Positive\&quot;. The &#x60;/meta/themes&#x60; endpoint gives list of all available sentiment values. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


