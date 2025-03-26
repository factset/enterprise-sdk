# FactSet.SDK.ProcuretoPayAPISCIM.Model.FederationResource
Represents an authentication relationship between FactSet and a client firm for web technologies that facilitate single sign-on (SSO) access to FactSet services, such as SAML.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Schemas** | **List&lt;string&gt;** | A list of schema URIs in use by the resource. | [optional] 
**Id** | **Guid** | The Globally Unique Identifier (GUID) of the federation. | [optional] [readonly] 
**Name** | **string** | Name of federation. | [readonly] 
**EntityId** | **string** | The entity identifier of the corresponding identity provider. | [readonly] 
**MetadataUrl** | **string** | Public link to the IdP&#39;s metadata.xml. | [optional] [readonly] 
**SingleSignOnServiceUrl** | **string** | Destination client browsers are directed to, at the IdP, for Single Sign-on Protocol Message exchange. | [readonly] 
**RequestBinding** | **string** | Preferred HTTP method for IdP&#39;s singleSignOnServiceUrl destination. | [readonly] 
**Certificates** | **List&lt;byte[]&gt;** | Public x509 certificate values the Service Provider can expect Single Sign-on messages to be signed with from the IdP. | [readonly] 
**Location** | [**FederationResourceLocation**](FederationResourceLocation.md) |  | 
**AutoSyncUsernames** | **List&lt;string&gt;** | List of FactSet usernames automatically mapped into the federation with email address expected as contents of &#39;nameID&#39;. | [optional] [readonly] 
**Users** | [**List&lt;FederationResourceUser&gt;**](FederationResourceUser.md) | A list of mappings for users between their assertion value(s) as provided by this identity provider and their corresponding FactSet username-serial. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

