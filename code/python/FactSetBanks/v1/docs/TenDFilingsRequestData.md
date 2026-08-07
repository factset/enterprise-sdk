# TenDFilingsRequestData

Form 10-D filing query parameters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**metrics** | **[str]** | Array of Form 10-D metric codes to retrieve. Available metrics include: - Principal Receivables: PRIN_RECEIV_BEG, PRIN_RECEIV_END, PRIN_RECEIV_NET_CHG - Finance Charge Receivables: FIN_CHRG_RECEIV_BEG, FIN_CHRG_RECEIV_END, FIN_CHRG_RECEIV_NET_CHG - Current/Delinquent: RECEIV_CURR, RECEIV_DELQ_1_29, RECEIV_DELQ_30_59, RECEIV_DELQ_60_89, RECEIV_DELQ_90_119, RECEIV_DELQ_120_149, RECEIV_DELQ_150_179, RECEIV_DELQ_180_OVER - Delinquency Percentages: RECEIV_CURR_PCT, RECEIV_DELQ_1_29_PCT, RECEIV_DELQ_30_OVER, RECEIV_DELQ_60_OVER, RECEIV_DELQ_90_OVER, RECEIV_DELQ_120_OVER, RECEIV_DELQ_150_OVER - Number of Receivables: NO_RECEIV_DELQ_1_29, NO_RECEIV_DELQ_30_59, NO_RECEIV_DELQ_TOT - Monthly Collections: MTC_PRIN, MTC_FIN_CHRG_TOT, MTC_FIN_CHRG_FEE, MTC_INVEST_INC, MTC_ICF, MTC_RECOV  Use the &#x60;/metrics&#x60; endpoint to retrieve the full list of available metric codes and their definitions.  | 
**start_date** | **date** | Filters for filings with a &#x60;filingDate&#x60; on or after this date in YYYY-MM-DD format. Use with &#x60;endDate&#x60; for a date range, or alone to return all filings from this date forward. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent 30 days of filings are returned.  | [optional] 
**end_date** | **date** | Filters for filings with a &#x60;filingDate&#x60; on or before this date in YYYY-MM-DD format. Use with &#x60;startDate&#x60; for a date range, or alone to return the most recent filings on or before this date. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent 30 days of filings are returned.  | [optional] 
**currency** | [**CurrencyCode**](CurrencyCode.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


