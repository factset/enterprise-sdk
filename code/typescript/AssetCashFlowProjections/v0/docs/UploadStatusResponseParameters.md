# assetcashflowprojections.UploadStatusResponseParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acfpStatus** | **String** | The ACFP status of the uploaded file, can be one of the following: - &#x60;pending&#x60;: File validation is pending. - &#x60;validating&#x60;:File is being validated. - &#x60;error&#x60;: File failed validation.  - &#x60;replicating&#x60;: File is being copied. - &#x60;good&#x60;: File is successfully validated. - &#x60;preparing&#x60;: File is being parsed.  - &#x60;uninitiated&#x60;: File upload is not initiated. | [optional] 
**asOfDate** | **Date** | Scenario As of Date | [optional] 
**fileName** | **String** | Actuarial Scenario file name | [optional] 
**numberOfScenarios** | **Number** | Number of scenarios that are within a scenario file | [optional] 
**status** | **String** | The status of the uploaded file, can be one of the following: | [optional] 
**type** | **String** | Actuarial Scenario File Type | [optional] 
**uploadDateTime** | **Date** | The time stamp when the file is uploaded | [optional] 
**uploadId** | **String** | Unique Identifier for the file | [optional] 



## Enum: AcfpStatusEnum


* `pending` (value: `"pending"`)

* `validating` (value: `"validating"`)

* `error` (value: `"error"`)

* `replicating` (value: `"replicating"`)

* `good` (value: `"good"`)

* `preparing` (value: `"preparing"`)

* `uninitiated` (value: `"uninitiated"`)





## Enum: StatusEnum


* `queued` (value: `"queued"`)

* `executing` (value: `"executing"`)

* `created` (value: `"created"`)





## Enum: TypeEnum


* `Tillinghast Actuarial Software (TAS)` (value: `"Tillinghast Actuarial Software (TAS)"`)

* `Milliman&#39;s MG-ALFA (ALFA)` (value: `"Milliman's MG-ALFA (ALFA)"`)

* `Sungard iWorks Prophet` (value: `"Sungard iWorks Prophet"`)

* `FactSet` (value: `"FactSet"`)




