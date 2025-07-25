# PostOptionByClassListRequestDataContractExcercise

Parameters related to the exercise.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**right** | **str** | Restricts the exercise right of the option. | Value | Description | | --- | --- | | put | A put option gives the owner the right, but not the obligation, to sell an asset at a specified price within a specific time period. | | call | A call option gives the owner the right, but not the obligation, to buy an asset at a specified price within a specific time period. |   | [optional] 
**style** | **str** | Restricts the exercise style of the option. | Value | Description | | --- | --- | | american | An American-style option can be exercised anytime during its life. | | european | A European-style option can be exercised at the end of its life. |   | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


