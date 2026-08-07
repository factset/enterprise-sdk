# FactSet.SDK.FactSetBanks.Model.Exposure
A single row of country exposure data for one entity, country, and metric.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request (e.g., ticker or entity ID) | [optional] 
**FiscalEndDate** | **DateTime** | Fiscal period end date in YYYY-MM-DD format | [optional] 
**Country** | **string** | ISO 3166-1 alpha-2 country code | [optional] 
**Currency** | **string** | Currency code for financial values (ISO 4217). Null for percentage or count metrics. For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 
**EntityProperName** | **string** | Institution legal name | [optional] 
**FactsetEntityId** | **string** | FactSet entity identifier | [optional] 
**Metric** | **string** | Metric code | [optional] 
**Value** | **decimal?** | Metric value | [optional] 
**Description** | **string** | Detailed description of the metric | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

