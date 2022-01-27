# Tag


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Type of the extracted named-entity (NE). | [optional] 
**sub_type** | **str** | More specific sub-type (e.g., NE_COUNTRY) of the named-entity (if applicable). | [optional] 
**text** | **str** | Text for the named-entity (NE), as extracted from the given document. | [optional] 
**score** | **float** |  | [optional] 
**start_char** | **int** | Starting character position of the named-entity text (relative to any offset provided (default offset&#x3D;0)). | [optional] 
**end_char** | **int** | Ending character position of the named-entity text (relative to any offset provided (default offset&#x3D;0)) | [optional] 
**lookup_text** | **str** | Best-matching (FactSet) looked-up name for the extracted named-entity. | [optional] 
**ne_id** | **str** | Best-matching (FactSet) entity-id for the extracted named-entity | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


