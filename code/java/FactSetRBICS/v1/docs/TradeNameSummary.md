

# TradeNameSummary

Aggregate counts scoped to a single entity's tradeNames. Returned when the request `responseFormat` is `SUMMARY_ONLY` or `DETAILS_WITH_SUMMARY`, and omitted when `responseFormat` is `DETAILS_ONLY`. For entities that returned an error, this object is null. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalTradeNames** | **Integer** | Total number of tradeName mapping rows for this entity (counts every product/L6 mapping, including the same product across multiple sectors).  |  [optional]
**uniqueTradeIds** | **Integer** | Distinct &#x60;tradeId&#x60; values for this entity. |  [optional]
**uniqueProducts** | **Integer** | Distinct &#x60;productId&#x60; values for this entity. |  [optional]
**uniqueL6Categories** | **Integer** | Distinct RBICS Level 6 Sub-Industry IDs (&#x60;l6Id&#x60;) this entity&#39;s tradeNames are mapped to.  |  [optional]
**activeTradeNames** | **Integer** | TradeName mappings for this entity that are still active (those with a null &#x60;endDate&#x60;).  |  [optional]


## Implemented Interfaces

* Serializable


