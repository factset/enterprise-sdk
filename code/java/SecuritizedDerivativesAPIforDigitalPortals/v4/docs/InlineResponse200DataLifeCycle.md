

# InlineResponse200DataLifeCycle

Important dates of the instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriptionPeriod** | [**InlineResponse200DataLifeCycleSubscriptionPeriod**](InlineResponse200DataLifeCycleSubscriptionPeriod.md) |  |  [optional]
**valutaIssue** | **LocalDate** | Date by which the issuer requires receiving the purchase price for a newly issued product purchased during the subscription period. |  [optional]
**initialFixing** | **LocalDate** | Date of the initial fixing. |  [optional]
**issue** | **LocalDate** | Date of the issue. |  [optional]
**intradayActivation** | [**InlineResponse200DataLifeCycleIntradayActivation**](InlineResponse200DataLifeCycleIntradayActivation.md) |  |  [optional]
**tradingPeriod** | [**InlineResponse200DataLifeCycleTradingPeriod**](InlineResponse200DataLifeCycleTradingPeriod.md) |  |  [optional]
**startExercisePeriod** | **LocalDate** | Date of the start of the exercise period, which ends with the valuation. |  [optional]
**valuation** | **LocalDate** | Date of the valuation. |  [optional]
**maturity** | [**InlineResponse200DataLifeCycleMaturity**](InlineResponse200DataLifeCycleMaturity.md) |  |  [optional]
**repayment** | **LocalDate** | Date of the repayment. |  [optional]
**cancellation** | **LocalDate** | Date of the cancellation day defined by the issuer. |  [optional]


## Implemented Interfaces

* Serializable


