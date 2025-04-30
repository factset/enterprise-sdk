# FactSet.SDK.OpenFactSetMarketplace.Model.Product
Product object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Product unique identifier | 
**ProductPageUrl** | **string** | URL of the product&#39;s page on the marketplace catalog. | 
**SecondaryLink** | **string** | Secondary link with additional information | [optional] 
**Title** | **string** | Product title | 
**Description** | **string** | Product description | 
**CreateDate** | **DateTime** | Product creation date | 
**Partner** | [**ProductPartner**](ProductPartner.md) |  | 
**ProductStatus** | **string** | Product status pertaining to its availability on the Open:FactSet Marketplace | 
**Type** | **List&lt;string&gt;** | Product type | 
**Documents** | [**List&lt;DocumentsItems&gt;**](DocumentsItems.md) | Product documents | [optional] 
**ThirdPartyUrls** | [**List&lt;ThirdPartyUrls&gt;**](ThirdPartyUrls.md) | Product third party URLs | [optional] 
**PrimaryLink** | **string** | Link to primary product information, which is separate from the product&#39;s product page URL. | [optional] 
**PreviewLink** | **string** | Link to additional information on the product, which is separate from the product&#39;s product page URL. | [optional] 
**RelatedProducts** | [**List&lt;RelatedProducts&gt;**](RelatedProducts.md) | Related products | [optional] 
**CoverageTable** | **string** | Product coverage table (HTML) | [optional] 
**AttributesGroups** | [**List&lt;AttributesGroupsItem&gt;**](AttributesGroupsItem.md) | Key-value pairs of product attributes that describe the product and its usage. These attributes groups are used to filter products on the marketplace catalog. | [optional] 
**VideoUrl** | **string** | Product video URL | [optional] 
**NavigatorUrl** | **string** | Product Data Navigator URL, on https://open.factset.com/navigator/ | [optional] 
**UpdateFrequency** | **string** | Product update frequency, i.e. &#39;Daily&#39;, &#39;Weekly&#39;, etc. | [optional] 
**DeliveryFrequency** | **string** | Product delivery frequency, i.e. &#39;Daily&#39;, &#39;Weekly&#39;, etc. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

