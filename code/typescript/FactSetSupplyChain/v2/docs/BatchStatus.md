# factsetsupplychain.BatchStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the id of batch request. | [optional] 
**startTime** | **Date** | Time when the batch request is started. This is in Eastern Time Zone. The date-time format is expressed as &#x60;[YYYY-MM-DD]T[HH:MM:SSS]&#x60;, following ISO 8601. | [optional] 
**endTime** | **Date** | Time when the batch request is ended. This is in Eastern Time Zone. The date-time format is expressed as &#x60;[YYYY-MM-DD]T[HH:MM:SSS]&#x60;, following ISO 8601. | [optional] 
**status** | **String** | Status of the batch request | [optional] 
**error** | [**ErrorObject**](ErrorObject.md) |  | [optional] 



## Enum: StatusEnum


* `QUEUED` (value: `"QUEUED"`)

* `EXECUTING` (value: `"EXECUTING"`)

* `CREATED` (value: `"CREATED"`)

* `FAILED` (value: `"FAILED"`)




