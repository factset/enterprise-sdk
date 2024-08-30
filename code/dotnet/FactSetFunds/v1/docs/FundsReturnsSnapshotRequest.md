# FactSet.SDK.FactSetFunds.Model.FundsReturnsSnapshotRequest
Returns Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt;  | 
**Date** | **string** | The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the &#x60;priceRecentDate&#x60; found within the /summary endpoint.  | [optional] 
**DividendAdjust** | [**DividendAdjust**](DividendAdjust.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

