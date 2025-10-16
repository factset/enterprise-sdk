# FactSet.SDK.FactSetFundamentals.Model.BatchResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier provided in the input request that corresponds to this period information. | [optional] 
**FsymId** | **string** | FactSet Regional Security Identifier representing the specific data series for the requested &#x60;requestId&#x60;. | [optional] 
**Metric** | **string** | The identifier of the fundamental metric being reported (e.g., &#x60;FF_SALES&#x60;). | [optional] 
**Periodicity** | **string** | Periodicity code for this fiscal period (e.g., &#x60;QTR&#x60;, &#x60;ANN&#x60;). | [optional] 
**FiscalPeriod** | **int?** | Integer representing the fiscal period. For &#x60;QTR&#x60; periodicity, possible values are 1, 2, 3, or 4. For &#x60;SEMI&#x60; periodicity, possible values are 1 or 2. | 
**FiscalYear** | **int?** | Fiscal year of the reported period, expressed in a YYYY format. | [optional] 
**FiscalPeriodLength** | **int?** | Length of the fiscal period in days. | [optional] 
**FiscalEndDate** | **DateTime?** | The official ending date of the fiscal period (YYYY-MM-DD). | [optional] 
**ReportDate** | **DateTime?** | The date the reported fiscal period ended. | [optional] 
**EpsReportDate** | **DateTime?** | The date the EPS was reported for the requested periodicity. In YYYY-MM-DD format. | [optional] 
**UpdateType** | **string** | Indicates the status of the source filing when this data point was recorded (&#x60;Preliminary&#x60; or &#x60;Final&#x60;). | [optional] 
**Currency** | **string** | Currency of the reported &#x60;value&#x60;, expressed as a 3-character ISO 4217 code. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**Value** | [**FundamentalValue**](FundamentalValue.md) |  | [optional] 
**Label** | **string** | Report labels of the segment type requested. | 
**Date** | **DateTime?** | Date for the period requested expressed in YYYY-MM-DD format | [optional] 
**PitStart** | **DateTime?** | The UTC timestamp for when the fiscal period information was first published and became available. | [optional] 
**PitEnd** | **DateTime?** | The UTC timestamp for when this version of the fiscal period information was superseded by a newer version. A &#x60;null&#x60; value indicates that this is the latest available version. | [optional] 
**FiscalInterimNumber** | **int?** | The sequential number of the interim period within the fiscal year (e.g., 1 for Q1, 2 for Q2). | [optional] 
**FiscalDate** | **DateTime?** | The specific date used for reporting the period end, which may occasionally differ slightly from the period&#39;s actual calendar end date (YYYY-MM-DD). | [optional] 
**FyeChange** | **bool?** | Flag indicating if a Fiscal Year End (FYE) change occurred during or impacted this specific period (&#x60;true&#x60; if changed, &#x60;false&#x60; otherwise). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

