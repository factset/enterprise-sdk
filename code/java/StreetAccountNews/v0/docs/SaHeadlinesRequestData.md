

# SaHeadlinesRequestData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | [**java.util.List&lt;SaHeadlinesRequestTickersObject&gt;**](SaHeadlinesRequestTickersObject.md) |  |  [optional]
**categories** | **java.util.List&lt;String&gt;** |  |  [optional]
**regions** | **java.util.List&lt;String&gt;** |  |  [optional]
**topics** | **java.util.List&lt;String&gt;** |  |  [optional]
**sectors** | **java.util.List&lt;String&gt;** |  |  [optional]
**isPrimary** | **Boolean** |  |  [optional]
**dateRange** | [**DateRangeEnum**](#DateRangeEnum) | see list of valid date ranges. Date range is mutually exlusive to start/end time |  [optional]
**searchDate** | [**SaHeadlinesRequestDataSearchDate**](SaHeadlinesRequestDataSearchDate.md) |  |  [optional]



## Enum: DateRangeEnum

Name | Value
---- | -----
TODAY | &quot;Today&quot;
_2_DAYS | &quot;2 Days&quot;
_1_WEEK | &quot;1 Week&quot;
_1_MONTH | &quot;1 Month&quot;
_3_MONTHS | &quot;3 Months&quot;
_6_MONTHS | &quot;6 Months&quot;
_1_YEAR | &quot;1 Year&quot;
_3_YEARS | &quot;3 Years&quot;
_5_YEARS | &quot;5 Years&quot;
_10_YEARS | &quot;10 Years&quot;
ALL_AVAILABLE | &quot;All Available&quot;


## Implemented Interfaces

* Serializable


