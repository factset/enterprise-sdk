

# PostOptionByClassValueRangesGetRequestDataKeyFiguresMoneyness

Value range of the ratio of the current underlying level to the strike of an option. For calls, it is current underlying level divided by the strike. For puts, it is strike divided by the current underlying level. It measures the degree to which an option is in-the-money (moneyness > 1) or out-of-the-money (moneyness < 1). If moneyness = 1, the option is at-the-money.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minimum** | [**PostOptionByClassListRequestDataKeyFiguresOmegaMinimum**](PostOptionByClassListRequestDataKeyFiguresOmegaMinimum.md) |  |  [optional]
**maximum** | [**PostOptionByClassListRequestDataOpenInterestMaximum**](PostOptionByClassListRequestDataOpenInterestMaximum.md) |  |  [optional]


## Implemented Interfaces

* Serializable


