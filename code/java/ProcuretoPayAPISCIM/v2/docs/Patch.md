

# Patch

The request body used for the HTTP PATCH server function (see RFC 7644 section 3.5.2.) This can be used to alter an individual SCIM resource.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | [**java.util.List&lt;SchemasEnum&gt;**](#java.util.List&lt;SchemasEnum&gt;) | An array containing the standard schema URI used for SCIM PATCH requests. |  [optional]
**operations** | [**java.util.List&lt;PatchOperation&gt;**](PatchOperation.md) | The list of PATCH operations that should be applied for the PATCH request. |  [optional]



## Enum: java.util.List&lt;SchemasEnum&gt;

Name | Value
---- | -----
URN_IETF_PARAMS_SCIM_API_MESSAGES_2_0_PATCHOP | &quot;urn:ietf:params:scim:api:messages:2.0:PatchOp&quot;


## Implemented Interfaces

* Serializable


