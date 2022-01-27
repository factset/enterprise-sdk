# FactSet.SDK.FactSetTickHistory.Model.Pagination
List of pagination objects

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Total** | **int** | Total number of files the API returns for a particular query | [optional] 
**IsEstimatedTotal** | **bool** | Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to  “False” as the API should always return the exact count | [optional] 
**Limit** | **int** | Number of results returned per page | [optional] 
**Offset** | **int** | The flag indicating the position in the results array if additional results are available beyond the default value or the value in paginationLimit parameter (if used). This value is passed in the _paginationOffset parameter to retreieve subsequent results | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

