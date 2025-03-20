# Product

Product object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Product unique identifier | 
**product_page_url** | **str** | URL of the product&#39;s page on the marketplace catalog. | 
**title** | **str** | Product title | 
**description** | **str** | Product description | 
**create_date** | **date** | Product creation date | 
**partner** | [**ProductPartner**](ProductPartner.md) |  | 
**product_status** | **str** | Product status pertaining to its availability on the Open:FactSet Marketplace | 
**type** | **[str]** | Product type | 
**secondary_link** | **str** | Secondary link with additional information | [optional] 
**documents** | [**[DocumentsItems]**](DocumentsItems.md) | Product documents | [optional] 
**third_party_urls** | [**[ThirdPartyUrls]**](ThirdPartyUrls.md) | Product third party URLs | [optional] 
**primary_link** | **str** | Link to primary product information, which is separate from the product&#39;s product page URL. | [optional] 
**preview_link** | **str** | Link to additional information on the product, which is separate from the product&#39;s product page URL. | [optional] 
**related_products** | [**[RelatedProducts]**](RelatedProducts.md) | Related products | [optional] 
**coverage_table** | **str** | Product coverage table (HTML) | [optional] 
**attributes_groups** | [**[AttributesGroupsItem]**](AttributesGroupsItem.md) | Key-value pairs of product attributes that describe the product and its usage. These attributes groups are used to filter products on the marketplace catalog. | [optional] 
**video_url** | **str** | Product video URL | [optional] 
**navigator_url** | **str** | Product Data Navigator URL, on https://open.factset.com/navigator/ | [optional] 
**update_frequency** | **str** | Product update frequency, i.e. &#39;Daily&#39;, &#39;Weekly&#39;, etc. | [optional] 
**delivery_frequency** | **str** | Product delivery frequency, i.e. &#39;Daily&#39;, &#39;Weekly&#39;, etc. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


