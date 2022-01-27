# Entity


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Type of the extracted named entity (NE). | [optional] 
**text** | **str** | Text for the named entity, as found in the source text. | [optional] 
**start_char** | **int** | Starting character position of the entity text. | [optional] 
**end_char** | **int** | Ending character position of the entity text. | [optional] 
**lookup_text** | **str** | Name of the FactSet entity linked to the text. | [optional] 
**entity_id** | **str** | FactSet Entity ID for the extracted entity. | [optional] 
**lookup_url** | **str** | URL to the extracted entity in FactSet. | [optional] 
**associated_orgs** | [**[AssociatedOrganization]**](AssociatedOrganization.md) | Organizations associated with this entity. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


