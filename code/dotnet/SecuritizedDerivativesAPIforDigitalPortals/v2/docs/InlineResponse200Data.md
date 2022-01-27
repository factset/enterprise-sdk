# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.InlineResponse200Data
Instrument data of the securitized derivative.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Isin** | **string** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. | [optional] 
**Nsin** | [**InlineResponse200DataNsin**](InlineResponse200DataNsin.md) |  | [optional] 
**IsPrivatePlacement** | **bool** | If true, the instrument is part of a private placement and therefore not publicly traded. | [optional] 
**Name** | **string** | Name of the instrument. | [optional] 
**ShortName** | **string** | Short name of the instrument. | [optional] 
**Type** | [**List&lt;InlineResponse200DataType&gt;**](InlineResponse200DataType.md) | Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). Please refer to endpoint &#x60;/category/get&#x60; for possible values. | [optional] 
**IsIncomplete** | **bool** | If true, the data supplier has marked the data for this instrument as incomplete. | [optional] 
**LifeCycle** | [**InlineResponse200DataLifeCycle**](InlineResponse200DataLifeCycle.md) |  | [optional] 
**CountrySecurityRegistration** | [**List&lt;InlineResponse200DataCountrySecurityRegistration&gt;**](InlineResponse200DataCountrySecurityRegistration.md) | List of countries where the instrument is registered. See endpoint &#x60;/basic/region/country/list&#x60; for possible values. | [optional] 
**ReferenceDebtor** | [**InlineResponse200DataReferenceDebtor**](InlineResponse200DataReferenceDebtor.md) |  | [optional] 
**IsCollateralized** | **bool** | If true, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange). | [optional] 
**IsQuanto** | **bool** | If true, the risk of exchange rate fluctuations between the value unit of the underlying (all of them, in case of multiple underlyings) and the value unit of the redemption is hedged. | [optional] 
**CapitalProtection** | **decimal** | Proportion of the nominal amount protected against loss, usually 100%. | [optional] 
**HasCatchUp** | **bool** | If true, the instrument has a so-called \&quot;memory feature\&quot; (also called \&quot;catch up\&quot;). This means that a conditional payment that has not been paid out could be paid on a subsequent payment date if the condition is then satisfied. | [optional] 
**HasAutomaticExercise** | **bool** | If true, the instrument will be automatically exercised at termination (such as maturity, premature call, or premature payout). It prevents such products from becoming worthless, meaning the investor does not have to undertake any steps in order to receive the payable amount. | [optional] 
**OrderVolume** | [**InlineResponse200DataOrderVolume**](InlineResponse200DataOrderVolume.md) |  | [optional] 
**RedemptionAmount** | **decimal** | Actual redemption amount after expiry (e.g. knock out, maturity etc) for securitized derivatives with a so-called knock-out feature. The currency of the redemption amount is given by &#x60;issue.valueUnit&#x60; and is always a main currency for securitized derivatives with that feature.  | [optional] 
**Nominal** | [**InlineResponse200DataNominal**](InlineResponse200DataNominal.md) |  | [optional] 
**Issuer** | [**InlineResponse200DataIssuer**](InlineResponse200DataIssuer.md) |  | [optional] 
**Issue** | [**InlineResponse200DataIssue**](InlineResponse200DataIssue.md) |  | [optional] 
**Exercise** | [**InlineResponse200DataExercise**](InlineResponse200DataExercise.md) |  | [optional] 
**Settlement** | **string** | Settlement is the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

