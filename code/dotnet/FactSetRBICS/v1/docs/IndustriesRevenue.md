# FactSet.SDK.FactSetRBICS.Model.IndustriesRevenue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Permanent Entity Identifier. Six alpha-numeric characters, excluding vowels, with an -E suffix (XXXXXX-E). | [optional] 
**RequestId** | **string** | The RBICS Level 6 Sub-Industry identifier submitted in the request. | [optional] 
**CompanyName** | **string** | The official legal name of the company. This provides a human-readable identifier for the entity. | [optional] 
**AsOfDate** | **DateTime?** | The date of the company&#39;s financial report or filing from which the revenue data was sourced. | [optional] 
**PeriodEndDate** | **DateTime?** | The end date of the fiscal period (e.g., quarter or year) to which the reported revenue corresponds. | [optional] 
**TotalPercent** | **decimal** | The percentage of the company&#39;s total revenue that is attributable to the specified sector, based on the most recent reported data within the requested time frame. | [optional] 
**L6Id** | **decimal?** | The RBICS ID for the Level 6 (Sub-Industry) classification to which the revenue is attributed. This is the most granular level in the RBICS hierarchy. | [optional] 
**L6Name** | **string** | The descriptive name for the Level 6 (Sub-Industry) classification. | [optional] 
**Error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

