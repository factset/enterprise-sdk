

# DistCurrentAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**date** | **LocalDate** | The date of the distribution in YYYY-MM-DD format. |  [optional]
**distributionType** | **DistCurrentType** |  | 
**distributionFrequency** | **String** | Returns the distribution frequency. |  [optional]
**dividendExDate** | **LocalDate** | Returns the ex-dividend date of the most recently reported dividend. Data is currently only and available only for ETFs. |  [optional]
**currency** | **String** | ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; |  [optional]
**totalDistributions** | **Double** | Total Distributions. |  [optional]
**returnOfCapital** | **Double** | Return on Capital. |  [optional]
**qualifiedDividends** | **Double** | Qualified Dividends. |  [optional]
**nonQualifiedDividends** | **Double** | Non-Qualified Dividends. |  [optional]
**dailyAccruedDividends** | **Double** | Daily Accrued Dividends. |  [optional]
**shortTermCapitalGains** | **Double** | Short-Term Capital Gains. |  [optional]
**longTermCapitalGains** | **Double** | Long-Term Capital Gains. |  [optional]
**indicatedAnnualDividend** | **Double** | Indicated annual dividend. |  [optional]
**last12MonthDistributionYield** | **Double** | Distribution yield for the last twelve months. |  [optional]
**firstDistributionDate** | **LocalDate** | The date of the funds first distribution in YYYY-MM-DD format. |  [optional]
**dividendType** | **String** | Returns the dividend treatment for the specified share class (distributes/capitalizes). Data is returned for both Mutual Funds and ETFs. |  [optional]


## Implemented Interfaces

* Serializable


