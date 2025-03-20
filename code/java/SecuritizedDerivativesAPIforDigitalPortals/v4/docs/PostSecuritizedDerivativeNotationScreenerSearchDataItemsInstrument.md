

# PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrument

Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**name** | **String** | Name of the instrument. |  [optional]
**shortName** | **String** | Short name of the instrument. |  [optional]
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument.The ISIN is a 12-character code of digits and upper-case letters that uniquely identifiesan instrument. |  [optional]
**nsin** | [**InlineResponse200DataNsin**](InlineResponse200DataNsin.md) |  |  [optional]
**fsym** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsNotationInstrumentFsym**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsNotationInstrumentFsym.md) |  |  [optional]
**categorization** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorization**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorization.md) |  |  [optional]
**lifeCycle** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLifeCycle**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLifeCycle.md) |  |  [optional]
**issuer** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentIssuer**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentIssuer.md) |  |  [optional]
**exercise** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentExercise**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentExercise.md) |  |  [optional]
**settlement** | [**SettlementEnum**](#SettlementEnum) | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | --- | --- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |   |  [optional]
**collateralized** | **Boolean** | If &#x60;true&#x60;, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange). |  [optional]
**quanto** | **Boolean** | If &#x60;true&#x60;, the risk of exchange rate fluctuations between the value unit of the underlying and the value unit of the cash flows is hedged. |  [optional]
**capitalProtection** | **BigDecimal** | Proportion of the nominal amount protected against loss. |  [optional]
**underlying** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentUnderlying**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentUnderlying.md) |  |  [optional]
**strike** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentStrike**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentStrike.md) |  |  [optional]
**bonusLevel** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentBonusLevel**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentBonusLevel.md) |  |  [optional]
**cap** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCap**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCap.md) |  |  [optional]
**knockOut** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentKnockOut**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentKnockOut.md) |  |  [optional]
**knockIn** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentKnockIn**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentKnockIn.md) |  |  [optional]
**lockOut** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLockOut**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLockOut.md) |  |  [optional]
**lockIn** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLockIn**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLockIn.md) |  |  [optional]
**capitalGuarantee** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCapitalGuarantee**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCapitalGuarantee.md) |  |  [optional]
**couponTriggerLevel** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCouponTriggerLevel**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCouponTriggerLevel.md) |  |  [optional]
**rangeKnockOut** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentRangeKnockOut**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentRangeKnockOut.md) |  |  [optional]
**participation** | [**ParticipationEnum**](#ParticipationEnum) | Participation direction of a factor certificate at the level movement of its effective underlying. | Value | Description | | --- | --- | | long | The factor certificate participates positively with rising levels of its effective underlying. | | short | The factor certificate participates negatively with rising levels of its effective underlying. |   |  [optional]
**constantLeverage** | **BigDecimal** | Constant leverage of a factor certificate. |  [optional]
**nominalCurrency** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentNominalCurrency**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentNominalCurrency.md) |  |  [optional]
**currentInterestRate** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCurrentInterestRate**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCurrentInterestRate.md) |  |  [optional]



## Enum: SettlementEnum

Name | Value
---- | -----
CASH | &quot;cash&quot;
PHYSICAL | &quot;physical&quot;
EITHER | &quot;either&quot;



## Enum: ParticipationEnum

Name | Value
---- | -----
LONG | &quot;long&quot;
SHORT | &quot;short&quot;


## Implemented Interfaces

* Serializable


