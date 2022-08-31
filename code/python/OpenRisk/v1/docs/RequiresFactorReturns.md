# RequiresFactorReturns

Indicates factor returns are required and which frequency from the risk model to fetch and use. The requested factor return frequency must be one that is available from the selected risk model itself. The orientation of factor return is forward-looking. For example, if daily factor return is called, and 'date' is set as '2021-06-30', factor return date range used for calculation is 2021-06-30 to 2021-07-01, assuming no holidays in these two dates.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Indicates factor returns are required and which frequency from the risk model to fetch and use. The requested factor return frequency must be one that is available from the selected risk model itself. The orientation of factor return is forward-looking. For example, if daily factor return is called, and &#39;date&#39; is set as &#39;2021-06-30&#39;, factor return date range used for calculation is 2021-06-30 to 2021-07-01, assuming no holidays in these two dates. |  must be one of ["Daily", "Monthly", ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


