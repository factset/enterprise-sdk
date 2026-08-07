# FactSet.SDK.FactSetBanks.Model.Meta
Response metadata including pagination and request tracking information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pagination** | [**Pagination**](Pagination.md) |  | 
**RequestedIds** | **int** | Total number of identifiers submitted in the request. | [optional] 
**FailedIds** | **List&lt;string&gt;** | Identifiers from the request that failed (invalid format, empty, or not found). Empty array when all submitted identifiers resolved successfully. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

