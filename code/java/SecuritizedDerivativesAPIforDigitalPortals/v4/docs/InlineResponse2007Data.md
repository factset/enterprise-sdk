

# InlineResponse2007Data

Underlying data, barrier conditions, and related cash flows.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idInstrument** | **String** | MDG identifier of the instrument. |  [optional]
**sourceIdentifier** | **String** | Identifier used in the request. |  [optional]
**underlyings** | [**java.util.List&lt;GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems&gt;**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems.md) | Information regarding the underlying(s) of the securitized derivative. |  [optional]
**barrierTypeConditions** | [**java.util.List&lt;GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsItems&gt;**](GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsItems.md) | Set of conditions associated with a particular type of barrier. A condition is defined by the related type and level of the barrier, its observation period, and the resulting cash flow, if any. |  [optional]


## Implemented Interfaces

* Serializable


