

# VermilionGroupResource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **java.util.List&lt;String&gt;** |  |  [optional]
**id** | **String** |  |  [optional] [readonly]
**externalId** | **String** | A String that is an identifier for the resource as defined by the provisioning client.The service provider MUST always interpret the externalId as scoped to the provisioning domain. |  [optional]
**displayName** | **String** | A human-readable name for the Group. REQUIRED. | 
**members** | [**java.util.List&lt;VermilionGroupResourceMembers&gt;**](VermilionGroupResourceMembers.md) | A list of members of the Group. |  [optional]
**tenant** | **String** | The tenant this role is in |  [optional]
**domainCode** | **String** | Domain code of Enterprise Hosting pod in which user resides. REQUIRED. | 
**meta** | [**VermilionGroupResourceMeta**](VermilionGroupResourceMeta.md) |  |  [optional]


## Implemented Interfaces

* Serializable


