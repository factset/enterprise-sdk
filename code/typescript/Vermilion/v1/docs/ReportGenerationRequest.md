# vermilion.ReportGenerationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report** | **String** | The Report definition code. | [optional] 
**tenancy** | **String** | The tenancy code in which the report generation occurs. | [optional] 
**outputFormat** | **String** | The desired output format for the generated report. | [optional] 
**sectionFilter** | **String** | Section filter that has to be used in the report generation process. | [optional] 
**priority** | **String** | The priority level assigned to the report generation request. | [optional] 
**startDate** | **String** | The scheduled start date for generating the report. | [optional] 
**entitySelection** | [**{String: EntitySelection}**](EntitySelection.md) | Specifies the Entity selections for the report generation. | [optional] 



## Enum: OutputFormatEnum


* `WORD` (value: `"WORD"`)

* `WORD2010` (value: `"WORD2010"`)

* `EXCEL` (value: `"EXCEL"`)

* `EXCEL2010` (value: `"EXCEL2010"`)

* `PPT` (value: `"PPT"`)

* `PPT2010` (value: `"PPT2010"`)

* `PDF` (value: `"PDF"`)

* `CSV` (value: `"CSV"`)

* `XML` (value: `"XML"`)

* `VXML` (value: `"VXML"`)

* `HTML` (value: `"HTML"`)

* `PS` (value: `"PS"`)




