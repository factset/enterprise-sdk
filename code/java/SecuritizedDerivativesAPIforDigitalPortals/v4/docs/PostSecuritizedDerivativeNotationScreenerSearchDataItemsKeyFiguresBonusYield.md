

# PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresBonusYield

Bonus yield. It represents the bonus level adjusted for the cover ratio and currency cross rate minus the ask price of the securitized derivative. The value can become negative (e.g. for uncapped products), which does not mean that the investor will necessarily suffer a loss buying it. This key figure is calculated for bonus certificates with an intact knock-in barrier only, i.e. the attribute `knockIn.breach.breached` is false.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absolute** | **BigDecimal** | Bonus yield in absolute terms. |  [optional]
**relative** | **BigDecimal** | Bonus yield relative to the ask price. |  [optional]
**annualized** | **BigDecimal** | Annualized bonus yield relative to the ask price. |  [optional]


## Implemented Interfaces

* Serializable


