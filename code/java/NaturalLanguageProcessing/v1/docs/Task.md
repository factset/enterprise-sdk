

# Task

Schema that represents a long-running process/task.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | The task identifier | 
**startedAt** | **OffsetDateTime** | The date time the task started (UTC). | 
**status** | [**StatusEnum**](#StatusEnum) |  Completion status of the task.  The detailed description of each of the statuses is as follows: |Status|Description| |--------|--------| |queued|The task did not start yet.| |created|The task is completed and the underlying resource is created.| |failed|The task has failed and consequently the creation of the resource failed.| |executing|The task is executing.| |cancelled|The task is cancelled and the creation of the underlying resource was cancelled before it could finish.| | 



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;queued&quot;
CREATED | &quot;created&quot;
FAILED | &quot;failed&quot;
EXECUTING | &quot;executing&quot;
CANCELLED | &quot;cancelled&quot;


## Implemented Interfaces

* Serializable


