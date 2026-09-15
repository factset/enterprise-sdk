

# RiskStats

Risk statistics holder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annStDev** | **BigDecimal** | Annualized Standard deviation |  [optional]
**annLossStDev** | **BigDecimal** | Annualized Loss Standard deviation |  [optional]
**etl** | **Map&lt;String, BigDecimal&gt;** | a map from confidence level (e.g. \&quot;95%\&quot;) to a numeric value |  [optional]
**stDev** | [**StDev**](StDev.md) |  |  [optional]
**skewness** | **BigDecimal** | Skewness |  [optional]
**excessKurtosis** | **BigDecimal** | ExcessKurtosis |  [optional]
**var** | **Map&lt;String, BigDecimal&gt;** | a map from confidence level (e.g. \&quot;95%\&quot;) to a numeric value |  [optional]
**positiveReturnsRatio** | **BigDecimal** | Positive Returns Ratio |  [optional]


## Implemented Interfaces

* Serializable


