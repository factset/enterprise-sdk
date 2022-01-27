

# InlineResponse2006KeyFigures

Key figures specific to securitized derivatives; based on ask prices.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**InlineResponse2006KeyFiguresCurrency**](InlineResponse2006KeyFiguresCurrency.md) |  |  [optional]
**bonusYield** | [**InlineResponse2006KeyFiguresBonusYield**](InlineResponse2006KeyFiguresBonusYield.md) |  |  [optional]
**sidewaysYield** | [**InlineResponse2006KeyFiguresSidewaysYield**](InlineResponse2006KeyFiguresSidewaysYield.md) |  |  [optional]
**maximumYield** | [**InlineResponse2006KeyFiguresMaximumYield**](InlineResponse2006KeyFiguresMaximumYield.md) |  |  [optional]
**agio** | [**InlineResponse2006KeyFiguresAgio**](InlineResponse2006KeyFiguresAgio.md) |  |  [optional]
**discount** | [**InlineResponse2006KeyFiguresDiscount**](InlineResponse2006KeyFiguresDiscount.md) |  |  [optional]
**breakEven** | [**InlineResponse2006KeyFiguresBreakEven**](InlineResponse2006KeyFiguresBreakEven.md) |  |  [optional]
**spread** | [**InlineResponse2006KeyFiguresSpread**](InlineResponse2006KeyFiguresSpread.md) |  |  [optional]
**delta** | [**InlineResponse2006KeyFiguresDelta**](InlineResponse2006KeyFiguresDelta.md) |  |  [optional]
**thetaOneWeek** | [**InlineResponse2006KeyFiguresThetaOneWeek**](InlineResponse2006KeyFiguresThetaOneWeek.md) |  |  [optional]
**vega** | [**InlineResponse2006KeyFiguresVega**](InlineResponse2006KeyFiguresVega.md) |  |  [optional]
**leverage** | **BigDecimal** | Leverage. It represents the ratio of the underlying level to the ask price of the securitized derivative, adjusted for the cover ratio and the currency cross rate. This key figure is calculated only for leveraged securitized derivatives (e.g. warrants, knock-out certificates). |  [optional]
**omega** | **BigDecimal** | Omega. It represents unadjusted delta (see attribute &#x60;delta.unadjusted&#x60;) multiplied with the leverage (see attribute &#x60;leverage&#x60;), both calculated based on the ask price of the derivative. Omega indicates the elasticity of the securitized derivative&#39;s price regarding the underlying level. This key figure is calculated for plain vanilla warrants only. |  [optional]
**impliedVolatility** | **BigDecimal** | Implied volatility. It represents the volatility of the underlying that justifies the ask price of the derivative, when used as a parameter in the derivative&#39;s pricing model (such as Black-Scholes). Its value is a result of the pricing process, thus it represents the annual volatility of the underlying expected by the market participants until maturity of the derivative. This key figure is calculated for plain vanilla warrants only. |  [optional]
**intrinsicValue** | **BigDecimal** | Intrinsic value. It represents the difference between the underlying level and the strike of the securitized derivative, adjusted for the cover ratio and the currency cross rate. If the difference is negative, the intrinsic value is given as 0. The intrinsic value represents the theoretical profit from an immediate exercise of the derivative. This key figure is calculated for plain vanilla warrants only. |  [optional]
**timeValue** | **BigDecimal** | Time value. It represents the difference between the ask price of the securitized derivative and its intrinsic value (see attribute &#x60;intrinsicValue&#x60;). This key figure is calculated for plain vanilla warrants only. |  [optional]
**outperformancePoint** | **BigDecimal** | Outperformance point. It represents the underlying level from which the underlying starts to outperform the securitized derivative, thus the investor would be better off investing directly in the underlying. It is calculated only for securitized derivatives with a limited payout (e.g. capped products). For the value unit, see attribute &#x60;instrument.underlying.valueUnit&#x60;. |  [optional]
**parity** | **BigDecimal** | Parity. It represents the difference between the underlying level and the strike of the derivative, adjusted for the cover ratio and the currency cross rate. Negative values are possible. It is the gain or loss that would result from the immediate exercise of an already present warrant and a simultaneously executed compensation transaction on the spot markets. This key figure is calculated for plain vanilla warrants only. |  [optional]


## Implemented Interfaces

* Serializable


