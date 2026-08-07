# FactSet.SDK.FactSetBanks.Model.Ucc1FilingsRequestData
UCC-1 filing query parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Array of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Entity IDs. | 
**StartDate** | **DateTime** | Filters for UCC-1 filings with an &#x60;effectiveDate&#x60; on or after this date in YYYY-MM-DD format. Use with &#x60;endDate&#x60; for a date range, or alone to return all filings from this date forward. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent 30 days of filings are returned.  | [optional] 
**EndDate** | **DateTime** | Filters for UCC-1 filings with an &#x60;effectiveDate&#x60; on or before this date in YYYY-MM-DD format. Use with &#x60;startDate&#x60; for a date range, or alone to return all filings up to this date. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent 30 days of filings are returned.  | [optional] 
**FilingState** | **string** | Filter by US state code (e.g., \&quot;VA\&quot;, \&quot;CA\&quot;, \&quot;NY\&quot;). Omit to retrieve all states. | [optional] 
**DebtorName** | **string** | Filter by debtor name. Supports partial matching. Omit to retrieve all debtors. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

