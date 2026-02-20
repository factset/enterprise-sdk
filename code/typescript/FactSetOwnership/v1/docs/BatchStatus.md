# factsetownership.BatchStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the id of batch request. | [optional] 
**startTime** | **Date** | The time when the batch request was initiated. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601. | [optional] 
**endTime** | **Date** | The time when the batch request was completed. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601. | [optional] 
**status** | **String** | The status signifies the current state of the batch request that can be &#39;queued&#39;, &#39;executing&#39;, &#39;created&#39;, or &#39;failed&#39;. | [optional] 
**error** | [**BatchErrorObject**](BatchErrorObject.md) |  | [optional] 



## Enum: StatusEnum


* `queued` (value: `"queued"`)

* `executing` (value: `"executing"`)

* `created` (value: `"created"`)

* `failed` (value: `"failed"`)




