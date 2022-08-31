# FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model.CursorBasedPaginationOutputObject
Pagination attributes for the cursor-based pagination strategy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Total** | **decimal** | Total number of entries in the result set. | 
**IsEstimatedTotal** | **bool** | Flag indicating that the value of &#x60;total&#x60; is estimated. | 
**Next** | **string** | The next cursor position to use in the parameter &#x60;pagination.cursor&#x60; for an endpoint that supports cursor-based pagination, otherwise &#x60;null&#x60;. | 
**Previous** | **string** | The previous cursor position to use in the parameter &#x60;pagination.cursor&#x60; for an endpoint that supports cursor-based pagination. If a previous cursor position is not supported or available, &#x60;previous&#x60; is &#x60;null&#x60;. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

