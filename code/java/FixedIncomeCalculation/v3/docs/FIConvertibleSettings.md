

# FIConvertibleSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**equityPrice** | **Double** | Equity Price |  [optional]
**equityIndexVolatility** | **Double** | Equity Index Volatility |  [optional]
**equityDividendYield** | **Float** | Equity Dividend Yield |  [optional]
**volatilityCapMethod** | [**VolatilityCapMethodEnum**](#VolatilityCapMethodEnum) | Volatility CapMethod |  [optional]
**volatilityCapMethodValue** | **Float** | Volatility CapMethod Value - (Required only when volatilityCapMethod is specifiedRate or multiplier) |  [optional]
**equityExchangeRate** | **Float** | Equity Exchange Rate |  [optional]



## Enum: VolatilityCapMethodEnum

Name | Value
---- | -----
NOCAP | &quot;noCap&quot;
SPECIFIEDRATE | &quot;specifiedRate&quot;
MULTIPLIER | &quot;multiplier&quot;


## Implemented Interfaces

* Serializable


