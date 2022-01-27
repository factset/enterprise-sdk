# InlineResponse2002DataArticles


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | Identifier of the news article. | [optional] 
**time** | **str** | Date and time of the news article. | [optional] 
**headline** | **str** | Headline of the news article represented as text with HTML entity encoding but without HTML tags. | [optional] 
**types** | [**[InlineResponse2001Types]**](InlineResponse2001Types.md) | Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values. | [optional] 
**language** | [**InlineResponse2001Language**](InlineResponse2001Language.md) |  | [optional] 
**categories** | [**[InlineResponse2001Categories]**](InlineResponse2001Categories.md) | Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


