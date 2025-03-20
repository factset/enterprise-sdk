# GetSecuritizedDerivativeUnderlyingListDataBarrierTypeConditionsConditionsBarriersItemsSingleParticipationFactor

Participation factor of the securitized derivative in the performance of the underlying, depending on the exercise right (see attribute `exercise.right` in endpoint `/securitized-derivative/get`).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**positive** | **float, none_type** | Participation factor above the barrier for a securitized derivative with exercise right call, and below the barrier for exercise right put.  | [optional] 
**negative** | **float, none_type** | Participation factor above the barrier for a securitized derivative with exercise right put, and below the barrier for exercise right call. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


