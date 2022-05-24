

# InlineResponse2002DataArticles


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Identifier of the news article. |  [optional]
**time** | **String** | Date and time of the news article. |  [optional]
**headline** | **String** | Headline of the news article represented as text with HTML entity encoding but without HTML tags. |  [optional]
**summary** | **String** | Textual summary of the body of the news article or &#x60;null&#x60; if no summary was provided by the news article distributor. |  [optional]
**types** | [**java.util.List&lt;InlineResponse2001Types&gt;**](InlineResponse2001Types.md) | Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values. |  [optional]
**language** | [**InlineResponse2001Language**](InlineResponse2001Language.md) |  |  [optional]
**categories** | [**java.util.List&lt;InlineResponse2001Categories&gt;**](InlineResponse2001Categories.md) | Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values. |  [optional]
**instruments** | [**java.util.List&lt;InlineResponse2001Instruments&gt;**](InlineResponse2001Instruments.md) | Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off. |  [optional]


## Implemented Interfaces

* Serializable


