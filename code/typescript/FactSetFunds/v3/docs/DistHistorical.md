# factsetfunds.DistHistorical

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**date** | **Date** | The date of the distribution in YYYY-MM-DD format. | [optional] 
**currency** | **String** | ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**distributionType** | [**DistHistoricalType**](DistHistoricalType.md) |  | 
**totalDistributions** | **Number** | Total Distributions. | [optional] 
**returnOfCapital** | **Number** | Return on Capital. | [optional] 
**qualifiedDividends** | **Number** | Qualified Dividends. | [optional] 
**nonQualifiedDividends** | **Number** | Non-Qualified Dividends. | [optional] 
**dailyAccruedDividends** | **Number** | Daily Accrued Dividends. | [optional] 
**shortTermCapitalGains** | **Number** | Short-Term Capital Gains. | [optional] 
**longTermCapitalGains** | **Number** | Long-Term Capital Gains. | [optional] 
**dividendType** | **String** | Returns the dividend treatment for the specified share class (distributes/capitalizes). Data is returned for both Mutual Funds and ETFs. | [optional] 


