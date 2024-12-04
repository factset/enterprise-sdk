

# PostNewsArticleListByChainDataArticlesItems

A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Identifier of the news article. |  [optional]
**time** | **OffsetDateTime** | Date and time of the news article. |  [optional]
**headline** | **String** | Headline of the news article represented as text with HTML entity encoding but without HTML tags. |  [optional]
**summary** | **String** | Textual summary of the body of the news article or &#x60;null&#x60; if no summary was provided by the news article distributor. |  [optional]
**types** | [**java.util.List&lt;PostNewsArticleListByChainDataArticlesTypesItems&gt;**](PostNewsArticleListByChainDataArticlesTypesItems.md) | Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values. |  [optional]
**language** | [**PostNewsArticleListByChainDataArticlesItemsLanguage**](PostNewsArticleListByChainDataArticlesItemsLanguage.md) |  |  [optional]
**categories** | [**java.util.List&lt;PostNewsArticleListByChainDataArticlesCategoriesItems&gt;**](PostNewsArticleListByChainDataArticlesCategoriesItems.md) | Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values. |  [optional]
**instruments** | [**java.util.List&lt;PostNewsArticleListByChainDataArticlesInstrumentsItems&gt;**](PostNewsArticleListByChainDataArticlesInstrumentsItems.md) | Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off. |  [optional]


## Implemented Interfaces

* Serializable


