# ContactSummaryDto


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | A guid that identifies the contact for further interactions | [optional] 
**irn_person_id** | **str, none_type** | A Unique ticker with suffix -x that identifies the contact, which can be used in identifier lookup to tag the contact | [optional] 
**primary_email_address** | **str, none_type** |  | [optional] 
**identifier** | **str, none_type** |  | [optional] 
**full_name** | **str, none_type** |  | [optional] 
**employer_name** | **str, none_type** |  | [optional] 
**employer_identifier** | **str, none_type** |  | [optional] 
**city** | **str, none_type** |  | [optional] 
**state_province** | **str, none_type** |  | [optional] 
**postal_code** | **str, none_type** |  | [optional] 
**country** | **str, none_type** |  | [optional] 
**role** | [**ContactRoleDto**](ContactRoleDto.md) |  | [optional] 
**type** | [**ContactTypeDto**](ContactTypeDto.md) |  | [optional] 
**is_deleted** | **bool** |  | [optional] 
**last_meeting** | **str, none_type** |  | [optional] 
**alternative_email_addresses** | [**[AlternativeEmailAddressDto], none_type**](AlternativeEmailAddressDto.md) |  | [optional] 
**custom_field_values** | [**[ContactCustomFieldValueDto], none_type**](ContactCustomFieldValueDto.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


