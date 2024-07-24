# JobOverrides

If this object is provided, the settings given here will override the default settings of the job for the job run (settings will only be used temporarily and no changes will be made to the default PRB job). Only certain objects can be used for certain job types.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**combinations** | [**[JobOverridesCombinationsRoot]**](JobOverridesCombinationsRoot.md) | An array of date, account, and tasks combinations | [optional] 
**run_as_serial_number** | **str** | The FactSet serial number which has the credentials wanted to run the job | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


