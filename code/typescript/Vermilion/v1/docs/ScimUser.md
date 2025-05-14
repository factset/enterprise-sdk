# vermilion.ScimUser

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **[String]** | Array of schema URIs applicable to this resource. | [optional] 
**id** | **String** | Unique identifier for the user. | [optional] 
**userName** | **String** | Username used for identifying and logging in the user. | [optional] 
**name** | [**ScimUserName**](ScimUserName.md) |  | [optional] 
**userType** | **String** | Type of user. | [optional] 
**active** | **Boolean** | Indicates whether the user account is active. | [optional] 
**authenticatedUserName** | **String** | Authenticated username used for the SSO logins. | [optional] 
**tenant** | **String** | Tenancy code in which user was created. | [optional] 
**phoneNumbers** | [**[ScimPhone]**](ScimPhone.md) | Array of phone numbers associated with the user. | [optional] 
**emails** | [**[ScimEmail]**](ScimEmail.md) | Array of email addresses linked to the user account. | [optional] 
**photos** | [**[ScimPhoto]**](ScimPhoto.md) | Array of URLs to the user&#39;s profile pictures. | [optional] 
**tenancies** | [**[Tenancy]**](Tenancy.md) | Array of tenancies assigned to the user. | [optional] 
**groups** | [**[ScimUserGroup]**](ScimUserGroup.md) | Array of groups/roles assigned to the user. | [optional] 
**domainCode** | **String** | Domain code representing the user&#39;s domain. | [optional] 
**isAdministrator** | **Boolean** | Flag indicating if the user has admin privileges. | [optional] 
**meta** | [**ScimMeta**](ScimMeta.md) |  | [optional] 


