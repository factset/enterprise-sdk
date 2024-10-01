

# ActiveJobStatus

Status information about an active job

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


## Implemented Interfaces

* Serializable


