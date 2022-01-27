# InlineResponse2006Instrument

Instrument data of the notation.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of the instrument. | [optional] 
**name** | **str** | Name of the instrument. | [optional] 
**short_name** | **str** | Short name of the instrument. | [optional] 
**isin** | **str** | The International Securities Identification Number (ISIN) of the instrument.The ISIN is a 12-character code of digits and upper-case letters that uniquely identifiesan instrument. | [optional] 
**nsin** | [**InlineResponse200DataNsin**](InlineResponse200DataNsin.md) |  | [optional] 
**categorization** | [**InlineResponse2006InstrumentCategorization**](InlineResponse2006InstrumentCategorization.md) |  | [optional] 
**life_cycle** | [**InlineResponse2006InstrumentLifeCycle**](InlineResponse2006InstrumentLifeCycle.md) |  | [optional] 
**issuer** | [**InlineResponse2006InstrumentIssuer**](InlineResponse2006InstrumentIssuer.md) |  | [optional] 
**exercise** | [**InlineResponse2006InstrumentExercise**](InlineResponse2006InstrumentExercise.md) |  | [optional] 
**settlement** | **str** | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | [optional] 
**collateralized** | **bool** | If &#x60;true&#x60;, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange). | [optional] 
**quanto** | **bool** | If &#x60;true&#x60;, the risk of exchange rate fluctuations between the value unit of the underlying and the value unit of the cash flows is hedged. | [optional] 
**capital_protection** | **float** | Proportion of the nominal amount protected against loss. | [optional] 
**underlying** | [**InlineResponse2006InstrumentUnderlying**](InlineResponse2006InstrumentUnderlying.md) |  | [optional] 
**strike** | [**InlineResponse2006InstrumentStrike**](InlineResponse2006InstrumentStrike.md) |  | [optional] 
**bonus_level** | [**InlineResponse2006InstrumentBonusLevel**](InlineResponse2006InstrumentBonusLevel.md) |  | [optional] 
**cap** | [**InlineResponse2006InstrumentCap**](InlineResponse2006InstrumentCap.md) |  | [optional] 
**knock_out** | [**InlineResponse2006InstrumentKnockOut**](InlineResponse2006InstrumentKnockOut.md) |  | [optional] 
**knock_in** | [**InlineResponse2006InstrumentKnockIn**](InlineResponse2006InstrumentKnockIn.md) |  | [optional] 
**lock_out** | [**InlineResponse2006InstrumentLockOut**](InlineResponse2006InstrumentLockOut.md) |  | [optional] 
**lock_in** | [**InlineResponse2006InstrumentLockIn**](InlineResponse2006InstrumentLockIn.md) |  | [optional] 
**capital_guarantee** | [**InlineResponse2006InstrumentCapitalGuarantee**](InlineResponse2006InstrumentCapitalGuarantee.md) |  | [optional] 
**coupon_trigger_level** | [**InlineResponse2006InstrumentCouponTriggerLevel**](InlineResponse2006InstrumentCouponTriggerLevel.md) |  | [optional] 
**range_knock_out** | [**InlineResponse2006InstrumentRangeKnockOut**](InlineResponse2006InstrumentRangeKnockOut.md) |  | [optional] 
**participation** | **str** | Participation direction of a factor certificate at the level movement of its effective underlying. | [optional] 
**constant_leverage** | **float** | Constant leverage of a factor certificate. | [optional] 
**nominal_currency** | [**InlineResponse2006InstrumentNominalCurrency**](InlineResponse2006InstrumentNominalCurrency.md) |  | [optional] 
**current_interest_rate** | [**InlineResponse2006InstrumentCurrentInterestRate**](InlineResponse2006InstrumentCurrentInterestRate.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


