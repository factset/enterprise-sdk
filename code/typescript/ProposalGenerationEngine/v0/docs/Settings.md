# proposalgenerationengine.Settings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **String** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client | [optional] 
**returnsPreferences** | **String** | code of preconfigured analysis settings&lt;br&gt; Note: the setup of these settings is done by PGE administrator | [optional] 
**validatePortfolio** | **Boolean** | a flag controlling whether to perform validations on the portfolio and its holdings (e.g. whether they have valid historical data). If set to false it is possible that call might not return user-friendly error message, however the call will be faster | [optional] [default to false]
**levels** | **[String]** |  | [optional] 
**confidenceLevels** | **[Number]** |  | [optional] 
**reportingFrequency** | **Number** |  | [optional] 



## Enum: ReportingFrequencyEnum


* `1` (value: `1`)

* `2` (value: `2`)

* `4` (value: `4`)

* `6` (value: `6`)

* `12` (value: `12`)




