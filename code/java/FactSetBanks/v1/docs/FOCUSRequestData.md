

# FOCUSRequestData

FOCUS report query parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Array of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Entity IDs. | 
**startDate** | **LocalDate** | Filters for fiscal periods ending on or after this date in YYYY-MM-DD format. Use with &#x60;endDate&#x60; for a date range, or alone to return all periods from this date forward. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available period is returned.  |  [optional]
**endDate** | **LocalDate** | Filters for fiscal periods ending on or before this date in YYYY-MM-DD format. Use with &#x60;startDate&#x60; for a date range, or alone to return the most recent period on or before this date. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available period is returned.  |  [optional]
**currency** | **String** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). |  [optional]
**metrics** | **java.util.List&lt;String&gt;** | Array of FOCUS metric codes to retrieve.  - Income Statement: FSF_FR_COMMISS_FEE_INC, FSF_FR_COMMISS_FEE_EXP, FSF_FR_COMMISS_FEE_EXP_OTH - Balance Sheet: Various asset and liability metrics - Net Capital: FSF_FR_NET_CAP, FSF_FR_FM_NET_CAP_REQ, FSF_FR_FM_NET_CAP_REQ_ALT  Omit to retrieve all available metrics. Use the &#x60;/metrics&#x60; endpoint to retrieve the full list of available metric codes and their definitions.  | 


## Implemented Interfaces

* Serializable


