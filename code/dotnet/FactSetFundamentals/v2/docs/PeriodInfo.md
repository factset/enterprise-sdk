# FactSet.SDK.FactSetFundamentals.Model.PeriodInfo
Detailed information about a single fiscal period for a security, including its Point-in-Time validity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier provided in the input request that corresponds to this period information. | [optional] 
**FsymId** | **string** | FactSet Regional Security Identifier representing the specific data series for the requested &#x60;requestId&#x60;. | [optional] 
**FiscalInterimNumber** | **int?** | The sequential number of the interim period within the fiscal year (e.g., 1 for Q1, 2 for Q2). | [optional] 
**Periodicity** | **string** | Periodicity code for this fiscal period (e.g., &#x60;QTR&#x60;, &#x60;ANN&#x60;). | [optional] 
**FiscalDate** | **DateTime?** | The specific date used for reporting the period end, which may occasionally differ slightly from the period&#39;s actual calendar end date (YYYY-MM-DD). | [optional] 
**FyeChange** | **bool?** | Flag indicating if a Fiscal Year End (FYE) change occurred during or impacted this specific period (&#x60;true&#x60; if changed, &#x60;false&#x60; otherwise). | [optional] 
**PitStart** | **DateTime?** | The UTC timestamp for when the fiscal period information was first published and became available. | [optional] 
**PitEnd** | **DateTime?** | The UTC timestamp for when this version of the fiscal period information was superseded by a newer version. A &#x60;null&#x60; value indicates that this is the latest available version. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

