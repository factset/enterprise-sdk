# naturallanguageprocessing.QnATask

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The task identifier | 
**startedAt** | **Date** | The date time the task started (UTC). | 
**status** | **String** |  Completion status of the task.  The detailed description of each of the statuses is as follows: |Status|Description| |--------|--------| |queued|The task did not start yet.| |created|The task is completed and the underlying resource is created.| |failed|The task has failed and consequently the creation of the resource failed.| |executing|The task is executing.| |cancelled|The task is cancelled and the creation of the underlying resource was cancelled before it could finish.| | 



## Enum: StatusEnum


* `queued` (value: `"queued"`)

* `created` (value: `"created"`)

* `failed` (value: `"failed"`)

* `executing` (value: `"executing"`)

* `cancelled` (value: `"cancelled"`)




