# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.InlineResponse2006Instrument
Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the instrument. | [optional] 
**Name** | **string** | Name of the instrument. | [optional] 
**ShortName** | **string** | Short name of the instrument. | [optional] 
**Isin** | **string** | The International Securities Identification Number (ISIN) of the instrument.The ISIN is a 12-character code of digits and upper-case letters that uniquely identifiesan instrument. | [optional] 
**Nsin** | [**InlineResponse200DataNsin**](InlineResponse200DataNsin.md) |  | [optional] 
**Categorization** | [**InlineResponse2006InstrumentCategorization**](InlineResponse2006InstrumentCategorization.md) |  | [optional] 
**LifeCycle** | [**InlineResponse2006InstrumentLifeCycle**](InlineResponse2006InstrumentLifeCycle.md) |  | [optional] 
**Issuer** | [**InlineResponse2006InstrumentIssuer**](InlineResponse2006InstrumentIssuer.md) |  | [optional] 
**Exercise** | [**InlineResponse2006InstrumentExercise**](InlineResponse2006InstrumentExercise.md) |  | [optional] 
**Settlement** | **string** | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | [optional] 
**Collateralized** | **bool** | If &#x60;true&#x60;, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange). | [optional] 
**Quanto** | **bool** | If &#x60;true&#x60;, the risk of exchange rate fluctuations between the value unit of the underlying and the value unit of the cash flows is hedged. | [optional] 
**CapitalProtection** | **decimal** | Proportion of the nominal amount protected against loss. | [optional] 
**Underlying** | [**InlineResponse2006InstrumentUnderlying**](InlineResponse2006InstrumentUnderlying.md) |  | [optional] 
**Strike** | [**InlineResponse2006InstrumentStrike**](InlineResponse2006InstrumentStrike.md) |  | [optional] 
**BonusLevel** | [**InlineResponse2006InstrumentBonusLevel**](InlineResponse2006InstrumentBonusLevel.md) |  | [optional] 
**Cap** | [**InlineResponse2006InstrumentCap**](InlineResponse2006InstrumentCap.md) |  | [optional] 
**KnockOut** | [**InlineResponse2006InstrumentKnockOut**](InlineResponse2006InstrumentKnockOut.md) |  | [optional] 
**KnockIn** | [**InlineResponse2006InstrumentKnockIn**](InlineResponse2006InstrumentKnockIn.md) |  | [optional] 
**LockOut** | [**InlineResponse2006InstrumentLockOut**](InlineResponse2006InstrumentLockOut.md) |  | [optional] 
**LockIn** | [**InlineResponse2006InstrumentLockIn**](InlineResponse2006InstrumentLockIn.md) |  | [optional] 
**CapitalGuarantee** | [**InlineResponse2006InstrumentCapitalGuarantee**](InlineResponse2006InstrumentCapitalGuarantee.md) |  | [optional] 
**CouponTriggerLevel** | [**InlineResponse2006InstrumentCouponTriggerLevel**](InlineResponse2006InstrumentCouponTriggerLevel.md) |  | [optional] 
**RangeKnockOut** | [**InlineResponse2006InstrumentRangeKnockOut**](InlineResponse2006InstrumentRangeKnockOut.md) |  | [optional] 
**Participation** | **string** | Participation direction of a factor certificate at the level movement of its effective underlying. | [optional] 
**ConstantLeverage** | **decimal** | Constant leverage of a factor certificate. | [optional] 
**NominalCurrency** | [**InlineResponse2006InstrumentNominalCurrency**](InlineResponse2006InstrumentNominalCurrency.md) |  | [optional] 
**CurrentInterestRate** | [**InlineResponse2006InstrumentCurrentInterestRate**](InlineResponse2006InstrumentCurrentInterestRate.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

