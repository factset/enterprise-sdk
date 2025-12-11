# VectorDataResult

Returns vector information.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vector** | **[str]** | Chuncked emedding vector. | [optional] 
**vector_id** | **str** | Unique vector identifier associated with the document. | [optional] 
**similarity_score** | **float** | Score indicating the similarity. | [optional] 
**story_date** | **date** | Date associated with the story. | [optional] 
**themes** | **str** | Theme of the document. | [optional] 
**document_type** | **str** | Type of the document. | [optional] 
**source** | **str** | Name of the source | [optional] 
**document_id** | **str** | Unique identifier for a document. | [optional] 
**_property** | **str** | The name of the schema. | [optional] 
**type** | **str** | The type of the schema. | [optional] 
**ids** | **[str]** | List of related IDs. | [optional] 
**trimmed** | **bool** | Trimmed attribute indicates whether the vectors are trimmed or not.  - If **true**, the vectors has been trimmed.   - If **false**, the vectors are been returned.  | [optional] 
**sentiment** | **str** | Sentiment is the measure of expressed attitude or opinion of the document, such as \&quot;Negative\&quot; or \&quot;Very Positive\&quot;. The &#x60;/meta/themes&#x60; endpoint gives list of all available sentiment values. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


