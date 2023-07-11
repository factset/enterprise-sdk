# Pagination

List of pagination objects

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **int** | Total number of files the API returns for a particular query | [optional] 
**is_estimated_total** | **bool** | Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to False as the API should always return the exact count | [optional] 
**limit** | **int** | Number of results returned per page | [optional] 
**offset** | **int** | The flag indicating the position in the results array if additional results are available beyond the default value or the value in paginationLimit parameter (if used). This value is passed in the _paginationOffset parameter to retreieve subsequent results | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


