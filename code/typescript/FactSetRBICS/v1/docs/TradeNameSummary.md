# factsetrbics.TradeNameSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalTradeNames** | **Number** | Total number of tradeName mapping rows for this entity (counts every product/L6 mapping, including the same product across multiple sectors).  | [optional] 
**uniqueTradeIds** | **Number** | Distinct &#x60;tradeId&#x60; values for this entity. | [optional] 
**uniqueProducts** | **Number** | Distinct &#x60;productId&#x60; values for this entity. | [optional] 
**uniqueL6Categories** | **Number** | Distinct RBICS Level 6 Sub-Industry IDs (&#x60;l6Id&#x60;) this entity&#39;s tradeNames are mapped to.  | [optional] 
**activeTradeNames** | **Number** | TradeName mappings for this entity that are still active (those with a null &#x60;endDate&#x60;).  | [optional] 


