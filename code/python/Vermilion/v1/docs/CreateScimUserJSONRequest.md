# CreateScimUserJSONRequest

Payload to create a new user in the system, including attributes like username, password, contact information, and tenant details.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_name** | **str** | Unique identifier for the user within the system, typically their loginID. | [optional] 
**password** | **str** | Password associated with the user&#39;s account for authentication. | [optional] 
**name** | [**CreateScimUserJSONRequestName**](CreateScimUserJSONRequestName.md) |  | [optional] 
**preferred_language** | **str** | The preferred language of the user. | [optional] 
**active** | **bool** | Indicates whether the user account is active. | [optional] 
**authenticated_user_name** | **str** | Authenticated username used by the SSO logins. | [optional] 
**tenant** | **str** | Tenancy code in which user should be created. | [optional] 
**domain_code** | **str** | Domain associated with the user | [optional] 
**phone_numbers** | [**[ScimPhone]**](ScimPhone.md) | A list of phone numbers associated with the user. | [optional] 
**emails** | [**[ScimEmail]**](ScimEmail.md) | A list of email addresses associated with the user. | [optional] 
**photos** | [**[ScimPhoto]**](ScimPhoto.md) | A list of profile photos or images associated with the user. | [optional] 
**tenancies** | [**[Tenancy]**](Tenancy.md) | A list of tenancies that need to be assigned to the user. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


