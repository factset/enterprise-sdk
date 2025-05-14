

# ReportRevisionDTO

Contains details about the Report revision.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportStatus** | [**ReportStatusEnum**](#ReportStatusEnum) | The current status of the Report generation process. |  [optional]
**startDate** | **String** | Start date of the Report generation process. |  [optional]
**finishDate** | **String** | Completion date of the Report generation process. |  [optional]
**signOffStatus** | [**SignOffStatusEnum**](#SignOffStatusEnum) | Sign-off status of the Report. |  [optional]
**signOffNotes** | **String** | Additional notes related to the sign-off process. |  [optional]
**reportReasonCd** | **String** | Reason code for generating the Report. |  [optional]
**description** | **String** | Description of the Report revision. |  [optional]
**languageCode** | **String** | Language code of the Report. |  [optional]
**outputFormat** | **String** | Output format of the Report. |  [optional]
**percentageComplete** | **BigDecimal** | Percentage of completion for the Report generation. |  [optional]



## Enum: ReportStatusEnum

Name | Value
---- | -----
WAITING | &quot;WAITING&quot;
STARTING | &quot;STARTING&quot;
RETRIEVING_REQUEST | &quot;RETRIEVING_REQUEST&quot;
CONTENT_FILTER | &quot;CONTENT_FILTER&quot;
STYLE_PROCESSING | &quot;STYLE_PROCESSING&quot;
STYLE_PREPROCESSING | &quot;STYLE_PREPROCESSING&quot;
RULE_PROCESSING | &quot;RULE_PROCESSING&quot;
GETTING_DATA | &quot;GETTING_DATA&quot;
RI_PROCESSING | &quot;RI_PROCESSING&quot;
COMPILE | &quot;COMPILE&quot;
SUBSTITUTION | &quot;SUBSTITUTION&quot;
TRANSLATION | &quot;TRANSLATION&quot;
GRID_PROCESSING | &quot;GRID_PROCESSING&quot;
CHART_PROCESSING | &quot;CHART_PROCESSING&quot;
IMPORTED_FILE_PROCESSING | &quot;IMPORTED_FILE_PROCESSING&quot;
TEXT_PROCESSING_STATUS | &quot;TEXT_PROCESSING_STATUS&quot;
TOC_PROCESSING_STATUS | &quot;TOC_PROCESSING_STATUS&quot;
COMPONENT_PROCESSING | &quot;COMPONENT_PROCESSING&quot;
POST_PROCESSING | &quot;POST_PROCESSING&quot;
POSTING_TO_WRS | &quot;POSTING_TO_WRS&quot;
POSTED_TO_WRS | &quot;POSTED_TO_WRS&quot;
RENDERING | &quot;RENDERING&quot;
DOC_CREATION | &quot;DOC_CREATION&quot;
PDF_CONVERSION | &quot;PDF_CONVERSION&quot;
ABORTED | &quot;ABORTED&quot;
COMPLETED | &quot;COMPLETED&quot;
COMPLETED_CAUTIONS | &quot;COMPLETED_CAUTIONS&quot;
COMPLETED_ERROR | &quot;COMPLETED_ERROR&quot;
COMPLETED_MODIFYING | &quot;COMPLETED_MODIFYING&quot;
COMPLETED_CHANGED | &quot;COMPLETED_CHANGED&quot;
DELETING | &quot;DELETING&quot;
REPORT_ORIGINAL_GENERATION | &quot;REPORT_ORIGINAL_GENERATION&quot;
REPORT_PREVIOUS_REVISION | &quot;REPORT_PREVIOUS_REVISION&quot;
GENERATING | &quot;GENERATING&quot;



## Enum: SignOffStatusEnum

Name | Value
---- | -----
REJECTED | &quot;REJECTED&quot;
PENDING | &quot;PENDING&quot;
APPROVED | &quot;APPROVED&quot;


## Implemented Interfaces

* Serializable


