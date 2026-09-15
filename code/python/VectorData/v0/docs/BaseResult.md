# BaseResult

Common fields shared across all search results regardless of source.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
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
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


