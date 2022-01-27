# UltimateEntityStructureRequest

Ultimate Entity Structure Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**StructureIds**](StructureIds.md) |  | 
**level** | **int** | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional]  if omitted the server will use the default value of -1
**active** | [**Active**](Active.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


