

# ExPostStatsRollingSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **String** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client |  [optional]
**returnsPreferences** | **String** | code of preconfigured analysis settings&lt;br&gt; Note: the setup of these settings is done by PGE administrator |  [optional]
**validatePortfolio** | **Boolean** | a flag controlling whether to perform validations on the portfolio and its holdings (e.g. whether they have valid historical data). If set to false it is possible that call might not return user-friendly error message, however the call will be faster |  [optional]
**timeWindows** | **java.util.List&lt;String&gt;** |  |  [optional]
**rollingTimeWindow** | **Integer** |  | 
**stats** | [**java.util.List&lt;StatsEnum&gt;**](#java.util.List&lt;StatsEnum&gt;) |  |  [optional]
**aggregationFunctions** | [**java.util.List&lt;AggregationFunctionsEnum&gt;**](#java.util.List&lt;AggregationFunctionsEnum&gt;) |  |  [optional]



## Enum: java.util.List&lt;StatsEnum&gt;

Name | Value
---- | -----
ANNRETURN | &quot;annReturn&quot;
CUMRETURN | &quot;cumReturn&quot;
STDEV | &quot;stDev&quot;
ANNLOSSSTD | &quot;annLossStd&quot;
SHARPE | &quot;sharpe&quot;
SHARPEEXCESSRETURN | &quot;sharpeExcessReturn&quot;
SORTINO | &quot;sortino&quot;
SORTINOEXCESSRETURN | &quot;sortinoExcessReturn&quot;
CORRELATIONMATRIX | &quot;correlationMatrix&quot;
PORTFOLIOCORRELATIONMATRIX | &quot;portfolioCorrelationMatrix&quot;



## Enum: java.util.List&lt;AggregationFunctionsEnum&gt;

Name | Value
---- | -----
MINIMUM | &quot;minimum&quot;
MAXIMUM | &quot;maximum&quot;


## Implemented Interfaces

* Serializable


