# FactSet.SDK.FactSetRBICS.Model.TradeName
Trade Names response object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AsOfDate** | **DateTime?** | Date of the tradeName data snapshot (YYYY-MM-DD) | [optional] 
**FactsetEntityId** | **string** | FactSet Entity Identifier | [optional] 
**RequestId** | **string** | Original identifier from request (ticker, CUSIP, entity ID, etc.) | [optional] 
**Summary** | [**TradeNameSummary**](TradeNameSummary.md) |  | [optional] 
**TradeNames** | [**List&lt;TradeNames&gt;**](TradeNames.md) | List of tradeNames for the entity on this date. Omitted when the request &#x60;responseFormat&#x60; is &#x60;SUMMARY_ONLY&#x60;.  | [optional] 
**Error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

