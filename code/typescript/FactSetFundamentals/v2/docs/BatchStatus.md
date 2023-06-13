# factsetfundamentals.BatchStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the id of batch request. | [optional] 
**startTime** | **Date** | Time when the batch request is started. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601. | [optional] 
**endTime** | **Date** | Time when the batch request is ended. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601. | [optional] 
**status** | **String** |  | [optional] 
**error** | [**BatchErrorObject**](BatchErrorObject.md) |  | [optional] 



## Enum: StatusEnum


* `queued` (value: `"queued"`)

* `executing` (value: `"executing"`)

* `created` (value: `"created"`)

* `failed` (value: `"failed"`)




