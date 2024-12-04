# FactSet.SDK.RealTimeNews.Model.InlineResponse20043Data
Content of the news article.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Time** | **DateTime?** | Date and time of the news article. | [optional] 
**Headline** | **string** | Headline of the news article represented as text with HTML entity encoding but without HTML tags. | [optional] 
**Summary** | **string** | Textual summary of the body of the news article or &#x60;null&#x60; if no summary was provided by the news article distributor. | [optional] 
**Body** | **string** | Text body of the news article. | [optional] 
**Types** | [**List&lt;GetNewsArticleGetDataTypesItems&gt;**](GetNewsArticleGetDataTypesItems.md) | Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values. | [optional] 
**Language** | [**InlineResponse20043DataLanguage**](InlineResponse20043DataLanguage.md) |  | [optional] 
**Distributor** | [**InlineResponse20043DataDistributor**](InlineResponse20043DataDistributor.md) |  | [optional] 
**Publisher** | [**InlineResponse20043DataPublisher**](InlineResponse20043DataPublisher.md) |  | [optional] 
**Categories** | [**List&lt;GetNewsArticleGetDataCategoriesItems&gt;**](GetNewsArticleGetDataCategoriesItems.md) | Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values. | [optional] 
**Instruments** | [**List&lt;GetNewsArticleGetDataInstrumentsItems&gt;**](GetNewsArticleGetDataInstrumentsItems.md) | Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off. | [optional] 
**Media** | [**List&lt;GetNewsArticleGetDataMediaItems&gt;**](GetNewsArticleGetDataMediaItems.md) | List of media elements of the news article. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

