# InputToResultSecurityIndexMapping

For each input holding from the request, a list of indices aligned to the input holding's IDs. These 0-based index values key into the security dimension of the results arrays and the `labels.security.ids` array.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio** | **[int]** | Index mapping corresponding to the input &#39;portfolio&#39; holdings | 
**benchmark** | **[int]** | Index mapping corresponding to the input &#39;benchmark&#39; holdings | [optional] 
**market** | **[int]** | Index mapping corresponding to the input &#39;market&#39; holdings | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


