# HeadlinesRequestData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | [**[HeadlinesRequestTickersObject]**](HeadlinesRequestTickersObject.md) | List of tickers to filter the headlines. Each ticker is an object. Please refer to the /filters endpoint to obtain the values accepted by the optional parameters. | [optional] 
**is_primary** | **bool** | If true, then only stories with the provided ticker as a primary symbol will be returned. When this parameter is false, the symbol is either primary OR a related symbol will be returned.  | [optional] 
**categories** | **[str]** | A list of categories used to filter the headlines. Categories are define the nature or topic of the headlines, such as \&quot;Earnings\&quot;. | [optional] 
**countries** | **[str]** | A list of countries used to filter the headlines. | [optional] 
**regions** | **[str]** | A list of regions used to filter the headlines. Regions specify the geographical location or market to which the headlines are relevant, for example, \&quot;Americas\&quot;. | [optional] 
**sources** | **[str]** | A list of sources used to filter the headlines. | [optional] 
**topics** | **[str]** | A list of topics used to filter the headlines. Topics represent specific subjects or themes associated with the headlines, such as \&quot;Market Summaries\&quot;. | [optional] 
**predefined_range** | **str** | See list of valid date ranges. Date range is mutually exclusive to start/end time | [optional] 
**search_time** | [**HeadlinesRequestDataSearchTime**](HeadlinesRequestDataSearchTime.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


