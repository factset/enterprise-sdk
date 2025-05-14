# FactSet.SDK.Vermilion.Model.CreatedScimUserJSONResponse
Response object for creating a new SCIM user, containing core identity details, contact information, and account settings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schemas** | **List&lt;string&gt;** | Array listing the schema URIs associated with the user resource. | [optional] 
**Id** | **string** | Unique identifier for the newly created user. | [optional] 
**UserName** | **string** | Username used for identifying and logging in the user. | [optional] 
**Name** | [**ScimUserName**](ScimUserName.md) |  | [optional] 
**UserType** | **string** | Type of user. | [optional] 
**PreferredLanguage** | **string** | User&#39;s preferred language. | [optional] 
**Active** | **bool** | Indicates if the user&#39;s account is currently active. | [optional] 
**AuthenticatedUserName** | **string** | Authenticated username used by SSO login. | [optional] 
**Tenant** | **string** | Tenancy code in which the user was created. | [optional] 
**PhoneNumbers** | [**List&lt;ScimPhone&gt;**](ScimPhone.md) | Array of phone numbers for the user, each with a type and value. | [optional] 
**Emails** | [**List&lt;ScimEmail&gt;**](ScimEmail.md) | Array of email addresses linked to the user account. | [optional] 
**Tenancies** | [**List&lt;Tenancy&gt;**](Tenancy.md) | List of tenancies the user is associated with. | [optional] 
**Photos** | [**List&lt;ScimPhoto&gt;**](ScimPhoto.md) | Array of URLs to the user&#39;s profile photos or avatars. | [optional] 
**DomainCode** | **string** | Domain code representing the user&#39;s domain. | [optional] 
**IsAdministrator** | **bool** | Flag indicating if the user has admin privileges. | [optional] 
**Meta** | [**CreatedScimUserJSONResponseMeta**](CreatedScimUserJSONResponseMeta.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

