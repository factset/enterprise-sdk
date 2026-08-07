

# RelationshipsItemAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relationshipType** | **RelationshipTypeEnum** |  |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Indicates whether the relationship is direct, reverse, or mutual. A direct relationship is disclosed by the source company, while a reverse relationship is disclosed by another company regarding the source company. A mutual relationship indicates that both companies have disclosed the relationship. |  [optional]
**requestIdSubsidiaries** | [**java.util.List&lt;Subsidiary&gt;**](Subsidiary.md) | List of requesting entity subsidiaries involved in this relationship. |  [optional]
**targetSubsidiaries** | [**java.util.List&lt;Subsidiary&gt;**](Subsidiary.md) | List of related entity subsidiaries involved in this relationship. |  [optional]
**overlappingSectorCount** | **Integer** | Number of sectors to which both the requesting entity and the related entity are mapped. A higher count indicates greater overlap in business operations. This field is applicable only for COMPETITOR relationships and will be omitted for PARTNER relationships. |  [optional]
**relationshipKeywords** | **java.util.List&lt;java.util.List&lt;String&gt;&gt;** | Related keywords associated with the relationship to assist in discovering additional related data. Each inner array represents a grouped set of related keywords. |  [optional]



## Enum: DirectionEnum

Name | Value
---- | -----
DIRECT | &quot;DIRECT&quot;
REVERSE | &quot;REVERSE&quot;
MUTUAL | &quot;MUTUAL&quot;


## Implemented Interfaces

* Serializable


