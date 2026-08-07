# factsetsupplychain.BatchResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The requested identifier sent as input. | [optional] 
**date** | **Date** | The requested date in YYYY-MM-DD format. | [optional] 
**type** | **String** | Discriminator object for relationships | [optional] 
**error** | [**ErrorObject**](ErrorObject.md) |  | [optional] 
**items** | [**[RelationshipsItem]**](RelationshipsItem.md) | Array of relationship items for the given requestId and date. | [optional] 



## Enum: TypeEnum


* `RELATIONSHIPS` (value: `"RELATIONSHIPS"`)




