# IndustriesRevenue


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | FactSet Permanent Entity Identifier. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E). | [optional] 
**request_id** | **str** | The RBICS Level 6 Sub-Industry identifier submitted in the request. | [optional] 
**company_name** | **str, none_type** | The official legal name of the company. This provides a human-readable identifier for the entity. | [optional] 
**as_of_date** | **date, none_type** | The date of the company&#39;s financial report or filing from which the revenue data was sourced. | [optional] 
**period_end_date** | **date, none_type** | The end date of the fiscal period (e.g., quarter or year) to which the reported revenue corresponds. | [optional] 
**total_percent** | **float** | The percentage of the company&#39;s total revenue that is attributable to the specified sector, based on the most recent reported data within the requested time frame. | [optional] 
**l6_id** | **float, none_type** | The RBICS ID for the Level 6 (Sub-Industry) classification to which the revenue is attributed. This is the most granular level in the RBICS hierarchy. | [optional] 
**l6_name** | **str, none_type** | The descriptive name for the Level 6 (Sub-Industry) classification. | [optional] 
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


