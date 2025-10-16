# PeriodInfo

Detailed information about a single fiscal period for a security, including its Point-in-Time validity.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The identifier provided in the input request that corresponds to this period information. | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier representing the specific data series for the requested &#x60;requestId&#x60;. | [optional] 
**fiscal_interim_number** | **int, none_type** | The sequential number of the interim period within the fiscal year (e.g., 1 for Q1, 2 for Q2). | [optional] 
**periodicity** | **str, none_type** | Periodicity code for this fiscal period (e.g., &#x60;QTR&#x60;, &#x60;ANN&#x60;). | [optional] 
**fiscal_date** | **date, none_type** | The specific date used for reporting the period end, which may occasionally differ slightly from the period&#39;s actual calendar end date (YYYY-MM-DD). | [optional] 
**fye_change** | **bool, none_type** | Flag indicating if a Fiscal Year End (FYE) change occurred during or impacted this specific period (&#x60;true&#x60; if changed, &#x60;false&#x60; otherwise). | [optional] 
**pit_start** | **datetime, none_type** | The UTC timestamp for when the fiscal period information was first published and became available. | [optional] 
**pit_end** | **datetime, none_type** | The UTC timestamp for when this version of the fiscal period information was superseded by a newer version. A &#x60;null&#x60; value indicates that this is the latest available version. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


