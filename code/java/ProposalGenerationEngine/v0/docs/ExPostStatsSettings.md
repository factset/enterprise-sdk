

# ExPostStatsSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **String** | The as-of date for the analysis. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well. The as-of date should be among the set of preconfigured as-of dates for the user/client |  [optional]
**returnsPreferences** | **String** | code of preconfigured analysis settings&lt;br&gt; Note: the setup of these settings is done by PGE administrator |  [optional]
**validatePortfolio** | **Boolean** | a flag controlling whether to perform validations on the portfolio and its holdings (e.g. whether they have valid historical data). If set to false it is possible that call might not return user-friendly error message, however the call will be faster |  [optional]
**levels** | **java.util.List&lt;String&gt;** |  |  [optional]
**confidenceLevels** | **java.util.List&lt;BigDecimal&gt;** |  |  [optional]
**reportingFrequency** | [**ReportingFrequencyEnum**](#ReportingFrequencyEnum) |  |  [optional]
**timeWindows** | **java.util.List&lt;String&gt;** |  |  [optional]
**periods** | [**java.util.List&lt;Period&gt;**](Period.md) |  |  [optional]
**reportingFrequencyAlignment** | [**ReportingFrequencyAlignmentEnum**](#ReportingFrequencyAlignmentEnum) |  |  [optional]
**stats** | [**java.util.List&lt;StatsEnum&gt;**](#java.util.List&lt;StatsEnum&gt;) |  |  [optional]
**udfs** | **java.util.List&lt;String&gt;** |  |  [optional]



## Enum: ReportingFrequencyEnum

Name | Value
---- | -----
NUMBER_1 | new BigDecimal(&quot;1&quot;)
NUMBER_2 | new BigDecimal(&quot;2&quot;)
NUMBER_4 | new BigDecimal(&quot;4&quot;)
NUMBER_6 | new BigDecimal(&quot;6&quot;)
NUMBER_12 | new BigDecimal(&quot;12&quot;)



## Enum: ReportingFrequencyAlignmentEnum

Name | Value
---- | -----
START | &quot;start&quot;
CALENDAR | &quot;calendar&quot;



## Enum: java.util.List&lt;StatsEnum&gt;

Name | Value
---- | -----
ANNRETURN | &quot;annReturn&quot;
CUMRETURN | &quot;cumReturn&quot;
MEANRETURN | &quot;meanReturn&quot;
ETR | &quot;etr&quot;
STDEV | &quot;stDev&quot;
ANNSTDEV | &quot;annStDev&quot;
ANNLOSSSTD | &quot;annLossStd&quot;
ANNSTDEV100 | &quot;annStDev100&quot;
ETL | &quot;etl&quot;
SKEWNESS | &quot;skewness&quot;
EXCESSKURTOSIS | &quot;excessKurtosis&quot;
VAR | &quot;var&quot;
POSITIVERETURNSRATIO | &quot;positiveReturnsRatio&quot;
SHARPE | &quot;sharpe&quot;
SHARPEEXCESSRETURN | &quot;sharpeExcessReturn&quot;
STARR | &quot;starr&quot;
SORTINO | &quot;sortino&quot;
SORTINOEXCESSRETURN | &quot;sortinoExcessReturn&quot;
ALPHA | &quot;alpha&quot;
ALPHAEXCESSRETURN | &quot;alphaExcessReturn&quot;
BETA | &quot;beta&quot;
BETAEXCESSRETURN | &quot;betaExcessReturn&quot;
UPCAPTURE | &quot;upCapture&quot;
UPCAPTUREMSTAR | &quot;upCaptureMStar&quot;
DOWNCAPTURE | &quot;downCapture&quot;
DOWNCAPTUREMSTAR | &quot;downCaptureMstar&quot;
RSQUARE | &quot;rsquare&quot;
RSQUAREEXCESSRETURN | &quot;rsquareExcessReturn&quot;
TRACKINGERROR | &quot;trackingError&quot;
ANNTRACKINGERROR | &quot;annTrackingError&quot;
INFORMATIONRATIOANNARITHMETICEXCESSRETURN | &quot;informationRatioAnnArithmeticExcessReturn&quot;
BATTINGAVERAGE | &quot;battingAverage&quot;
CORRELATIONMATRIX | &quot;correlationMatrix&quot;
BOXPLOTSUMMARY | &quot;boxplotSummary&quot;
BOXPLOTOUTLIERS | &quot;boxplotOutliers&quot;
MAXDRAWDOWN | &quot;maxDrawdown&quot;
MAXDRAWDOWNPV | &quot;maxDrawdownPV&quot;
MAXDRAWDOWNDATE | &quot;maxDrawdownDate&quot;
MAXDRAWDOWNSTART | &quot;maxDrawdownStart&quot;
MAXDRAWDOWNEND | &quot;maxDrawdownEnd&quot;
MAXDRAWDOWNPERIODS | &quot;maxDrawdownPeriods&quot;
LONGESTDRAWDOWNSTART | &quot;longestDrawdownStart&quot;
LONGESTDRAWDOWNEND | &quot;longestDrawdownEnd&quot;
TOPDRAWDOWNS | &quot;topDrawdowns&quot;
ANNCOMPONENTRETURNATTRIBUTION | &quot;annComponentReturnAttribution&quot;
ANNPERCENTAGERETURNATTRIBUTION | &quot;annPercentageReturnAttribution&quot;
ANNCOMPONENTSTDEVATTRIBUTION | &quot;annComponentStDevAttribution&quot;
ANNPERCENTAGESTDEVATTRIBUTION | &quot;annPercentageStDevAttribution&quot;
CONTRIBUTIONTRANSACTIONS | &quot;contributionTransactions&quot;
WITHDRAWALTRANSACTIONS | &quot;withdrawalTransactions&quot;
FEETRANSACTIONS | &quot;feeTransactions&quot;


## Implemented Interfaces

* Serializable


