# InlineResponse2003Data

Notation-based key figures of the securitized derivative.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_notation** | **str, none_type** | MDG identifier of the listing. | [optional] 
**source_identifier** | **str, none_type** | Identifier used in the request. | [optional] 
**prices** | [**InlineResponse2003DataPrices**](InlineResponse2003DataPrices.md) |  | [optional] 
**underlyings** | [**[GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems]**](GetSecuritizedDerivativeKeyFiguresNotationGetDataUnderlyingsItems.md) | Details of the underlyings. | [optional] 
**currency** | [**InlineResponse2003DataCurrency**](InlineResponse2003DataCurrency.md) |  | [optional] 
**performance_issue** | [**InlineResponse2003DataPerformanceIssue**](InlineResponse2003DataPerformanceIssue.md) |  | [optional] 
**bonus_yield** | [**InlineResponse2003DataBonusYield**](InlineResponse2003DataBonusYield.md) |  | [optional] 
**sideways_yield** | [**InlineResponse2003DataSidewaysYield**](InlineResponse2003DataSidewaysYield.md) |  | [optional] 
**maximum_yield** | [**InlineResponse2003DataMaximumYield**](InlineResponse2003DataMaximumYield.md) |  | [optional] 
**agio** | [**InlineResponse2003DataAgio**](InlineResponse2003DataAgio.md) |  | [optional] 
**discount** | [**InlineResponse2003DataDiscount**](InlineResponse2003DataDiscount.md) |  | [optional] 
**break_even** | [**InlineResponse2003DataBreakEven**](InlineResponse2003DataBreakEven.md) |  | [optional] 
**spread** | [**InlineResponse2003DataSpread**](InlineResponse2003DataSpread.md) |  | [optional] 
**delta** | [**InlineResponse2003DataDelta**](InlineResponse2003DataDelta.md) |  | [optional] 
**theta_one_week** | [**InlineResponse2003DataThetaOneWeek**](InlineResponse2003DataThetaOneWeek.md) |  | [optional] 
**vega** | [**InlineResponse2003DataVega**](InlineResponse2003DataVega.md) |  | [optional] 
**leverage** | **float, none_type** | Ask-based leverage. It represents the ratio of the underlying level to the ask price of the securitized derivative, adjusted for the cover ratio and the currency cross rate. This key figure is calculated only for leveraged derivatives (e.g. warrants, knock-out certificates). | [optional] 
**omega** | **float, none_type** | Ask-based omega. It represents unadjusted delta (see attribute &#x60;delta.unadjusted&#x60;) multiplied with the leverage (see attribute &#x60;leverage&#x60;), both calculated based on the ask price of the derivative. Omega indicates the elasticity of the securitized derivative&#39;s price regarding the underlying level. This key figure is calculated for plain vanilla warrants only. | [optional] 
**implied_volatility** | **float, none_type** | Ask-based implied volatility. It represents the volatility of the underlying that justifies the ask price of the derivative, when used as a parameter in the derivative&#39;s pricing model (such as Black-Scholes). Its value is a result of the pricing process, thus it represents the annual volatility of the underlying expected by the market participants until maturity of the derivative. This key figure is calculated for plain vanilla warrants only. | [optional] 
**intrinsic_value** | **float, none_type** | Intrinsic value. It represents the difference between the underlying level and the strike of the securitized derivative, adjusted for the cover ratio and the currency cross rate. If the difference is negative, the intrinsic value is given as 0. The intrinsic value represents the theoretical profit from an immediate exercise of the derivative. This key figure is calculated for plain vanilla warrants only. | [optional] 
**time_value** | **float, none_type** | Ask-based time value. It represents the difference between the ask price of the securitized derivative and its intrinsic value (see attribute &#x60;intrinsicValue&#x60;). This key figure is calculated for plain vanilla warrants only. | [optional] 
**outperformance_point** | **float, none_type** | Ask-based outperformance point. It represents the underlying level from which the underlying starts to outperform the securitized derivative, thus the investor would be better off investing directly in the underlying. It is calculated only for securitized derivatives with a limited payout (e.g. capped products). This key figure is not calculated for securitized derivatives with multiple underlyings. For the value unit, see attribute &#x60;underlyings.valueUnit&#x60;. | [optional] 
**parity** | **float, none_type** | Parity. It represents the difference between the underlying level and the strike of the derivative, adjusted for the cover ratio and the currency cross rate. Negative values are possible. It is the gain or loss that would result from the immediate exercise of an already present warrant and a simultaneously executed compensation transaction on the spot markets. This key figure is calculated for plain vanilla warrants only. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


