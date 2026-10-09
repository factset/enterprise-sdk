# factsetbanks.SearchEntitiesRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Array of Market Tickers or FactSet Entity IDs identifying the parent (or ultimate parent) company. Required if &#x60;searchText&#x60; is not provided. | [optional] 
**reportType** | **String** | Destination endpoint to resolve entities for. Only entities eligible for the selected reportType are returned:   * **UBPR** — subsidiary bank entities, for use with &#x60;/ubpr&#x60;   * **TEN_D** — asset-backed trust entities, for use with &#x60;/ten-d&#x60;. The trust&#39;s ultimate parent may be a bank or, for auto loan securitizations, a non-bank company (e.g., an auto manufacturer&#39;s finance arm)   * **UCC1** — subsidiary bank entities, for use with &#x60;/ucc1&#x60;   * **DEPOSIT_RATES** — subsidiary bank entities, for use with &#x60;/deposit-rates&#x60;   * **AUM_RIA** — private Registered Investment Adviser entities, for use with &#x60;/aum/ria&#x60;   * **FOCUS** — private broker-dealer entities, for use with &#x60;/focus&#x60;   * **FINANCIALS** — bank entities, for use with &#x60;/financials&#x60;   * **BRANCHES** — bank entities, for use with &#x60;/branches&#x60;   * **COUNTRY_EXPOSURE** — bank entities, for use with &#x60;/country-exposure&#x60;  | 
**startDate** | **Date** | Filters to relationships with a &#x60;startDate&#x60; on or after this date in YYYY-MM-DD format. Use with &#x60;endDate&#x60; for a date range, or alone to return all relationships from this date forward. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, all historical and currently active relationships are returned.  | [optional] 
**endDate** | **Date** | Filters to relationships with an &#x60;endDate&#x60; on or before this date in YYYY-MM-DD format. Currently active relationships have a null &#x60;endDate&#x60; and are always included regardless of this filter. Use with &#x60;startDate&#x60; for a date range, or alone to return all relationships up to this date. If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, all historical and currently active relationships are returned.  | [optional] 
**searchText** | **String** | Case-insensitive substring match against the entity&#39;s &#x60;entityProperName&#x60; or its parent&#39;s &#x60;factsetUltParentProperName&#x60;. Useful when the entity has no bank holding company above it and there&#39;s no parent ticker to supply in &#x60;ids&#x60; — search by the parent&#39;s (or the entity&#39;s own) name instead. Required if &#x60;ids&#x60; is not provided.  | [optional] 



## Enum: ReportTypeEnum


* `UBPR` (value: `"UBPR"`)

* `TEN_D` (value: `"TEN_D"`)

* `UCC1` (value: `"UCC1"`)

* `DEPOSIT_RATES` (value: `"DEPOSIT_RATES"`)

* `AUM_RIA` (value: `"AUM_RIA"`)

* `FOCUS` (value: `"FOCUS"`)

* `FINANCIALS` (value: `"FINANCIALS"`)

* `BRANCHES` (value: `"BRANCHES"`)

* `COUNTRY_EXPOSURE` (value: `"COUNTRY_EXPOSURE"`)




