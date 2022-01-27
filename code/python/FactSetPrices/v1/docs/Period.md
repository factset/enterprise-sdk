# Period

Period of measure for Prices High Low. This does not change display `frequency` but rather the underlying return calculation period. All periods are referencing actual periods of measure, not period-ends. For example, 1M rolling period will go back to that date the previous month, which is not always the month-end date.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Period of measure for Prices High Low. This does not change display &#x60;frequency&#x60; but rather the underlying return calculation period. All periods are referencing actual periods of measure, not period-ends. For example, 1M rolling period will go back to that date the previous month, which is not always the month-end date. | defaults to "52W",  must be one of ["1D", "1W", "1M", "3M", "6M", "52W", "2Y", "3Y", "5Y", "10Y", ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


