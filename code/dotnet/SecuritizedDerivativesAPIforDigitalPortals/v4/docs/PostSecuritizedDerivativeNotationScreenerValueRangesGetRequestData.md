# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Validation** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidation**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataValidation.md) |  | [optional] 
**Category** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCategory**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCategory.md) |  | [optional] 
**RegistrationCountry** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataRegistrationCountry**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataRegistrationCountry.md) |  | [optional] 
**LifeCycle** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycle**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataLifeCycle.md) |  | [optional] 
**Issuer** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer.md) |  | [optional] 
**Exercise** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataExercise**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataExercise.md) |  | [optional] 
**Settlement** | **string** | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | - -- | - -- | | cash | Transfer of a cash amount | | physical | Phyiscal delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |   | [optional] 
**Collateralized** | **bool** | Restricts the result to securitized derivatives that are collateralized (&#x60;true&#x60;) or are  not collateralized (&#x60;false&#x60;). A collateralized securitized derivative is protected against an  issuer default by collateral. | [optional] 
**Quanto** | **bool** | Restricts the result to securitized derivatives that are hedged (&#x60;true&#x60;) or are not hedged (&#x60;false&#x60;) against fluctuations of the foreign exchange rate between the value unit of the underlying and the value unit of the cash flows. | [optional] 
**CapitalProtection** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtection**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCapitalProtection.md) |  | [optional] 
**Underlying** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataUnderlying**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataUnderlying.md) |  | [optional] 
**CashFlowCurrency** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCashFlowCurrency**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCashFlowCurrency.md) |  | [optional] 
**SingleBarriers** | [**List&lt;PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItems&gt;**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItems.md) | Single barriers. Barriers of this kind represent either a lower or an upper bound derived from the exercise right of the securitized derivative. Multiple barrier types may be used in one request. | [optional] 
**RangeBarriers** | [**List&lt;PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItems&gt;**](PostSecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriersItems.md) | Range barriers. Barriers of this kind represent a range with a lower and an upper bound. | [optional] 
**FactorCertificates** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificates**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataFactorCertificates.md) |  | [optional] 
**NominalCurrency** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataNominalCurrency**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataNominalCurrency.md) |  | [optional] 
**CurrentInterestRate** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRate**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataCurrentInterestRate.md) |  | [optional] 
**KeyFigures** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataKeyFigures.md) |  | [optional] 
**Performance** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformance**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataPerformance.md) |  | [optional] 
**Volatility** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatility**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequestDataVolatility.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

