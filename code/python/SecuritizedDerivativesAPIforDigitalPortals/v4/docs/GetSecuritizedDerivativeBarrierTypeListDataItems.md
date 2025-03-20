# GetSecuritizedDerivativeBarrierTypeListDataItems

A list of objects. For semantical context see the description of the parent array.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float, none_type** | Identifier of the barrier type. | [optional] 
**name** | **str, none_type** | English name of the barrier type. | [optional] 
**description** | **str, none_type** | English description of the barrier type. | [optional] 
**kind** | **str, none_type** | Kind of the barrier type. | Value | Description | | --- | --- | | single | Barrier types of this kind represent either a lower or an upper bound derived from the exercise right of the securitized derivative, see attribute &#x60;exercise.right&#x60; in endpoint &#x60;/securitized-derivative/get&#x60;. | | range | Barrier types of this kind represent a range with a lower and an upper bound. |   | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


