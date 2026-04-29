# FactSet.SDK.FactSetFunds.Model.DistributionsItem
Polymorphic distribution object (current or historical)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**RequestId** | **string** | The requested Id sent as input. | [optional] 
**Error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**Date** | **DateTime?** | The date of the distribution in YYYY-MM-DD format. | [optional] 
**DistributionType** | **DistHistoricalType** |  | 
**DistributionFrequency** | **string** | Returns the distribution frequency. | [optional] 
**DividendExDate** | **DateTime?** | Returns the ex-dividend date of the most recently reported dividend. Data is currently only and available only for ETFs. | [optional] 
**Currency** | **string** | ISO3 Currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470)&#39; | [optional] 
**TotalDistributions** | **double?** | Total Distributions. | [optional] 
**ReturnOfCapital** | **double?** | Return on Capital. | [optional] 
**QualifiedDividends** | **double?** | Qualified Dividends. | [optional] 
**NonQualifiedDividends** | **double?** | Non-Qualified Dividends. | [optional] 
**DailyAccruedDividends** | **double?** | Daily Accrued Dividends. | [optional] 
**ShortTermCapitalGains** | **double?** | Short-Term Capital Gains. | [optional] 
**LongTermCapitalGains** | **double?** | Long-Term Capital Gains. | [optional] 
**IndicatedAnnualDividend** | **double?** | Indicated annual dividend. | [optional] 
**Last12MonthDistributionYield** | **double?** | Distribution yield for the last twelve months. | [optional] 
**FirstDistributionDate** | **DateTime?** | The date of the funds first distribution in YYYY-MM-DD format. | [optional] 
**DividendType** | **string** | Returns the dividend treatment for the specified share class (distributes/capitalizes). Data is returned for both Mutual Funds and ETFs. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

