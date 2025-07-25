# FactSet.SDK.RealTimeOptions.Model.PostOptionByClassValueRangesGetRequestDataKeyFiguresMoneyness
Value range of the ratio of the current underlying level to the strike of an option. For calls, it is current underlying level divided by the strike. For puts, it is strike divided by the current underlying level. It measures the degree to which an option is in-the-money (moneyness > 1) or out-of-the-money (moneyness < 1). If moneyness = 1, the option is at-the-money.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Minimum** | [**PostOptionByClassListRequestDataKeyFiguresOmegaMinimum**](PostOptionByClassListRequestDataKeyFiguresOmegaMinimum.md) |  | [optional] 
**Maximum** | [**PostOptionByClassListRequestDataOpenInterestMaximum**](PostOptionByClassListRequestDataOpenInterestMaximum.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

