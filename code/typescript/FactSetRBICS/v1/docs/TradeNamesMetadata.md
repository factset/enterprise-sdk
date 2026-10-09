# factsetrbics.TradeNamesMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalResults** | **Number** | Number of entity result objects in &#x60;data&#x60; (one per requested identifier, including those that returned an error).  | [optional] 
**successfulResults** | **Number** | Number of entity result objects in &#x60;data&#x60; that were processed successfully and returned trade name information.  | [optional] 
**failedResults** | **Number** | Number of entity result objects in &#x60;data&#x60; that failed processing and returned an error.  | [optional] 
**totalTradeNames** | **Number** | Sum of tradeNames across all entities in the response. Counts every mapping row, including duplicates of the same product across multiple L6 sectors.  | [optional] 
**uniqueTradeIds** | **Number** | Number of distinct &#x60;tradeId&#x60; values across all entities in the response.  | [optional] 
**uniqueProducts** | **Number** | Number of distinct &#x60;productId&#x60; values across all entities in the response.  | [optional] 
**uniqueL6Categories** | **Number** | Number of distinct RBICS Level 6 Sub-Industry IDs (&#x60;l6Id&#x60;) that appear across all tradeName mappings in the response.  | [optional] 
**activeTradeNames** | **Number** | Number of tradeName mappings in the response that are still active (those with a null &#x60;endDate&#x60;).  | [optional] 


