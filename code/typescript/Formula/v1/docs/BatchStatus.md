# formula.BatchStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the id of batch request. | [optional] 
**startTime** | **Date** | Time when the batch request is started. This is in UTC Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SS], following ISO 8601. | [optional] 
**endTime** | **Date** | Time when the batch request is ended. This is in UTC Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SS], following ISO 8601. | [optional] 
**status** | **String** |  | [optional] 
**error** | **String** | Error message. | [optional] 



## Enum: StatusEnum


* `QUEUED` (value: `"QUEUED"`)

* `EXECUTING` (value: `"EXECUTING"`)

* `DONE` (value: `"DONE"`)

* `FAILED` (value: `"FAILED"`)

* `CANCELED` (value: `"CANCELED"`)




