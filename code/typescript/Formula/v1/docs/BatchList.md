# formula.BatchList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the id of batch request. | [optional] 
**status** | **String** |  | [optional] 
**error** | **String** | Error message. | [optional] 
**expiration** | **Date** | Time when the batch request will expire, which is 48 hours after the batch is complete. This is in UTC Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SS], following ISO 8601. | [optional] 



## Enum: StatusEnum


* `QUEUED` (value: `"QUEUED"`)

* `EXECUTING` (value: `"EXECUTING"`)

* `DONE` (value: `"DONE"`)

* `FAILED` (value: `"FAILED"`)

* `CANCELED` (value: `"CANCELED"`)




