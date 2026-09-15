

# DocumentsStatus

Document Status

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentID** | **String** | Unique identifier of the ingested document. |  [optional]
**fileName** | **String** | Name of the file. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Terminal processing state. Success - all chunks indexed; document is searchable. Failed  - one or more chunks failed; document is not searchable. |  [optional]
**createdAt** | **OffsetDateTime** | ISO 8601 timestamp of when the presigned upload URL was created. |  [optional]
**confirmedAt** | **OffsetDateTime** | ISO 8601 timestamp of when the client signalled upload completion. |  [optional]
**updatedAt** | **OffsetDateTime** | ISO 8601 timestamp of the most recent pipeline modification. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
AWAITINGUPLOAD | &quot;AwaitingUpload&quot;
PROCESSING | &quot;Processing&quot;
SUCCESS | &quot;Success&quot;
FAILED | &quot;Failed&quot;


## Implemented Interfaces

* Serializable


