# FactSet.SDK.OpenRisk.Model.GroupsLabels
Tree of input group name and calculated data results index for relevant group calculation-level

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Index** | **int** | 0-based index into the results array dimension for the corresponding calculation-levels | [optional] 
**Name** | **string** | Name that was provided for this group | [optional] 
**Groups** | [**List&lt;GroupsLabels&gt;**](GroupsLabels.md) | Recursively defined elements; base case array (i.e., lowest group) contains objects with &#39;name&#39; and &#39;index&#39; only and not &#39;groups&#39; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

