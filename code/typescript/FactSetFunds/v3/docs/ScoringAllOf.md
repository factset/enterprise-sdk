# factsetfunds.ScoringAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**analystPick** | **Boolean** | Analyst pick flags an ETF that provides comprehensive, market like exposure to an area of the market/segment, keeping costs and liquidity in mind. | [optional] 
**opportunitiesList** | **Boolean** | Opportunities list flags an ETF that provides potentially valuable but alternative exposure to the market/segment, keeping costs and liquidity in mind. | [optional] 
**fundGrade** | **String** | Grade combines efficiency and tradability scores and assigns a letter grade. | [optional] 
**fitScore** | **Number** | Returns the Fit score for an ETF. | [optional] 
**segmentAverageFit** | **Number** | Returns the segment Average Fit score for an ETF. | [optional] 
**fundEfficiency** | **Number** | Returns Fund Efficiency score for an ETF. | [optional] 
**segmentAverageEfficiency** | **Number** | Returns the Segment Average efficiency score for an ETF | [optional] 
**fundTradability** | **Number** | Returns the tradability score of an ETF.  | [optional] 
**segmentAverageTradability** | **Number** | Returns the Segment Average Tradability score of an ETF.  | [optional] 
**date** | **Date** | Returns the date when the scores are calculated for an ETF.  | [optional] 



## Enum: FundGradeEnum


* `A` (value: `"A"`)

* `B` (value: `"B"`)

* `C` (value: `"C"`)

* `D` (value: `"D"`)

* `F` (value: `"F"`)




