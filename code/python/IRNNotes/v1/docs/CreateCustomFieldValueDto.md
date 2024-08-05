# CreateCustomFieldValueDto

Set a value or values for a custom field identified by the field 'Code'. Only one of the fields (IntegerValue / TextValue / FilePathValue etc) will be used,  depending on the data type of the custom field corresponding to the 'Code' provided

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** |  | 
**integer_value** | **int, none_type** |  | [optional] 
**text_value** | **str, none_type** |  | [optional] 
**file_path_value** | **str, none_type** |  | [optional] 
**numeric_value** | **float, none_type** |  | [optional] 
**date_value** | **str, none_type** |  | [optional] 
**extended_text_value** | **str, none_type** |  | [optional] 
**contact_lookup_values** | **[str], none_type** |  | [optional] 
**option_value** | **str, none_type** |  | [optional] 
**option_values** | **[str], none_type** |  | [optional] 
**user_team_lookup_values** | [**UserTeamLookupDto**](UserTeamLookupDto.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


