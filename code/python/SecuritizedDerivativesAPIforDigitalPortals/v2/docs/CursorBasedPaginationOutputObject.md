# CursorBasedPaginationOutputObject

Pagination attributes for the cursor-based pagination strategy.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **float** | Total number of entries in the result set. | 
**is_estimated_total** | **bool** | Flag indicating that the value of \&quot;total\&quot; is estimated. | 
**next** | **str** | Cursor position to use in the attribute &#x60;pagination.cursor&#x60; to retrieve the next page of results, if any, otherwise null. | 
**previous** | **str** | Cursor position to use in the attribute &#x60;pagination.cursor&#x60; to retrieve the previous page of results, if any, otherwise null. | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


