# SpecialtyFinanceAUM

A single row of Form ADV assets under management data for one entity and metric.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Request identifier, typically the entity identifier submitted in the request | 
**report_type** | [**AUMReportType**](AUMReportType.md) |  | 
**entity_proper_name** | **str** | Institution legal name | [optional] 
**factset_entity_id** | **str** | FactSet entity identifier | [optional] 
**metric** | **str** | Metric code | [optional] 
**value** | **float, none_type** | Metric value | [optional] 
**description** | **str, none_type** | Detailed description of the metric | [optional] 
**fiscal_end_date** | **date, none_type** | Fiscal period end date in YYYY-MM-DD format | [optional] 
**filing_date** | **date, none_type** | Date the Form ADV filing was submitted | [optional] 
**currency** | [**CurrencyCode**](CurrencyCode.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


