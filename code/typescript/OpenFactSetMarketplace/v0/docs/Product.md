# openfactsetmarketplace.Product

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Product unique identifier | 
**productPageUrl** | **String** | URL of the product&#39;s page on the marketplace catalog. | 
**secondaryLink** | **String** | Secondary link with additional information | [optional] 
**title** | **String** | Product title | 
**description** | **String** | Product description | 
**createDate** | **Date** | Product creation date | 
**partner** | [**ProductPartner**](ProductPartner.md) |  | 
**productStatus** | **String** | Product status pertaining to its availability on the Open:FactSet Marketplace | 
**type** | **[String]** | Product type | 
**documents** | [**[DocumentsItems]**](DocumentsItems.md) | Product documents | [optional] 
**thirdPartyUrls** | [**[ThirdPartyUrls]**](ThirdPartyUrls.md) | Product third party URLs | [optional] 
**primaryLink** | **String** | Link to primary product information, which is separate from the product&#39;s product page URL. | [optional] 
**previewLink** | **String** | Link to additional information on the product, which is separate from the product&#39;s product page URL. | [optional] 
**relatedProducts** | [**[RelatedProducts]**](RelatedProducts.md) | Related products | [optional] 
**coverageTable** | **String** | Product coverage table (HTML) | [optional] 
**attributesGroups** | [**[AttributesGroupsItem]**](AttributesGroupsItem.md) | Key-value pairs of product attributes that describe the product and its usage. These attributes groups are used to filter products on the marketplace catalog. | [optional] 
**videoUrl** | **String** | Product video URL | [optional] 
**navigatorUrl** | **String** | Product Data Navigator URL, on https://open.factset.com/navigator/ | [optional] 
**updateFrequency** | **String** | Product update frequency, i.e. &#39;Daily&#39;, &#39;Weekly&#39;, etc. | [optional] 
**deliveryFrequency** | **String** | Product delivery frequency, i.e. &#39;Daily&#39;, &#39;Weekly&#39;, etc. | [optional] 



## Enum: ProductStatusEnum


* `available` (value: `"available"`)

* `candidate` (value: `"candidate"`)

* `comingSoon` (value: `"comingSoon"`)

* `developmentQueue` (value: `"developmentQueue"`)

* `new` (value: `"new"`)

* `updated` (value: `"updated"`)





## Enum: [TypeEnum]


* `dataFeed` (value: `"dataFeed"`)

* `api` (value: `"api"`)

* `platform` (value: `"platform"`)





## Enum: UpdateFrequencyEnum


* `quarterly` (value: `"quarterly"`)

* `monthly` (value: `"monthly"`)

* `daily` (value: `"daily"`)

* `weekly` (value: `"weekly"`)

* `annual` (value: `"annual"`)

* `event` (value: `"event"`)

* `intraday` (value: `"intraday"`)





## Enum: DeliveryFrequencyEnum


* `intradayDaily` (value: `"intradayDaily"`)

* `quarterly` (value: `"quarterly"`)

* `monthly` (value: `"monthly"`)

* `intraday` (value: `"intraday"`)

* `weekly` (value: `"weekly"`)

* `daily` (value: `"daily"`)

* `annual` (value: `"annual"`)

* `event` (value: `"event"`)




