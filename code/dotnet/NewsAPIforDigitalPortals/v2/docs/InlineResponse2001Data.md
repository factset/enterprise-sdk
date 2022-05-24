# FactSet.SDK.NewsAPIforDigitalPortals.Model.InlineResponse2001Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Identifier of the news article. | [optional] 
**Time** | **string** | Date and time of the news article. | [optional] 
**Headline** | **string** | Headline of the news article represented as text with HTML entity encoding but without HTML tags. | [optional] 
**Summary** | **string** | Textual summary of the body of the news article or &#x60;null&#x60; if no summary was provided by the news article distributor. | [optional] 
**Types** | [**List&lt;InlineResponse2001Types&gt;**](InlineResponse2001Types.md) | Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values. | [optional] 
**Language** | [**InlineResponse2001Language**](InlineResponse2001Language.md) |  | [optional] 
**Distributor** | [**InlineResponse2001Distributor**](InlineResponse2001Distributor.md) |  | [optional] 
**Publisher** | [**InlineResponse2001Publisher**](InlineResponse2001Publisher.md) |  | [optional] 
**Categories** | [**List&lt;InlineResponse2001Categories&gt;**](InlineResponse2001Categories.md) | Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values. | [optional] 
**Chain** | [**InlineResponse2001Chain**](InlineResponse2001Chain.md) |  | [optional] 
**Instruments** | [**List&lt;InlineResponse2001Instruments&gt;**](InlineResponse2001Instruments.md) | Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

