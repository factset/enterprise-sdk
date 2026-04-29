

# AssetAllocation

Portfolio asset allocation showing weight distribution across asset types such as equity, bonds, and cash

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**date** | **LocalDate** | The date in YYYY-MM-DD format. |  [optional]
**analyticsType** | **AssetAllocationType** |  | 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**assetAllocationName** | **String** | Returns the asset type in the fund&#39;s portfolio. Data is returned for both Mutual Funds and ETFs. |  [optional]
**assetAllocationWeight** | **Double** | Returns the asset type&#39;s weight in the fund&#39;s portfolio. Data is returned for both Mutual Funds and ETFs |  [optional]


## Implemented Interfaces

* Serializable


