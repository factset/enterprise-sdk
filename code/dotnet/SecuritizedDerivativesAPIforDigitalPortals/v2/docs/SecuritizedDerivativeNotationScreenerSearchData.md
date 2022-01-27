# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.SecuritizedDerivativeNotationScreenerSearchData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Validation** | [**SecuritizedDerivativeNotationScreenerSearchDataValidation**](SecuritizedDerivativeNotationScreenerSearchDataValidation.md) |  | [optional] 
**Category** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory**](SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory.md) |  | [optional] 
**RegistrationCountry** | [**SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry**](SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry.md) |  | [optional] 
**LifeCycle** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle**](SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle.md) |  | [optional] 
**Issuer** | [**SecuritizedDerivativeNotationRankingIntradayListDataIssuer**](SecuritizedDerivativeNotationRankingIntradayListDataIssuer.md) |  | [optional] 
**Exercise** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataExercise**](SecuritizedDerivativeNotationScreenerValueRangesGetDataExercise.md) |  | [optional] 
**Settlement** | **string** | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | [optional] 
**Collateralized** | **bool** | Restricts the result to securitized derivatives that are collateralized (&#x60;true&#x60;) or are  not collateralized (&#x60;false&#x60;). A collateralized securitized derivative is protected against an  issuer default by collateral. | [optional] 
**Quanto** | **bool** | Restricts the result to securitized derivatives that are hedged (&#x60;true&#x60;) or are not hedged (&#x60;false&#x60;) against fluctuations of the foreign exchange rate between the value unit of the underlying and the value unit of the cash flows. | [optional] 
**CapitalProtection** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtection**](SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtection.md) |  | [optional] 
**Underlying** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying**](SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying.md) |  | [optional] 
**CashFlowCurrency** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency**](SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency.md) |  | [optional] 
**SingleBarriers** | [**List&lt;SecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriers&gt;**](SecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriers.md) | Single barriers. Barriers of this kind represent either a lower or an upper bound derived from the exercise right of the securitized derivative. Multiple barrier types may be used in one request. | [optional] 
**RangeBarriers** | [**List&lt;SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers&gt;**](SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.md) | Range barriers. Barriers of this kind represent a range with a lower and an upper bound. | [optional] 
**FactorCertificates** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataFactorCertificates**](SecuritizedDerivativeNotationScreenerValueRangesGetDataFactorCertificates.md) |  | [optional] 
**NominalCurrency** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataNominalCurrency**](SecuritizedDerivativeNotationScreenerValueRangesGetDataNominalCurrency.md) |  | [optional] 
**CurrentInterestRate** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataCurrentInterestRate**](SecuritizedDerivativeNotationScreenerValueRangesGetDataCurrentInterestRate.md) |  | [optional] 
**KeyFigures** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures**](SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures.md) |  | [optional] 
**Performance** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformance**](SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformance.md) |  | [optional] 
**Volatility** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility**](SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

