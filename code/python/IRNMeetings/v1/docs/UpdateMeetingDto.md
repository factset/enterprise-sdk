# UpdateMeetingDto


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **str** |  | 
**identifier** | **str** |  | 
**start** | **str** |  | 
**end** | **str** |  | 
**locations** | **[str], none_type** |  | [optional] 
**organizer** | **str, none_type** |  | [optional] 
**organizer_id** | **str** |  | [optional] 
**attendees** | [**[ReferenceAttendeeDto], none_type**](ReferenceAttendeeDto.md) |  | [optional] 
**alert_attendees** | **bool** |  | [optional]  if omitted the server will use the default value of False
**alert_author** | **bool** |  | [optional]  if omitted the server will use the default value of False
**related_records** | [**RelatedRecordsDto**](RelatedRecordsDto.md) |  | [optional] 
**related_contacts** | **[str], none_type** |  | [optional] 
**related_symbols** | **[str], none_type** |  | [optional] 
**body** | [**CreateBodyDto**](CreateBodyDto.md) |  | [optional] 
**custom_field_values** | [**[CreateCustomFieldValueDto], none_type**](CreateCustomFieldValueDto.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


