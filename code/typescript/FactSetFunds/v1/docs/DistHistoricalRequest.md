# factsetfunds.DistHistoricalRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt;  | 
**startDate** | **String** | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**endDate** | **String** | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
**frequency** | [**Frequency**](Frequency.md) |  | [optional] 
**currency** | **String** | The ISO3 currency control for the requested fund. | [optional] [default to &#39;LOCAL&#39;]
**splitAdjust** | **Boolean** | Controls the split adjustment of the Fund&#39;s NAV.  | [optional] [default to true]


