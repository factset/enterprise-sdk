# Metric

Definition and metadata for a single available metric.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | **str** | Metric code identifier | [optional] 
**category** | **str** | Primary category of the metric | [optional] 
**subcategory** | **str** | Sub-category classification | [optional] 
**data_type** | **str** | Data type of metric values | [optional] 
**description** | **str** | Detailed description of the metric | [optional] 
**oa_page_id** | **str, none_type** | Online Assistant page ID for methodology | [optional] 
**oa_url** | **str, none_type** | Online Assistant URL for methodology | [optional] 
**subsidiary** | **bool** | Whether this metric requires a subsidiary entity identifier. Use &#x60;/search-entities&#x60; with the appropriate reportType to resolve the correct subsidiary identifier if true.  | [optional]  if omitted the server will use the default value of False
**holding** | **bool** | Whether this metric requires a holding company (parent) entity identifier. Use &#x60;/search-entities&#x60; with the appropriate reportType to resolve the correct holding company identifier if true.  | [optional]  if omitted the server will use the default value of False
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


