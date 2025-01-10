# CursorBasedPaginationOutputObject

Pagination attributes for the cursor-based pagination strategy.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **int** | Total number of entries in the result set. | 
**is_estimated_total** | **bool** | Flag indicating that the value of &#x60;total&#x60; is estimated. | 
**next** | **str** | The next cursor position to use in the parameter &#x60;pagination.cursor&#x60; for an endpoint that supports cursor-based pagination, otherwise &#x60;null&#x60;. | 
**previous** | **str** | The previous cursor position to use in the parameter &#x60;pagination.cursor&#x60; for an endpoint that supports cursor-based pagination. If a previous cursor position is not supported or available, &#x60;previous&#x60; is &#x60;null&#x60;. | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


