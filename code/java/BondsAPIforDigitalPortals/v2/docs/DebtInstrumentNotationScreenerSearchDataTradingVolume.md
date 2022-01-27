

# DebtInstrumentNotationScreenerSearchDataTradingVolume

Parameters regarding the trading volume. The issuer of a debt instrument may define a minimum trading volume, and an increment over that minimum, per market place and for the over-the-counter (e.g. interbank) trade. Orders that do not match the defined volumes cannot be (fully) executed. The currency is the currency of denomination, thus the parameter `issue.volume.currency.restrict.ids` must be set to exactly one currency in order to use this parameter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**otc** | [**DebtInstrumentNotationScreenerSearchDataTradingVolumeOtc**](DebtInstrumentNotationScreenerSearchDataTradingVolumeOtc.md) |  |  [optional]


## Implemented Interfaces

* Serializable


