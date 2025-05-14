# FactSet.SDK.Vermilion.Model.ScimUser
A user object representing identity information, including attributes like username, email, with links for retrieving additional group details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schemas** | **List&lt;string&gt;** | Array of schema URIs applicable to this resource. | [optional] 
**Id** | **string** | Unique identifier for the user. | [optional] 
**UserName** | **string** | Username used for identifying and logging in the user. | [optional] 
**Name** | [**ScimUserName**](ScimUserName.md) |  | [optional] 
**UserType** | **string** | Type of user. | [optional] 
**Active** | **bool** | Indicates whether the user account is active. | [optional] 
**AuthenticatedUserName** | **string** | Authenticated username used for the SSO logins. | [optional] 
**Tenant** | **string** | Tenancy code in which user was created. | [optional] 
**PhoneNumbers** | [**List&lt;ScimPhone&gt;**](ScimPhone.md) | Array of phone numbers associated with the user. | [optional] 
**Emails** | [**List&lt;ScimEmail&gt;**](ScimEmail.md) | Array of email addresses linked to the user account. | [optional] 
**Photos** | [**List&lt;ScimPhoto&gt;**](ScimPhoto.md) | Array of URLs to the user&#39;s profile pictures. | [optional] 
**Tenancies** | [**List&lt;Tenancy&gt;**](Tenancy.md) | Array of tenancies assigned to the user. | [optional] 
**Groups** | [**List&lt;ScimUserGroup&gt;**](ScimUserGroup.md) | Array of groups/roles assigned to the user. | [optional] 
**DomainCode** | **string** | Domain code representing the user&#39;s domain. | [optional] 
**IsAdministrator** | **bool** | Flag indicating if the user has admin privileges. | [optional] 
**Meta** | [**ScimMeta**](ScimMeta.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

