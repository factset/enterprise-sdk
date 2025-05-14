# ReportGenerationRequest

details needed to request the generation of a report.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report** | **str** | The Report definition code. | [optional] 
**tenancy** | **str** | The tenancy code in which the report generation occurs. | [optional] 
**output_format** | **str** | The desired output format for the generated report. | [optional] 
**section_filter** | **str** | Section filter that has to be used in the report generation process. | [optional] 
**priority** | **str** | The priority level assigned to the report generation request. | [optional] 
**start_date** | **str** | The scheduled start date for generating the report. | [optional] 
**entity_selection** | [**{str: (EntitySelection,)}**](EntitySelection.md) | Specifies the Entity selections for the report generation. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


