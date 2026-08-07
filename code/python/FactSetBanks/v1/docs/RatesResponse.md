# RatesResponse

Response containing deposit rate data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**[Rate]**](Rate.md) | Array of deposit rate data. Structure varies based on data type: - **Product rates by balance tier**: One row per product-term-balance tier combination - **Average product rates**: One row per product-term combination - **Location-specific rates**: One row per product-term-state-deposit range combination  | [optional] 
**meta** | [**Meta**](Meta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


