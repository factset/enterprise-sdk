# PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**validation** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidation**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidation.md) |  | [optional] 
**category** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCategory**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCategory.md) |  | [optional] 
**registration_country** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataRegistrationCountry**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataRegistrationCountry.md) |  | [optional] 
**life_cycle** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycle**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycle.md) |  | [optional] 
**issuer** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer.md) |  | [optional] 
**exercise** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataExercise**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataExercise.md) |  | [optional] 
**settlement** | **str** | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | --- | --- | | cash | Transfer of a cash amount | | physical | Phyiscal delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |   | [optional] 
**collateralized** | **bool** | Restricts the result to securitized derivatives that are collateralized (&#x60;true&#x60;) or are  not collateralized (&#x60;false&#x60;). A collateralized securitized derivative is protected against an  issuer default by collateral. | [optional] 
**quanto** | **bool** | Restricts the result to securitized derivatives that are hedged (&#x60;true&#x60;) or are not hedged (&#x60;false&#x60;) against fluctuations of the foreign exchange rate between the value unit of the underlying and the value unit of the cash flows. | [optional] 
**capital_protection** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtection**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtection.md) |  | [optional] 
**underlying** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataUnderlying**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataUnderlying.md) |  | [optional] 
**cash_flow_currency** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCashFlowCurrency**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCashFlowCurrency.md) |  | [optional] 
**single_barriers** | [**[PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItems]**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItems.md) | Single barriers. Barriers of this kind represent either a lower or an upper bound derived from the exercise right of the securitized derivative. Multiple barrier types may be used in one request. | [optional] 
**range_barriers** | [**[PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItems]**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItems.md) | Range barriers. Barriers of this kind represent a range with a lower and an upper bound. | [optional] 
**factor_certificates** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificates**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificates.md) |  | [optional] 
**nominal_currency** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataNominalCurrency**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataNominalCurrency.md) |  | [optional] 
**current_interest_rate** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRate**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRate.md) |  | [optional] 
**key_figures** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.md) |  | [optional] 
**performance** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformance**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformance.md) |  | [optional] 
**volatility** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatility**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatility.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


