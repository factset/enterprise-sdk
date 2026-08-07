# factsetsupplychain.RelationshipsItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityId** | **String** | Unique FactSet-generated identifier representing the related entity. Six alpha-numeric characters with a -E suffix (XXXXXX-E). | [optional] 
**entityName** | **String** | The proper name of the related entity. | [optional] 
**relationshipType** | [**RelationshipTypeEnum**](RelationshipTypeEnum.md) |  | [optional] 
**direction** | **String** | Indicates whether the relationship is direct, reverse, or mutual. A direct relationship is disclosed by the source company, while a reverse relationship is disclosed by another company regarding the source company. A mutual relationship indicates that both companies have disclosed the relationship. | [optional] 
**requestIdSubsidiaries** | [**[Subsidiary]**](Subsidiary.md) | List of requesting entity subsidiaries involved in this relationship. | [optional] 
**targetSubsidiaries** | [**[Subsidiary]**](Subsidiary.md) | List of related entity subsidiaries involved in this relationship. | [optional] 
**overlappingSectorCount** | **Number** | Number of sectors to which both the requesting entity and the related entity are mapped. A higher count indicates greater overlap in business operations. This field is applicable only for COMPETITOR relationships and will be omitted for PARTNER relationships. | [optional] 
**relationshipKeywords** | **[[String]]** | Related keywords associated with the relationship to assist in discovering additional related data. Each inner array represents a grouped set of related keywords. | [optional] 



## Enum: DirectionEnum


* `DIRECT` (value: `"DIRECT"`)

* `REVERSE` (value: `"REVERSE"`)

* `MUTUAL` (value: `"MUTUAL"`)




