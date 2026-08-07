# Exposure

A single row of country exposure data for one entity, country, and metric.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier as submitted in the request (e.g., ticker or entity ID) | [optional] 
**fiscal_end_date** | **date** | Fiscal period end date in YYYY-MM-DD format | [optional] 
**country** | **str** | ISO 3166-1 alpha-2 country code | [optional] 
**currency** | **str, none_type** | Currency code for financial values (ISO 4217). Null for percentage or count metrics. For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 
**entity_proper_name** | **str, none_type** | Institution legal name | [optional] 
**factset_entity_id** | **str, none_type** | FactSet entity identifier | [optional] 
**metric** | **str, none_type** | Metric code | [optional] 
**value** | **float, none_type** | Metric value | [optional] 
**description** | **str, none_type** | Detailed description of the metric | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


