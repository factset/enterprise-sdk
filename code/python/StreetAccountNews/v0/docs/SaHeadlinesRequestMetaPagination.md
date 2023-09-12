# SaHeadlinesRequestMetaPagination

Object defining pagination for the results pageable attribute. Offset-based strategy is used for Pagination.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **int** | Non-negative maximum number of entries to return. | [optional]  if omitted the server will use the default value of 500
**offset** | **int** | Non-negative number of entries to skip. | [optional]  if omitted the server will use the default value of 0
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


