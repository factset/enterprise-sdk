

# InlineResponse2003DataAgio

Agio based on the ask price.  For plain vanilla warrants, it represents the difference between the ask price of the derivative and its parity (see attribute `parity`). Thus, for those with exercise right call, the agio indicates how much more expensive would it be to obtain the underlying through purchasing and exercising the warrant compared to directly purchasing the underlying. For those with exercise right put, the above consideration is applied inversely. For other types of securitized derivatives, the calculation and interpretation of the agio depends on their category. Negative values are possible. This key figure is not calculated for securitized derivatives with multiple underlyings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absolute** | **BigDecimal** | Agio in absolute terms. |  [optional]
**relative** | **BigDecimal** | Agio relative to the underlying level. |  [optional]
**annualized** | **BigDecimal** | Annualized agio relative to the underlying level. |  [optional]


## Implemented Interfaces

* Serializable


