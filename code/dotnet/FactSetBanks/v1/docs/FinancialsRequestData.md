# FactSet.SDK.FactSetBanks.Model.FinancialsRequestData
Financial data query parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ids** | **List&lt;string&gt;** | Array of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Entity IDs. | 
**Periodicity** | **string** | Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual - Original   * **QTR**  &#x3D; Quarterly - Original   * **SEMI** &#x3D; Semi-Annual  If omitted, defaults to &#x60;ANN&#x60;.  | [optional] 
**StartDate** | **DateTime** | Filters for fiscal periods ending on or after this date in YYYY-MM-DD format. Use with &#x60;endDate&#x60; for a date range, or alone to return all periods from this date forward. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available period is returned.  | [optional] 
**EndDate** | **DateTime** | Filters for fiscal periods ending on or before this date in YYYY-MM-DD format. Use with &#x60;startDate&#x60; for a date range, or alone to return the most recent period on or before this date. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available period is returned.  | [optional] 
**Coverage** | **string** | Data source region or institution type.   * **US** — US banks, thrifts, and depository institutions, including bank holding companies (FFIEC/FDIC)   * **CANADA** — Canadian banks regulated by OSFI   * **AUSTRALIA** — Australian banks regulated by APRA   * **CREDIT_UNION** — US credit unions regulated by NCUA  | 
**Metrics** | **List&lt;string&gt;** | Array of metric codes to retrieve. Use the &#x60;/metrics&#x60; endpoint to retrieve the full list of available metric codes and their definitions.  | 
**Currency** | **string** | Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

