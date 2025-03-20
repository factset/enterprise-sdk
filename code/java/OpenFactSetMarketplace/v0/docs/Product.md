

# Product

Product object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Product unique identifier | 
**productPageUrl** | **String** | URL of the product&#39;s page on the marketplace catalog. | 
**secondaryLink** | **String** | Secondary link with additional information |  [optional]
**title** | **String** | Product title | 
**description** | **String** | Product description | 
**createDate** | **LocalDate** | Product creation date | 
**partner** | [**ProductPartner**](ProductPartner.md) |  | 
**productStatus** | [**ProductStatusEnum**](#ProductStatusEnum) | Product status pertaining to its availability on the Open:FactSet Marketplace | 
**type** | [**java.util.List&lt;TypeEnum&gt;**](#java.util.List&lt;TypeEnum&gt;) | Product type | 
**documents** | [**java.util.List&lt;DocumentsItems&gt;**](DocumentsItems.md) | Product documents |  [optional]
**thirdPartyUrls** | [**java.util.List&lt;ThirdPartyUrls&gt;**](ThirdPartyUrls.md) | Product third party URLs |  [optional]
**primaryLink** | **String** | Link to primary product information, which is separate from the product&#39;s product page URL. |  [optional]
**previewLink** | **String** | Link to additional information on the product, which is separate from the product&#39;s product page URL. |  [optional]
**relatedProducts** | [**java.util.List&lt;RelatedProducts&gt;**](RelatedProducts.md) | Related products |  [optional]
**coverageTable** | **String** | Product coverage table (HTML) |  [optional]
**attributesGroups** | [**java.util.List&lt;AttributesGroupsItem&gt;**](AttributesGroupsItem.md) | Key-value pairs of product attributes that describe the product and its usage. These attributes groups are used to filter products on the marketplace catalog. |  [optional]
**videoUrl** | **String** | Product video URL |  [optional]
**navigatorUrl** | **String** | Product Data Navigator URL, on https://open.factset.com/navigator/ |  [optional]
**updateFrequency** | [**UpdateFrequencyEnum**](#UpdateFrequencyEnum) | Product update frequency, i.e. &#39;Daily&#39;, &#39;Weekly&#39;, etc. |  [optional]
**deliveryFrequency** | [**DeliveryFrequencyEnum**](#DeliveryFrequencyEnum) | Product delivery frequency, i.e. &#39;Daily&#39;, &#39;Weekly&#39;, etc. |  [optional]



## Enum: ProductStatusEnum

Name | Value
---- | -----
AVAILABLE | &quot;available&quot;
CANDIDATE | &quot;candidate&quot;
COMINGSOON | &quot;comingSoon&quot;
DEVELOPMENTQUEUE | &quot;developmentQueue&quot;
NEW | &quot;new&quot;
UPDATED | &quot;updated&quot;



## Enum: java.util.List&lt;TypeEnum&gt;

Name | Value
---- | -----
DATAFEED | &quot;dataFeed&quot;
API | &quot;api&quot;
PLATFORM | &quot;platform&quot;



## Enum: UpdateFrequencyEnum

Name | Value
---- | -----
QUARTERLY | &quot;quarterly&quot;
MONTHLY | &quot;monthly&quot;
DAILY | &quot;daily&quot;
WEEKLY | &quot;weekly&quot;
ANNUAL | &quot;annual&quot;
EVENT | &quot;event&quot;
INTRADAY | &quot;intraday&quot;



## Enum: DeliveryFrequencyEnum

Name | Value
---- | -----
INTRADAYDAILY | &quot;intradayDaily&quot;
QUARTERLY | &quot;quarterly&quot;
MONTHLY | &quot;monthly&quot;
INTRADAY | &quot;intraday&quot;
WEEKLY | &quot;weekly&quot;
DAILY | &quot;daily&quot;
ANNUAL | &quot;annual&quot;
EVENT | &quot;event&quot;


## Implemented Interfaces

* Serializable


