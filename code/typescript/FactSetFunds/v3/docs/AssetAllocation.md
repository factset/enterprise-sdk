# factsetfunds.AssetAllocation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**date** | **Date** | The date in YYYY-MM-DD format. | [optional] 
**analyticsType** | [**AssetAllocationType**](AssetAllocationType.md) |  | 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**assetAllocationName** | **String** | Returns the asset type in the fund&#39;s portfolio. Data is returned for both Mutual Funds and ETFs. | [optional] 
**assetAllocationWeight** | **Number** | Returns the asset type&#39;s weight in the fund&#39;s portfolio. Data is returned for both Mutual Funds and ETFs | [optional] 


