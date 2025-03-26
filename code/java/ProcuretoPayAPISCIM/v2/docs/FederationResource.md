

# FederationResource

Represents an authentication relationship between FactSet and a client firm for web technologies that facilitate single sign-on (SSO) access to FactSet services, such as SAML.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **java.util.List&lt;String&gt;** | A list of schema URIs in use by the resource. |  [optional]
**id** | **java.util.UUID** | The Globally Unique Identifier (GUID) of the federation. |  [optional] [readonly]
**name** | **String** | Name of federation. |  [readonly]
**entityId** | **String** | The entity identifier of the corresponding identity provider. |  [readonly]
**metadataUrl** | **String** | Public link to the IdP&#39;s metadata.xml. |  [optional] [readonly]
**singleSignOnServiceUrl** | **String** | Destination client browsers are directed to, at the IdP, for Single Sign-on Protocol Message exchange. |  [readonly]
**requestBinding** | **String** | Preferred HTTP method for IdP&#39;s singleSignOnServiceUrl destination. |  [readonly]
**certificates** | **java.util.List&lt;byte[]&gt;** | Public x509 certificate values the Service Provider can expect Single Sign-on messages to be signed with from the IdP. |  [readonly]
**location** | [**FederationResourceLocation**](FederationResourceLocation.md) |  | 
**autoSyncUsernames** | **java.util.List&lt;String&gt;** | List of FactSet usernames automatically mapped into the federation with email address expected as contents of &#39;nameID&#39;. |  [optional] [readonly]
**users** | [**java.util.List&lt;FederationResourceUser&gt;**](FederationResourceUser.md) | A list of mappings for users between their assertion value(s) as provided by this identity provider and their corresponding FactSet username-serial. |  [optional]


## Implemented Interfaces

* Serializable


