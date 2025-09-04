

# BatchList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | the id of batch request. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**error** | **String** | Error message. |  [optional]
**expiration** | **OffsetDateTime** | Time when the batch request will expire, which is 48 hours after the batch is complete. This is in UTC Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SS], following ISO 8601. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;QUEUED&quot;
EXECUTING | &quot;EXECUTING&quot;
DONE | &quot;DONE&quot;
FAILED | &quot;FAILED&quot;
CANCELED | &quot;CANCELED&quot;


## Implemented Interfaces

* Serializable


