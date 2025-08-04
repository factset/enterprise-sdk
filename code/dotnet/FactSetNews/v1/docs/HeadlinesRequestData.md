# FactSet.SDK.FactSetNews.Model.HeadlinesRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Tickers** | [**List&lt;HeadlinesRequestTickersObject&gt;**](HeadlinesRequestTickersObject.md) | List of tickers to filter the headlines. Each ticker is an object. Please refer to the /filters endpoint to obtain the values accepted by the optional parameters. | [optional] 
**IsPrimary** | **bool** | If true, stories that match the provided ticker on which the ticker is a primary symbol will be returned. Additionally, stories that match the other filters specified such as topics or regions will also be returned.   | [optional] 
**Categories** | **List&lt;string&gt;** | A list of categories used to filter the headlines. Categories are define the nature or topic of the headlines, such as \&quot;Earnings\&quot;. | [optional] 
**Countries** | **List&lt;string&gt;** | A list of countries used to filter the headlines. | [optional] 
**Regions** | **List&lt;string&gt;** | A list of regions used to filter the headlines. Regions specify the geographical location or market to which the headlines are relevant, for example, \&quot;Americas\&quot;. | [optional] 
**Sources** | **List&lt;string&gt;** | A list of sources used to filter the headlines. | [optional] 
**Topics** | **List&lt;string&gt;** | A list of topics used to filter the headlines. Topics represent specific subjects or themes associated with the headlines, such as \&quot;Market Summaries\&quot;. | [optional] 
**PredefinedRange** | **string** | See list of valid date ranges. Date range is mutually exclusive to start/end time | [optional] 
**SearchTime** | [**HeadlinesRequestDataSearchTime**](HeadlinesRequestDataSearchTime.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

