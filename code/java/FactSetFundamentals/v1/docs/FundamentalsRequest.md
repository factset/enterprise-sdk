

# FundamentalsRequest

Fundamentals request body elements

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input.  | 
**periodicity** | **Periodicity** |  |  [optional]
**fiscalPeriodStart** | **String** | Fiscal period start expressed as YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  |  [optional]
**fiscalPeriodEnd** | **String** | Fiscal period end expressed YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  |  [optional]
**metrics** | **java.util.List&lt;String&gt;** | Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items.  | 
**currency** | **String** | Currency code for currency values. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).  |  [optional]
**restated** | **Restated** |  |  [optional]


## Implemented Interfaces

* Serializable


