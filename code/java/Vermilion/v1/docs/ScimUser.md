

# ScimUser

A user object representing identity information, including attributes like username, email, with links for retrieving additional group details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **java.util.List&lt;String&gt;** | Array of schema URIs applicable to this resource. |  [optional]
**id** | **String** | Unique identifier for the user. |  [optional]
**userName** | **String** | Username used for identifying and logging in the user. |  [optional]
**name** | [**ScimUserName**](ScimUserName.md) |  |  [optional]
**userType** | **String** | Type of user. |  [optional]
**active** | **Boolean** | Indicates whether the user account is active. |  [optional]
**authenticatedUserName** | **String** | Authenticated username used for the SSO logins. |  [optional]
**tenant** | **String** | Tenancy code in which user was created. |  [optional]
**phoneNumbers** | [**java.util.List&lt;ScimPhone&gt;**](ScimPhone.md) | Array of phone numbers associated with the user. |  [optional]
**emails** | [**java.util.List&lt;ScimEmail&gt;**](ScimEmail.md) | Array of email addresses linked to the user account. |  [optional]
**photos** | [**java.util.List&lt;ScimPhoto&gt;**](ScimPhoto.md) | Array of URLs to the user&#39;s profile pictures. |  [optional]
**tenancies** | [**java.util.List&lt;Tenancy&gt;**](Tenancy.md) | Array of tenancies assigned to the user. |  [optional]
**groups** | [**java.util.List&lt;ScimUserGroup&gt;**](ScimUserGroup.md) | Array of groups/roles assigned to the user. |  [optional]
**domainCode** | **String** | Domain code representing the user&#39;s domain. |  [optional]
**isAdministrator** | **Boolean** | Flag indicating if the user has admin privileges. |  [optional]
**meta** | [**ScimMeta**](ScimMeta.md) |  |  [optional]


## Implemented Interfaces

* Serializable


