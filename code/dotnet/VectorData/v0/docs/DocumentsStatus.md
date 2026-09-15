# FactSet.SDK.VectorData.Model.DocumentsStatus
Document Status

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentID** | **string** | Unique identifier of the ingested document. | [optional] 
**FileName** | **string** | Name of the file. | [optional] 
**Status** | **string** | Terminal processing state. Success - all chunks indexed; document is searchable. Failed  - one or more chunks failed; document is not searchable. | [optional] 
**CreatedAt** | **DateTime?** | ISO 8601 timestamp of when the presigned upload URL was created. | [optional] 
**ConfirmedAt** | **DateTime?** | ISO 8601 timestamp of when the client signalled upload completion. | [optional] 
**UpdatedAt** | **DateTime?** | ISO 8601 timestamp of the most recent pipeline modification. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

