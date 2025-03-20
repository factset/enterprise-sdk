# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFigures
Key figures specific to securitized derivatives; based on ask prices.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresCurrency**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresCurrency.md) |  | [optional] 
**BonusYield** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresBonusYield**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresBonusYield.md) |  | [optional] 
**SidewaysYield** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresSidewaysYield**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresSidewaysYield.md) |  | [optional] 
**MaximumYield** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresMaximumYield**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresMaximumYield.md) |  | [optional] 
**Agio** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresAgio**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresAgio.md) |  | [optional] 
**Discount** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresDiscount**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresDiscount.md) |  | [optional] 
**BreakEven** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresBreakEven**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresBreakEven.md) |  | [optional] 
**Spread** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresSpread**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresSpread.md) |  | [optional] 
**Delta** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresDelta**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresDelta.md) |  | [optional] 
**ThetaOneWeek** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresThetaOneWeek**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresThetaOneWeek.md) |  | [optional] 
**Vega** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresVega**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsKeyFiguresVega.md) |  | [optional] 
**Leverage** | **decimal?** | Leverage. It represents the ratio of the underlying level to the ask price of the securitized derivative, adjusted for the cover ratio and the currency cross rate. This key figure is calculated only for leveraged securitized derivatives (e.g. warrants, knock-out certificates). | [optional] 
**Omega** | **decimal?** | Omega. It represents unadjusted delta (see attribute &#x60;delta.unadjusted&#x60;) multiplied with the leverage (see attribute &#x60;leverage&#x60;), both calculated based on the ask price of the derivative. Omega indicates the elasticity of the securitized derivative&#39;s price regarding the underlying level. This key figure is calculated for plain vanilla warrants only. | [optional] 
**ImpliedVolatility** | **decimal?** | Implied volatility. It represents the volatility of the underlying that justifies the ask price of the derivative, when used as a parameter in the derivative&#39;s pricing model (such as Black-Scholes). Its value is a result of the pricing process, thus it represents the annual volatility of the underlying expected by the market participants until maturity of the derivative. This key figure is calculated for plain vanilla warrants only. | [optional] 
**IntrinsicValue** | **decimal?** | Intrinsic value. It represents the difference between the underlying level and the strike of the securitized derivative, adjusted for the cover ratio and the currency cross rate. If the difference is negative, the intrinsic value is given as 0. The intrinsic value represents the theoretical profit from an immediate exercise of the derivative. This key figure is calculated for plain vanilla warrants only. | [optional] 
**TimeValue** | **decimal?** | Time value. It represents the difference between the ask price of the securitized derivative and its intrinsic value (see attribute &#x60;intrinsicValue&#x60;). This key figure is calculated for plain vanilla warrants only. | [optional] 
**OutperformancePoint** | **decimal?** | Outperformance point. It represents the underlying level from which the underlying starts to outperform the securitized derivative, thus the investor would be better off investing directly in the underlying. It is calculated only for securitized derivatives with a limited payout (e.g. capped products). For the value unit, see attribute &#x60;instrument.underlying.valueUnit&#x60;. | [optional] 
**Parity** | **decimal?** | Parity. It represents the difference between the underlying level and the strike of the derivative, adjusted for the cover ratio and the currency cross rate. Negative values are possible. It is the gain or loss that would result from the immediate exercise of an already present warrant and a simultaneously executed compensation transaction on the spot markets. This key figure is calculated for plain vanilla warrants only. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

