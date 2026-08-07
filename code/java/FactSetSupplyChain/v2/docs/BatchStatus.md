

# BatchStatus

Batch Status object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | the id of batch request. |  [optional]
**startTime** | **OffsetDateTime** | Time when the batch request is started. This is in Eastern Time Zone. The date-time format is expressed as &#x60;[YYYY-MM-DD]T[HH:MM:SSS]&#x60;, following ISO 8601. |  [optional]
**endTime** | **OffsetDateTime** | Time when the batch request is ended. This is in Eastern Time Zone. The date-time format is expressed as &#x60;[YYYY-MM-DD]T[HH:MM:SSS]&#x60;, following ISO 8601. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the batch request |  [optional]
**error** | [**ErrorObject**](ErrorObject.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;QUEUED&quot;
EXECUTING | &quot;EXECUTING&quot;
CREATED | &quot;CREATED&quot;
FAILED | &quot;FAILED&quot;


## Implemented Interfaces

* Serializable


