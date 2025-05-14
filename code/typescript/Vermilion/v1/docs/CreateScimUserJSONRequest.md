# vermilion.CreateScimUserJSONRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userName** | **String** | Unique identifier for the user within the system, typically their loginID. | [optional] 
**password** | **String** | Password associated with the user&#39;s account for authentication. | [optional] 
**name** | [**CreateScimUserJSONRequestName**](CreateScimUserJSONRequestName.md) |  | [optional] 
**preferredLanguage** | **String** | The preferred language of the user. | [optional] 
**active** | **Boolean** | Indicates whether the user account is active. | [optional] 
**authenticatedUserName** | **String** | Authenticated username used by the SSO logins. | [optional] 
**tenant** | **String** | Tenancy code in which user should be created. | [optional] 
**domainCode** | **String** | Domain associated with the user | [optional] 
**phoneNumbers** | [**[ScimPhone]**](ScimPhone.md) | A list of phone numbers associated with the user. | [optional] 
**emails** | [**[ScimEmail]**](ScimEmail.md) | A list of email addresses associated with the user. | [optional] 
**photos** | [**[ScimPhoto]**](ScimPhoto.md) | A list of profile photos or images associated with the user. | [optional] 
**tenancies** | [**[Tenancy]**](Tenancy.md) | A list of tenancies that need to be assigned to the user. | [optional] 


