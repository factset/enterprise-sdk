# FactSet.SDK.ProcuretoPayAPISCIM.Model.VermilionUserResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schemas** | **List&lt;string&gt;** |  | [optional] 
**Id** | **string** |  | [optional] [readonly] 
**UserName** | **string** | A service provider&#39;s unique identifier for the user, typically used by the user to directly authenticate to the service provider. Each User MUST include a non-empty userName value. This identifier MUST be unique across the service provider&#39;s entire set of Users. | [readonly] 
**Name** | [**VermilionUserResourceName**](VermilionUserResourceName.md) |  | [optional] 
**DisplayName** | **string** | The name of the User, suitable for display to end-users. The name SHOULD be the full name of the User being described, if known. | [optional] 
**ProfileUrl** | **string** | A fully qualified URL pointing to a page\\nrepresenting the User&#39;s online profile. | [optional] 
**UserType** | **string** | Used to identify the relationship between the organization and the user. Typical values used might be &#39;Contractor&#39;, &#39;Employee&#39;, &#39;Intern&#39;, &#39;Temp&#39;, &#39;External&#39;, and &#39;Unknown&#39;, but any value may be used. | [optional] 
**PreferredLanguage** | **string** | Indicates the User&#39;s preferred written or spoken language.  Generally used for selecting a localized user interface; e.g., &#39;en_US&#39; specifies the language English and country | [optional] 
**Active** | **bool** | A Boolean value indicating the User&#39;s administrative status. | [optional] 
**Password** | **string** | The User&#39;s cleartext password. This attribute is intended to be used as a means to specify an initial password when creating a new User or to reset an existing User&#39;s password. | [optional] 
**AuthenticatedUserName** | **string** | The authenticated user name of the user | [optional] 
**Tenant** | **string** | The tenant this user is in | [optional] 
**Emails** | [**VermilionUserResourceEmails**](VermilionUserResourceEmails.md) |  | [optional] 
**PhoneNumbers** | [**List&lt;VermilionUserResourcePhoneNumbers&gt;**](VermilionUserResourcePhoneNumbers.md) | Phone numbers for the User. The value SHOULD be canonicalized by the service provider according to the format specified in RFC 3966, e.g., &#39;tel:+1-201-555-0123&#39;. Canonical type values of &#39;work&#39;, &#39;home&#39;, &#39;mobile&#39;, &#39;fax&#39;, &#39;pager&#39; | [optional] 
**Photos** | [**List&lt;VermilionUserResourcePhotos&gt;**](VermilionUserResourcePhotos.md) | URLs of photos of the User. | [optional] 
**Groups** | [**List&lt;VermilionUserResourceGroups&gt;**](VermilionUserResourceGroups.md) | A list of groups to which the user belongs, either through direct membership, through nested groups, or dynamically calculated. | [optional] 
**Entitlements** | [**VermilionUserResourceEntitlements**](VermilionUserResourceEntitlements.md) |  | [optional] 
**Roles** | [**VermilionUserResourceRoles**](VermilionUserResourceRoles.md) |  | [optional] 
**DomainCode** | **string** | Domain code of Enterprise Hosting pod in which user resides. REQUIRED. | 
**IsAdministrator** | **bool** | Whether the user can perform maintenance on other users. REQUIRED. | 
**Meta** | [**VermilionUserResourceMeta**](VermilionUserResourceMeta.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

