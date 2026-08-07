# USFinancial

A single row of US regulatory financial data for one entity, period, and metric.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverage** | [**USCoverage**](USCoverage.md) |  | 
**request_id** | **str** | The identifier as submitted in the request (e.g., ticker or entity ID) | [optional] 
**entity_proper_name** | **str, none_type** | Institution legal name | [optional] 
**factset_entity_id** | **str, none_type** | FactSet entity identifier | [optional] 
**metric** | **str, none_type** | Metric code | [optional] 
**value** | **float, none_type** | Metric value | [optional] 
**description** | **str, none_type** | Detailed description of the metric | [optional] 
**currency** | [**CurrencyCode**](CurrencyCode.md) |  | [optional] 
**bank_type_description** | **str, none_type** | Bank type description | [optional] 
**fiscal_end_date** | **date, none_type** | Fiscal period end date in YYYY-MM-DD format | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


