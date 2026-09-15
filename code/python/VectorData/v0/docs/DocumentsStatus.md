# DocumentsStatus

Document Status

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_id** | **str** | Unique identifier of the ingested document. | [optional] 
**file_name** | **str, none_type** | Name of the file. | [optional] 
**status** | **str** | Terminal processing state. Success - all chunks indexed; document is searchable. Failed  - one or more chunks failed; document is not searchable. | [optional] 
**created_at** | **datetime, none_type** | ISO 8601 timestamp of when the presigned upload URL was created. | [optional] 
**confirmed_at** | **datetime, none_type** | ISO 8601 timestamp of when the client signalled upload completion. | [optional] 
**updated_at** | **datetime, none_type** | ISO 8601 timestamp of the most recent pipeline modification. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


