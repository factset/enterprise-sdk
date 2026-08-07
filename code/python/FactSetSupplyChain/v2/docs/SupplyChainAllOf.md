# SupplyChainAllOf


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Discriminator object for supplychain | [optional]  if omitted the server will use the default value of "SUPPLY_CHAIN"
**error** | [**ErrorObject**](ErrorObject.md) |  | [optional] 
**items** | [**[SupplyChainItem]**](SupplyChainItem.md) | Array of supply chain relationship items for the given requestId and date. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


