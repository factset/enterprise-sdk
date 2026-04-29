# FactSet.SDK.FactSetFunds.Model.AssetAllocation
Portfolio asset allocation showing weight distribution across asset types such as equity, bonds, and cash

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Date** | **DateTime?** | The date in YYYY-MM-DD format. | [optional] 
**AnalyticsType** | **AssetAllocationType** |  | 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**AssetAllocationName** | **string** | Returns the asset type in the fund&#39;s portfolio. Data is returned for both Mutual Funds and ETFs. | [optional] 
**AssetAllocationWeight** | **double?** | Returns the asset type&#39;s weight in the fund&#39;s portfolio. Data is returned for both Mutual Funds and ETFs | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

