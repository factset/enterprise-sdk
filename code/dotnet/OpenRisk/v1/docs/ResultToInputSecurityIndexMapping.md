# FactSet.SDK.OpenRisk.Model.ResultToInputSecurityIndexMapping
For each input holding from the request, a list of indices aligned to the security dimension of the results arrays and the `labels.security.ids` array. These 0-based index values key into the input holding's IDs. Values less than 0 indicate result index not originating from corresponding holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Portfolio** | **List&lt;int&gt;** | Index mapping corresponding to the input &#39;portfolio&#39; holdings | 
**Benchmark** | **List&lt;int&gt;** | Index mapping corresponding to the input &#39;benchmark&#39; holdings | [optional] 
**Market** | **List&lt;int&gt;** | Index mapping corresponding to the input &#39;market&#39; holdings | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

