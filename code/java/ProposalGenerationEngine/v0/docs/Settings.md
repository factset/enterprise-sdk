

# Settings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **String** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client |  [optional]
**returnsPreferences** | **String** | code of preconfigured analysis settings&lt;br&gt; Note: the setup of these settings is done by PGE administrator |  [optional]
**validatePortfolio** | **Boolean** | a flag controlling whether to perform validations on the portfolio and its holdings (e.g. whether they have valid historical data). If set to false it is possible that call might not return user-friendly error message, however the call will be faster |  [optional]
**levels** | **java.util.List&lt;String&gt;** |  |  [optional]
**confidenceLevels** | **java.util.List&lt;BigDecimal&gt;** |  |  [optional]
**reportingFrequency** | [**ReportingFrequencyEnum**](#ReportingFrequencyEnum) |  |  [optional]



## Enum: ReportingFrequencyEnum

Name | Value
---- | -----
NUMBER_1 | new BigDecimal(&quot;1&quot;)
NUMBER_2 | new BigDecimal(&quot;2&quot;)
NUMBER_4 | new BigDecimal(&quot;4&quot;)
NUMBER_6 | new BigDecimal(&quot;6&quot;)
NUMBER_12 | new BigDecimal(&quot;12&quot;)


## Implemented Interfaces

* Serializable


