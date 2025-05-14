# vermilion.ReportRevisionDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportStatus** | **String** | The current status of the Report generation process. | [optional] 
**startDate** | **String** | Start date of the Report generation process. | [optional] 
**finishDate** | **String** | Completion date of the Report generation process. | [optional] 
**signOffStatus** | **String** | Sign-off status of the Report. | [optional] 
**signOffNotes** | **String** | Additional notes related to the sign-off process. | [optional] 
**reportReasonCd** | **String** | Reason code for generating the Report. | [optional] 
**description** | **String** | Description of the Report revision. | [optional] 
**languageCode** | **String** | Language code of the Report. | [optional] 
**outputFormat** | **String** | Output format of the Report. | [optional] 
**percentageComplete** | **Number** | Percentage of completion for the Report generation. | [optional] 



## Enum: ReportStatusEnum


* `WAITING` (value: `"WAITING"`)

* `STARTING` (value: `"STARTING"`)

* `RETRIEVING_REQUEST` (value: `"RETRIEVING_REQUEST"`)

* `CONTENT_FILTER` (value: `"CONTENT_FILTER"`)

* `STYLE_PROCESSING` (value: `"STYLE_PROCESSING"`)

* `STYLE_PREPROCESSING` (value: `"STYLE_PREPROCESSING"`)

* `RULE_PROCESSING` (value: `"RULE_PROCESSING"`)

* `GETTING_DATA` (value: `"GETTING_DATA"`)

* `RI_PROCESSING` (value: `"RI_PROCESSING"`)

* `COMPILE` (value: `"COMPILE"`)

* `SUBSTITUTION` (value: `"SUBSTITUTION"`)

* `TRANSLATION` (value: `"TRANSLATION"`)

* `GRID_PROCESSING` (value: `"GRID_PROCESSING"`)

* `CHART_PROCESSING` (value: `"CHART_PROCESSING"`)

* `IMPORTED_FILE_PROCESSING` (value: `"IMPORTED_FILE_PROCESSING"`)

* `TEXT_PROCESSING_STATUS` (value: `"TEXT_PROCESSING_STATUS"`)

* `TOC_PROCESSING_STATUS` (value: `"TOC_PROCESSING_STATUS"`)

* `COMPONENT_PROCESSING` (value: `"COMPONENT_PROCESSING"`)

* `POST_PROCESSING` (value: `"POST_PROCESSING"`)

* `POSTING_TO_WRS` (value: `"POSTING_TO_WRS"`)

* `POSTED_TO_WRS` (value: `"POSTED_TO_WRS"`)

* `RENDERING` (value: `"RENDERING"`)

* `DOC_CREATION` (value: `"DOC_CREATION"`)

* `PDF_CONVERSION` (value: `"PDF_CONVERSION"`)

* `ABORTED` (value: `"ABORTED"`)

* `COMPLETED` (value: `"COMPLETED"`)

* `COMPLETED_CAUTIONS` (value: `"COMPLETED_CAUTIONS"`)

* `COMPLETED_ERROR` (value: `"COMPLETED_ERROR"`)

* `COMPLETED_MODIFYING` (value: `"COMPLETED_MODIFYING"`)

* `COMPLETED_CHANGED` (value: `"COMPLETED_CHANGED"`)

* `DELETING` (value: `"DELETING"`)

* `REPORT_ORIGINAL_GENERATION` (value: `"REPORT_ORIGINAL_GENERATION"`)

* `REPORT_PREVIOUS_REVISION` (value: `"REPORT_PREVIOUS_REVISION"`)

* `GENERATING` (value: `"GENERATING"`)





## Enum: SignOffStatusEnum


* `REJECTED` (value: `"REJECTED"`)

* `PENDING` (value: `"PENDING"`)

* `APPROVED` (value: `"APPROVED"`)




