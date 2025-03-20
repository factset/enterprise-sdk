

# PostSecuritizedDerivativeNotationScreenerSearchRequestData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**validation** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataValidation.md) |  |  [optional]
**category** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataCategory**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataCategory.md) |  |  [optional]
**registrationCountry** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataRegistrationCountry**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataRegistrationCountry.md) |  |  [optional]
**lifeCycle** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycle**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataLifeCycle.md) |  |  [optional]
**issuer** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer**](PostSecuritizedDerivativeNotationRankingIntradayListRequestDataIssuer.md) |  |  [optional]
**exercise** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataExercise**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataExercise.md) |  |  [optional]
**settlement** | [**SettlementEnum**](#SettlementEnum) | Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out. | Value | Description | | --- | --- | | cash | Transfer of a cash amount | | physical | Phyiscal delivery of the underlying asset. | | either | Cash or physical, at the discretion of the issuer. |   |  [optional]
**collateralized** | **Boolean** | Restricts the result to securitized derivatives that are collateralized (&#x60;true&#x60;) or are  not collateralized (&#x60;false&#x60;). A collateralized securitized derivative is protected against an  issuer default by collateral. |  [optional]
**quanto** | **Boolean** | Restricts the result to securitized derivatives that are hedged (&#x60;true&#x60;) or are not hedged (&#x60;false&#x60;) against fluctuations of the foreign exchange rate between the value unit of the underlying and the value unit of the cash flows. |  [optional]
**capitalProtection** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataCapitalProtection**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataCapitalProtection.md) |  |  [optional]
**underlying** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlying**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataUnderlying.md) |  |  [optional]
**cashFlowCurrency** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataCashFlowCurrency**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataCashFlowCurrency.md) |  |  [optional]
**singleBarriers** | [**java.util.List&lt;PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItems&gt;**](PostSecuritizedDerivativeNotationScreenerSearchDataSingleBarriersItems.md) | Single barriers. Barriers of this kind represent either a lower or an upper bound derived from the exercise right of the securitized derivative. Multiple barrier types may be used in one request. |  [optional]
**rangeBarriers** | [**java.util.List&lt;PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems&gt;**](PostSecuritizedDerivativeNotationScreenerSearchDataRangeBarriersItems.md) | Range barriers. Barriers of this kind represent a range with a lower and an upper bound. |  [optional]
**factorCertificates** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificates**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataFactorCertificates.md) |  |  [optional]
**nominalCurrency** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataNominalCurrency**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataNominalCurrency.md) |  |  [optional]
**currentInterestRate** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataCurrentInterestRate**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataCurrentInterestRate.md) |  |  [optional]
**keyFigures** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFigures**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataKeyFigures.md) |  |  [optional]
**performance** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformance**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataPerformance.md) |  |  [optional]
**volatility** | [**PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatility**](PostSecuritizedDerivativeNotationScreenerSearchRequestDataVolatility.md) |  |  [optional]



## Enum: SettlementEnum

Name | Value
---- | -----
CASH | &quot;cash&quot;
PHYSICAL | &quot;physical&quot;
EITHER | &quot;either&quot;


## Implemented Interfaces

* Serializable


