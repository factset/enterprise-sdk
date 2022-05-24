# FactSet.SDK.ProcuretoPayAPISCIM.Model.ProductResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schemas** | **List&lt;string&gt;** |  | [optional] 
**Id** | **string** |  | [optional] [readonly] 
**Name** | **string** | Name of product. | [optional] [readonly] 
**Description** | **string** | Details of product. | [optional] [readonly] 
**GroupDescription** | **string** | Description of the group the product belongs in, e.g. Exchange, Product, Database, Workstation, etc. | [optional] [readonly] 
**Workstation** | **bool** | A boolean representing whether the product is base-level access to FactSet, issuing the individual&#39;s serial number. Only one Product \&quot;id\&quot; per individual will have this value set to true. | [optional] [readonly] 
**RequiresApproval** | **string** | A description of the type of approval required before an order for this product can be fulfilled. This value is null for those products that do not require any approval. | [optional] [readonly] 
**Whitelist** | **bool** | Whether the product appears in the requester&#39;s product whitelist. Presence in the product whitelist means the requester is authorized to order this product for other users. | [readonly] 
**Meta** | [**ProductResourceMeta**](ProductResourceMeta.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

