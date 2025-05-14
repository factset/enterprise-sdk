

# ScimUserPatchRequestBody

Defines the request payload for updating a user's attributes. The patch operation modifies specific fields of a user.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **java.util.List&lt;String&gt;** | A list of URIs that indicate the namespaces of the schema used in this request. |  [optional]
**operations** | [**java.util.List&lt;ScimUserPatchOperation&gt;**](ScimUserPatchOperation.md) | A list of operations defining the specific changes to apply to the user&#39;s attributes. Each operation specifies an action (e.g., add, remove, replace) the target attribute and value |  [optional]


## Implemented Interfaces

* Serializable


