# streetaccountnews.HeadlinesRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | [**[HeadlinesRequestTickersObject]**](HeadlinesRequestTickersObject.md) | List of tickers to filter the headlines. Each ticker is an object. | [optional] 
**isPrimary** | **Boolean** | If true, then only stories with the provided ticker as a primary symbol will be returned. Otherwise, all stories with the ticker as a primary symbol or related symbol will be returned  | [optional] 
**categories** | **[String]** | A list of categories used to filter the headlines. Categories are define the nature or topic of the headlines, such as \&quot;Earnings\&quot;. Use the &#x60;/filters/categories&#x60; endpoint to get the list of available categories. | [optional] 
**topics** | **[String]** | A list of topics used to filter the headlines. Topics represent specific subjects or themes associated with the headlines, such as \&quot;Market Summaries\&quot;. Use the &#x60;/filters/topics&#x60; endpoint to get the list of available topics. | [optional] 
**regions** | **[String]** | A list of regions used to filter the headlines. Regions specify the geographical location or market to which the headlines are relevant, for example, \&quot;North America\&quot;. Use the &#x60;/filters/regions&#x60; endpoint to get the list of available regions. | [optional] 
**sectors** | **[String]** | A list of sectors used to filter the headlines. Sectors are segments or divisions of the economy or market provided by StreetAccount, such as \&quot;Financial\&quot;. Use the &#x60;/filters/sectors&#x60;endpoint to get the list of available sectors. | [optional] 
**predefinedRange** | **String** | see list of valid date ranges. Date range is mutually exclusive to start/end time | [optional] 
**searchTime** | [**HeadlinesRequestDataSearchTime**](HeadlinesRequestDataSearchTime.md) |  | [optional] 



## Enum: PredefinedRangeEnum


* `today` (value: `"today"`)

* `twoDays` (value: `"twoDays"`)

* `oneWeek` (value: `"oneWeek"`)

* `oneMonth` (value: `"oneMonth"`)

* `threeMonths` (value: `"threeMonths"`)

* `sixMonths` (value: `"sixMonths"`)

* `oneYear` (value: `"oneYear"`)

* `threeYears` (value: `"threeYears"`)

* `fiveYears` (value: `"fiveYears"`)

* `tenYears` (value: `"tenYears"`)

* `allAvailable` (value: `"allAvailable"`)




