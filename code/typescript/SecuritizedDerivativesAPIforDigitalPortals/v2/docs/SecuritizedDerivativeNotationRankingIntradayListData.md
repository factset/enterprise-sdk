# securitizedderivativesapifordigitalportals.SecuritizedDerivativeNotationRankingIntradayListData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prices** | [**SecuritizedDerivativeNotationRankingIntradayListDataPrices**](SecuritizedDerivativeNotationRankingIntradayListDataPrices.md) |  | [optional] 
**valueUnit** | [**SecuritizedDerivativeNotationRankingIntradayListDataValueUnit**](SecuritizedDerivativeNotationRankingIntradayListDataValueUnit.md) |  | [optional] 
**currency** | [**SecuritizedDerivativeNotationRankingIntradayListDataCurrency**](SecuritizedDerivativeNotationRankingIntradayListDataCurrency.md) |  | [optional] 
**market** | [**SecuritizedDerivativeNotationRankingIntradayListDataMarket**](SecuritizedDerivativeNotationRankingIntradayListDataMarket.md) |  | 
**instrumentRestrictionList** | [**SecuritizedDerivativeNotationRankingIntradayListDataInstrumentRestrictionList**](SecuritizedDerivativeNotationRankingIntradayListDataInstrumentRestrictionList.md) |  | [optional] 
**notationRestrictionList** | [**SecuritizedDerivativeNotationRankingIntradayListDataNotationRestrictionList**](SecuritizedDerivativeNotationRankingIntradayListDataNotationRestrictionList.md) |  | [optional] 
**category** | [**SecuritizedDerivativeNotationRankingIntradayListDataCategory**](SecuritizedDerivativeNotationRankingIntradayListDataCategory.md) |  | [optional] 
**registrationCountry** | [**SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry**](SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry.md) |  | [optional] 
**lifeCycle** | [**SecuritizedDerivativeNotationRankingIntradayListDataLifeCycle**](SecuritizedDerivativeNotationRankingIntradayListDataLifeCycle.md) |  | [optional] 
**issuer** | [**SecuritizedDerivativeNotationRankingIntradayListDataIssuer**](SecuritizedDerivativeNotationRankingIntradayListDataIssuer.md) |  | [optional] 
**exercise** | [**SecuritizedDerivativeNotationRankingIntradayListDataExercise**](SecuritizedDerivativeNotationRankingIntradayListDataExercise.md) |  | [optional] 
**underlying** | [**SecuritizedDerivativeNotationRankingIntradayListDataUnderlying**](SecuritizedDerivativeNotationRankingIntradayListDataUnderlying.md) |  | [optional] 
**factorCertificates** | [**SecuritizedDerivativeNotationRankingIntradayListDataFactorCertificates**](SecuritizedDerivativeNotationRankingIntradayListDataFactorCertificates.md) |  | [optional] 
**knockedOut** | **String** | Specifies whether knocked-out securitized derivatives are included in the response. Particularly relevant for knock-out certificates. | [optional] [default to &#39;exclude&#39;]
**knockedIn** | **String** | Specifies whether knocked-in securitized derivatives are included in the response. Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. | [optional] [default to &#39;exclude&#39;]



## Enum: KnockedOutEnum


* `only` (value: `"only"`)

* `include` (value: `"include"`)

* `exclude` (value: `"exclude"`)





## Enum: KnockedInEnum


* `only` (value: `"only"`)

* `include` (value: `"include"`)

* `exclude` (value: `"exclude"`)




