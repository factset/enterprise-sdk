# openrisk.Holding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[String]** | Security identifiers | 
**marketValues** | **[Number]** | Security market values | 
**grouping** | [**SecurityGroup**](SecurityGroup.md) |  | [optional] 
**uncoveredAssets** | **String** | Uncovered asset weight handling. Default values: &#39;portfolio&#39; -&gt; ExcludeToGlobalCash, &#39;benchmark&#39; -&gt; Normalize, &#39;market&#39; -&gt; Normalize. See also [OA:21737](https://my.apps.factset.com/oa/pages/21737#group_normal_mix) | [optional] 



## Enum: UncoveredAssetsEnum


* `Normalize` (value: `"Normalize"`)

* `ExcludeToGlobalCash` (value: `"ExcludeToGlobalCash"`)

* `NormalizeWithGroupCash` (value: `"NormalizeWithGroupCash"`)

* `ExcludeToCashWithinGroup` (value: `"ExcludeToCashWithinGroup"`)

* `NormalizeWithinGroup` (value: `"NormalizeWithinGroup"`)




