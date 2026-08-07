# factsetbanks.RatesRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Array of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Entity IDs. | 
**startDate** | **Date** | Filters for deposit rate records with an &#x60;asOfDate&#x60; on or after this date in YYYY-MM-DD format. Use with &#x60;endDate&#x60; for a date range, or alone to return all records from this date forward. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available rates are returned.  | [optional] 
**endDate** | **Date** | Filters for deposit rate records with an &#x60;asOfDate&#x60; on or before this date in YYYY-MM-DD format. Use with &#x60;startDate&#x60; for a date range, or alone to return the most recent rates on or before this date. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available rates are returned.  | [optional] 
**currency** | **String** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 
**depositProduct** | **String** | Filter by deposit product type (e.g., \&quot;Savings\&quot;, \&quot;Certificate of Deposit\&quot;, \&quot;Fixed Rate IRA\&quot;). Omit to retrieve all products.  | [optional] 
**term** | **String** | Filter by product term (e.g., \&quot;0 Month\&quot;, \&quot;1 Year\&quot;, \&quot;18 Months\&quot;, \&quot;All\&quot;). Omit to retrieve all terms.  | [optional] 
**state** | [**USStateCode**](USStateCode.md) |  | [optional] 


