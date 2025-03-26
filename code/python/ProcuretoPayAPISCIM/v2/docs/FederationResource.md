# FederationResource

Represents an authentication relationship between FactSet and a client firm for web technologies that facilitate single sign-on (SSO) access to FactSet services, such as SAML.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of federation. | [readonly] 
**entity_id** | **str** | The entity identifier of the corresponding identity provider. | [readonly] 
**single_sign_on_service_url** | **str** | Destination client browsers are directed to, at the IdP, for Single Sign-on Protocol Message exchange. | [readonly] 
**request_binding** | **str** | Preferred HTTP method for IdP&#39;s singleSignOnServiceUrl destination. | [readonly] 
**certificates** | **[str]** | Public x509 certificate values the Service Provider can expect Single Sign-on messages to be signed with from the IdP. | [readonly] 
**location** | [**FederationResourceLocation**](FederationResourceLocation.md) |  | 
**schemas** | **[str]** | A list of schema URIs in use by the resource. | [optional] 
**id** | **str** | The Globally Unique Identifier (GUID) of the federation. | [optional] [readonly] 
**metadata_url** | **str** | Public link to the IdP&#39;s metadata.xml. | [optional] [readonly] 
**auto_sync_usernames** | **[str]** | List of FactSet usernames automatically mapped into the federation with email address expected as contents of &#39;nameID&#39;. | [optional] [readonly] 
**users** | [**[FederationResourceUser]**](FederationResourceUser.md) | A list of mappings for users between their assertion value(s) as provided by this identity provider and their corresponding FactSet username-serial. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


