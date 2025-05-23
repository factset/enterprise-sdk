

# GIPSCalculationParameters

List of calculation parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **String** | Account path for the calculation. Account field accepts only ACTM. | 
**enddate** | **String** | Calculation&#39;s end date. End of previous month will be used as the enddate if not provided explicitly. |  [optional]
**report** | [**ReportEnum**](#ReportEnum) | Report name |  [optional]
**viewid** | **String** | ViewId for calculation. |  [optional]
**currencyisocode** | **String** | Currency ISO code for calculation. The default currency value of the account will be used if not provided explicitly. |  [optional]



## Enum: ReportEnum

Name | Value
---- | -----
RET_STAT | &quot;RET_STAT&quot;


## Implemented Interfaces

* Serializable


