# InlineResponse20043Data

Content of the news article.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **datetime, none_type** | Date and time of the news article. | [optional] 
**headline** | **str, none_type** | Headline of the news article represented as text with HTML entity encoding but without HTML tags. | [optional] 
**summary** | **str, none_type** | Textual summary of the body of the news article or &#x60;null&#x60; if no summary was provided by the news article distributor. | [optional] 
**body** | **str, none_type** | Text body of the news article. | [optional] 
**types** | [**[GetNewsArticleGetDataTypesItems]**](GetNewsArticleGetDataTypesItems.md) | Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values. | [optional] 
**language** | [**InlineResponse20043DataLanguage**](InlineResponse20043DataLanguage.md) |  | [optional] 
**distributor** | [**InlineResponse20043DataDistributor**](InlineResponse20043DataDistributor.md) |  | [optional] 
**publisher** | [**InlineResponse20043DataPublisher**](InlineResponse20043DataPublisher.md) |  | [optional] 
**categories** | [**[GetNewsArticleGetDataCategoriesItems]**](GetNewsArticleGetDataCategoriesItems.md) | Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values. | [optional] 
**instruments** | [**[GetNewsArticleGetDataInstrumentsItems]**](GetNewsArticleGetDataInstrumentsItems.md) | Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off. | [optional] 
**media** | [**[GetNewsArticleGetDataMediaItems]**](GetNewsArticleGetDataMediaItems.md) | List of media elements of the news article. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


