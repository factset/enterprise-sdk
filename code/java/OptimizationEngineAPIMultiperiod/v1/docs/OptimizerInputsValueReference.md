

# OptimizerInputsValueReference

Contains the results of an asset-level formula from FPO, mapping the TotalUniverse asset index to resulting value. The list of ValueReferences in the LookupTables should provide results for ALL formulae referenced throughout the FPO strategy. When the optimizer encounters a \"reference\" value in the strategy, it will come here to resolve the value for each asset within the scope of that reference.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetValues** | **Double** |  |  [optional]


## Implemented Interfaces

* Serializable


