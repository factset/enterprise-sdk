# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.InlineResponse200DataLifeCycle
Important dates of the instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SubscriptionPeriod** | [**InlineResponse200DataLifeCycleSubscriptionPeriod**](InlineResponse200DataLifeCycleSubscriptionPeriod.md) |  | [optional] 
**ValutaIssue** | **DateTime?** | Date by which the issuer requires receiving the purchase price for a newly issued product purchased during the subscription period. | [optional] 
**InitialFixing** | **DateTime?** | Date of the initial fixing. | [optional] 
**Issue** | **DateTime?** | Date of the issue. | [optional] 
**IntradayActivation** | [**InlineResponse200DataLifeCycleIntradayActivation**](InlineResponse200DataLifeCycleIntradayActivation.md) |  | [optional] 
**TradingPeriod** | [**InlineResponse200DataLifeCycleTradingPeriod**](InlineResponse200DataLifeCycleTradingPeriod.md) |  | [optional] 
**StartExercisePeriod** | **DateTime?** | Date of the start of the exercise period, which ends with the valuation. | [optional] 
**Valuation** | **DateTime?** | Date of the valuation. | [optional] 
**Maturity** | [**InlineResponse200DataLifeCycleMaturity**](InlineResponse200DataLifeCycleMaturity.md) |  | [optional] 
**Repayment** | **DateTime?** | Date of the repayment. | [optional] 
**Cancellation** | **DateTime?** | Date of the cancellation day defined by the issuer. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

