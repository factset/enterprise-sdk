# factsetfundamentals.FundamentalsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input.  | 
**periodicity** | [**Periodicity**](Periodicity.md) |  | [optional] 
**fiscalPeriodStart** | **String** | Fiscal period start expressed as YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  | [optional] 
**fiscalPeriodEnd** | **String** | Fiscal period end expressed YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  | [optional] 
**metrics** | **[String]** | Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items.  | 
**currency** | **String** | Currency code for currency values. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).  | [optional] [default to &#39;LOCAL&#39;]
**restated** | [**Restated**](Restated.md) |  | [optional] 


