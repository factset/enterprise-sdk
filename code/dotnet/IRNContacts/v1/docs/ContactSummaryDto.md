# FactSet.SDK.IRNContacts.Model.ContactSummaryDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Guid** | A guid that identifies the contact for further interactions | [optional] 
**IrnPersonId** | **string** | A Unique ticker with suffix -x that identifies the contact, which can be used in identifier lookup to tag the contact | [optional] 
**PrimaryEmailAddress** | **string** |  | [optional] 
**Identifier** | **string** |  | [optional] 
**FullName** | **string** |  | [optional] 
**EmployerName** | **string** |  | [optional] 
**EmployerIdentifier** | **string** |  | [optional] 
**City** | **string** |  | [optional] 
**StateProvince** | **string** |  | [optional] 
**PostalCode** | **string** |  | [optional] 
**Country** | **string** |  | [optional] 
**Role** | [**ContactRoleDto**](ContactRoleDto.md) |  | [optional] 
**Type** | [**ContactTypeDto**](ContactTypeDto.md) |  | [optional] 
**IsDeleted** | **bool** |  | [optional] 
**LastMeeting** | **string** |  | [optional] 
**AlternativeEmailAddresses** | [**List&lt;AlternativeEmailAddressDto&gt;**](AlternativeEmailAddressDto.md) |  | [optional] 
**CustomFieldValues** | [**List&lt;ContactCustomFieldValueDto&gt;**](ContactCustomFieldValueDto.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

