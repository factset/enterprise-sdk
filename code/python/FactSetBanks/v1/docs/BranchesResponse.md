# BranchesResponse

Response containing branch and location data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**[Branch]**](Branch.md) | Array of branch and location data. Structure varies by coverage type: * **US** — Aggregated branch counts and deposit market share by geographic area * **CREDIT_UNION** — Individual credit union branch/ATM locations * **AUSTRALIA** — Individual service channel locations * **GLOBAL** — Individual branch locations (ex-US)  | [optional] 
**meta** | [**Meta**](Meta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


