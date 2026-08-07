

# SupplyChainAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Discriminator object for supplychain |  [optional]
**error** | [**ErrorObject**](ErrorObject.md) |  |  [optional]
**items** | [**java.util.List&lt;SupplyChainItem&gt;**](SupplyChainItem.md) | Array of supply chain relationship items for the given requestId and date. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
SUPPLY_CHAIN | &quot;SUPPLY_CHAIN&quot;


## Implemented Interfaces

* Serializable


