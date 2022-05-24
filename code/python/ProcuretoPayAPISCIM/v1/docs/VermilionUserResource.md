# VermilionUserResource


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_name** | **str** | A service provider&#39;s unique identifier for the user, typically used by the user to directly authenticate to the service provider. Each User MUST include a non-empty userName value. This identifier MUST be unique across the service provider&#39;s entire set of Users. | [readonly] 
**domain_code** | **str** | Domain code of Enterprise Hosting pod in which user resides. REQUIRED. | 
**is_administrator** | **bool** | Whether the user can perform maintenance on other users. REQUIRED. | 
**schemas** | **[str]** |  | [optional] 
**id** | **str** |  | [optional] [readonly] 
**name** | [**VermilionUserResourceName**](VermilionUserResourceName.md) |  | [optional] 
**display_name** | **str** | The name of the User, suitable for display to end-users. The name SHOULD be the full name of the User being described, if known. | [optional] 
**profile_url** | **str** | A fully qualified URL pointing to a page\\nrepresenting the User&#39;s online profile. | [optional] 
**user_type** | **str** | Used to identify the relationship between the organization and the user. Typical values used might be &#39;Contractor&#39;, &#39;Employee&#39;, &#39;Intern&#39;, &#39;Temp&#39;, &#39;External&#39;, and &#39;Unknown&#39;, but any value may be used. | [optional] 
**preferred_language** | **str** | Indicates the User&#39;s preferred written or spoken language.  Generally used for selecting a localized user interface; e.g., &#39;en_US&#39; specifies the language English and country | [optional] 
**active** | **bool** | A Boolean value indicating the User&#39;s administrative status. | [optional] 
**password** | **str** | The User&#39;s cleartext password. This attribute is intended to be used as a means to specify an initial password when creating a new User or to reset an existing User&#39;s password. | [optional] 
**authenticated_user_name** | **str** | The authenticated user name of the user | [optional] 
**tenant** | **str** | The tenant this user is in | [optional] 
**emails** | [**VermilionUserResourceEmails**](VermilionUserResourceEmails.md) |  | [optional] 
**phone_numbers** | [**[VermilionUserResourcePhoneNumbers]**](VermilionUserResourcePhoneNumbers.md) | Phone numbers for the User. The value SHOULD be canonicalized by the service provider according to the format specified in RFC 3966, e.g., &#39;tel:+1-201-555-0123&#39;. Canonical type values of &#39;work&#39;, &#39;home&#39;, &#39;mobile&#39;, &#39;fax&#39;, &#39;pager&#39; | [optional] 
**photos** | [**[VermilionUserResourcePhotos]**](VermilionUserResourcePhotos.md) | URLs of photos of the User. | [optional] 
**groups** | [**[VermilionUserResourceGroups]**](VermilionUserResourceGroups.md) | A list of groups to which the user belongs, either through direct membership, through nested groups, or dynamically calculated. | [optional] 
**entitlements** | [**VermilionUserResourceEntitlements**](VermilionUserResourceEntitlements.md) |  | [optional] 
**roles** | [**VermilionUserResourceRoles**](VermilionUserResourceRoles.md) |  | [optional] 
**meta** | [**VermilionUserResourceMeta**](VermilionUserResourceMeta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


