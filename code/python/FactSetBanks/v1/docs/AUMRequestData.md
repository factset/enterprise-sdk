# AUMRequestData

Form ADV AUM query parameters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**Ids**](Ids.md) |  | 
**metrics** | **[str]** | Array of AUM metric codes to retrieve.  - Total AUM: aum_tot, aum_discre, aum_non_discre - AUM by Client Type: aum_hnwi, aum_indiv_excl_hnwi, aum_bk_thrift, aum_invest_co, aum_bdc, aum_piv, aum_pension_psp, aum_char_org, aum_state_muni, aum_oth_invest_adv, aum_ins_co, aum_swf_foi, aum_corp_oth_bus - Geographic: aum_us_per, aum_non_us_per  Omit to retrieve all available metrics. Use the &#x60;/metrics&#x60; endpoint to retrieve the full list of available metric codes and their definitions.  | 
**start_date** | **date** | Filters for fiscal periods ending on or after this date in YYYY-MM-DD format. Use with &#x60;endDate&#x60; for a date range, or alone to return all periods from this date forward. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available period is returned.  | [optional] 
**end_date** | **date** | Filters for fiscal periods ending on or before this date in YYYY-MM-DD format. Use with &#x60;startDate&#x60; for a date range, or alone to return the most recent period on or before this date. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the most recent available period is returned.  | [optional] 
**currency** | [**CurrencyCode**](CurrencyCode.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


