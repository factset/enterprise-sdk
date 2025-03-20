

# PostSecuritizedDerivativeNotationRankingIntradayListDataItemsAccumulatedCurrency

Main currency of the trading value. For securitized derivatives quoted in percent, it is also the currency of the nominal trading volume, for the latter see attribute `accumulated.tradingVolume`. For securitized derivatives quoted in units, this attribute contains the same unit as the attribute `valueUnit`. See endpoint `/basic/value-unit/main/currency/list` for possible values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **BigDecimal** | Identifier of the currency. |  [optional]
**code** | **String** | Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code. |  [optional]


## Implemented Interfaces

* Serializable


