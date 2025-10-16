

# PeriodsRequestBody

Parameters for requesting fiscal period information via POST.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Array of identifiers supported in async requests to &#x60;/point-in-time&#x60; and &#x60;/periods&#x60; endpoints.  Accepted types: Tickers, SEDOLs, ISINs, CUSIPs, FactSet Permanent Security, Regional, and Entity Identifiers. | 
**periodicity** | **PeriodicityEnum** |  |  [optional]
**fiscalPeriodStart** | **LocalDate** | Filters for fiscal periods ending on or after this date (YYYY-MM-DD). Used with &#x60;fiscalPeriodEnd&#x60; for a range, or alone for the earliest period. | 
**fiscalPeriodEnd** | **LocalDate** | Filters for fiscal periods ending on or before this date (YYYY-MM-DD). Used with &#x60;fiscalPeriodStart&#x60; for a range, or alone for the latest period. |  [optional]


## Implemented Interfaces

* Serializable


