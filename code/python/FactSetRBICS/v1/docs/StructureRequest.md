# StructureRequest

Structure Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rbics_ids** | [**RbicsIds**](RbicsIds.md) |  | [optional] 
**level** | [**LevelStructure**](LevelStructure.md) |  | [optional] 
**include_names** | **bool** | Option to include or exclude industry Names and the L6 Description. True &#x3D; Include Names; False &#x3D; Exclude Names.  | [optional]  if omitted the server will use the default value of True
**date** | **str** | Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


