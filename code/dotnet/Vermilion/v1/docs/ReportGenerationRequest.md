# FactSet.SDK.Vermilion.Model.ReportGenerationRequest
details needed to request the generation of a report.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Report** | **string** | The Report definition code. | [optional] 
**Tenancy** | **string** | The tenancy code in which the report generation occurs. | [optional] 
**OutputFormat** | **string** | The desired output format for the generated report. | [optional] 
**SectionFilter** | **string** | Section filter that has to be used in the report generation process. | [optional] 
**Priority** | **string** | The priority level assigned to the report generation request. | [optional] 
**StartDate** | **string** | The scheduled start date for generating the report. | [optional] 
**EntitySelection** | [**Dictionary&lt;string, EntitySelection&gt;**](EntitySelection.md) | Specifies the Entity selections for the report generation. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

