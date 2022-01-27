

# InlineResponse2002DataArticles


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Identifier of the news article. |  [optional]
**time** | **String** | Date and time of the news article. |  [optional]
**headline** | **String** | Headline of the news article represented as text with HTML entity encoding but without HTML tags. |  [optional]
**types** | [**java.util.List&lt;InlineResponse2001Types&gt;**](InlineResponse2001Types.md) | Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values. |  [optional]
**language** | [**InlineResponse2001Language**](InlineResponse2001Language.md) |  |  [optional]
**categories** | [**java.util.List&lt;InlineResponse2001Categories&gt;**](InlineResponse2001Categories.md) | Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values. |  [optional]


## Implemented Interfaces

* Serializable


