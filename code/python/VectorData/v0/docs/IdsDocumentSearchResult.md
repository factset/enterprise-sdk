# IdsDocumentSearchResult

A single search result returned by the document search endpoint.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chunk_id** | **str, none_type** | Unique identifier for the document chunk. | [optional] 
**document_id** | **str, none_type** | Unique identifier for the source document. | [optional] 
**similarity_score** | **float** | Similarity score between the query and this result (0-1). | [optional] 
**content** | **str, none_type** | Text content of the document chunk. | [optional] 
**document_link** | **str, none_type** | Secure HTTPS link to the full source document. | [optional] 
**source** | **str** | Data source identifier. | [optional] 
**text_length** | **int, none_type** | Character length of the content field. | [optional] 
**file_name** | **str, none_type** | name of the file. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


