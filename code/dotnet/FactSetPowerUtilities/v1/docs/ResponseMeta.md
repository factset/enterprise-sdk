# FactSet.SDK.FactSetPowerUtilities.Model.ResponseMeta
Response metadata including pagination and request tracking.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pagination** | [**ResponsePagination**](ResponsePagination.md) |  | [optional] 
**RequestedIds** | **int** | Total number of identifiers submitted in the request. | [optional] 
**FailedIds** | **List&lt;string&gt;** | List of identifiers from the request that failed (invalid format, empty, or not found). Empty array when all submitted IDs resolved successfully. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

