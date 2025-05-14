# FactSet.SDK.Vermilion.Model.ScimGroup
Role details, defining permissions and access.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schemas** | **List&lt;string&gt;** | List of schema URIs for the group/role. | [optional] 
**Id** | **string** | Unique identifier of the group/role. | [optional] 
**DisplayName** | **string** | The display name of the group/role. | [optional] 
**Members** | [**List&lt;ScimGroupMember&gt;**](ScimGroupMember.md) | A list of users assigned to the group/role. | [optional] 
**Tenant** | **string** | Tenant associated with the group/role. | [optional] 
**DomainCode** | **string** | Domain code for the group. | [optional] 
**Meta** | [**ScimMeta**](ScimMeta.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

