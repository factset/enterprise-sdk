

# ExposureRequestData

Country exposure query parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Array of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Entity IDs. | 
**startDate** | **LocalDate** | Filters for fiscal periods ending on or after this date in YYYY-MM-DD format. Use with &#x60;endDate&#x60; for a date range, or alone to return all periods from this date forward. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available period is returned.  |  [optional]
**endDate** | **LocalDate** | Filters for fiscal periods ending on or before this date in YYYY-MM-DD format. Use with &#x60;startDate&#x60; for a date range, or alone to return the most recent period on or before this date. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available period is returned.  |  [optional]
**country** | **String** | Filter by ISO 3166-1 alpha-2 country code (e.g., \&quot;AU\&quot;, \&quot;GB\&quot;). Omit to retrieve all countries. |  [optional]
**currency** | **String** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). |  [optional]
**metrics** | **java.util.List&lt;String&gt;** | Array of country exposure metric codes to retrieve. Available metrics include: - CB_CLAIMS_EXCL_DERIV_GT: Cross-border claims excluding derivatives - CLAIMS_DERIV_GT: Gross claims from derivative products - CLAIMS_GT: Total cross-border and local claims - LR_CLAIMS_EXCL_DERIV_GT: Local resident claims excluding derivatives - CLAIMS_GT_BK: Claims by borrower type - Banks - CLAIMS_GT_NBFI: Claims by borrower type - Non-bank financial institutions - CLAIMS_GT_PUB: Claims by borrower type - Public sector - CLAIMS_GT_OTH: Claims by borrower type - Other  Omit to retrieve all available metrics. Use the &#x60;/metrics&#x60; endpoint to retrieve the full list of available metric codes and their definitions.  | 


## Implemented Interfaces

* Serializable


