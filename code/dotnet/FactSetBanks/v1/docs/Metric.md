# FactSet.SDK.FactSetBanks.Model.Metric
Definition and metadata for a single available metric.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_Metric** | **string** | Metric code identifier | [optional] 
**Category** | **string** | Primary category of the metric | [optional] 
**Subcategory** | **string** | Sub-category classification | [optional] 
**DataType** | **string** | Data type of metric values | [optional] 
**Description** | **string** | Detailed description of the metric | [optional] 
**OaPageId** | **string** | Online Assistant page ID for methodology | [optional] 
**OaUrl** | **string** | Online Assistant URL for methodology | [optional] 
**Subsidiary** | **bool** | Whether this metric requires a subsidiary entity identifier. Use &#x60;/search-entities&#x60; with the appropriate reportType to resolve the correct subsidiary identifier if true.  | [optional] [default to false]
**Holding** | **bool** | Whether this metric requires a holding company (parent) entity identifier. Use &#x60;/search-entities&#x60; with the appropriate reportType to resolve the correct holding company identifier if true.  | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

