

# GroupResource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **java.util.List&lt;String&gt;** |  |  [optional]
**id** | **String** |  |  [optional] [readonly]
**externalId** | **String** | An arbitrary identifier for the resource defined by the client. This can assist the client locate the resource through the use of search filters. |  [optional]
**displayName** | **String** | A human-readable name for the Group. |  [optional]
**description** | **String** | A description for the Group. |  [optional]
**members** | [**java.util.List&lt;GroupResourceMember&gt;**](GroupResourceMember.md) | A list of members of the Group. |  [optional]
**urnColonScimColonSchemasColonExtensionColonFactSetColonEnterpriseHostingColon10ColonGroup** | [**GroupResourceUrnScimSchemasExtensionFactSetEnterpriseHosting10Group**](GroupResourceUrnScimSchemasExtensionFactSetEnterpriseHosting10Group.md) |  |  [optional]
**urnColonScimColonSchemasColonExtensionColonFactSetColonVRSColon10ColonGroup** | [**GroupResourceUrnScimSchemasExtensionFactSetVRS10Group**](GroupResourceUrnScimSchemasExtensionFactSetVRS10Group.md) |  |  [optional]
**meta** | [**GroupResourceMeta**](GroupResourceMeta.md) |  |  [optional]


## Implemented Interfaces

* Serializable


