# securitizedderivativesapifordigitalportals.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**validation** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidation**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidation.md) |  | [optional] 
**category** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCategory**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCategory.md) |  | [optional] 
**registrationCountry** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataRegistrationCountry**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataRegistrationCountry.md) |  | [optional] 
**lifeCycle** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycle**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycle.md) |  | [optional] 
**issuer** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer.md) |  | [optional] 
**exercise** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataExercise**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataExercise.md) |  | [optional] 
**settlement** | **String** | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | --- | --- | | cash | Transfer of a cash amount | | physical | Phyiscal delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |   | [optional] 
**collateralized** | **Boolean** | Restricts the result to securitized derivatives that are collateralized (&#x60;true&#x60;) or are  not collateralized (&#x60;false&#x60;). A collateralized securitized derivative is protected against an  issuer default by collateral. | [optional] 
**quanto** | **Boolean** | Restricts the result to securitized derivatives that are hedged (&#x60;true&#x60;) or are not hedged (&#x60;false&#x60;) against fluctuations of the foreign exchange rate between the value unit of the underlying and the value unit of the cash flows. | [optional] 
**capitalProtection** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtection**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtection.md) |  | [optional] 
**underlying** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataUnderlying**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataUnderlying.md) |  | [optional] 
**cashFlowCurrency** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCashFlowCurrency**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCashFlowCurrency.md) |  | [optional] 
**singleBarriers** | [**[PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItems]**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItems.md) | Single barriers. Barriers of this kind represent either a lower or an upper bound derived from the exercise right of the securitized derivative. Multiple barrier types may be used in one request. | [optional] 
**rangeBarriers** | [**[PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItems]**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItems.md) | Range barriers. Barriers of this kind represent a range with a lower and an upper bound. | [optional] 
**factorCertificates** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificates**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificates.md) |  | [optional] 
**nominalCurrency** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataNominalCurrency**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataNominalCurrency.md) |  | [optional] 
**currentInterestRate** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRate**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRate.md) |  | [optional] 
**keyFigures** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.md) |  | [optional] 
**performance** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformance**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformance.md) |  | [optional] 
**volatility** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatility**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatility.md) |  | [optional] 



## Enum: SettlementEnum


* `cash` (value: `"cash"`)

* `physical` (value: `"physical"`)

* `either` (value: `"either"`)




