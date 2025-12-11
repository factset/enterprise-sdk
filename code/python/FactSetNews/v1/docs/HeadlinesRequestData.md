# HeadlinesRequestData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | [**[HeadlinesRequestTickersObject]**](HeadlinesRequestTickersObject.md) | List of tickers to filter the headlines. Each ticker is an object. Please refer to the /filters endpoint to obtain the values accepted by the optional parameters. | [optional] 
**is_primary** | **bool** | If true, stories that match the provided ticker on which the ticker is a primary symbol will be returned. Additionally, stories that match the other filters specified such as topics or regions will also be returned.   | [optional] 
**categories** | **[str]** | A list of categories used to filter the headlines. Categories are define the nature or topic of the headlines, such as \&quot;Earnings\&quot;. | [optional] 
**countries** | **[str]** | A list of countries used to filter the headlines. | [optional] 
**regions** | **[str]** | A list of regions used to filter the headlines. Regions specify the geographical location or market to which the headlines are relevant, for example, \&quot;Americas\&quot;. | [optional] 
**sources** | **[str]** | A list of sources used to filter the headlines. | [optional] 
**topics** | **[str]** | A list of topics used to filter the headlines. Topics represent specific subjects or themes associated with the headlines, such as \&quot;Market Summaries\&quot;. | [optional] 
**predefined_range** | **str** | See list of valid date ranges. Date range is mutually exclusive to start/end time | [optional] 
**search_time** | [**HeadlinesRequestDataSearchTime**](HeadlinesRequestDataSearchTime.md) |  | [optional] 
**search_text** | **str** | Restricts the search to include only document stories that include the searched text. It supports boolean operators that we have in this [OA page](https://my.apps.factset.com/oa/pages/12708)  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


