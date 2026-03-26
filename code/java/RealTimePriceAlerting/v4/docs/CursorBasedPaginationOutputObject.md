

# CursorBasedPaginationOutputObject

Pagination attributes for the cursor-based pagination strategy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** | Total number of entries in the result set. |  [optional]
**isEstimatedTotal** | **Boolean** | Flag indicating that the value of &#x60;total&#x60; is estimated. |  [optional]
**next** | **String** | The next cursor position to use in the parameter &#x60;pagination.cursor&#x60; for an endpoint that supports cursor-based pagination, otherwise &#x60;null&#x60;. |  [optional]
**previous** | **String** | The previous cursor position to use in the parameter &#x60;pagination.cursor&#x60; for an endpoint that supports cursor-based pagination. If a previous cursor position is not supported or available, &#x60;previous&#x60; is &#x60;null&#x60;. |  [optional]


## Implemented Interfaces

* Serializable


