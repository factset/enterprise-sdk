

# InlineResponse20043Data

Content of the news article.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **OffsetDateTime** | Date and time of the news article. |  [optional]
**headline** | **String** | Headline of the news article represented as text with HTML entity encoding but without HTML tags. |  [optional]
**summary** | **String** | Textual summary of the body of the news article or &#x60;null&#x60; if no summary was provided by the news article distributor. |  [optional]
**body** | **String** | Text body of the news article. |  [optional]
**types** | [**java.util.List&lt;GetNewsArticleGetDataTypesItems&gt;**](GetNewsArticleGetDataTypesItems.md) | Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values. |  [optional]
**language** | [**InlineResponse20043DataLanguage**](InlineResponse20043DataLanguage.md) |  |  [optional]
**distributor** | [**InlineResponse20043DataDistributor**](InlineResponse20043DataDistributor.md) |  |  [optional]
**publisher** | [**InlineResponse20043DataPublisher**](InlineResponse20043DataPublisher.md) |  |  [optional]
**categories** | [**java.util.List&lt;GetNewsArticleGetDataCategoriesItems&gt;**](GetNewsArticleGetDataCategoriesItems.md) | Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values. |  [optional]
**instruments** | [**java.util.List&lt;GetNewsArticleGetDataInstrumentsItems&gt;**](GetNewsArticleGetDataInstrumentsItems.md) | Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off. |  [optional]
**media** | [**java.util.List&lt;GetNewsArticleGetDataMediaItems&gt;**](GetNewsArticleGetDataMediaItems.md) | List of media elements of the news article. |  [optional]


## Implemented Interfaces

* Serializable


