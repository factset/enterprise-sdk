# DebtInstrumentNotationScreenerSearchDataTradingVolume

Parameters regarding the trading volume. The issuer of a debt instrument may define a minimum trading volume, and an increment over that minimum, per market place and for the over-the-counter (e.g. interbank) trade. Orders that do not match the defined volumes cannot be (fully) executed. The currency is the currency of denomination, thus the parameter `issue.volume.currency.restrict.ids` must be set to exactly one currency in order to use this parameter.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**otc** | [**DebtInstrumentNotationScreenerSearchDataTradingVolumeOtc**](DebtInstrumentNotationScreenerSearchDataTradingVolumeOtc.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


