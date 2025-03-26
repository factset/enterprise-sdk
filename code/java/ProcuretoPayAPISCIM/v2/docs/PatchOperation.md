

# PatchOperation

An individual PATCH operation that is part of a PATCH request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**op** | [**OpEnum**](#OpEnum) | Indicates the HTTP PATCH operation to perform. For details on the \&quot;add\&quot; operation, see RFC 7644 section 3.5.2.1. For details on the \&quot;remove\&quot; operation, see RFC 7644 section 3.5.2.2. For details on the \&quot;replace\&quot; operation, see RFC 7644 section 3.5.2.3. |  [optional]
**path** | **String** | Describes the target of the HTTP PATCH operation. This is optional for \&quot;add\&quot; and \&quot;replace\&quot; operations and is required for \&quot;remove\&quot; operations. |  [optional]
**value** | [**PatchOperationValue**](PatchOperationValue.md) |  |  [optional]



## Enum: OpEnum

Name | Value
---- | -----
ADD | &quot;add&quot;
REMOVE | &quot;remove&quot;
REPLACE | &quot;replace&quot;


## Implemented Interfaces

* Serializable


