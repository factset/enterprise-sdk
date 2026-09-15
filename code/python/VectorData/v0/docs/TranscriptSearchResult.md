# TranscriptSearchResult

Search result from transcript sources (FCST) with speaker and call metadata.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | [**TranscriptSearch**](TranscriptSearch.md) |  | 
**vector_id** | **str, none_type** | Unique vector identifier associated with the document. | [optional] 
**content** | **str, none_type** | The text content of the document chunk. | [optional] 
**story_link** | **str, none_type** | Secure HTTPS link to the full document. | [optional] 
**view_url** | **str, none_type** | Secure HTTPS Web-friendly format link rendered in a browser. | [optional] 
**story_date_time** | **datetime, none_type** | Date associated with the story. | [optional] 
**headline** | **str, none_type** | Headline of the story | [optional] 
**document_id** | **str, none_type** | Unique identifier for the document. | [optional] 
**ids** | **[str], none_type** | List of related IDs. | [optional] 
**text_length** | **int, none_type** | Character length of the content. | [optional] 
**token_count** | **int, none_type** | Token count of the content. | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 
**speaker_id** | **int, none_type** | Unique identifier of the speaker. | [optional] 
**speaker_name** | **str, none_type** | Name of the speaker. | [optional] 
**speaker_type** | **str, none_type** | Type of speaker (e.g., corprep, analyst). | [optional] 
**upload_date_time** | **datetime** | Date and time when the document was uploaded to the system. | [optional] 
**speaker_title** | **str, none_type** | Title of the speaker. | [optional] 
**speaker_company_name** | **str, none_type** | Company name of the speaker. | [optional] 
**speaker_company_entity_id** | **str, none_type** | FactSet entity ID of speaker&#39;s company. | [optional] 
**speaker_entity** | **str, none_type** | FactSet entity ID of the speaker. | [optional] 
**doc_type** | **str, none_type** | Type of document chunk. | [optional] 
**similarity_score** | **float** | Score indicating the similarity between the query and the result (0-1). | [optional] 
**doc_num** | **str, none_type** | Sequential chunk identifier within the document. | [optional] 
**financial_year** | **str, none_type** | Financial year. | [optional] 
**financial_quarter** | **str, none_type** | Financial quarter. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


