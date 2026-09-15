# vectordata.IdsDocumentListItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** | fileName of the document. | [optional] 
**documentID** | **String** | Unique identifier of the document. | [optional] 
**requestId** | **String** | Server-generated UUID. | [optional] 
**status** | **String** | status of the document. | [optional] 
**createdAt** | **Date** | ISO 8601 timestamp of when the presigned upload URL was created. | [optional] 
**confirmedAt** | **Date** | ISO 8601 timestamp of when the client signalled upload completion. | [optional] 
**updatedAt** | **Date** | ISO 8601 timestamp of the most recent pipeline modification. | [optional] 



## Enum: StatusEnum


* `AwaitingUpload` (value: `"AwaitingUpload"`)

* `Processing` (value: `"Processing"`)

* `Success` (value: `"Success"`)

* `Failed` (value: `"Failed"`)




