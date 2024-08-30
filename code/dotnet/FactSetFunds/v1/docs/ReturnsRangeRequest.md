# FactSet.SDK.FactSetFunds.Model.ReturnsRangeRequest
Returns Range Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt;  | 
**StartDate** | **string** | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to the day prior to today&#39;s previous close. The startDate cannot be equal to the endDate as no return can be computed. Additionally, the startDate MUST be equal to or greater than the &#x60;priceFirstDate&#x60; found within the /summary endpoint.  | [optional] 
**EndDate** | **string** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**DividendAdjust** | [**DividendAdjust**](DividendAdjust.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

