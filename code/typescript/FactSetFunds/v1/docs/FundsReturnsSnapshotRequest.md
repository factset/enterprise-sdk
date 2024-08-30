# factsetfunds.FundsReturnsSnapshotRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt;  | 
**date** | **String** | The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the &#x60;priceRecentDate&#x60; found within the /summary endpoint.  | [optional] 
**dividendAdjust** | [**DividendAdjust**](DividendAdjust.md) |  | [optional] 


