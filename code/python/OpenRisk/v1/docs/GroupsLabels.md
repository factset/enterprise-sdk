# GroupsLabels

Tree of input group name and calculated data results index for relevant group calculation-level

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | 0-based index into the results array dimension for the corresponding calculation-levels | [optional] 
**name** | **str** | Name that was provided for this group | [optional] 
**groups** | [**[GroupsLabels]**](GroupsLabels.md) | Recursively defined elements; base case array (i.e., lowest group) contains objects with &#39;name&#39; and &#39;index&#39; only and not &#39;groups&#39; | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


