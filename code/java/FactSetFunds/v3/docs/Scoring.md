

# Scoring

Fund scoring metrics including analyst picks, fund grades, fit scores, efficiency, and tradability ratings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**analystPick** | **Boolean** | Analyst pick flags an ETF that provides comprehensive, market like exposure to an area of the market/segment, keeping costs and liquidity in mind. |  [optional]
**opportunitiesList** | **Boolean** | Opportunities list flags an ETF that provides potentially valuable but alternative exposure to the market/segment, keeping costs and liquidity in mind. |  [optional]
**fundGrade** | [**FundGradeEnum**](#FundGradeEnum) | Grade combines efficiency and tradability scores and assigns a letter grade. |  [optional]
**fitScore** | **BigDecimal** | Returns the Fit score for an ETF. |  [optional]
**segmentAverageFit** | **BigDecimal** | Returns the segment Average Fit score for an ETF. |  [optional]
**fundEfficiency** | **BigDecimal** | Returns Fund Efficiency score for an ETF. |  [optional]
**segmentAverageEfficiency** | **BigDecimal** | Returns the Segment Average efficiency score for an ETF |  [optional]
**fundTradability** | **BigDecimal** | Returns the tradability score of an ETF.  |  [optional]
**segmentAverageTradability** | **BigDecimal** | Returns the Segment Average Tradability score of an ETF.  |  [optional]
**date** | **LocalDate** | Returns the date when the scores are calculated for an ETF.  |  [optional]



## Enum: FundGradeEnum

Name | Value
---- | -----
A | &quot;A&quot;
B | &quot;B&quot;
C | &quot;C&quot;
D | &quot;D&quot;
F | &quot;F&quot;


## Implemented Interfaces

* Serializable


