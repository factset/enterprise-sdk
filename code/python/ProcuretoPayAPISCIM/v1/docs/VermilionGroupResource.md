# VermilionGroupResource


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**display_name** | **str** | A human-readable name for the Group. REQUIRED. | 
**domain_code** | **str** | Domain code of Enterprise Hosting pod in which user resides. REQUIRED. | 
**schemas** | **[str]** |  | [optional] 
**id** | **str** |  | [optional] [readonly] 
**external_id** | **str** | A String that is an identifier for the resource as defined by the provisioning client.The service provider MUST always interpret the externalId as scoped to the provisioning domain. | [optional] 
**members** | [**[VermilionGroupResourceMembers]**](VermilionGroupResourceMembers.md) | A list of members of the Group. | [optional] 
**tenant** | **str** | The tenant this role is in | [optional] 
**meta** | [**VermilionGroupResourceMeta**](VermilionGroupResourceMeta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


