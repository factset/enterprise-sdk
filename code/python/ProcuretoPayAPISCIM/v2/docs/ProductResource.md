# ProductResource


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderable** | **bool** | Whether the product can be ordered by the current client. | [readonly] 
**trial_available** | **bool** | Whether a temporary trial use of this product is available for users. | [readonly] 
**whitelist** | **bool** | Whether the product appears in the requester&#39;s product whitelist. Presence in the product whitelist means the requester is authorized to order this product for other users. | [readonly] 
**schemas** | **[str]** |  | [optional] 
**id** | **str** |  | [optional] [readonly] 
**name** | **str** | Name of product. | [optional] [readonly] 
**description** | **str** | Details of product. | [optional] [readonly] 
**group_description** | **str** | Description of the group the product belongs in, e.g. Exchange, Product, Database, Workstation, etc. | [optional] [readonly] 
**workstation** | **bool** | A boolean representing whether the product is base-level access to FactSet, issuing the individual&#39;s serial number. Only one Product \&quot;id\&quot; per individual will have this value set to true. | [optional] [readonly] 
**requires_approval** | **str** | A description of the type of approval required before an order for this product can be fulfilled. This value is null for those products that do not require any approval. | [optional] [readonly] 
**meta** | [**ProductResourceMeta**](ProductResourceMeta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


