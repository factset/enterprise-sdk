

# UploadStatusResponseParameters

Uploaded status response parameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uploadId** | **String** | Unique Identifier for the file |  [optional]
**fileName** | **String** | Actuarial Scenario file name |  [optional]
**asOfDate** | **LocalDate** | Scenario As of Date |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Actuarial Scenario File Type |  [optional]
**acfpStatus** | [**AcfpStatusEnum**](#AcfpStatusEnum) | The ACFP status of the uploaded file, can be one of the following: - &#x60;pending&#x60;: File validation is pending. - &#x60;validating&#x60;:File is being validated. - &#x60;error&#x60;: File failed validation.  - &#x60;replicating&#x60;: File is being copied. - &#x60;good&#x60;: File is successfully validated. - &#x60;preparing&#x60;: File is being parsed.  - &#x60;uninitiated&#x60;: File upload is not initiated. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the uploaded file, can be one of the following: |  [optional]
**uploadDateTime** | **OffsetDateTime** | The time stamp when the file is uploaded |  [optional]
**numberOfScenarios** | **BigDecimal** | Number of scenarios that are within a scenario file |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TILLINGHAST_ACTUARIAL_SOFTWARE_TAS_ | &quot;Tillinghast Actuarial Software (TAS)&quot;
MILLIMAN_S_MG_ALFA_ALFA_ | &quot;Milliman&#39;s MG-ALFA (ALFA)&quot;
SUNGARD_IWORKS_PROPHET | &quot;Sungard iWorks Prophet&quot;
FACTSET | &quot;FactSet&quot;



## Enum: AcfpStatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
VALIDATING | &quot;validating&quot;
ERROR | &quot;error&quot;
REPLICATING | &quot;replicating&quot;
GOOD | &quot;good&quot;
PREPARING | &quot;preparing&quot;
UNINITIATED | &quot;uninitiated&quot;



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;queued&quot;
EXECUTING | &quot;executing&quot;
CREATED | &quot;created&quot;


## Implemented Interfaces

* Serializable


