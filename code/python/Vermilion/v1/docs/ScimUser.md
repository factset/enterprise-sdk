# ScimUser

A user object representing identity information, including attributes like username, email, with links for retrieving additional group details.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **[str]** | Array of schema URIs applicable to this resource. | [optional] 
**id** | **str** | Unique identifier for the user. | [optional] 
**user_name** | **str** | Username used for identifying and logging in the user. | [optional] 
**name** | [**ScimUserName**](ScimUserName.md) |  | [optional] 
**user_type** | **str** | Type of user. | [optional] 
**active** | **bool** | Indicates whether the user account is active. | [optional] 
**authenticated_user_name** | **str** | Authenticated username used for the SSO logins. | [optional] 
**tenant** | **str** | Tenancy code in which user was created. | [optional] 
**phone_numbers** | [**[ScimPhone]**](ScimPhone.md) | Array of phone numbers associated with the user. | [optional] 
**emails** | [**[ScimEmail]**](ScimEmail.md) | Array of email addresses linked to the user account. | [optional] 
**photos** | [**[ScimPhoto]**](ScimPhoto.md) | Array of URLs to the user&#39;s profile pictures. | [optional] 
**tenancies** | [**[Tenancy]**](Tenancy.md) | Array of tenancies assigned to the user. | [optional] 
**groups** | [**[ScimUserGroup]**](ScimUserGroup.md) | Array of groups/roles assigned to the user. | [optional] 
**domain_code** | **str** | Domain code representing the user&#39;s domain. | [optional] 
**is_administrator** | **bool** | Flag indicating if the user has admin privileges. | [optional] 
**meta** | [**ScimMeta**](ScimMeta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


