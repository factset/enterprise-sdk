# CalculateMetadata

Generic options that can be applied to endpoint output.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sort** | **[str]** | An array of parameter references to sort by to override the sort set in the screen document. Format is \&quot;#P.&lt;parameter_name&gt;\&quot; for ascending sort, \&quot;-#P.&lt;parameter_name&gt;\&quot; for descending. Will sort by references in order of appearance in the provided list, i.e. will sort first by the 0th reference, then the 1st reference and so on. Limit of 7 references. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


