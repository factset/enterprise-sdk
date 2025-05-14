# CreatedScimUserJSONResponse

Response object for creating a new SCIM user, containing core identity details, contact information, and account settings.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **[str]** | Array listing the schema URIs associated with the user resource. | [optional] 
**id** | **str** | Unique identifier for the newly created user. | [optional] 
**user_name** | **str** | Username used for identifying and logging in the user. | [optional] 
**name** | [**ScimUserName**](ScimUserName.md) |  | [optional] 
**user_type** | **str** | Type of user. | [optional] 
**preferred_language** | **str** | User&#39;s preferred language. | [optional] 
**active** | **bool** | Indicates if the user&#39;s account is currently active. | [optional] 
**authenticated_user_name** | **str** | Authenticated username used by SSO login. | [optional] 
**tenant** | **str** | Tenancy code in which the user was created. | [optional] 
**phone_numbers** | [**[ScimPhone]**](ScimPhone.md) | Array of phone numbers for the user, each with a type and value. | [optional] 
**emails** | [**[ScimEmail]**](ScimEmail.md) | Array of email addresses linked to the user account. | [optional] 
**tenancies** | [**[Tenancy]**](Tenancy.md) | List of tenancies the user is associated with. | [optional] 
**photos** | [**[ScimPhoto]**](ScimPhoto.md) | Array of URLs to the user&#39;s profile photos or avatars. | [optional] 
**domain_code** | **str** | Domain code representing the user&#39;s domain. | [optional] 
**is_administrator** | **bool** | Flag indicating if the user has admin privileges. | [optional] 
**meta** | [**CreatedScimUserJSONResponseMeta**](CreatedScimUserJSONResponseMeta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


