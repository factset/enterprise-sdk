# FactSet.SDK.FactSetFunds.Model.SectorWeightage
Sector allocation percentages based on FactSet RBICS classification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**AnalyticsType** | **SectorWeightageType** |  | 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**Sector** | **string** | Sector data based on FactSet RBICS classification. | [optional] 
**SectorWeightagePercentage** | **double?** | The percentage weight of the sector in the fund&#39;s portfolio, based on FactSet RBICS classification. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

