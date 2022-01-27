

# InlineResponse200Data

Instrument data of the securitized derivative.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isin** | **String** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. |  [optional]
**nsin** | [**InlineResponse200DataNsin**](InlineResponse200DataNsin.md) |  |  [optional]
**isPrivatePlacement** | **Boolean** | If true, the instrument is part of a private placement and therefore not publicly traded. |  [optional]
**name** | **String** | Name of the instrument. |  [optional]
**shortName** | **String** | Short name of the instrument. |  [optional]
**type** | [**java.util.List&lt;InlineResponse200DataType&gt;**](InlineResponse200DataType.md) | Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with the first level representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). Please refer to endpoint &#x60;/category/get&#x60; for possible values. |  [optional]
**isIncomplete** | **Boolean** | If true, the data supplier has marked the data for this instrument as incomplete. |  [optional]
**lifeCycle** | [**InlineResponse200DataLifeCycle**](InlineResponse200DataLifeCycle.md) |  |  [optional]
**countrySecurityRegistration** | [**java.util.List&lt;InlineResponse200DataCountrySecurityRegistration&gt;**](InlineResponse200DataCountrySecurityRegistration.md) | List of countries where the instrument is registered. See endpoint &#x60;/basic/region/country/list&#x60; for possible values. |  [optional]
**referenceDebtor** | [**InlineResponse200DataReferenceDebtor**](InlineResponse200DataReferenceDebtor.md) |  |  [optional]
**isCollateralized** | **Boolean** | If true, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange). |  [optional]
**isQuanto** | **Boolean** | If true, the risk of exchange rate fluctuations between the value unit of the underlying (all of them, in case of multiple underlyings) and the value unit of the redemption is hedged. |  [optional]
**capitalProtection** | **BigDecimal** | Proportion of the nominal amount protected against loss, usually 100%. |  [optional]
**hasCatchUp** | **Boolean** | If true, the instrument has a so-called \&quot;memory feature\&quot; (also called \&quot;catch up\&quot;). This means that a conditional payment that has not been paid out could be paid on a subsequent payment date if the condition is then satisfied. |  [optional]
**hasAutomaticExercise** | **Boolean** | If true, the instrument will be automatically exercised at termination (such as maturity, premature call, or premature payout). It prevents such products from becoming worthless, meaning the investor does not have to undertake any steps in order to receive the payable amount. |  [optional]
**orderVolume** | [**InlineResponse200DataOrderVolume**](InlineResponse200DataOrderVolume.md) |  |  [optional]
**redemptionAmount** | **BigDecimal** | Actual redemption amount after expiry (e.g. knock out, maturity etc) for securitized derivatives with a so-called knock-out feature. The currency of the redemption amount is given by &#x60;issue.valueUnit&#x60; and is always a main currency for securitized derivatives with that feature.  |  [optional]
**nominal** | [**InlineResponse200DataNominal**](InlineResponse200DataNominal.md) |  |  [optional]
**issuer** | [**InlineResponse200DataIssuer**](InlineResponse200DataIssuer.md) |  |  [optional]
**issue** | [**InlineResponse200DataIssue**](InlineResponse200DataIssue.md) |  |  [optional]
**exercise** | [**InlineResponse200DataExercise**](InlineResponse200DataExercise.md) |  |  [optional]
**settlement** | [**SettlementEnum**](#SettlementEnum) | Settlement is the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. |  [optional]



## Enum: SettlementEnum

Name | Value
---- | -----
CASH | &quot;cash&quot;
PHYSICAL | &quot;physical&quot;
EITHER | &quot;either&quot;


## Implemented Interfaces

* Serializable


