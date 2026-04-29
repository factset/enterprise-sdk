# factsetfunds.TaxExposure

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**taxItemsType** | [**TaxExposureType**](TaxExposureType.md) |  | 
**capitalGainsDistribution3YAvg** | **Number** | Returns capital gains distribution(3Yr) information. | [optional] 
**maxLTGainsRate** | **Number** | Returns maximum Long Term Gains Rate | [optional] 
**maxSTGainsRate** | **Number** | Returns maximum Short Term Gains Rate | [optional] 
**taxOnDistributions** | **Number** | Returns tax on distributions. | [optional] 
**distributeK1** | **Number** | Returns the details if the funds distribute K1 | [optional] 
**latestLTCapGainsDist** | **Number** | Returns the latest Long Term Capital Gains Distribution | [optional] 
**latestLTCapGainsDistDate** | **Date** | Returns the date of the most recent distributions for the specified share class for long term gains.Daily Accrued Dividend is only available for Mutual Funds.Data is returned for both Mutual Funds and ETFs. | [optional] 
**latestSTCapGainsDist** | **Number** | Returns the details of the latest Short Term Capital Gains Distribution | [optional] 
**latestSTCapGainsDistDate** | **Date** | Returns the date of the most recent distributions for the specified share class for short term gains.Daily Accrued Dividend is only available for Mutual Funds.Data is returned for both Mutual Funds and ETFs. Distribution | [optional] 


