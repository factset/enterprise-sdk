

# ReportGenerationRequest

details needed to request the generation of a report.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report** | **String** | The Report definition code. |  [optional]
**tenancy** | **String** | The tenancy code in which the report generation occurs. |  [optional]
**outputFormat** | [**OutputFormatEnum**](#OutputFormatEnum) | The desired output format for the generated report. |  [optional]
**sectionFilter** | **String** | Section filter that has to be used in the report generation process. |  [optional]
**priority** | **String** | The priority level assigned to the report generation request. |  [optional]
**startDate** | **String** | The scheduled start date for generating the report. |  [optional]
**entitySelection** | [**Map&lt;String, EntitySelection&gt;**](EntitySelection.md) | Specifies the Entity selections for the report generation. |  [optional]



## Enum: OutputFormatEnum

Name | Value
---- | -----
WORD | &quot;WORD&quot;
WORD2010 | &quot;WORD2010&quot;
EXCEL | &quot;EXCEL&quot;
EXCEL2010 | &quot;EXCEL2010&quot;
PPT | &quot;PPT&quot;
PPT2010 | &quot;PPT2010&quot;
PDF | &quot;PDF&quot;
CSV | &quot;CSV&quot;
XML | &quot;XML&quot;
VXML | &quot;VXML&quot;
HTML | &quot;HTML&quot;
PS | &quot;PS&quot;


## Implemented Interfaces

* Serializable


