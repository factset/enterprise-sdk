# OptimizerInputsValueReference

Contains the results of an asset-level formula from FPO, mapping the TotalUniverse asset index to resulting value. The list of ValueReferences in the LookupTables should provide results for ALL formulae referenced throughout the FPO strategy. When the optimizer encounters a \"reference\" value in the strategy, it will come here to resolve the value for each asset within the scope of that reference.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_values** | **float** |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


