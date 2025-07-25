

# PostOptionByClassListDataItemsKeyFigures

Key figures of an option contract.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**moneyness** | **BigDecimal** | Ratio of the current underlying level to the strike of an option. For calls, it is current underlying level divided by the strike. For puts, it is strike divided by the current underlying level. It measures the degree to which an option is in-the-money (moneyness &gt; 1) or out-of-the-money (moneyness &lt; 1). If moneyness &#x3D; 1, the option is at-the-money. |  [optional]
**impliedVolatility** | **BigDecimal** | Ask-based implied volatility. It represents the volatility of the underlying that justifies the ask price of the option, when used as a parameter in the option&#39;s pricing model (such as Black-Scholes). Its value is a result of the pricing process, thus it represents the annual volatility of the underlying expected by the market participants until maturity of the option. |  [optional]
**omega** | **BigDecimal** | Ask-based omega. It represents delta (see attribute delta) multiplied with the leverage (see attribute &#x60;leverage&#x60;), both calculated based on the ask price of the option. Omega indicates the elasticity of the option&#39;s price regarding the underlying level. |  [optional]
**leverage** | **BigDecimal** | Ask-based leverage. It represents the ratio of the underlying level to the ask price of the option, adjusted for the currency cross rate. |  [optional]
**delta** | **BigDecimal** | Ask-based delta. It represents the first partial derivative of the function determining the option&#39;s theoretical price with respect to the underlying level, evaluated at the underlying level. Delta indicates the ratio of the absolute change of the price of an option for an indefinitely small absolute change in the underlying level, thus it represents the price sensitivity of the option relative to changes in the underlying level. |  [optional]
**thetaOneWeek** | **BigDecimal** | Ask-based weekly theta. It represents the first partial derivative of the function determining the option&#39;s theoretical price with respect to the residual term, evaluated at the current residual term and multiplied by 7/365. Weekly theta indicates the absolute change (decrease) of the price of an option for a reduction of the residual term by one week (seven calendar days), thus it represents the price sensitivity of the option relative to changes in the residual term. |  [optional]
**vega** | **BigDecimal** | Ask-based vega. It represents the first partial derivative of the function determining the option&#39;s theoretical price with respect to the implied volatility, evaluated at the current implied volatility. Vega indicates the ratio of the absolute change of the price of an option for an absolute change of the implied volatility, thus it represents the price sensitivity of the option relative to changes in the implied volatility. |  [optional]
**gamma** | **BigDecimal** | Ask-based gamma. It represents the second partial derivative of the function determining the option&#39;s theoretical price with respect to the underlying level, evaluated at the current underlying level. Gamma indicates the rate of change of the option&#39;s delta (see attribute &#x60;delta&#x60;) with respect to the underlying level. |  [optional]
**rho** | **BigDecimal** | Ask-based rho. It represents the first partial derivative of the function determining the option&#39;s theoretical price with respect to the risk-free interest rate, evaluated at the current risk-free interest rate. Rho indicates the ratio of the absolute change of the price of an option for an absolute change of the risk-free interest rate, thus it represents the price sensitivity of the option relative to changes in the risk-free interest rate. The key figure is shown in one basis point change. |  [optional]


## Implemented Interfaces

* Serializable


