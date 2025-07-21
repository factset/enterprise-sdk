# Metric

Metric Object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metric** | **str, none_type** | Data item to be used as &#x60;metrics&#x60; input in &#x60;/factset-private-company/v#/&#x60; endpoint. | [optional] 
**description** | **str, none_type** | Description of the metric. | [optional] 
**category** | **str, none_type** | Corresponding endpoint to input metric item. For example, metrics returning the category &#39;FINANCIALS&#39; should be used in the &#x60;/financials&#x60; endpoint. The same follows data items falling in the category for NON_PERIODIC, which would be used in the &#x60;/non-periodic&#x60; endpoint. | [optional] 
**factor** | **int, none_type** | The factor for the metric (e.g. 1000 &#x3D; thousands). | [optional] 
**sdf_name** | **str, none_type** | The name of the data item as it appears in the Standard Data Feed (SDF). A null value represents items available only in API. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


