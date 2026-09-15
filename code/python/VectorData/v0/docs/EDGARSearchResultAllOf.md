# EDGARSearchResultAllOf


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | [**EDGARSearch**](EDGARSearch.md) |  | 
**form_type** | **str** | Document form type (e.g., 10-K, 10-Q, 8-K). | [optional] 
**section_name** | **str, none_type** | Name of the filing section. | [optional] 
**section_number** | **str, none_type** | Section number in the filing. | [optional] 
**doc_type** | **str, none_type** | Type of document chunk. | [optional] 
**similarity_score** | **float** | Score indicating the similarity between the query and the result (0-1). | [optional] 
**table_text** | **str, none_type** | Full table text if chunk contains tabular data. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


