

# ScimGroup

Role details, defining permissions and access.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **java.util.List&lt;String&gt;** | List of schema URIs for the group/role. |  [optional]
**id** | **String** | Unique identifier of the group/role. |  [optional]
**displayName** | **String** | The display name of the group/role. |  [optional]
**members** | [**java.util.List&lt;ScimGroupMember&gt;**](ScimGroupMember.md) | A list of users assigned to the group/role. |  [optional]
**tenant** | **String** | Tenant associated with the group/role. |  [optional]
**domainCode** | **String** | Domain code for the group. |  [optional]
**meta** | [**ScimMeta**](ScimMeta.md) |  |  [optional]


## Implemented Interfaces

* Serializable


