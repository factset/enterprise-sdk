# FactSet.SDK.FactSetSupplyChain.Model.SupplyChain
Comprehensive supply chain relationship information for an entity including subsidiaries, revenue percentages, relevance grades, centrality measures, and relationship keywords

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The requested identifier sent as input. | [optional] 
**Date** | **DateTime?** | The requested date in YYYY-MM-DD format. | [optional] 
**Type** | **string** | Discriminator object for supplychain | [optional] 
**Error** | [**ErrorObject**](ErrorObject.md) |  | [optional] 
**Items** | [**List&lt;SupplyChainItem&gt;**](SupplyChainItem.md) | Array of supply chain relationship items for the given requestId and date. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

