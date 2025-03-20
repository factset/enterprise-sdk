# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrument
Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the instrument. | [optional] 
**Name** | **string** | Name of the instrument. | [optional] 
**ShortName** | **string** | Short name of the instrument. | [optional] 
**Isin** | **string** | The International Securities Identification Number (ISIN) of the instrument.The ISIN is a 12-character code of digits and upper-case letters that uniquely identifiesan instrument. | [optional] 
**Nsin** | [**InlineResponse200DataNsin**](InlineResponse200DataNsin.md) |  | [optional] 
**Fsym** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsNotationInstrumentFsym**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsNotationInstrumentFsym.md) |  | [optional] 
**Categorization** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorization**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorization.md) |  | [optional] 
**LifeCycle** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLifeCycle**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLifeCycle.md) |  | [optional] 
**Issuer** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentIssuer**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentIssuer.md) |  | [optional] 
**Exercise** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentExercise**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentExercise.md) |  | [optional] 
**Settlement** | **string** | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | - -- | - -- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |   | [optional] 
**Collateralized** | **bool?** | If &#x60;true&#x60;, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange). | [optional] 
**Quanto** | **bool?** | If &#x60;true&#x60;, the risk of exchange rate fluctuations between the value unit of the underlying and the value unit of the cash flows is hedged. | [optional] 
**CapitalProtection** | **decimal?** | Proportion of the nominal amount protected against loss. | [optional] 
**Underlying** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentUnderlying**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentUnderlying.md) |  | [optional] 
**Strike** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentStrike**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentStrike.md) |  | [optional] 
**BonusLevel** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentBonusLevel**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentBonusLevel.md) |  | [optional] 
**Cap** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCap**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCap.md) |  | [optional] 
**KnockOut** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentKnockOut**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentKnockOut.md) |  | [optional] 
**KnockIn** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentKnockIn**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentKnockIn.md) |  | [optional] 
**LockOut** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLockOut**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLockOut.md) |  | [optional] 
**LockIn** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLockIn**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLockIn.md) |  | [optional] 
**CapitalGuarantee** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCapitalGuarantee**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCapitalGuarantee.md) |  | [optional] 
**CouponTriggerLevel** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCouponTriggerLevel**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCouponTriggerLevel.md) |  | [optional] 
**RangeKnockOut** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentRangeKnockOut**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentRangeKnockOut.md) |  | [optional] 
**Participation** | **string** | Participation direction of a factor certificate at the level movement of its effective underlying. | Value | Description | | - -- | - -- | | long | The factor certificate participates positively with rising levels of its effective underlying. | | short | The factor certificate participates negatively with rising levels of its effective underlying. |   | [optional] 
**ConstantLeverage** | **decimal?** | Constant leverage of a factor certificate. | [optional] 
**NominalCurrency** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentNominalCurrency**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentNominalCurrency.md) |  | [optional] 
**CurrentInterestRate** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCurrentInterestRate**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCurrentInterestRate.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

