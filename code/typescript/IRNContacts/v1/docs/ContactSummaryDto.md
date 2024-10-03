# irncontacts.ContactSummaryDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A guid that identifies the contact for further interactions | [optional] 
**irnPersonId** | **String** | A Unique ticker with suffix -x that identifies the contact, which can be used in identifier lookup to tag the contact | [optional] 
**primaryEmailAddress** | **String** |  | [optional] 
**identifier** | **String** |  | [optional] 
**fullName** | **String** |  | [optional] 
**employerName** | **String** |  | [optional] 
**employerIdentifier** | **String** |  | [optional] 
**city** | **String** |  | [optional] 
**stateProvince** | **String** |  | [optional] 
**postalCode** | **String** |  | [optional] 
**country** | **String** |  | [optional] 
**role** | [**ContactRoleDto**](ContactRoleDto.md) |  | [optional] 
**type** | [**ContactTypeDto**](ContactTypeDto.md) |  | [optional] 
**isDeleted** | **Boolean** |  | [optional] 
**lastMeeting** | **String** |  | [optional] 
**alternativeEmailAddresses** | [**[AlternativeEmailAddressDto]**](AlternativeEmailAddressDto.md) |  | [optional] 
**customFieldValues** | [**[ContactCustomFieldValueDto]**](ContactCustomFieldValueDto.md) |  | [optional] 


