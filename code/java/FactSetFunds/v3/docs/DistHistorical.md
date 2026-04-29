

# DistHistorical

Historical distribution data including dividends, capital gains, and yields over time

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**date** | **LocalDate** | The date of the distribution in YYYY-MM-DD format. |  [optional]
**currency** | **String** | ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; |  [optional]
**distributionType** | **DistHistoricalType** |  | 
**totalDistributions** | **Double** | Total Distributions. |  [optional]
**returnOfCapital** | **Double** | Return on Capital. |  [optional]
**qualifiedDividends** | **Double** | Qualified Dividends. |  [optional]
**nonQualifiedDividends** | **Double** | Non-Qualified Dividends. |  [optional]
**dailyAccruedDividends** | **Double** | Daily Accrued Dividends. |  [optional]
**shortTermCapitalGains** | **Double** | Short-Term Capital Gains. |  [optional]
**longTermCapitalGains** | **Double** | Long-Term Capital Gains. |  [optional]
**dividendType** | **String** | Returns the dividend treatment for the specified share class (distributes/capitalizes). Data is returned for both Mutual Funds and ETFs. |  [optional]


## Implemented Interfaces

* Serializable


