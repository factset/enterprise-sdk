# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.PostSecuritizedDerivativeNotationScreenerSearchRequestData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Validation** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.md) |  | [optional] 
**Category** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataCategory**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataCategory.md) |  | [optional] 
**RegistrationCountry** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataRegistrationCountry**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataRegistrationCountry.md) |  | [optional] 
**LifeCycle** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycle**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycle.md) |  | [optional] 
**Issuer** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer.md) |  | [optional] 
**Exercise** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataExercise**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataExercise.md) |  | [optional] 
**Settlement** | **string** | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | - -- | - -- | | cash | Transfer of a cash amount | | physical | Phyiscal delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |   | [optional] 
**Collateralized** | **bool** | Restricts the result to securitized derivatives that are collateralized (&#x60;true&#x60;) or are  not collateralized (&#x60;false&#x60;). A collateralized securitized derivative is protected against an  issuer default by collateral. | [optional] 
**Quanto** | **bool** | Restricts the result to securitized derivatives that are hedged (&#x60;true&#x60;) or are not hedged (&#x60;false&#x60;) against fluctuations of the foreign exchange rate between the value unit of the underlying and the value unit of the cash flows. | [optional] 
**CapitalProtection** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataCapitalProtection**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataCapitalProtection.md) |  | [optional] 
**Underlying** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlying**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlying.md) |  | [optional] 
**CashFlowCurrency** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataCashFlowCurrency**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataCashFlowCurrency.md) |  | [optional] 
**SingleBarriers** | [**List&lt;PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItems&gt;**](PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItems.md) | Single barriers. Barriers of this kind represent either a lower or an upper bound derived from the exercise right of the securitized derivative. Multiple barrier types may be used in one request. | [optional] 
**RangeBarriers** | [**List&lt;PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems&gt;**](PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems.md) | Range barriers. Barriers of this kind represent a range with a lower and an upper bound. | [optional] 
**FactorCertificates** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificates**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificates.md) |  | [optional] 
**NominalCurrency** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataNominalCurrency**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataNominalCurrency.md) |  | [optional] 
**CurrentInterestRate** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataCurrentInterestRate**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataCurrentInterestRate.md) |  | [optional] 
**KeyFigures** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFigures**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFigures.md) |  | [optional] 
**Performance** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformance**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformance.md) |  | [optional] 
**Volatility** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatility**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatility.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

