

# IdsDocumentListItem

Documents List

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** | fileName of the document. |  [optional]
**documentID** | **String** | Unique identifier of the document. |  [optional]
**requestId** | **java.util.UUID** | Server-generated UUID. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | status of the document. |  [optional]
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


