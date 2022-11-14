# NEREntity


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_char** | **int** | The index of the last character of the entity text | 
**start_char** | **int** | The index of the starting character of the entity text | 
**text** | **str** | The substring of the source text that ws found as an entity | 
**type** | **str** | The type of entity (organization, person, etc.) that was found | 
**associated_orgs** | [**[NEROrganization]**](NEROrganization.md) | Organizations that are associated with this entity | [optional] 
**entity_id** | **str** | The FactSet Entity ID that is linked to this text. | [optional] 
**lookup_text** | **str** | Name of the FactSet entity that is linked to this text. | [optional] 
**lookup_url** | **str** | A link to the information page for the given entity | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


