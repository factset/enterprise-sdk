# CursorBasedPaginationOutputObject

Pagination attributes for the cursor-based pagination strategy.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **int, none_type** | Total number of entries in the result set. | [optional] 
**is_estimated_total** | **bool, none_type** | Flag indicating that the value of &#x60;total&#x60; is estimated. | [optional] 
**next** | **str, none_type** | The next cursor position to use in the parameter &#x60;pagination.cursor&#x60; for an endpoint that supports cursor-based pagination, otherwise &#x60;null&#x60;. | [optional] 
**previous** | **str, none_type** | The previous cursor position to use in the parameter &#x60;pagination.cursor&#x60; for an endpoint that supports cursor-based pagination. If a previous cursor position is not supported or available, &#x60;previous&#x60; is &#x60;null&#x60;. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


