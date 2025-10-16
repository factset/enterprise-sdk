

# BatchStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | the id of batch request. |  [optional]
**startTime** | **OffsetDateTime** | Time when the batch request is started. This is in Eastern Time Zone. The date-time format is expressed as &#x60;[YYYY-MM-DD]T[HH:MM:SSS]&#x60;, following ISO 8601. |  [optional]
**endTime** | **OffsetDateTime** | Time when the batch request is ended. This is in Eastern Time Zone. The date-time format is expressed as &#x60;[YYYY-MM-DD]T[HH:MM:SSS]&#x60;, following ISO 8601. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**error** | [**BatchErrorObject**](BatchErrorObject.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;queued&quot;
EXECUTING | &quot;executing&quot;
CREATED | &quot;created&quot;
FAILED | &quot;failed&quot;


## Implemented Interfaces

* Serializable


