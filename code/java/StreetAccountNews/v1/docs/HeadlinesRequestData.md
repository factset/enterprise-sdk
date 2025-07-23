

# HeadlinesRequestData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | [**java.util.List&lt;HeadlinesRequestTickersObject&gt;**](HeadlinesRequestTickersObject.md) | List of tickers to filter the headlines. Each ticker is an object. |  [optional]
**isPrimary** | **Boolean** | If true, stories that match the provided ticker on which the ticker is a primary symbol will be returned. Additionally, stories that match the other filters specified such as topics or regions will also be returned.   |  [optional]
**categories** | **java.util.List&lt;String&gt;** | A list of categories used to filter the headlines. Categories are define the nature or topic of the headlines, such as \&quot;Earnings\&quot;. Use the &#x60;/filters/categories&#x60; endpoint to get the list of available categories. |  [optional]
**topics** | **java.util.List&lt;String&gt;** | A list of topics used to filter the headlines. Topics represent specific subjects or themes associated with the headlines, such as \&quot;Market Summaries\&quot;. Use the &#x60;/filters/topics&#x60; endpoint to get the list of available topics. |  [optional]
**regions** | **java.util.List&lt;String&gt;** | A list of regions used to filter the headlines. Regions specify the geographical location or market to which the headlines are relevant, for example, \&quot;North America\&quot;. Use the &#x60;/filters/regions&#x60; endpoint to get the list of available regions.  **Note:** Filtering is possible only for top-level regions, not individual countries. |  [optional]
**sectors** | **java.util.List&lt;String&gt;** | A list of sectors used to filter the headlines. Sectors are segments or divisions of the economy or market provided by StreetAccount, such as \&quot;Financial\&quot;. Use the &#x60;/filters/sectors&#x60;endpoint to get the list of available sectors. |  [optional]
**predefinedRange** | [**PredefinedRangeEnum**](#PredefinedRangeEnum) | see list of valid date ranges. Date range is mutually exclusive to start/end time |  [optional]
**searchTime** | [**HeadlinesRequestDataSearchTime**](HeadlinesRequestDataSearchTime.md) |  |  [optional]



## Enum: PredefinedRangeEnum

Name | Value
---- | -----
TODAY | &quot;today&quot;
TWODAYS | &quot;twoDays&quot;
ONEWEEK | &quot;oneWeek&quot;
ONEMONTH | &quot;oneMonth&quot;
THREEMONTHS | &quot;threeMonths&quot;
SIXMONTHS | &quot;sixMonths&quot;
ONEYEAR | &quot;oneYear&quot;
THREEYEARS | &quot;threeYears&quot;
FIVEYEARS | &quot;fiveYears&quot;
TENYEARS | &quot;tenYears&quot;
ALLAVAILABLE | &quot;allAvailable&quot;


## Implemented Interfaces

* Serializable


