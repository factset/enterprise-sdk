

# BatchStatus

Details the current status of a given batch request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | the id of batch request. |  [optional]
**startTime** | **OffsetDateTime** | The time when the batch request was initiated. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601. |  [optional]
**endTime** | **OffsetDateTime** | The time when the batch request was completed. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status signifies the current state of the batch request that can be &#39;queued&#39;, &#39;executing&#39;, &#39;created&#39;, or &#39;failed&#39;. |  [optional]
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


