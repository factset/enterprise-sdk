

# FactorGroup

Factor grouping definition to use for calculations and results. This field impacts the calculation only when any 'FactorGroup' level statistics are requested, e.g. 'FactorGroup', 'FactorGroupSecurity'.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of this factor group |  [optional]
**nodes** | [**java.util.List&lt;FactorGroupNodes&gt;**](FactorGroupNodes.md) | Recursively defined elements; base case array (i.e., lowest factor group) contains &#39;RiskModelFactor&#39; objects only and no &#39;FactorGroup&#39; objects | 


## Implemented Interfaces

* Serializable


