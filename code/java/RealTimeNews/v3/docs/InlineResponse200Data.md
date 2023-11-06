

# InlineResponse200Data

Content of the news article.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **String** | Date and time of the news article. |  [optional]
**headline** | **String** | Headline of the news article represented as text with HTML entity encoding but without HTML tags. |  [optional]
**summary** | **String** | Textual summary of the body of the news article or &#x60;null&#x60; if no summary was provided by the news article distributor. |  [optional]
**body** | **String** | Text body of the news article. |  [optional]
**types** | [**java.util.List&lt;InlineResponse200DataTypes&gt;**](InlineResponse200DataTypes.md) | Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values. |  [optional]
**language** | [**InlineResponse200DataLanguage**](InlineResponse200DataLanguage.md) |  |  [optional]
**distributor** | [**InlineResponse200DataDistributor**](InlineResponse200DataDistributor.md) |  |  [optional]
**publisher** | [**InlineResponse200DataPublisher**](InlineResponse200DataPublisher.md) |  |  [optional]
**categories** | [**java.util.List&lt;InlineResponse200DataCategories&gt;**](InlineResponse200DataCategories.md) | Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values. |  [optional]
**instruments** | [**java.util.List&lt;InlineResponse200DataInstruments&gt;**](InlineResponse200DataInstruments.md) | Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off. |  [optional]
**media** | [**java.util.List&lt;InlineResponse200DataMedia&gt;**](InlineResponse200DataMedia.md) | List of media elements of the news article. |  [optional]


## Implemented Interfaces

* Serializable


