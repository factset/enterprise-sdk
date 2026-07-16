# factsetrbics.EntityRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. Max Ids of 2500.  | 
**startDate** | **Date** | Specifies the start date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and forward. The &#x60;startDate&#x60; must be equal to or before the &#x60;endDate&#x60;. Future dates (T+1) are not accepted in this endpoint. &lt;br&gt; Note: &lt;br&gt; - If omitted while &#x60;endDate&#x60; is specified: Data will be fetched from the earliest available record up to the specified end date. &lt;br&gt; - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data. | [optional] 
**endDate** | **Date** | Specifies the end date for the requested date range, formatted as **YYYY-MM-DD**. The data returned will be reflective of the classifications or revenue data as of this date and earlier. The &#x60;endDate&#x60; must be equal to or after the &#x60;startDate&#x60;. Future dates (T+1) are not accepted in this endpoint. &lt;br&gt; Note: &lt;br&gt; - If omitted (with &#x60;startDate&#x60; specified): Data will be returned from the specified start date up to the most recent available date. &lt;br&gt; - If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted: The response will return the latest available data. | [optional] 
**level** | **Number** | Specifies the deepest level of the RBICS taxonomy to be included in the revenue breakdown. The response will include all levels from 1 up to the specified level. For example, a value of &#39;3&#39; will return revenue percentages for Economy (L1), Sector (L2), and Sub-Sector (L3). The default behavior is to return all 6 levels. | [optional] 


