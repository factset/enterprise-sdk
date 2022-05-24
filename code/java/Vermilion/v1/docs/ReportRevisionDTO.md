

# ReportRevisionDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportStatus** | [**ReportStatusEnum**](#ReportStatusEnum) |  |  [optional]
**startDate** | **String** |  |  [optional]
**finishDate** | **String** |  |  [optional]
**signOffStatus** | [**SignOffStatusEnum**](#SignOffStatusEnum) |  |  [optional]
**signOffNotes** | **String** |  |  [optional]
**reportReasonCd** | **String** |  |  [optional]
**outputFormat** | **String** |  |  [optional]
**percentageComplete** | **Integer** |  |  [optional]



## Enum: ReportStatusEnum

Name | Value
---- | -----
WAITING | &quot;WAITING&quot;
STARTING | &quot;STARTING&quot;
RETRIEVING_REQUEST | &quot;RETRIEVING_REQUEST&quot;
CONTENT_FILTER | &quot;CONTENT_FILTER&quot;
STYLE_PROCESSING | &quot;STYLE_PROCESSING&quot;
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
RENDERING | &quot;RENDERING&quot;
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


