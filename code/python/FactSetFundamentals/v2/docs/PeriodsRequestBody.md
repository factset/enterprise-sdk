# PeriodsRequestBody

Parameters for requesting fiscal period information via POST.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**IdentifierList**](IdentifierList.md) |  | 
**fiscal_period_start** | **date** | Filters for fiscal periods ending on or after this date (YYYY-MM-DD). Used with &#x60;fiscalPeriodEnd&#x60; for a range, or alone for the earliest period. | 
**periodicity** | [**PeriodicityEnum**](PeriodicityEnum.md) |  | [optional] 
**fiscal_period_end** | **date** | Filters for fiscal periods ending on or before this date (YYYY-MM-DD). Used with &#x60;fiscalPeriodStart&#x60; for a range, or alone for the latest period. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


