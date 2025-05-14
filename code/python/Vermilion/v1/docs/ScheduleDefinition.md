# ScheduleDefinition

List of Schedule Definition.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schedule_definition_id** | **int** | Unique Identifier for the Schedule Definition. | [optional] 
**name** | **str** | Name of the Schedule Definition. | [optional] 
**code** | **str** | Code of the Schedule Definition. | [optional] 
**schedule_type** | **str** | Type of Schedule Definition. | [optional] 
**schedule_group** | **str** | Group of the Schedule Definition. | [optional] 
**report_date** | **str** | Report Date of the Schedule Definition. | [optional] 
**number_of_obligations** | **int** | Number of obligations used in the Schedule Definition. | [optional] 
**business_calendar** | **str** | Calender name used in the Schedule Definition. | [optional] 
**delete_schedule_after_days** | **int** | Indicates after how many days the Schedule should be deleted. | [optional] 
**number_of_packages** | **int** | Indicates number of packages involved in the Schedule Definition. | [optional] 
**entities** | [**[EntityDTO]**](EntityDTO.md) | A set of entities used in Schedule Definition. | [optional] 
**owner_role** | [**ScheduleDefinitionOwnerRole**](ScheduleDefinitionOwnerRole.md) |  | [optional] 
**notes** | **str** | Notes of the Schedule Definition. | [optional] 
**last_updated_by** | **str** | Indicates the username of the person who last updated the Data Source. | [optional] 
**last_updated** | **str** | The timestamp of the most recent update in epoch format for a specific Schedule Definition | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


