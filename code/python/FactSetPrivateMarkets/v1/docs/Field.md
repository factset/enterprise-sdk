# Field


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **str** | Data item to be used as &#x60;fields&#x60; input in &#x60;/factset-private-markets/v#/&#x60; endpoint. | [optional] 
**name** | **str** | Plain text name of the field. | [optional] 
**category** | **str** | Corresponding endpoint to input field item. For example, fields returning the category &#39;FINANCIALS&#39; should be used in the /financials endpoint. The same follows data items falling in the category for NON_PERIODIC, which would be used in the /non-periodic endpoint. | [optional] 
**factor** | **int** | The factor for the field (e.g. 1000 &#x3D; thousands). | [optional] 
**sdf_name** | **str** | The name of the data item as it appears in the Standard Data Feed (SDF). A null value represents items available only in API. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


