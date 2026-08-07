# FactSet.SDK.FactSetBanks.Model.Performance
A single row of UBPR performance data for one entity, metric, and reporting period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The identifier as submitted in the request (e.g., ticker or entity ID) | [optional] 
**FiscalEndDate** | **DateTime** | Fiscal period end date in YYYY-MM-DD format. | [optional] 
**Currency** | **string** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 
**PeerGroupName** | **string** | Descriptive name of the FFIEC peer group. Peer groups are curated sets of similar banks used to benchmark how an institution performs relative to its peers.  | [optional] 
**PeerGroupRank** | **int?** | The percentile ranking (0-99) of the institution within its peer group for a given ratio. | [optional] 
**EntityProperName** | **string** | Institution legal name | [optional] 
**FactsetEntityId** | **string** | FactSet entity identifier | [optional] 
**Metric** | **string** | Metric code | [optional] 
**Value** | **decimal?** | Metric value | [optional] 
**Description** | **string** | Detailed description of the metric | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

