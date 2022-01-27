

# InlineResponse2003DataBonusYield

Bonus yield based on the ask price. It represents the bonus level adjusted for the cover ratio and currency cross rate minus the ask price of the securitized derivative. The value can become negative (e.g. for uncapped products), which does not mean that the investor will necessarily suffer a loss buying it. This key figure is calculated for bonus certificates with intact knock-in barrier only. For the barrier breach of barriers with a single limit, see attribute `barrierTypeConditions.barriers.single.breach.isBreached` in endpoint `/securitizedDerivative/underlying/list`, for the breach of the up and down limit of range barriers see attribute `barrierTypeConditions.barriers.range.up/down.breach.isBreached` respectively.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absolute** | **BigDecimal** | Bonus yield in absolute terms. |  [optional]
**relative** | **BigDecimal** | Bonus yield relative to the ask price. |  [optional]
**annualized** | **BigDecimal** | Annualized bonus yield relative to the ask price. |  [optional]


## Implemented Interfaces

* Serializable


