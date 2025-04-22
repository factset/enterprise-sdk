# HeadlinesRequestData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | [**[HeadlinesRequestTickersObject]**](HeadlinesRequestTickersObject.md) | List of tickers to filter the headlines. Each ticker is an object. | [optional] 
**is_primary** | **bool** | If true, then only stories with the provided ticker as a primary symbol will be returned. Otherwise, all stories with the ticker as a primary symbol or related symbol will be returned  | [optional] 
**categories** | **[str]** | A list of categories used to filter the headlines. Categories are define the nature or topic of the headlines, such as \&quot;Earnings\&quot;. Use the &#x60;/filters/categories&#x60; endpoint to get the list of available categories. | [optional] 
**topics** | **[str]** | A list of topics used to filter the headlines. Topics represent specific subjects or themes associated with the headlines, such as \&quot;Market Summaries\&quot;. Use the &#x60;/filters/topics&#x60; endpoint to get the list of available topics. | [optional] 
**regions** | **[str]** | A list of regions used to filter the headlines. Regions specify the geographical location or market to which the headlines are relevant, for example, \&quot;North America\&quot;. Use the &#x60;/filters/regions&#x60; endpoint to get the list of available regions.  **Note:** Filtering is possible only for top-level regions, not individual countries. | [optional] 
**sectors** | **[str]** | A list of sectors used to filter the headlines. Sectors are segments or divisions of the economy or market provided by StreetAccount, such as \&quot;Financial\&quot;. Use the &#x60;/filters/sectors&#x60;endpoint to get the list of available sectors. | [optional] 
**predefined_range** | **str** | see list of valid date ranges. Date range is mutually exclusive to start/end time | [optional] 
**search_time** | [**HeadlinesRequestDataSearchTime**](HeadlinesRequestDataSearchTime.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


