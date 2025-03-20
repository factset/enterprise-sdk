# securitizedderivativesapifordigitalportals.InlineResponse2005Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalCount** | **Number** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. | [optional] 
**categorization** | [**InlineResponse2005DataCategorization**](InlineResponse2005DataCategorization.md) |  | [optional] 
**market** | [**[PostSecuritizedDerivativeNotationScreenerValueRangesGetDataMarketItems]**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataMarketItems.md) | List of market identifiers. | [optional] 
**lifeCycle** | [**InlineResponse2005DataLifeCycle**](InlineResponse2005DataLifeCycle.md) |  | [optional] 
**issuer** | [**InlineResponse2005DataIssuer**](InlineResponse2005DataIssuer.md) |  | [optional] 
**exercise** | [**InlineResponse2005DataExercise**](InlineResponse2005DataExercise.md) |  | [optional] 
**settlement** | [**[PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSettlementItems]**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSettlementItems.md) | Values related to the settlement. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | [optional] 
**collateralized** | [**[PostSecuritizedDerivativeNotationScreenerValueRangesGetDataCollateralizedItems]**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataCollateralizedItems.md) | Indicates whether securitized derivatives with and without protection against an issuer default are among the results. An example for such a collateralization is the COSI flag provided by SIX Swiss Exchange. | [optional] 
**quanto** | [**[PostSecuritizedDerivativeNotationScreenerValueRangesGetDataQuantoItems]**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataQuantoItems.md) | Indicates whether quanto and non-quanto securitized derivatives are among the results. Quanto means that the risk of exchange rate fluctuations between the value unit of the underlying and the value unit of the cash flows is hedged. | [optional] 
**capitalProtection** | [**InlineResponse2005DataCapitalProtection**](InlineResponse2005DataCapitalProtection.md) |  | [optional] 
**underlying** | [**InlineResponse2005DataUnderlying**](InlineResponse2005DataUnderlying.md) |  | [optional] 
**strike** | [**InlineResponse2005DataStrike**](InlineResponse2005DataStrike.md) |  | [optional] 
**bonusLevel** | [**InlineResponse2005DataBonusLevel**](InlineResponse2005DataBonusLevel.md) |  | [optional] 
**cap** | [**InlineResponse2005DataCap**](InlineResponse2005DataCap.md) |  | [optional] 
**knockOut** | [**InlineResponse2005DataKnockOut**](InlineResponse2005DataKnockOut.md) |  | [optional] 
**knockIn** | [**InlineResponse2005DataKnockIn**](InlineResponse2005DataKnockIn.md) |  | [optional] 
**lockOut** | [**InlineResponse2005DataLockOut**](InlineResponse2005DataLockOut.md) |  | [optional] 
**lockIn** | [**InlineResponse2005DataLockIn**](InlineResponse2005DataLockIn.md) |  | [optional] 
**capitalGuarantee** | [**InlineResponse2005DataCapitalGuarantee**](InlineResponse2005DataCapitalGuarantee.md) |  | [optional] 
**couponTriggerLevel** | [**InlineResponse2005DataCouponTriggerLevel**](InlineResponse2005DataCouponTriggerLevel.md) |  | [optional] 
**rangeKnockOut** | [**InlineResponse2005DataRangeKnockOut**](InlineResponse2005DataRangeKnockOut.md) |  | [optional] 
**participation** | [**[PostSecuritizedDerivativeNotationScreenerValueRangesGetDataParticipationItems]**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataParticipationItems.md) | Values of the participation direction of factor certificates at the level movement of its effective underlying. | [optional] 
**constantLeverage** | [**[PostSecuritizedDerivativeNotationScreenerValueRangesGetDataConstantLeverageItems]**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataConstantLeverageItems.md) | Values of the constant leverage of factor certificates. | [optional] 
**nominalCurrency** | [**[PostSecuritizedDerivativeNotationScreenerValueRangesGetDataNominalCurrencyItems]**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataNominalCurrencyItems.md) | Values of the main currency of the nominal and of the coupon payments. See endpoint &#x60;/basic/value-unit/currency/main/list&#x60; for possible values. | [optional] 
**currentInterestRate** | [**InlineResponse2005DataCurrentInterestRate**](InlineResponse2005DataCurrentInterestRate.md) |  | [optional] 
**keyFigures** | [**InlineResponse2005DataKeyFigures**](InlineResponse2005DataKeyFigures.md) |  | [optional] 
**performance** | [**InlineResponse2005DataPerformance**](InlineResponse2005DataPerformance.md) |  | [optional] 
**volatility** | [**InlineResponse2005DataVolatility**](InlineResponse2005DataVolatility.md) |  | [optional] 


