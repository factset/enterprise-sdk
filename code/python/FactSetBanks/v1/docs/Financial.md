# Financial

A single row of regulatory financial data for one entity, period, and metric. Structure varies by coverage type.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverage** | [**CreditUnionCoverage**](CreditUnionCoverage.md) |  | 
**request_id** | **str** | The identifier as submitted in the request (e.g., ticker or entity ID) | [optional] 
**entity_proper_name** | **str, none_type** | Institution legal name | [optional] 
**factset_entity_id** | **str, none_type** | FactSet entity identifier | [optional] 
**metric** | **str, none_type** | Metric code | [optional] 
**value** | **float, none_type** | Metric value | [optional] 
**description** | **str, none_type** | Detailed description of the metric | [optional] 
**currency** | [**CurrencyCode**](CurrencyCode.md) |  | [optional] 
**bank_type_description** | **str, none_type** | Bank type description | [optional] 
**fiscal_end_date** | **date, none_type** | Fiscal period end date in YYYY-MM-DD format | [optional] 
**report_end_date** | **date, none_type** | Date corresponding to the end of the report period in YYYY-MM-DD format | [optional] 
**report_period** | **str, none_type** | Period used in the report. Format: &#x60;M#&#x60; where &#x60;#&#x60; is the month number (e.g., &#x60;M1&#x60; for January, &#x60;M12&#x60; for December). | [optional] 
**report_description** | **str, none_type** | Standardized line item description from the source report | [optional] 
**report** | **str, none_type** | Report code | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


