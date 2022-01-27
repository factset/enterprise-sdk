

# InlineResponse2006Instrument

Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. |  [optional]
**name** | **String** | Name of the instrument. |  [optional]
**shortName** | **String** | Short name of the instrument. |  [optional]
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument.The ISIN is a 12-character code of digits and upper-case letters that uniquely identifiesan instrument. |  [optional]
**nsin** | [**InlineResponse200DataNsin**](InlineResponse200DataNsin.md) |  |  [optional]
**categorization** | [**InlineResponse2006InstrumentCategorization**](InlineResponse2006InstrumentCategorization.md) |  |  [optional]
**lifeCycle** | [**InlineResponse2006InstrumentLifeCycle**](InlineResponse2006InstrumentLifeCycle.md) |  |  [optional]
**issuer** | [**InlineResponse2006InstrumentIssuer**](InlineResponse2006InstrumentIssuer.md) |  |  [optional]
**exercise** | [**InlineResponse2006InstrumentExercise**](InlineResponse2006InstrumentExercise.md) |  |  [optional]
**settlement** | [**SettlementEnum**](#SettlementEnum) | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. |  [optional]
**collateralized** | **Boolean** | If &#x60;true&#x60;, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange). |  [optional]
**quanto** | **Boolean** | If &#x60;true&#x60;, the risk of exchange rate fluctuations between the value unit of the underlying and the value unit of the cash flows is hedged. |  [optional]
**capitalProtection** | **BigDecimal** | Proportion of the nominal amount protected against loss. |  [optional]
**underlying** | [**InlineResponse2006InstrumentUnderlying**](InlineResponse2006InstrumentUnderlying.md) |  |  [optional]
**strike** | [**InlineResponse2006InstrumentStrike**](InlineResponse2006InstrumentStrike.md) |  |  [optional]
**bonusLevel** | [**InlineResponse2006InstrumentBonusLevel**](InlineResponse2006InstrumentBonusLevel.md) |  |  [optional]
**cap** | [**InlineResponse2006InstrumentCap**](InlineResponse2006InstrumentCap.md) |  |  [optional]
**knockOut** | [**InlineResponse2006InstrumentKnockOut**](InlineResponse2006InstrumentKnockOut.md) |  |  [optional]
**knockIn** | [**InlineResponse2006InstrumentKnockIn**](InlineResponse2006InstrumentKnockIn.md) |  |  [optional]
**lockOut** | [**InlineResponse2006InstrumentLockOut**](InlineResponse2006InstrumentLockOut.md) |  |  [optional]
**lockIn** | [**InlineResponse2006InstrumentLockIn**](InlineResponse2006InstrumentLockIn.md) |  |  [optional]
**capitalGuarantee** | [**InlineResponse2006InstrumentCapitalGuarantee**](InlineResponse2006InstrumentCapitalGuarantee.md) |  |  [optional]
**couponTriggerLevel** | [**InlineResponse2006InstrumentCouponTriggerLevel**](InlineResponse2006InstrumentCouponTriggerLevel.md) |  |  [optional]
**rangeKnockOut** | [**InlineResponse2006InstrumentRangeKnockOut**](InlineResponse2006InstrumentRangeKnockOut.md) |  |  [optional]
**participation** | [**ParticipationEnum**](#ParticipationEnum) | Participation direction of a factor certificate at the level movement of its effective underlying. |  [optional]
**constantLeverage** | **BigDecimal** | Constant leverage of a factor certificate. |  [optional]
**nominalCurrency** | [**InlineResponse2006InstrumentNominalCurrency**](InlineResponse2006InstrumentNominalCurrency.md) |  |  [optional]
**currentInterestRate** | [**InlineResponse2006InstrumentCurrentInterestRate**](InlineResponse2006InstrumentCurrentInterestRate.md) |  |  [optional]



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


