# InlineResponse200Data

Instrument data of the securitized derivative.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isin** | **str, none_type** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. | [optional] 
**id_instrument** | **str, none_type** | MDG identifier of the instrument. | [optional] 
**source_identifier** | **str, none_type** | Identifier used in the request. | [optional] 
**nsin** | [**InlineResponse200DataNsin**](InlineResponse200DataNsin.md) |  | [optional] 
**is_private_placement** | **bool, none_type** | If true, the instrument is part of a private placement and therefore not publicly traded. | [optional] 
**name** | **str, none_type** | Name of the instrument. | [optional] 
**short_name** | **str, none_type** | Short name of the instrument. | [optional] 
**type** | [**[GetSecuritizedDerivativeGetDataTypeItems]**](GetSecuritizedDerivativeGetDataTypeItems.md) | Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). Please refer to endpoint &#x60;/category/get&#x60; for possible values. | [optional] 
**is_incomplete** | **bool, none_type** | If true, the data supplier has marked the data for this instrument as incomplete. | [optional] 
**life_cycle** | [**InlineResponse200DataLifeCycle**](InlineResponse200DataLifeCycle.md) |  | [optional] 
**country_security_registration** | [**[GetSecuritizedDerivativeGetDataCountrySecurityRegistrationItems]**](GetSecuritizedDerivativeGetDataCountrySecurityRegistrationItems.md) | List of countries where the instrument is registered. See endpoint &#x60;/basic/region/country/list&#x60; for possible values. | [optional] 
**reference_debtor** | [**InlineResponse200DataReferenceDebtor**](InlineResponse200DataReferenceDebtor.md) |  | [optional] 
**is_collateralized** | **bool, none_type** | If true, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange). | [optional] 
**is_quanto** | **bool, none_type** | If true, the risk of exchange rate fluctuations between the value unit of the underlying (all of them, in case of multiple underlyings) and the value unit of the redemption is hedged. | [optional] 
**capital_protection** | **float, none_type** | Proportion of the nominal amount protected against loss, usually 100%. | [optional] 
**has_catch_up** | **bool, none_type** | If true, the instrument has a so-called \&quot;memory feature\&quot; (also called \&quot;catch up\&quot;). This means that a conditional payment that has not been paid out could be paid on a subsequent payment date if the condition is then satisfied. | [optional] 
**has_automatic_exercise** | **bool, none_type** | If true, the instrument will be automatically exercised at termination (such as maturity, premature call, or premature payout). It prevents such products from becoming worthless, meaning the investor does not have to undertake any steps in order to receive the payable amount. | [optional] 
**order_volume** | [**InlineResponse200DataOrderVolume**](InlineResponse200DataOrderVolume.md) |  | [optional] 
**redemption_amount** | **float, none_type** | Actual redemption amount after expiry (e.g. knock out, maturity etc) for securitized derivatives with a so-called knock-out feature. The currency of the redemption amount is given by &#x60;issue.valueUnit&#x60; and is always a main currency for securitized derivatives with that feature.  | [optional] 
**management_fee** | **float, none_type** | Management fee paid annually by the investor to the issuer of the securitized derivative instrument. | [optional] 
**nominal** | [**InlineResponse200DataNominal**](InlineResponse200DataNominal.md) |  | [optional] 
**issuer** | [**InlineResponse200DataIssuer**](InlineResponse200DataIssuer.md) |  | [optional] 
**issue** | [**InlineResponse200DataIssue**](InlineResponse200DataIssue.md) |  | [optional] 
**exercise** | [**InlineResponse200DataExercise**](InlineResponse200DataExercise.md) |  | [optional] 
**settlement** | **str, none_type** | Settlement is the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | --- | --- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |   | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


