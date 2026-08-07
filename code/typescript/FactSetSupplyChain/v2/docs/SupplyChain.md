# factsetsupplychain.SupplyChain

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The requested identifier sent as input. | [optional] 
**date** | **Date** | The requested date in YYYY-MM-DD format. | [optional] 
**type** | **String** | Discriminator object for supplychain | [optional] 
**error** | [**ErrorObject**](ErrorObject.md) |  | [optional] 
**items** | [**[SupplyChainItem]**](SupplyChainItem.md) | Array of supply chain relationship items for the given requestId and date. | [optional] 



## Enum: TypeEnum


* `SUPPLY_CHAIN` (value: `"SUPPLY_CHAIN"`)




