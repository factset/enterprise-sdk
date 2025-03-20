# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationRankingIntradayListRequestData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Prices** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPrices**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPrices.md) |  | [optional] 
**ValueUnit** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataValueUnit**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataValueUnit.md) |  | [optional] 
**Currency** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCurrency**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCurrency.md) |  | [optional] 
**Market** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataMarket**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataMarket.md) |  | 
**InstrumentRestrictionList** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataInstrumentRestrictionList**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataInstrumentRestrictionList.md) |  | [optional] 
**NotationRestrictionList** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataNotationRestrictionList**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataNotationRestrictionList.md) |  | [optional] 
**Category** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCategory**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCategory.md) |  | [optional] 
**RegistrationCountry** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataRegistrationCountry**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataRegistrationCountry.md) |  | [optional] 
**LifeCycle** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataLifeCycle**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataLifeCycle.md) |  | [optional] 
**Issuer** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer.md) |  | [optional] 
**Exercise** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataExercise**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataExercise.md) |  | [optional] 
**Underlying** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlying**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlying.md) |  | [optional] 
**FactorCertificates** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataFactorCertificates**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataFactorCertificates.md) |  | [optional] 
**KnockedOut** | **string** | Specifies whether knocked-out securitized derivatives are included in the response. Particularly relevant for knock-out certificates. | Value | Description | | - -- | - -- | | only | Only knocked-out securitized derivatives are included in the result. | | include | Knocked-out securitized derivatives are included in the result. | | exclude | Knocked-out securitized derivatives are excluded from the result. |   | [optional] [default to KnockedOutEnum.Exclude]
**KnockedIn** | **string** | Specifies whether knocked-in securitized derivatives are included in the response. Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. | Value | Description | | - -- | - -- | | only | Only knocked-in securitized derivatives are included in the result. | | include | Knocked-in securitized derivatives are included in the result. | | exclude | Knocked-in securitized derivatives are excluded from the result. |   | [optional] [default to KnockedInEnum.Exclude]
**Performance** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformance**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformance.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

