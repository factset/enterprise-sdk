# EntityMapping

Concordance Company Entity Mapping object. Shows the mapping detail related to user's universe. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **str, none_type** | FactSet Entity Identifier of the entity matched to the submitted entity | [optional] 
**entity_name** | **str, none_type** | Full name corresponding to the matched entity. | [optional] 
**client_id** | **str, none_type** | User-defined unique identifier provided by the user in the request | [optional] 
**client_name** | **str, none_type** | Name of the entity to match as specified in the request. | [optional] 
**client_country** | **str, none_type** | ISO2 country code specified in the request | [optional] 
**client_state** | **str, none_type** | State code specified in the request | [optional] 
**client_url** | **str, none_type** | URL specified in the request | [optional] 
**created_time** | **datetime, none_type** | Time when entity was created in UTC. | [optional] 
**updated_time** | **datetime, none_type** | Time when the submitted entity was last updated in UTC. | [optional] 
**map_status** | **str, none_type** | Current status of the entity mapping. | [optional] 
**universe_id** | **int, none_type** | The universe this mapping belongs to. Only set in v2 endpoints  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


