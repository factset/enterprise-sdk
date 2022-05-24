

# SecuritizedDerivativeNotationRankingIntradayListData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prices** | [**SecuritizedDerivativeNotationRankingIntradayListDataPrices**](SecuritizedDerivativeNotationRankingIntradayListDataPrices.md) |  |  [optional]
**valueUnit** | [**SecuritizedDerivativeNotationRankingIntradayListDataValueUnit**](SecuritizedDerivativeNotationRankingIntradayListDataValueUnit.md) |  |  [optional]
**currency** | [**SecuritizedDerivativeNotationRankingIntradayListDataCurrency**](SecuritizedDerivativeNotationRankingIntradayListDataCurrency.md) |  |  [optional]
**market** | [**SecuritizedDerivativeNotationRankingIntradayListDataMarket**](SecuritizedDerivativeNotationRankingIntradayListDataMarket.md) |  | 
**instrumentRestrictionList** | [**SecuritizedDerivativeNotationRankingIntradayListDataInstrumentRestrictionList**](SecuritizedDerivativeNotationRankingIntradayListDataInstrumentRestrictionList.md) |  |  [optional]
**notationRestrictionList** | [**SecuritizedDerivativeNotationRankingIntradayListDataNotationRestrictionList**](SecuritizedDerivativeNotationRankingIntradayListDataNotationRestrictionList.md) |  |  [optional]
**category** | [**SecuritizedDerivativeNotationRankingIntradayListDataCategory**](SecuritizedDerivativeNotationRankingIntradayListDataCategory.md) |  |  [optional]
**registrationCountry** | [**SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry**](SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry.md) |  |  [optional]
**lifeCycle** | [**SecuritizedDerivativeNotationRankingIntradayListDataLifeCycle**](SecuritizedDerivativeNotationRankingIntradayListDataLifeCycle.md) |  |  [optional]
**issuer** | [**SecuritizedDerivativeNotationRankingIntradayListDataIssuer**](SecuritizedDerivativeNotationRankingIntradayListDataIssuer.md) |  |  [optional]
**exercise** | [**SecuritizedDerivativeNotationRankingIntradayListDataExercise**](SecuritizedDerivativeNotationRankingIntradayListDataExercise.md) |  |  [optional]
**underlying** | [**SecuritizedDerivativeNotationRankingIntradayListDataUnderlying**](SecuritizedDerivativeNotationRankingIntradayListDataUnderlying.md) |  |  [optional]
**factorCertificates** | [**SecuritizedDerivativeNotationRankingIntradayListDataFactorCertificates**](SecuritizedDerivativeNotationRankingIntradayListDataFactorCertificates.md) |  |  [optional]
**knockedOut** | [**KnockedOutEnum**](#KnockedOutEnum) | Specifies whether knocked-out securitized derivatives are included in the response. Particularly relevant for knock-out certificates. |  [optional]
**knockedIn** | [**KnockedInEnum**](#KnockedInEnum) | Specifies whether knocked-in securitized derivatives are included in the response. Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. |  [optional]
**performance** | [**SecuritizedDerivativeNotationRankingIntradayListDataPerformance**](SecuritizedDerivativeNotationRankingIntradayListDataPerformance.md) |  |  [optional]



## Enum: KnockedOutEnum

Name | Value
---- | -----
ONLY | &quot;only&quot;
INCLUDE | &quot;include&quot;
EXCLUDE | &quot;exclude&quot;



## Enum: KnockedInEnum

Name | Value
---- | -----
ONLY | &quot;only&quot;
INCLUDE | &quot;include&quot;
EXCLUDE | &quot;exclude&quot;


## Implemented Interfaces

* Serializable


