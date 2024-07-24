# universalscreening.ResourceStatusResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**ErrorObject**](ErrorObject.md) |  | [optional] 
**id** | **String** | ID of the submitted job | [optional] 
**status** | **String** | Current status of the job.\\ &#x60;queued&#x60;: The job has not started.\\ &#x60;executing&#x60;: The job is in progress.\\ &#x60;created&#x60;: The job completed successfully.\\ &#x60;failed&#x60;: The job failed. See the &#x60;error&#x60; property for more information.\\ &#x60;cancelled&#x60;: The job was cancelled before it could finish. | [optional] 



## Enum: StatusEnum


* `queued` (value: `"queued"`)

* `executing` (value: `"executing"`)

* `created` (value: `"created"`)

* `failed` (value: `"failed"`)

* `cancelled` (value: `"cancelled"`)




