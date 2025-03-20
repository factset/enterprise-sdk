# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.InlineResponse2003Data
Notation-based key figures of the securitized derivative.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdNotation** | **string** | MDG identifier of the listing. | [optional] 
**SourceIdentifier** | **string** | Identifier used in the request. | [optional] 
**Prices** | [**InlineResponse2003DataPrices**](InlineResponse2003DataPrices.md) |  | [optional] 
**Underlyings** | [**List&lt;GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems&gt;**](GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems.md) | Details of the underlyings. | [optional] 
**Currency** | [**InlineResponse2003DataCurrency**](InlineResponse2003DataCurrency.md) |  | [optional] 
**PerformanceIssue** | [**InlineResponse2003DataPerformanceIssue**](InlineResponse2003DataPerformanceIssue.md) |  | [optional] 
**BonusYield** | [**InlineResponse2003DataBonusYield**](InlineResponse2003DataBonusYield.md) |  | [optional] 
**SidewaysYield** | [**InlineResponse2003DataSidewaysYield**](InlineResponse2003DataSidewaysYield.md) |  | [optional] 
**MaximumYield** | [**InlineResponse2003DataMaximumYield**](InlineResponse2003DataMaximumYield.md) |  | [optional] 
**Agio** | [**InlineResponse2003DataAgio**](InlineResponse2003DataAgio.md) |  | [optional] 
**Discount** | [**InlineResponse2003DataDiscount**](InlineResponse2003DataDiscount.md) |  | [optional] 
**BreakEven** | [**InlineResponse2003DataBreakEven**](InlineResponse2003DataBreakEven.md) |  | [optional] 
**Spread** | [**InlineResponse2003DataSpread**](InlineResponse2003DataSpread.md) |  | [optional] 
**Delta** | [**InlineResponse2003DataDelta**](InlineResponse2003DataDelta.md) |  | [optional] 
**ThetaOneWeek** | [**InlineResponse2003DataThetaOneWeek**](InlineResponse2003DataThetaOneWeek.md) |  | [optional] 
**Vega** | [**InlineResponse2003DataVega**](InlineResponse2003DataVega.md) |  | [optional] 
**Leverage** | **decimal?** | Ask-based leverage. It represents the ratio of the underlying level to the ask price of the securitized derivative, adjusted for the cover ratio and the currency cross rate. This key figure is calculated only for leveraged derivatives (e.g. warrants, knock-out certificates). | [optional] 
**Omega** | **decimal?** | Ask-based omega. It represents unadjusted delta (see attribute &#x60;delta.unadjusted&#x60;) multiplied with the leverage (see attribute &#x60;leverage&#x60;), both calculated based on the ask price of the derivative. Omega indicates the elasticity of the securitized derivative&#39;s price regarding the underlying level. This key figure is calculated for plain vanilla warrants only. | [optional] 
**ImpliedVolatility** | **decimal?** | Ask-based implied volatility. It represents the volatility of the underlying that justifies the ask price of the derivative, when used as a parameter in the derivative&#39;s pricing model (such as Black-Scholes). Its value is a result of the pricing process, thus it represents the annual volatility of the underlying expected by the market participants until maturity of the derivative. This key figure is calculated for plain vanilla warrants only. | [optional] 
**IntrinsicValue** | **decimal?** | Intrinsic value. It represents the difference between the underlying level and the strike of the securitized derivative, adjusted for the cover ratio and the currency cross rate. If the difference is negative, the intrinsic value is given as 0. The intrinsic value represents the theoretical profit from an immediate exercise of the derivative. This key figure is calculated for plain vanilla warrants only. | [optional] 
**TimeValue** | **decimal?** | Ask-based time value. It represents the difference between the ask price of the securitized derivative and its intrinsic value (see attribute &#x60;intrinsicValue&#x60;). This key figure is calculated for plain vanilla warrants only. | [optional] 
**OutperformancePoint** | **decimal?** | Ask-based outperformance point. It represents the underlying level from which the underlying starts to outperform the securitized derivative, thus the investor would be better off investing directly in the underlying. It is calculated only for securitized derivatives with a limited payout (e.g. capped products). This key figure is not calculated for securitized derivatives with multiple underlyings. For the value unit, see attribute &#x60;underlyings.valueUnit&#x60;. | [optional] 
**Parity** | **decimal?** | Parity. It represents the difference between the underlying level and the strike of the derivative, adjusted for the cover ratio and the currency cross rate. Negative values are possible. It is the gain or loss that would result from the immediate exercise of an already present warrant and a simultaneously executed compensation transaction on the spot markets. This key figure is calculated for plain vanilla warrants only. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

