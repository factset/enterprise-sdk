# FinancialsRequestData

Financial data query parameters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**coverage** | **str** | Data source region or institution type.   * **US** — US banks, thrifts, and depository institutions, including bank holding companies (FFIEC/FDIC)   * **CANADA** — Canadian banks regulated by OSFI   * **AUSTRALIA** — Australian banks regulated by APRA   * **CREDIT_UNION** — US credit unions regulated by NCUA  | 
**metrics** | **[str]** | Array of metric codes to retrieve. Use the &#x60;/metrics&#x60; endpoint to retrieve the full list of available metric codes and their definitions.  | 
**periodicity** | **str** | Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual - Original   * **QTR**  &#x3D; Quarterly - Original   * **SEMI** &#x3D; Semi-Annual  If omitted, defaults to &#x60;ANN&#x60;.  | [optional] 
**start_date** | **date** | Filters for fiscal periods ending on or after this date in YYYY-MM-DD format. Use with &#x60;endDate&#x60; for a date range, or alone to return all periods from this date forward. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available period is returned.  | [optional] 
**end_date** | **date** | Filters for fiscal periods ending on or before this date in YYYY-MM-DD format. Use with &#x60;startDate&#x60; for a date range, or alone to return the most recent period on or before this date. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available period is returned.  | [optional] 
**currency** | [**CurrencyCode**](CurrencyCode.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


