# InlineResponse200DataTradingVolume

Requirements regarding the trading volume in the over-the-counter (non-exchange-based) trading. For the currency of the trading volume, see attribute `issue.volume.currency`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minimum** | **float** | Minimum trading volume. | [optional] 
**increment** | **float** | Incremental trading volume over the minimum. The trading volume over the minimum must be an integral multiple of the increment. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


