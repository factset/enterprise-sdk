

# TaxExposure

Tax-related information including capital gains distributions, tax rates, and K1 distribution details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**taxItemsType** | **TaxExposureType** |  | 
**capitalGainsDistribution3YAvg** | **BigDecimal** | Returns capital gains distribution(3Yr) information. |  [optional]
**maxLTGainsRate** | **BigDecimal** | Returns maximum Long Term Gains Rate |  [optional]
**maxSTGainsRate** | **BigDecimal** | Returns maximum Short Term Gains Rate |  [optional]
**taxOnDistributions** | **BigDecimal** | Returns tax on distributions. |  [optional]
**distributeK1** | **BigDecimal** | Returns the details if the funds distribute K1 |  [optional]
**latestLTCapGainsDist** | **BigDecimal** | Returns the latest Long Term Capital Gains Distribution |  [optional]
**latestLTCapGainsDistDate** | **LocalDate** | Returns the date of the most recent distributions for the specified share class for long term gains.Daily Accrued Dividend is only available for Mutual Funds.Data is returned for both Mutual Funds and ETFs. |  [optional]
**latestSTCapGainsDist** | **BigDecimal** | Returns the details of the latest Short Term Capital Gains Distribution |  [optional]
**latestSTCapGainsDistDate** | **LocalDate** | Returns the date of the most recent distributions for the specified share class for short term gains.Daily Accrued Dividend is only available for Mutual Funds.Data is returned for both Mutual Funds and ETFs. Distribution |  [optional]


## Implemented Interfaces

* Serializable


