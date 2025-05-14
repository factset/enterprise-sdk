# vermilion.CreatedScimUserJSONResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **[String]** | Array listing the schema URIs associated with the user resource. | [optional] 
**id** | **String** | Unique identifier for the newly created user. | [optional] 
**userName** | **String** | Username used for identifying and logging in the user. | [optional] 
**name** | [**ScimUserName**](ScimUserName.md) |  | [optional] 
**userType** | **String** | Type of user. | [optional] 
**preferredLanguage** | **String** | User&#39;s preferred language. | [optional] 
**active** | **Boolean** | Indicates if the user&#39;s account is currently active. | [optional] 
**authenticatedUserName** | **String** | Authenticated username used by SSO login. | [optional] 
**tenant** | **String** | Tenancy code in which the user was created. | [optional] 
**phoneNumbers** | [**[ScimPhone]**](ScimPhone.md) | Array of phone numbers for the user, each with a type and value. | [optional] 
**emails** | [**[ScimEmail]**](ScimEmail.md) | Array of email addresses linked to the user account. | [optional] 
**tenancies** | [**[Tenancy]**](Tenancy.md) | List of tenancies the user is associated with. | [optional] 
**photos** | [**[ScimPhoto]**](ScimPhoto.md) | Array of URLs to the user&#39;s profile photos or avatars. | [optional] 
**domainCode** | **String** | Domain code representing the user&#39;s domain. | [optional] 
**isAdministrator** | **Boolean** | Flag indicating if the user has admin privileges. | [optional] 
**meta** | [**CreatedScimUserJSONResponseMeta**](CreatedScimUserJSONResponseMeta.md) |  | [optional] 


