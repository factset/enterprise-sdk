

# Holding

Security IDs and market values plus optional security grouping; the arrays must have the same number of items. Public security IDs such as SEDOL, CUSIP, ISIN, and Ticker are supported. If proprietary IDs are provided, they need to be mapped via composite assets. Market values are used to calculate weights and do not have to be normalized, but need to be denominated in the single same currency ISO.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** |  | 
**marketValues** | **java.util.List&lt;Double&gt;** |  | 
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


