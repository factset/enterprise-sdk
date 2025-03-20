# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model.InlineResponse2007Data
Underlying data, barrier conditions, and related cash flows.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdInstrument** | **string** | MDG identifier of the instrument. | [optional] 
**SourceIdentifier** | **string** | Identifier used in the request. | [optional] 
**Underlyings** | [**List&lt;GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems&gt;**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems.md) | Information regarding the underlying(s) of the securitized derivative. | [optional] 
**BarrierTypeConditions** | [**List&lt;GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsItems&gt;**](GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsItems.md) | Set of conditions associated with a particular type of barrier. A condition is defined by the related type and level of the barrier, its observation period, and the resulting cash flow, if any. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

