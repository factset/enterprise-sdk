

# ScimGroupPatchRequestBody

Defines the request payload for updating a group's attributes in SCIM. This patch operation allows for specific modifications to a group's properties.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **java.util.List&lt;String&gt;** | An array of URIs representing the schema namespaces applied to this request. |  [optional]
**operations** | [**java.util.List&lt;ScimGroupPatchOperation&gt;**](ScimGroupPatchOperation.md) | A list of operations specifying the actions to perform on the group&#39;s attributes, such as adding, removing, or updating members. |  [optional]


## Implemented Interfaces

* Serializable


