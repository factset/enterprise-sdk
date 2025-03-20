# PostSecuritizedDerivativeNotationScreenerValueRangesGetDataSingleBarriersItemsBreach

Parameters related to a barrier breach; applicable to the following barrier types: `knockIn` and `knockOut`

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breached** | **str** | Defines whether or not securitized derivatives for which the barrier has been breached are included in the result. | Value | Description | | --- | --- | | all | The result is not limited with regard to whether the barrier has been breached or not. | | only | The result is limited to securitized derivatives for which the barrier has been breached. | | exclude | The result is limited to securitized derivatives for which the barrier has not been breached. |   | [optional]  if omitted the server will use the default value of "exclude"
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


