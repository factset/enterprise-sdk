# fixedincomeanalyticsbatcher.FIABCalculationStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] 
**status** | **String** | FIAB service batch status integer definitions.  See https://pages.github.factset.com/FactSet/fipa-inf-docs/service/fiab_batch_api.html#lt-uuid-gt. | [optional] 
**startdatetime** | **Date** |  | [optional] 
**completiondatetime** | **Date** |  | [optional] 
**progress** | **Number** |  | [optional] 
**batchevents** | [**[EventSummary]**](EventSummary.md) |  | [optional] 



## Enum: StatusEnum


* `Pending` (value: `"Pending"`)

* `InProgress` (value: `"InProgress"`)

* `Done` (value: `"Done"`)

* `Paused` (value: `"Paused"`)

* `Cancelled` (value: `"Cancelled"`)

* `Error` (value: `"Error"`)




