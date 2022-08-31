

# HoldingAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grouping** | [**SecurityGroup**](SecurityGroup.md) |  |  [optional]
**uncoveredAssets** | [**UncoveredAssetsEnum**](#UncoveredAssetsEnum) | Uncovered asset weight handling. Default values: &#39;portfolio&#39; -&gt; ExcludeToGlobalCash, &#39;benchmark&#39; -&gt; Normalize, &#39;market&#39; -&gt; Normalize. See also [OA:21737](https://my.apps.factset.com/oa/pages/21737#group_normal_mix) |  [optional]



## Enum: UncoveredAssetsEnum

Name | Value
---- | -----
NORMALIZE | &quot;Normalize&quot;
EXCLUDETOGLOBALCASH | &quot;ExcludeToGlobalCash&quot;
NORMALIZEWITHGROUPCASH | &quot;NormalizeWithGroupCash&quot;
EXCLUDETOCASHWITHINGROUP | &quot;ExcludeToCashWithinGroup&quot;
NORMALIZEWITHINGROUP | &quot;NormalizeWithinGroup&quot;


## Implemented Interfaces

* Serializable


