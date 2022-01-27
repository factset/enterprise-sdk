# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.SecuritizedDerivativeNotationRankingIntradayListData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Prices** | [**SecuritizedDerivativeNotationRankingIntradayListDataPrices**](SecuritizedDerivativeNotationRankingIntradayListDataPrices.md) |  | [optional] 
**ValueUnit** | [**SecuritizedDerivativeNotationRankingIntradayListDataValueUnit**](SecuritizedDerivativeNotationRankingIntradayListDataValueUnit.md) |  | [optional] 
**Currency** | [**SecuritizedDerivativeNotationRankingIntradayListDataCurrency**](SecuritizedDerivativeNotationRankingIntradayListDataCurrency.md) |  | [optional] 
**Market** | [**SecuritizedDerivativeNotationRankingIntradayListDataMarket**](SecuritizedDerivativeNotationRankingIntradayListDataMarket.md) |  | 
**InstrumentRestrictionList** | [**SecuritizedDerivativeNotationRankingIntradayListDataInstrumentRestrictionList**](SecuritizedDerivativeNotationRankingIntradayListDataInstrumentRestrictionList.md) |  | [optional] 
**NotationRestrictionList** | [**SecuritizedDerivativeNotationRankingIntradayListDataNotationRestrictionList**](SecuritizedDerivativeNotationRankingIntradayListDataNotationRestrictionList.md) |  | [optional] 
**Category** | [**SecuritizedDerivativeNotationRankingIntradayListDataCategory**](SecuritizedDerivativeNotationRankingIntradayListDataCategory.md) |  | [optional] 
**RegistrationCountry** | [**SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry**](SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry.md) |  | [optional] 
**LifeCycle** | [**SecuritizedDerivativeNotationRankingIntradayListDataLifeCycle**](SecuritizedDerivativeNotationRankingIntradayListDataLifeCycle.md) |  | [optional] 
**Issuer** | [**SecuritizedDerivativeNotationRankingIntradayListDataIssuer**](SecuritizedDerivativeNotationRankingIntradayListDataIssuer.md) |  | [optional] 
**Exercise** | [**SecuritizedDerivativeNotationRankingIntradayListDataExercise**](SecuritizedDerivativeNotationRankingIntradayListDataExercise.md) |  | [optional] 
**Underlying** | [**SecuritizedDerivativeNotationRankingIntradayListDataUnderlying**](SecuritizedDerivativeNotationRankingIntradayListDataUnderlying.md) |  | [optional] 
**FactorCertificates** | [**SecuritizedDerivativeNotationRankingIntradayListDataFactorCertificates**](SecuritizedDerivativeNotationRankingIntradayListDataFactorCertificates.md) |  | [optional] 
**KnockedOut** | **string** | Specifies whether knocked-out securitized derivatives are included in the response. Particularly relevant for knock-out certificates. | [optional] [default to KnockedOutEnum.Exclude]
**KnockedIn** | **string** | Specifies whether knocked-in securitized derivatives are included in the response. Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. | [optional] [default to KnockedInEnum.Exclude]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

