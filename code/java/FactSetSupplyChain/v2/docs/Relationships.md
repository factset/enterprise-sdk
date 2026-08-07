

# Relationships

Relationship information for an entity, grouped by request identifier and date, with all relationship details nested within items.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The requested identifier sent as input. |  [optional]
**date** | **LocalDate** | The requested date in YYYY-MM-DD format. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Discriminator object for relationships |  [optional]
**error** | [**ErrorObject**](ErrorObject.md) |  |  [optional]
**items** | [**java.util.List&lt;RelationshipsItem&gt;**](RelationshipsItem.md) | Array of relationship items for the given requestId and date. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
RELATIONSHIPS | &quot;RELATIONSHIPS&quot;


## Implemented Interfaces

* Serializable


