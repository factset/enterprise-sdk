# securitizedderivativesapifordigitalportals.PostSecuritizedDerivativeNotationRankingIntradayListRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prices** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPrices**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPrices.md) |  | [optional] 
**valueUnit** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataValueUnit**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataValueUnit.md) |  | [optional] 
**currency** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCurrency**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCurrency.md) |  | [optional] 
**market** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataMarket**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataMarket.md) |  | 
**instrumentRestrictionList** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataInstrumentRestrictionList**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataInstrumentRestrictionList.md) |  | [optional] 
**notationRestrictionList** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataNotationRestrictionList**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataNotationRestrictionList.md) |  | [optional] 
**category** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCategory**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCategory.md) |  | [optional] 
**registrationCountry** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataRegistrationCountry**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataRegistrationCountry.md) |  | [optional] 
**lifeCycle** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataLifeCycle**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataLifeCycle.md) |  | [optional] 
**issuer** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer.md) |  | [optional] 
**exercise** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataExercise**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataExercise.md) |  | [optional] 
**underlying** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlying**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlying.md) |  | [optional] 
**factorCertificates** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataFactorCertificates**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataFactorCertificates.md) |  | [optional] 
**knockedOut** | **String** | Specifies whether knocked-out securitized derivatives are included in the response. Particularly relevant for knock-out certificates. | Value | Description | | --- | --- | | only | Only knocked-out securitized derivatives are included in the result. | | include | Knocked-out securitized derivatives are included in the result. | | exclude | Knocked-out securitized derivatives are excluded from the result. |   | [optional] [default to &#39;exclude&#39;]
**knockedIn** | **String** | Specifies whether knocked-in securitized derivatives are included in the response. Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. | Value | Description | | --- | --- | | only | Only knocked-in securitized derivatives are included in the result. | | include | Knocked-in securitized derivatives are included in the result. | | exclude | Knocked-in securitized derivatives are excluded from the result. |   | [optional] [default to &#39;exclude&#39;]
**performance** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformance**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformance.md) |  | [optional] 



## Enum: KnockedOutEnum


* `only` (value: `"only"`)

* `include` (value: `"include"`)

* `exclude` (value: `"exclude"`)





## Enum: KnockedInEnum


* `only` (value: `"only"`)

* `include` (value: `"include"`)

* `exclude` (value: `"exclude"`)




