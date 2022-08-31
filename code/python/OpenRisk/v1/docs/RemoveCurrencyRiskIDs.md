# RemoveCurrencyRiskIDs

Security IDs from which the contribution of currency to risk should be removed or not. Typical use includes asset types such as Contract for Difference (CFD), equity futures, and index futures. This will override the automatic currency removal based on assetTypes when provided. If this input type is provided, all assets that do not have explicit specification will have currency risk, because the default value is false. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**any string name** | **bool** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


