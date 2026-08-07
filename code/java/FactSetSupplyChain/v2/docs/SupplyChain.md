

# SupplyChain

Comprehensive supply chain relationship information for an entity including subsidiaries, revenue percentages, relevance grades, centrality measures, and relationship keywords

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The requested identifier sent as input. |  [optional]
**date** | **LocalDate** | The requested date in YYYY-MM-DD format. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Discriminator object for supplychain |  [optional]
**error** | [**ErrorObject**](ErrorObject.md) |  |  [optional]
**items** | [**java.util.List&lt;SupplyChainItem&gt;**](SupplyChainItem.md) | Array of supply chain relationship items for the given requestId and date. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
SUPPLY_CHAIN | &quot;SUPPLY_CHAIN&quot;


## Implemented Interfaces

* Serializable


