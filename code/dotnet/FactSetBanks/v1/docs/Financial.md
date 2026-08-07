# FactSet.SDK.FactSetBanks.Model.Financial
A single row of regulatory financial data for one entity, period, and metric. Structure varies by coverage type.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request (e.g., ticker or entity ID) | [optional] 
**EntityProperName** | **string** | Institution legal name | [optional] 
**FactsetEntityId** | **string** | FactSet entity identifier | [optional] 
**Metric** | **string** | Metric code | [optional] 
**Value** | **decimal?** | Metric value | [optional] 
**Description** | **string** | Detailed description of the metric | [optional] 
**Coverage** | **CreditUnionCoverage** |  | 
**Currency** | **string** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 
**BankTypeDescription** | **string** | Bank type description | [optional] 
**FiscalEndDate** | **DateTime?** | Fiscal period end date in YYYY-MM-DD format | [optional] 
**ReportEndDate** | **DateTime?** | Date corresponding to the end of the report period in YYYY-MM-DD format | [optional] 
**ReportPeriod** | **string** | Period used in the report. Format: &#x60;M#&#x60; where &#x60;#&#x60; is the month number (e.g., &#x60;M1&#x60; for January, &#x60;M12&#x60; for December). | [optional] 
**ReportDescription** | **string** | Standardized line item description from the source report | [optional] 
**Report** | **string** | Report code | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

