# FundamentalsPITRequestBody

Parameters for requesting Point-in-Time fundamentals data via POST.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**IdentifierList**](IdentifierList.md) |  | 
**fiscal_period_start** | **date** | Filters for fiscal periods ending on or after this date (YYYY-MM-DD). Used with &#x60;fiscalPeriodEnd&#x60; for a range, or alone for the earliest period. | 
**metrics** | [**MetricList**](MetricList.md) |  | 
**periodicity** | [**PeriodicityEnum**](PeriodicityEnum.md) |  | [optional] 
**fiscal_period_end** | **date** | Filters for fiscal periods ending on or before this date (YYYY-MM-DD). Used with &#x60;fiscalPeriodStart&#x60; for a range, or alone for the latest period. | [optional] 
**frequency** | [**FrequencyEnum**](FrequencyEnum.md) |  | [optional] 
**pit_start** | **datetime** | Filters PIT snapshots taken on or after this UTC date and time. * Use ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. * If &#x60;pitStart&#x60; and &#x60;pitEnd&#x60; are omitted, the full PIT history is returned (respecting &#x60;frequency&#x60; if provided). * For a specific point in time, provide the same value for both &#x60;pitStart&#x60; and &#x60;pitEnd&#x60;.  | [optional] 
**pit_end** | **datetime** | Filters PIT snapshots taken on or before this UTC date and time. * Use ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. * Must be used with &#x60;pitStart&#x60; to define a range. * For a specific point in time, use the same value for both &#x60;pitStart&#x60; and &#x60;pitEnd&#x60;.  | [optional] 
**update_type** | [**UpdateType**](UpdateType.md) |  | [optional] 
**active** | **bool** | Optional flag to restrict results to securities that were active on the snapshot (PIT) date.  When set to true, applies point-in-time filtering based on the security&#39;s active date range. Prevents inclusion of future-dated entities. | [optional]  if omitted the server will use the default value of True
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


