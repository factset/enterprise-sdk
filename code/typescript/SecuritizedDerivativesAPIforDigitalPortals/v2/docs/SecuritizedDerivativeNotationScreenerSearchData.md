# securitizedderivativesapifordigitalportals.SecuritizedDerivativeNotationScreenerSearchData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**validation** | [**SecuritizedDerivativeNotationScreenerSearchDataValidation**](SecuritizedDerivativeNotationScreenerSearchDataValidation.md) |  | [optional] 
**category** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory**](SecuritizedDerivativeNotationScreenerValueRangesGetDataCategory.md) |  | [optional] 
**registrationCountry** | [**SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry**](SecuritizedDerivativeNotationRankingIntradayListDataRegistrationCountry.md) |  | [optional] 
**lifeCycle** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle**](SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycle.md) |  | [optional] 
**issuer** | [**SecuritizedDerivativeNotationRankingIntradayListDataIssuer**](SecuritizedDerivativeNotationRankingIntradayListDataIssuer.md) |  | [optional] 
**exercise** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataExercise**](SecuritizedDerivativeNotationScreenerValueRangesGetDataExercise.md) |  | [optional] 
**settlement** | **String** | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | [optional] 
**collateralized** | **Boolean** | Restricts the result to securitized derivatives that are collateralized (&#x60;true&#x60;) or are  not collateralized (&#x60;false&#x60;). A collateralized securitized derivative is protected against an  issuer default by collateral. | [optional] 
**quanto** | **Boolean** | Restricts the result to securitized derivatives that are hedged (&#x60;true&#x60;) or are not hedged (&#x60;false&#x60;) against fluctuations of the foreign exchange rate between the value unit of the underlying and the value unit of the cash flows. | [optional] 
**capitalProtection** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtection**](SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtection.md) |  | [optional] 
**underlying** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying**](SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying.md) |  | [optional] 
**cashFlowCurrency** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency**](SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlowCurrency.md) |  | [optional] 
**singleBarriers** | [**[SecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriers]**](SecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriers.md) | Single barriers. Barriers of this kind represent either a lower or an upper bound derived from the exercise right of the securitized derivative. Multiple barrier types may be used in one request. | [optional] 
**rangeBarriers** | [**[SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers]**](SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.md) | Range barriers. Barriers of this kind represent a range with a lower and an upper bound. | [optional] 
**factorCertificates** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataFactorCertificates**](SecuritizedDerivativeNotationScreenerValueRangesGetDataFactorCertificates.md) |  | [optional] 
**nominalCurrency** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataNominalCurrency**](SecuritizedDerivativeNotationScreenerValueRangesGetDataNominalCurrency.md) |  | [optional] 
**currentInterestRate** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataCurrentInterestRate**](SecuritizedDerivativeNotationScreenerValueRangesGetDataCurrentInterestRate.md) |  | [optional] 
**keyFigures** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures**](SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFigures.md) |  | [optional] 
**performance** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformance**](SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformance.md) |  | [optional] 
**volatility** | [**SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility**](SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility.md) |  | [optional] 



## Enum: SettlementEnum


* `cash` (value: `"cash"`)

* `physical` (value: `"physical"`)

* `either` (value: `"either"`)




