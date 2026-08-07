# RelationshipsRequestData

Request payload containing the list of entity identifiers, relationship type, and optional filter parameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**relationship_type** | [**RelationshipsRelationshipType**](RelationshipsRelationshipType.md) |  | [optional] 
**date** | **date** | The date requested in **YYYY-MM-DD** format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**fields** | [**RelationshipsFields**](RelationshipsFields.md) |  | [optional] 
**batch** | [**Batch**](Batch.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


