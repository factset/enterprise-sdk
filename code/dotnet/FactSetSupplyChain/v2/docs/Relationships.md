# FactSet.SDK.FactSetSupplyChain.Model.Relationships
Relationship information for an entity, grouped by request identifier and date, with all relationship details nested within items.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The requested identifier sent as input. | [optional] 
**Date** | **DateTime?** | The requested date in YYYY-MM-DD format. | [optional] 
**Type** | **string** | Discriminator object for relationships | [optional] 
**Error** | [**ErrorObject**](ErrorObject.md) |  | [optional] 
**Items** | [**List&lt;RelationshipsItem&gt;**](RelationshipsItem.md) | Array of relationship items for the given requestId and date. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

