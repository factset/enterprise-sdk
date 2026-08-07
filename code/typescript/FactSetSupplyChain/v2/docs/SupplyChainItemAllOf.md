# factsetsupplychain.SupplyChainItemAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relationshipType** | **String** | Code denoting the type of relationship. For supply chain endpoints, values are CUSTOMER or SUPPLIER. | [optional] 
**direction** | **String** | Indicates whether the relationship is direct, reverse, or mutual. A direct relationship is disclosed by the source company, while a reverse relationship is disclosed by another company regarding the source company. A mutual relationship indicates that both companies have disclosed the relationship. | [optional] 
**revenuePct** | **Number** | Percentage of revenue that the source company derived from this relationship in the reporting period. This field is only applicable to relationships reported as Customer and only then for those cases where the reporting company provides a percentage. | [optional] 
**relevanceGrade** | **Number** | Integer value between 1 and 10,000 indicating the relevance factors&#39; grade for this relationship. A higher grade indicates a more significant supply chain relationship. | [optional] 
**supplierSubsidiaries** | [**[Subsidiary]**](Subsidiary.md) | List of supplier subsidiaries involved in this relationship. Only present when a subsidiary is disclosed as the specific entity involved in a relationship. | [optional] 
**customerSubsidiaries** | [**[Subsidiary]**](Subsidiary.md) | List of customer subsidiaries involved in this relationship. Only present when a subsidiary is disclosed as the specific entity involved in a relationship. | [optional] 
**centrality** | [**SupplyChainItemAllOfCentrality**](SupplyChainItemAllOfCentrality.md) |  | [optional] 
**relationshipKeywords** | **[[String]]** | Related keywords associated with the relationship to assist in discovering additional related data. Each inner array represents a grouped set of related keywords. | [optional] 



## Enum: RelationshipTypeEnum


* `CUSTOMER` (value: `"CUSTOMER"`)

* `SUPPLIER` (value: `"SUPPLIER"`)





## Enum: DirectionEnum


* `DIRECT` (value: `"DIRECT"`)

* `REVERSE` (value: `"REVERSE"`)

* `MUTUAL` (value: `"MUTUAL"`)




