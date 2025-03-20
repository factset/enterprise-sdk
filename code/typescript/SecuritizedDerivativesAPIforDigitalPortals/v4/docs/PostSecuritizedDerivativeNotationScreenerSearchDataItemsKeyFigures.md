# securitizedderivativesapifordigitalportals.PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFigures

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresCurrency**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresCurrency.md) |  | [optional] 
**bonusYield** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresBonusYield**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresBonusYield.md) |  | [optional] 
**sidewaysYield** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresSidewaysYield**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresSidewaysYield.md) |  | [optional] 
**maximumYield** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresMaximumYield**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresMaximumYield.md) |  | [optional] 
**agio** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresAgio**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresAgio.md) |  | [optional] 
**discount** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresDiscount**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresDiscount.md) |  | [optional] 
**breakEven** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresBreakEven**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresBreakEven.md) |  | [optional] 
**spread** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresSpread**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresSpread.md) |  | [optional] 
**delta** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresDelta**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresDelta.md) |  | [optional] 
**thetaOneWeek** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresThetaOneWeek**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresThetaOneWeek.md) |  | [optional] 
**vega** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresVega**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresVega.md) |  | [optional] 
**leverage** | **Number** | Leverage. It represents the ratio of the underlying level to the ask price of the securitized derivative, adjusted for the cover ratio and the currency cross rate. This key figure is calculated only for leveraged securitized derivatives (e.g. warrants, knock-out certificates). | [optional] 
**omega** | **Number** | Omega. It represents unadjusted delta (see attribute &#x60;delta.unadjusted&#x60;) multiplied with the leverage (see attribute &#x60;leverage&#x60;), both calculated based on the ask price of the derivative. Omega indicates the elasticity of the securitized derivative&#39;s price regarding the underlying level. This key figure is calculated for plain vanilla warrants only. | [optional] 
**impliedVolatility** | **Number** | Implied volatility. It represents the volatility of the underlying that justifies the ask price of the derivative, when used as a parameter in the derivative&#39;s pricing model (such as Black-Scholes). Its value is a result of the pricing process, thus it represents the annual volatility of the underlying expected by the market participants until maturity of the derivative. This key figure is calculated for plain vanilla warrants only. | [optional] 
**intrinsicValue** | **Number** | Intrinsic value. It represents the difference between the underlying level and the strike of the securitized derivative, adjusted for the cover ratio and the currency cross rate. If the difference is negative, the intrinsic value is given as 0. The intrinsic value represents the theoretical profit from an immediate exercise of the derivative. This key figure is calculated for plain vanilla warrants only. | [optional] 
**timeValue** | **Number** | Time value. It represents the difference between the ask price of the securitized derivative and its intrinsic value (see attribute &#x60;intrinsicValue&#x60;). This key figure is calculated for plain vanilla warrants only. | [optional] 
**outperformancePoint** | **Number** | Outperformance point. It represents the underlying level from which the underlying starts to outperform the securitized derivative, thus the investor would be better off investing directly in the underlying. It is calculated only for securitized derivatives with a limited payout (e.g. capped products). For the value unit, see attribute &#x60;instrument.underlying.valueUnit&#x60;. | [optional] 
**parity** | **Number** | Parity. It represents the difference between the underlying level and the strike of the derivative, adjusted for the cover ratio and the currency cross rate. Negative values are possible. It is the gain or loss that would result from the immediate exercise of an already present warrant and a simultaneously executed compensation transaction on the spot markets. This key figure is calculated for plain vanilla warrants only. | [optional] 


