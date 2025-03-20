# PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrument

Instrument data of the notation.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str, none_type** | Identifier of the instrument. | [optional] 
**name** | **str, none_type** | Name of the instrument. | [optional] 
**short_name** | **str, none_type** | Short name of the instrument. | [optional] 
**isin** | **str, none_type** | The International Securities Identification Number (ISIN) of the instrument.The ISIN is a 12-character code of digits and upper-case letters that uniquely identifiesan instrument. | [optional] 
**nsin** | [**InlineResponse200DataNsin**](InlineResponse200DataNsin.md) |  | [optional] 
**fsym** | [**GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsNotationInstrumentFsym**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItemsNotationInstrumentFsym.md) |  | [optional] 
**categorization** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorization**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCategorization.md) |  | [optional] 
**life_cycle** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLifeCycle**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLifeCycle.md) |  | [optional] 
**issuer** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentIssuer**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentIssuer.md) |  | [optional] 
**exercise** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentExercise**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentExercise.md) |  | [optional] 
**settlement** | **str, none_type** | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | --- | --- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |   | [optional] 
**collateralized** | **bool, none_type** | If &#x60;true&#x60;, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange). | [optional] 
**quanto** | **bool, none_type** | If &#x60;true&#x60;, the risk of exchange rate fluctuations between the value unit of the underlying and the value unit of the cash flows is hedged. | [optional] 
**capital_protection** | **float, none_type** | Proportion of the nominal amount protected against loss. | [optional] 
**underlying** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentUnderlying**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentUnderlying.md) |  | [optional] 
**strike** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentStrike**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentStrike.md) |  | [optional] 
**bonus_level** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentBonusLevel**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentBonusLevel.md) |  | [optional] 
**cap** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCap**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCap.md) |  | [optional] 
**knock_out** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentKnockOut**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentKnockOut.md) |  | [optional] 
**knock_in** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentKnockIn**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentKnockIn.md) |  | [optional] 
**lock_out** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLockOut**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLockOut.md) |  | [optional] 
**lock_in** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLockIn**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentLockIn.md) |  | [optional] 
**capital_guarantee** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCapitalGuarantee**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCapitalGuarantee.md) |  | [optional] 
**coupon_trigger_level** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCouponTriggerLevel**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCouponTriggerLevel.md) |  | [optional] 
**range_knock_out** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentRangeKnockOut**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentRangeKnockOut.md) |  | [optional] 
**participation** | **str, none_type** | Participation direction of a factor certificate at the level movement of its effective underlying. | Value | Description | | --- | --- | | long | The factor certificate participates positively with rising levels of its effective underlying. | | short | The factor certificate participates negatively with rising levels of its effective underlying. |   | [optional] 
**constant_leverage** | **float, none_type** | Constant leverage of a factor certificate. | [optional] 
**nominal_currency** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentNominalCurrency**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentNominalCurrency.md) |  | [optional] 
**current_interest_rate** | [**PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCurrentInterestRate**](PostSecuritizedDerivativeNotationScreenerSearchDataItemsInstrumentCurrentInterestRate.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


