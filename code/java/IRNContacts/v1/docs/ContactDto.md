

# ContactDto


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** |  |  [optional]
**primaryEmailAddress** | **String** |  |  [optional]
**identifier** | **String** |  |  [optional]
**fullName** | **String** |  |  [optional]
**address** | [**ContactAddressDto**](ContactAddressDto.md) |  |  [optional]
**linkedInProfile** | **String** |  |  [optional]
**isDeleted** | **Boolean** |  |  [optional]
**employer** | [**EmployerDto**](EmployerDto.md) |  |  [optional]
**role** | [**ContactRoleDto**](ContactRoleDto.md) |  |  [optional]
**type** | [**ContactTypeDto**](ContactTypeDto.md) |  |  [optional]
**phoneNumbers** | [**java.util.List&lt;ContactPhoneDto&gt;**](ContactPhoneDto.md) |  |  [optional]
**alternativeEmailAddresses** | [**java.util.List&lt;AlternativeEmailAddressDto&gt;**](AlternativeEmailAddressDto.md) |  |  [optional]
**customFields** | [**java.util.List&lt;ContactCustomFieldValueDto&gt;**](ContactCustomFieldValueDto.md) |  |  [optional]


## Implemented Interfaces

* Serializable


