# FactSet.SDK.FactSetFundamentals.Model.PeriodsRequestBody
Parameters for requesting fiscal period information via POST.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Array of identifiers supported in async requests to &#x60;/point-in-time&#x60; and &#x60;/periods&#x60; endpoints.  Accepted types: Tickers, SEDOLs, ISINs, CUSIPs, FactSet Permanent Security, Regional, and Entity Identifiers. | 
**Periodicity** | **PeriodicityEnum** |  | [optional] 
**FiscalPeriodStart** | **DateTime** | Filters for fiscal periods ending on or after this date (YYYY-MM-DD). Used with &#x60;fiscalPeriodEnd&#x60; for a range, or alone for the earliest period. | 
**FiscalPeriodEnd** | **DateTime** | Filters for fiscal periods ending on or before this date (YYYY-MM-DD). Used with &#x60;fiscalPeriodStart&#x60; for a range, or alone for the latest period. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

