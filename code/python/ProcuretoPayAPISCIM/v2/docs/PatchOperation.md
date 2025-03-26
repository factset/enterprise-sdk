# PatchOperation

An individual PATCH operation that is part of a PATCH request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**op** | **str** | Indicates the HTTP PATCH operation to perform. For details on the \&quot;add\&quot; operation, see RFC 7644 section 3.5.2.1. For details on the \&quot;remove\&quot; operation, see RFC 7644 section 3.5.2.2. For details on the \&quot;replace\&quot; operation, see RFC 7644 section 3.5.2.3. | [optional] 
**path** | **str** | Describes the target of the HTTP PATCH operation. This is optional for \&quot;add\&quot; and \&quot;replace\&quot; operations and is required for \&quot;remove\&quot; operations. | [optional] 
**value** | [**PatchOperationValue**](PatchOperationValue.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


