

# ProductResource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **java.util.List&lt;String&gt;** |  |  [optional]
**id** | **String** |  |  [optional] [readonly]
**name** | **String** | Name of product. |  [optional] [readonly]
**description** | **String** | Details of product. |  [optional] [readonly]
**groupDescription** | **String** | Description of the group the product belongs in, e.g. Exchange, Product, Database, Workstation, etc. |  [optional] [readonly]
**workstation** | **Boolean** | A boolean representing whether the product is base-level access to FactSet, issuing the individual&#39;s serial number. Only one Product \&quot;id\&quot; per individual will have this value set to true. |  [optional] [readonly]
**orderable** | **Boolean** | Whether the product can be ordered by the current client. |  [readonly]
**requiresApproval** | **String** | A description of the type of approval required before an order for this product can be fulfilled. This value is null for those products that do not require any approval. |  [optional] [readonly]
**trialAvailable** | **Boolean** | Whether a temporary trial use of this product is available for users. |  [readonly]
**whitelist** | **Boolean** | Whether the product appears in the requester&#39;s product whitelist. Presence in the product whitelist means the requester is authorized to order this product for other users. |  [readonly]
**meta** | [**ProductResourceMeta**](ProductResourceMeta.md) |  |  [optional]


## Implemented Interfaces

* Serializable


