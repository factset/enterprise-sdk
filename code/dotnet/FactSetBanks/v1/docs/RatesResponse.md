# FactSet.SDK.FactSetBanks.Model.RatesResponse
Response containing deposit rate data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**List&lt;Rate&gt;**](Rate.md) | Array of deposit rate data. Structure varies based on data type: - **Product rates by balance tier**: One row per product-term-balance tier combination - **Average product rates**: One row per product-term combination - **Location-specific rates**: One row per product-term-state-deposit range combination  | [optional] 
**Meta** | [**Meta**](Meta.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

