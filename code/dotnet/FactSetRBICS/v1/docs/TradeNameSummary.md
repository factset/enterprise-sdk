# FactSet.SDK.FactSetRBICS.Model.TradeNameSummary
Aggregate counts scoped to a single entity's tradeNames. Returned when the request `responseFormat` is `SUMMARY_ONLY` or `DETAILS_WITH_SUMMARY`, and omitted when `responseFormat` is `DETAILS_ONLY`. For entities that returned an error, this object is null. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalTradeNames** | **int?** | Total number of tradeName mapping rows for this entity (counts every product/L6 mapping, including the same product across multiple sectors).  | [optional] 
**UniqueTradeIds** | **int?** | Distinct &#x60;tradeId&#x60; values for this entity. | [optional] 
**UniqueProducts** | **int?** | Distinct &#x60;productId&#x60; values for this entity. | [optional] 
**UniqueL6Categories** | **int?** | Distinct RBICS Level 6 Sub-Industry IDs (&#x60;l6Id&#x60;) this entity&#39;s tradeNames are mapped to.  | [optional] 
**ActiveTradeNames** | **int?** | TradeName mappings for this entity that are still active (those with a null &#x60;endDate&#x60;).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

