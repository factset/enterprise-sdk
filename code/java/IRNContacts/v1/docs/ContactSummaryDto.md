

# ContactSummaryDto


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | A guid that identifies the contact for further interactions |  [optional]
**irnPersonId** | **String** | A Unique ticker with suffix -x that identifies the contact, which can be used in identifier lookup to tag the contact |  [optional]
**primaryEmailAddress** | **String** |  |  [optional]
**identifier** | **String** |  |  [optional]
**fullName** | **String** |  |  [optional]
**employerName** | **String** |  |  [optional]
**employerIdentifier** | **String** |  |  [optional]
**city** | **String** |  |  [optional]
**stateProvince** | **String** |  |  [optional]
**postalCode** | **String** |  |  [optional]
**country** | **String** |  |  [optional]
**role** | [**ContactRoleDto**](ContactRoleDto.md) |  |  [optional]
**type** | [**ContactTypeDto**](ContactTypeDto.md) |  |  [optional]
**isDeleted** | **Boolean** |  |  [optional]
**lastMeeting** | **String** |  |  [optional]
**alternativeEmailAddresses** | [**java.util.List&lt;AlternativeEmailAddressDto&gt;**](AlternativeEmailAddressDto.md) |  |  [optional]
**customFieldValues** | [**java.util.List&lt;ContactCustomFieldValueDto&gt;**](ContactCustomFieldValueDto.md) |  |  [optional]


## Implemented Interfaces

* Serializable


