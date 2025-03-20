# PostSecuritizedDerivativeNotationRankingIntradayListRequestData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataMarket**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataMarket.md) |  | 
**prices** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPrices**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPrices.md) |  | [optional] 
**value_unit** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataValueUnit**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataValueUnit.md) |  | [optional] 
**currency** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCurrency**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCurrency.md) |  | [optional] 
**instrument_restriction_list** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataInstrumentRestrictionList**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataInstrumentRestrictionList.md) |  | [optional] 
**notation_restriction_list** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataNotationRestrictionList**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataNotationRestrictionList.md) |  | [optional] 
**category** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCategory**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataCategory.md) |  | [optional] 
**registration_country** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataRegistrationCountry**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataRegistrationCountry.md) |  | [optional] 
**life_cycle** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataLifeCycle**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataLifeCycle.md) |  | [optional] 
**issuer** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer.md) |  | [optional] 
**exercise** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataExercise**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataExercise.md) |  | [optional] 
**underlying** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlying**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataUnderlying.md) |  | [optional] 
**factor_certificates** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataFactorCertificates**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataFactorCertificates.md) |  | [optional] 
**knocked_out** | **str** | Specifies whether knocked-out securitized derivatives are included in the response. Particularly relevant for knock-out certificates. | Value | Description | | --- | --- | | only | Only knocked-out securitized derivatives are included in the result. | | include | Knocked-out securitized derivatives are included in the result. | | exclude | Knocked-out securitized derivatives are excluded from the result. |   | [optional]  if omitted the server will use the default value of "exclude"
**knocked_in** | **str** | Specifies whether knocked-in securitized derivatives are included in the response. Particularly relevant for bonus certificates but also for securitized derivatives that might have additional protection such as reverse convertible bonds, discount certificates, and capital-protection certificates. | Value | Description | | --- | --- | | only | Only knocked-in securitized derivatives are included in the result. | | include | Knocked-in securitized derivatives are included in the result. | | exclude | Knocked-in securitized derivatives are excluded from the result. |   | [optional]  if omitted the server will use the default value of "exclude"
**performance** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformance**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataPerformance.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


