# proposalgenerationengine.ExPostStatsSettings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **String** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client | [optional] 
**returnsPreferences** | **String** | code of preconfigured analysis settings&lt;br&gt; Note: the setup of these settings is done by PGE administrator | [optional] 
**validatePortfolio** | **Boolean** | a flag controlling whether to perform validations on the portfolio and its holdings (e.g. whether they have valid historical data). If set to false it is possible that call might not return user-friendly error message, however the call will be faster | [optional] [default to false]
**levels** | **[String]** |  | [optional] 
**confidenceLevels** | **[Number]** |  | [optional] 
**reportingFrequency** | **Number** |  | [optional] 
**timeWindows** | **[String]** |  | [optional] 
**periods** | [**[Period]**](Period.md) |  | [optional] 
**reportingFrequencyAlignment** | **String** |  | [optional] 
**stats** | **[String]** |  | [optional] 
**udfs** | **[String]** |  | [optional] 



## Enum: ReportingFrequencyEnum


* `1` (value: `1`)

* `2` (value: `2`)

* `4` (value: `4`)

* `6` (value: `6`)

* `12` (value: `12`)





## Enum: ReportingFrequencyAlignmentEnum


* `start` (value: `"start"`)

* `calendar` (value: `"calendar"`)





## Enum: [StatsEnum]


* `annReturn` (value: `"annReturn"`)

* `cumReturn` (value: `"cumReturn"`)

* `meanReturn` (value: `"meanReturn"`)

* `etr` (value: `"etr"`)

* `stDev` (value: `"stDev"`)

* `annStDev` (value: `"annStDev"`)

* `annLossStd` (value: `"annLossStd"`)

* `annStDev100` (value: `"annStDev100"`)

* `etl` (value: `"etl"`)

* `skewness` (value: `"skewness"`)

* `excessKurtosis` (value: `"excessKurtosis"`)

* `var` (value: `"var"`)

* `positiveReturnsRatio` (value: `"positiveReturnsRatio"`)

* `sharpe` (value: `"sharpe"`)

* `sharpeExcessReturn` (value: `"sharpeExcessReturn"`)

* `starr` (value: `"starr"`)

* `sortino` (value: `"sortino"`)

* `sortinoExcessReturn` (value: `"sortinoExcessReturn"`)

* `alpha` (value: `"alpha"`)

* `alphaExcessReturn` (value: `"alphaExcessReturn"`)

* `beta` (value: `"beta"`)

* `betaExcessReturn` (value: `"betaExcessReturn"`)

* `upCapture` (value: `"upCapture"`)

* `upCaptureMStar` (value: `"upCaptureMStar"`)

* `downCapture` (value: `"downCapture"`)

* `downCaptureMstar` (value: `"downCaptureMstar"`)

* `rsquare` (value: `"rsquare"`)

* `rsquareExcessReturn` (value: `"rsquareExcessReturn"`)

* `trackingError` (value: `"trackingError"`)

* `annTrackingError` (value: `"annTrackingError"`)

* `informationRatioAnnArithmeticExcessReturn` (value: `"informationRatioAnnArithmeticExcessReturn"`)

* `battingAverage` (value: `"battingAverage"`)

* `correlationMatrix` (value: `"correlationMatrix"`)

* `boxplotSummary` (value: `"boxplotSummary"`)

* `boxplotOutliers` (value: `"boxplotOutliers"`)

* `maxDrawdown` (value: `"maxDrawdown"`)

* `maxDrawdownPV` (value: `"maxDrawdownPV"`)

* `maxDrawdownDate` (value: `"maxDrawdownDate"`)

* `maxDrawdownStart` (value: `"maxDrawdownStart"`)

* `maxDrawdownEnd` (value: `"maxDrawdownEnd"`)

* `maxDrawdownPeriods` (value: `"maxDrawdownPeriods"`)

* `longestDrawdownStart` (value: `"longestDrawdownStart"`)

* `longestDrawdownEnd` (value: `"longestDrawdownEnd"`)

* `topDrawdowns` (value: `"topDrawdowns"`)

* `annComponentReturnAttribution` (value: `"annComponentReturnAttribution"`)

* `annPercentageReturnAttribution` (value: `"annPercentageReturnAttribution"`)

* `annComponentStDevAttribution` (value: `"annComponentStDevAttribution"`)

* `annPercentageStDevAttribution` (value: `"annPercentageStDevAttribution"`)

* `contributionTransactions` (value: `"contributionTransactions"`)

* `withdrawalTransactions` (value: `"withdrawalTransactions"`)

* `feeTransactions` (value: `"feeTransactions"`)




