# PostOptionByClassListRequestDataKeyFiguresMoneyness

Value range of the ratio of the current underlying level to the strike of an option. For calls, it is current underlying level divided by the strike. For puts, it is strike divided by the current underlying level. It measures the degree to which an option is in-the-money (moneyness > 1) or out-of-the-money (moneyness < 1). If moneyness = 1, the option is at-the-money.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minimum** | [**PostOptionByClassListRequestDataOpenInterestMinimum**](PostOptionByClassListRequestDataOpenInterestMinimum.md) |  | [optional] 
**maximum** | [**PostOptionByClassListRequestDataKeyFiguresMoneynessMaximum**](PostOptionByClassListRequestDataKeyFiguresMoneynessMaximum.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


