# assetcashflowprojections.BatchJobResultRoot

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | ID generated on trigerring the batch | [optional] 
**duration** | **String** | Time taken to run the batch represented in HH:MM:SS | [optional] 
**jobs** | [**[BatchJobResults]**](BatchJobResults.md) | Job id generated in the batch | [optional] 
**name** | **String** | Name of the ACFP document trigerred | [optional] 
**runDate** | **Date** | Date and time of the trigeered batch represented in MM/DD/YYYY HH:MM:SS | [optional] 
**status** | **String** | Current status of the batch | [optional] 



## Enum: StatusEnum


* `completed` (value: `"completed"`)

* `cancelled` (value: `"cancelled"`)




