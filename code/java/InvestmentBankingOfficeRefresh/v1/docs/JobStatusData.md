

# JobStatusData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the job (resource ID returned from FactSet). |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the job |  [optional]
**error** | [**Error**](Error.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;queued&quot;
EXECUTING | &quot;executing&quot;
CREATED | &quot;created&quot;
FAILED | &quot;failed&quot;
CANCELLED | &quot;cancelled&quot;


## Implemented Interfaces

* Serializable


