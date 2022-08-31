# FactSet.SDK.OpenRisk.Model.SecurityGroup
Security grouping definition to use in calculation and results. Multi-layer security groupings are also suppoted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** |  | [optional] 
**Indices** | **List&lt;int&gt;** | List of 0-based indices into the containing holding&#39;s security IDs array | [optional] 
**Groups** | [**List&lt;SecurityGroup&gt;**](SecurityGroup.md) | Recursively defined elements; base case array (i.e., lowest security group) contains objects with &#39;indices&#39; only and not &#39;groups&#39; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

