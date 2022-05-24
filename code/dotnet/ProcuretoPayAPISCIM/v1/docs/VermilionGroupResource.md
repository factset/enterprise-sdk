# FactSet.SDK.ProcuretoPayAPISCIM.Model.VermilionGroupResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schemas** | **List&lt;string&gt;** |  | [optional] 
**Id** | **string** |  | [optional] [readonly] 
**ExternalId** | **string** | A String that is an identifier for the resource as defined by the provisioning client.The service provider MUST always interpret the externalId as scoped to the provisioning domain. | [optional] 
**DisplayName** | **string** | A human-readable name for the Group. REQUIRED. | 
**Members** | [**List&lt;VermilionGroupResourceMembers&gt;**](VermilionGroupResourceMembers.md) | A list of members of the Group. | [optional] 
**Tenant** | **string** | The tenant this role is in | [optional] 
**DomainCode** | **string** | Domain code of Enterprise Hosting pod in which user resides. REQUIRED. | 
**Meta** | [**VermilionGroupResourceMeta**](VermilionGroupResourceMeta.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

