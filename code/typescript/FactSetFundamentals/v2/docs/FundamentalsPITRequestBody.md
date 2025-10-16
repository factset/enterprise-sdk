# factsetfundamentals.FundamentalsPITRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Array of identifiers supported in async requests to &#x60;/point-in-time&#x60; and &#x60;/periods&#x60; endpoints.  Accepted types: Tickers, SEDOLs, ISINs, CUSIPs, FactSet Permanent Security, Regional, and Entity Identifiers. | 
**periodicity** | [**PeriodicityEnum**](PeriodicityEnum.md) |  | [optional] 
**fiscalPeriodStart** | **Date** | Filters for fiscal periods ending on or after this date (YYYY-MM-DD). Used with &#x60;fiscalPeriodEnd&#x60; for a range, or alone for the earliest period. | 
**fiscalPeriodEnd** | **Date** | Filters for fiscal periods ending on or before this date (YYYY-MM-DD). Used with &#x60;fiscalPeriodStart&#x60; for a range, or alone for the latest period. | [optional] 
**metrics** | **[String]** | An array of fundamentals metric identifiers. Use the &#x60;/metrics&#x60; endpoint for a complete list of available metric identifiers. | 
**frequency** | [**FrequencyEnum**](FrequencyEnum.md) |  | [optional] 
**pitStart** | **Date** | Filters PIT snapshots taken on or after this UTC date and time. * Use ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. * If &#x60;pitStart&#x60; and &#x60;pitEnd&#x60; are omitted, the full PIT history is returned (respecting &#x60;frequency&#x60; if provided). * For a specific point in time, provide the same value for both &#x60;pitStart&#x60; and &#x60;pitEnd&#x60;.  | [optional] 
**pitEnd** | **Date** | Filters PIT snapshots taken on or before this UTC date and time. * Use ISO 8601 format: &#x60;YYYY-MM-DDTHH:MM:SSZ&#x60;. * Must be used with &#x60;pitStart&#x60; to define a range. * For a specific point in time, use the same value for both &#x60;pitStart&#x60; and &#x60;pitEnd&#x60;.  | [optional] 
**updateType** | [**UpdateType**](UpdateType.md) |  | [optional] 
**active** | **Boolean** | Optional flag to restrict results to securities that were active on the snapshot (PIT) date.  When set to true, applies point-in-time filtering based on the security&#39;s active date range. Prevents inclusion of future-dated entities. | [optional] [default to true]


