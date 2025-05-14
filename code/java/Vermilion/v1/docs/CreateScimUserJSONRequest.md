

# CreateScimUserJSONRequest

Payload to create a new user in the system, including attributes like username, password, contact information, and tenant details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userName** | **String** | Unique identifier for the user within the system, typically their loginID. |  [optional]
**password** | **String** | Password associated with the user&#39;s account for authentication. |  [optional]
**name** | [**CreateScimUserJSONRequestName**](CreateScimUserJSONRequestName.md) |  |  [optional]
**preferredLanguage** | **String** | The preferred language of the user. |  [optional]
**active** | **Boolean** | Indicates whether the user account is active. |  [optional]
**authenticatedUserName** | **String** | Authenticated username used by the SSO logins. |  [optional]
**tenant** | **String** | Tenancy code in which user should be created. |  [optional]
**domainCode** | **String** | Domain associated with the user |  [optional]
**phoneNumbers** | [**java.util.List&lt;ScimPhone&gt;**](ScimPhone.md) | A list of phone numbers associated with the user. |  [optional]
**emails** | [**java.util.List&lt;ScimEmail&gt;**](ScimEmail.md) | A list of email addresses associated with the user. |  [optional]
**photos** | [**java.util.List&lt;ScimPhoto&gt;**](ScimPhoto.md) | A list of profile photos or images associated with the user. |  [optional]
**tenancies** | [**java.util.List&lt;Tenancy&gt;**](Tenancy.md) | A list of tenancies that need to be assigned to the user. |  [optional]


## Implemented Interfaces

* Serializable


