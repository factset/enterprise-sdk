# vectordata.DocumentsStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentID** | **String** | Unique identifier of the ingested document. | [optional] 
**fileName** | **String** | Name of the file. | [optional] 
**status** | **String** | Terminal processing state. Success - all chunks indexed; document is searchable. Failed  - one or more chunks failed; document is not searchable. | [optional] 
**createdAt** | **Date** | ISO 8601 timestamp of when the presigned upload URL was created. | [optional] 
**confirmedAt** | **Date** | ISO 8601 timestamp of when the client signalled upload completion. | [optional] 
**updatedAt** | **Date** | ISO 8601 timestamp of the most recent pipeline modification. | [optional] 



## Enum: StatusEnum


* `AwaitingUpload` (value: `"AwaitingUpload"`)

* `Processing` (value: `"Processing"`)

* `Success` (value: `"Success"`)

* `Failed` (value: `"Failed"`)




