# FactorGroup

Factor grouping definition to use for calculations and results. This field impacts the calculation only when any 'FactorGroup' level statistics are requested, e.g. 'FactorGroup', 'FactorGroupSecurity'.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodes** | [**[FactorGroupNodes]**](FactorGroupNodes.md) | Recursively defined elements; base case array (i.e., lowest factor group) contains &#39;RiskModelFactor&#39; objects only and no &#39;FactorGroup&#39; objects | 
**name** | **str** | Name of this factor group | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


