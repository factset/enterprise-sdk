# GIPSCalculationParameters

List of calculation parameters.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **str** | Account path for the calculation. Account field accepts only ACTM. | 
**enddate** | **str, none_type** | Calculation&#39;s end date. End of previous month will be used as the enddate if not provided explicitly. | [optional] 
**report** | **str, none_type** | Report name | [optional]  if omitted the server will use the default value of "RET_STAT"
**viewid** | **str, none_type** | ViewId for calculation. | [optional] 
**currencyisocode** | **str, none_type** | Currency ISO code for calculation. The default currency value of the account will be used if not provided explicitly. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


