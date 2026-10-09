# FactSet.SDK.FactSetRBICS.Model.TradeNamesMetadata
Request-level aggregate counts computed across every entity returned in `data`. Always present in the response regardless of `responseFormat`. Useful for at-a-glance sizing of the result set without iterating each entity. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalResults** | **int?** | Number of entity result objects in &#x60;data&#x60; (one per requested identifier, including those that returned an error).  | [optional] 
**SuccessfulResults** | **int?** | Number of entity result objects in &#x60;data&#x60; that were processed successfully and returned trade name information.  | [optional] 
**FailedResults** | **int?** | Number of entity result objects in &#x60;data&#x60; that failed processing and returned an error.  | [optional] 
**TotalTradeNames** | **int?** | Sum of tradeNames across all entities in the response. Counts every mapping row, including duplicates of the same product across multiple L6 sectors.  | [optional] 
**UniqueTradeIds** | **int?** | Number of distinct &#x60;tradeId&#x60; values across all entities in the response.  | [optional] 
**UniqueProducts** | **int?** | Number of distinct &#x60;productId&#x60; values across all entities in the response.  | [optional] 
**UniqueL6Categories** | **int?** | Number of distinct RBICS Level 6 Sub-Industry IDs (&#x60;l6Id&#x60;) that appear across all tradeName mappings in the response.  | [optional] 
**ActiveTradeNames** | **int?** | Number of tradeName mappings in the response that are still active (those with a null &#x60;endDate&#x60;).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

