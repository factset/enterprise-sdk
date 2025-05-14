# ScimGroup

Role details, defining permissions and access.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **[str]** | List of schema URIs for the group/role. | [optional] 
**id** | **str** | Unique identifier of the group/role. | [optional] 
**display_name** | **str** | The display name of the group/role. | [optional] 
**members** | [**[ScimGroupMember]**](ScimGroupMember.md) | A list of users assigned to the group/role. | [optional] 
**tenant** | **str** | Tenant associated with the group/role. | [optional] 
**domain_code** | **str** | Domain code for the group. | [optional] 
**meta** | [**ScimMeta**](ScimMeta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


