# FactSet.SDK.OpenRisk.Model.FactorGroup
Factor grouping definition to use for calculations and results. This field impacts the calculation only when any 'FactorGroup' level statistics are requested, e.g. 'FactorGroup', 'FactorGroupSecurity'.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of this factor group | [optional] 
**Nodes** | [**List&lt;FactorGroupNodes&gt;**](FactorGroupNodes.md) | Recursively defined elements; base case array (i.e., lowest factor group) contains &#39;RiskModelFactor&#39; objects only and no &#39;FactorGroup&#39; objects | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

