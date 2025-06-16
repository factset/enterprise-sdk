

# Relationships


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityId** | **String** | Unique FactSet-generated identifier representing an entity for the current entity identifier (-E) |  [optional]
**companyName** | **String** | Referring to the official name of a business entity. |  [optional]
**overlappingProductCount** | **String** | Number of Product Overlap is determined by how many sectors matches in named products (determined by Revere Hierarchy) there are in a given relationship between the source and target company. |  [optional]
**overlapPercentage** | **Integer** | Product Overlap Percentage is the percent value of the preceding overlapping product count data item. |  [optional]
**relationshipDirection** | [**RelationshipDirectionEnum**](#RelationshipDirectionEnum) | Direction of Relationship indicates which company (target or source) determined the relationship. |  [optional]
**requestId** | **String** | Identifier used in &#x60;ids&#x60;. |  [optional]



## Enum: RelationshipDirectionEnum

Name | Value
---- | -----
MUTUAL | &quot;Mutual&quot;
DIRECT | &quot;Direct&quot;
REVERSE | &quot;Reverse&quot;


## Implemented Interfaces

* Serializable


