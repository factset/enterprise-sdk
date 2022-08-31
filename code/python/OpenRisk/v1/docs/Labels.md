# Labels

Labeling and index information to be able to reconstruct the calculated data results to the provided inputs from the request. Only contains items relevant to results; will not be present at all if all calculation-levels are 'Portfolio'.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**security** | [**LabelsSecurity**](LabelsSecurity.md) |  | [optional] 
**factor** | [**LabelsFactor**](LabelsFactor.md) |  | [optional] 
**security_group** | [**GroupsLabels**](GroupsLabels.md) |  | [optional] 
**factor_group** | [**GroupsLabels**](GroupsLabels.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


