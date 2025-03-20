# InlineResponse2007Data

Underlying data, barrier conditions, and related cash flows.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_instrument** | **str, none_type** | MDG identifier of the instrument. | [optional] 
**source_identifier** | **str, none_type** | Identifier used in the request. | [optional] 
**underlyings** | [**[GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems]**](GetSecuritizedDerivativeUnderlyingListDataUnderlyingsItems.md) | Information regarding the underlying(s) of the securitized derivative. | [optional] 
**barrier_type_conditions** | [**[GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsItems]**](GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsItems.md) | Set of conditions associated with a particular type of barrier. A condition is defined by the related type and level of the barrier, its observation period, and the resulting cash flow, if any. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


