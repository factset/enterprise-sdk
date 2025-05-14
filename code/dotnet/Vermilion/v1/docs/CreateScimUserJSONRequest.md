# FactSet.SDK.Vermilion.Model.CreateScimUserJSONRequest
Payload to create a new user in the system, including attributes like username, password, contact information, and tenant details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserName** | **string** | Unique identifier for the user within the system, typically their loginID. | [optional] 
**Password** | **string** | Password associated with the user&#39;s account for authentication. | [optional] 
**Name** | [**CreateScimUserJSONRequestName**](CreateScimUserJSONRequestName.md) |  | [optional] 
**PreferredLanguage** | **string** | The preferred language of the user. | [optional] 
**Active** | **bool** | Indicates whether the user account is active. | [optional] 
**AuthenticatedUserName** | **string** | Authenticated username used by the SSO logins. | [optional] 
**Tenant** | **string** | Tenancy code in which user should be created. | [optional] 
**DomainCode** | **string** | Domain associated with the user | [optional] 
**PhoneNumbers** | [**List&lt;ScimPhone&gt;**](ScimPhone.md) | A list of phone numbers associated with the user. | [optional] 
**Emails** | [**List&lt;ScimEmail&gt;**](ScimEmail.md) | A list of email addresses associated with the user. | [optional] 
**Photos** | [**List&lt;ScimPhoto&gt;**](ScimPhoto.md) | A list of profile photos or images associated with the user. | [optional] 
**Tenancies** | [**List&lt;Tenancy&gt;**](Tenancy.md) | A list of tenancies that need to be assigned to the user. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

