# PostSecuritizedDerivativeNotationScreenerSearchRequestData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**validation** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.md) |  | [optional] 
**category** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataCategory**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataCategory.md) |  | [optional] 
**registration_country** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataRegistrationCountry**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataRegistrationCountry.md) |  | [optional] 
**life_cycle** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycle**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycle.md) |  | [optional] 
**issuer** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer.md) |  | [optional] 
**exercise** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataExercise**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataExercise.md) |  | [optional] 
**settlement** | **str** | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | --- | --- | | cash | Transfer of a cash amount | | physical | Phyiscal delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |   | [optional] 
**collateralized** | **bool** | Restricts the result to securitized derivatives that are collateralized (&#x60;true&#x60;) or are  not collateralized (&#x60;false&#x60;). A collateralized securitized derivative is protected against an  issuer default by collateral. | [optional] 
**quanto** | **bool** | Restricts the result to securitized derivatives that are hedged (&#x60;true&#x60;) or are not hedged (&#x60;false&#x60;) against fluctuations of the foreign exchange rate between the value unit of the underlying and the value unit of the cash flows. | [optional] 
**capital_protection** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataCapitalProtection**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataCapitalProtection.md) |  | [optional] 
**underlying** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlying**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlying.md) |  | [optional] 
**cash_flow_currency** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataCashFlowCurrency**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataCashFlowCurrency.md) |  | [optional] 
**single_barriers** | [**[PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItems]**](PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItems.md) | Single barriers. Barriers of this kind represent either a lower or an upper bound derived from the exercise right of the securitized derivative. Multiple barrier types may be used in one request. | [optional] 
**range_barriers** | [**[PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems]**](PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems.md) | Range barriers. Barriers of this kind represent a range with a lower and an upper bound. | [optional] 
**factor_certificates** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificates**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificates.md) |  | [optional] 
**nominal_currency** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataNominalCurrency**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataNominalCurrency.md) |  | [optional] 
**current_interest_rate** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataCurrentInterestRate**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataCurrentInterestRate.md) |  | [optional] 
**key_figures** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFigures**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFigures.md) |  | [optional] 
**performance** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformance**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformance.md) |  | [optional] 
**volatility** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatility**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatility.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


