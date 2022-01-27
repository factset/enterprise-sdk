# SecuritizedDerivativeNotationRankingIntradayListData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market** | [**SecuritizedDerivativeNotationRankingIntradayListDataMarket**](SecuritizedDerivativeNotationRankingIntradayListDataMarket.md) |  | 
**prices** | [**SecuritizedDerivativeNotationRankingIntradayListDataPrices**](SecuritizedDerivativeNotationRankingIntradayListDataPrices.md) |  | [optional] 
**value_unit** | [**SecuritizedDerivativeNotationRankingIntradayListDataValueUnit**](SecuritizedDerivativeNotationRankingIntradayListDataValueUnit.md) |  | [optional] 
**currency** | [**SecuritizedDerivativeNotationRankingIntradayListDataCurrency**](SecuritizedDerivativeNotationRankingIntradayListDataCurrency.md) |  | [optional] 
**instrument_restriction_list** | [**SecuritizedDerivativeNotationRankingIntradayListDataInstrumentRestrictionList**](SecuritizedDerivativeNotationRankingIntradayListDataInstrumentRestrictionList.md) |  | [optional] 
**notation_restriction_list** | [**SecuritizedDerivativeNotationRankingIntradayListDataNotationRestrictionList**](SecuritizedDerivativeNotationRankingIntradayListDataNotationRestrictionList.md) |  | [optional] 
**category** | [**SecuritizedDerivativeNotationRankingIntradayListDataCategory**](SecuritizedDerivativeNotationRankingIntradayListDataCategory.md) |  | [optional] 
**registration_country** | [**SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry**](SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry.md) |  | [optional] 
**life_cycle** | [**SecuritizedDerivativeNotationRankingIntradayListDataLifeCycle**](SecuritizedDerivativeNotationRankingIntradayListDataLifeCycle.md) |  | [optional] 
**issuer** | [**SecuritizedDerivativeNotationRankingIntradayListDataIssuer**](SecuritizedDerivativeNotationRankingIntradayListDataIssuer.md) |  | [optional] 
**exercise** | [**SecuritizedDerivativeNotationRankingIntradayListDataExercise**](SecuritizedDerivativeNotationRankingIntradayListDataExercise.md) |  | [optional] 
**underlying** | [**SecuritizedDerivativeNotationRankingIntradayListDataUnderlying**](SecuritizedDerivativeNotationRankingIntradayListDataUnderlying.md) |  | [optional] 
**factor_certificates** | [**SecuritizedDerivativeNotationRankingIntradayListDataFactorCertificates**](SecuritizedDerivativeNotationRankingIntradayListDataFactorCertificates.md) |  | [optional] 
**knocked_out** | **str** | Specifies whether knocked-out securitized derivatives are included in the response. Particularly relevant for knock-out certificates. | [optional]  if omitted the server will use the default value of "exclude"
**knocked_in** | **str** | Specifies whether knocked-in securitized derivatives are included in the response. Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. | [optional]  if omitted the server will use the default value of "exclude"
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


