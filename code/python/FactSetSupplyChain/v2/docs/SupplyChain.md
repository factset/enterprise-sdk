# SupplyChain

Comprehensive supply chain relationship information for an entity including subsidiaries, revenue percentages, relevance grades, centrality measures, and relationship keywords

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The requested identifier sent as input. | [optional] 
**date** | **date, none_type** | The requested date in YYYY-MM-DD format. | [optional] 
**type** | **str** | Discriminator object for supplychain | [optional]  if omitted the server will use the default value of "SUPPLY_CHAIN"
**error** | [**ErrorObject**](ErrorObject.md) |  | [optional] 
**items** | [**[SupplyChainItem]**](SupplyChainItem.md) | Array of supply chain relationship items for the given requestId and date. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


