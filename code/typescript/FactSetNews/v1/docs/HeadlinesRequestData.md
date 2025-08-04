# factsetnews.HeadlinesRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | [**[HeadlinesRequestTickersObject]**](HeadlinesRequestTickersObject.md) | List of tickers to filter the headlines. Each ticker is an object. Please refer to the /filters endpoint to obtain the values accepted by the optional parameters. | [optional] 
**isPrimary** | **Boolean** | If true, stories that match the provided ticker on which the ticker is a primary symbol will be returned. Additionally, stories that match the other filters specified such as topics or regions will also be returned.   | [optional] 
**categories** | **[String]** | A list of categories used to filter the headlines. Categories are define the nature or topic of the headlines, such as \&quot;Earnings\&quot;. | [optional] 
**countries** | **[String]** | A list of countries used to filter the headlines. | [optional] 
**regions** | **[String]** | A list of regions used to filter the headlines. Regions specify the geographical location or market to which the headlines are relevant, for example, \&quot;Americas\&quot;. | [optional] 
**sources** | **[String]** | A list of sources used to filter the headlines. | [optional] 
**topics** | **[String]** | A list of topics used to filter the headlines. Topics represent specific subjects or themes associated with the headlines, such as \&quot;Market Summaries\&quot;. | [optional] 
**predefinedRange** | **String** | See list of valid date ranges. Date range is mutually exclusive to start/end time | [optional] 
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




