# StockDividendListDataFilterPeriod

Period for which the dividends shall be returned. Since not all attributes contained in the dates object are available for all dividends, the following priority of the available dates is used to determine whether a dividend belongs to the specified period:  1. payment  2. effective  3. record  4. announcement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **date** | The starting point of the date range (inclusive), or &#x60;null&#x60; to indicate that the date range extends indefinitely into the past. | 
**end** | **date** | The ending point of the date range (inclusive), or &#x60;null&#x60; to indicate that the date range extends indefinitely into the future. | 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


