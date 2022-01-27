# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.InlineResponse2005Data
Possible values and value ranges of the parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalCount** | **decimal** | Number of notations that satisfy the request parameters, hence have been used to retrieve the possible values and value ranges. | [optional] 
**Categorization** | [**InlineResponse2005DataCategorization**](InlineResponse2005DataCategorization.md) |  | [optional] 
**Market** | [**List&lt;InlineResponse2005DataMarket&gt;**](InlineResponse2005DataMarket.md) | List of market identifiers. | [optional] 
**LifeCycle** | [**InlineResponse2005DataLifeCycle**](InlineResponse2005DataLifeCycle.md) |  | [optional] 
**Issuer** | [**InlineResponse2005DataIssuer**](InlineResponse2005DataIssuer.md) |  | [optional] 
**Exercise** | [**InlineResponse2005DataExercise**](InlineResponse2005DataExercise.md) |  | [optional] 
**Settlement** | [**List&lt;InlineResponse2005DataSettlement&gt;**](InlineResponse2005DataSettlement.md) | Values related to the settlement. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | [optional] 
**Collateralized** | [**List&lt;InlineResponse2005DataCollateralized&gt;**](InlineResponse2005DataCollateralized.md) | Indicates whether securitized derivatives with and without protection against an issuer default are among the results. An example for such a collateralization is the COSI flag provided by SIX Swiss Exchange. | [optional] 
**Quanto** | [**List&lt;InlineResponse2005DataLifeCycleMaturityPerpetual&gt;**](InlineResponse2005DataLifeCycleMaturityPerpetual.md) | Indicates whether quanto and non-quanto securitized derivatives are among the results. Quanto means that the risk of exchange rate fluctuations between the value unit of the underlying and the value unit of the cash flows is hedged. | [optional] 
**CapitalProtection** | [**InlineResponse2005DataCapitalProtection**](InlineResponse2005DataCapitalProtection.md) |  | [optional] 
**Underlying** | [**InlineResponse2005DataUnderlying**](InlineResponse2005DataUnderlying.md) |  | [optional] 
**Strike** | [**InlineResponse2005DataStrike**](InlineResponse2005DataStrike.md) |  | [optional] 
**BonusLevel** | [**InlineResponse2005DataBonusLevel**](InlineResponse2005DataBonusLevel.md) |  | [optional] 
**Cap** | [**InlineResponse2005DataCap**](InlineResponse2005DataCap.md) |  | [optional] 
**KnockOut** | [**InlineResponse2005DataKnockOut**](InlineResponse2005DataKnockOut.md) |  | [optional] 
**KnockIn** | [**InlineResponse2005DataKnockIn**](InlineResponse2005DataKnockIn.md) |  | [optional] 
**LockOut** | [**InlineResponse2005DataLockOut**](InlineResponse2005DataLockOut.md) |  | [optional] 
**LockIn** | [**InlineResponse2005DataLockIn**](InlineResponse2005DataLockIn.md) |  | [optional] 
**CapitalGuarantee** | [**InlineResponse2005DataCapitalGuarantee**](InlineResponse2005DataCapitalGuarantee.md) |  | [optional] 
**CouponTriggerLevel** | [**InlineResponse2005DataCouponTriggerLevel**](InlineResponse2005DataCouponTriggerLevel.md) |  | [optional] 
**RangeKnockOut** | [**InlineResponse2005DataRangeKnockOut**](InlineResponse2005DataRangeKnockOut.md) |  | [optional] 
**Participation** | [**List&lt;InlineResponse2005DataParticipation&gt;**](InlineResponse2005DataParticipation.md) | Values of the participation direction of factor certificates at the level movement of its effective underlying. | [optional] 
**ConstantLeverage** | [**List&lt;InlineResponse2005DataConstantLeverage&gt;**](InlineResponse2005DataConstantLeverage.md) | Values of the constant leverage of factor certificates. | [optional] 
**NominalCurrency** | [**List&lt;InlineResponse2005DataNominalCurrency&gt;**](InlineResponse2005DataNominalCurrency.md) | Values of the main currency of the nominal and of the coupon payments. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values. | [optional] 
**CurrentInterestRate** | [**InlineResponse2005DataCurrentInterestRate**](InlineResponse2005DataCurrentInterestRate.md) |  | [optional] 
**KeyFigures** | [**InlineResponse2005DataKeyFigures**](InlineResponse2005DataKeyFigures.md) |  | [optional] 
**Performance** | [**InlineResponse2005DataPerformance**](InlineResponse2005DataPerformance.md) |  | [optional] 
**Volatility** | [**InlineResponse2005DataVolatility**](InlineResponse2005DataVolatility.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

