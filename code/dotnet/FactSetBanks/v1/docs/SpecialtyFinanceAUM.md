# FactSet.SDK.FactSetBanks.Model.SpecialtyFinanceAUM
A single row of Form ADV assets under management data for one entity and metric.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | Request identifier, typically the entity identifier submitted in the request | 
**EntityProperName** | **string** | Institution legal name | [optional] 
**FactsetEntityId** | **string** | FactSet entity identifier | [optional] 
**Metric** | **string** | Metric code | [optional] 
**Value** | **decimal?** | Metric value | [optional] 
**Description** | **string** | Detailed description of the metric | [optional] 
**FiscalEndDate** | **DateTime?** | Fiscal period end date in YYYY-MM-DD format | [optional] 
**FilingDate** | **DateTime?** | Date the Form ADV filing was submitted | [optional] 
**Currency** | **string** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 
**ReportType** | **AUMReportType** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

