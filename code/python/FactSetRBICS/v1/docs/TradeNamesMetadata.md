# TradeNamesMetadata

Request-level aggregate counts computed across every entity returned in `data`. Always present in the response regardless of `responseFormat`. Useful for at-a-glance sizing of the result set without iterating each entity. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_results** | **int, none_type** | Number of entity result objects in &#x60;data&#x60; (one per requested identifier, including those that returned an error).  | [optional] 
**successful_results** | **int, none_type** | Number of entity result objects in &#x60;data&#x60; that were processed successfully and returned trade name information.  | [optional] 
**failed_results** | **int, none_type** | Number of entity result objects in &#x60;data&#x60; that failed processing and returned an error.  | [optional] 
**total_trade_names** | **int, none_type** | Sum of tradeNames across all entities in the response. Counts every mapping row, including duplicates of the same product across multiple L6 sectors.  | [optional] 
**unique_trade_ids** | **int, none_type** | Number of distinct &#x60;tradeId&#x60; values across all entities in the response.  | [optional] 
**unique_products** | **int, none_type** | Number of distinct &#x60;productId&#x60; values across all entities in the response.  | [optional] 
**unique_l6_categories** | **int, none_type** | Number of distinct RBICS Level 6 Sub-Industry IDs (&#x60;l6Id&#x60;) that appear across all tradeName mappings in the response.  | [optional] 
**active_trade_names** | **int, none_type** | Number of tradeName mappings in the response that are still active (those with a null &#x60;endDate&#x60;).  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


