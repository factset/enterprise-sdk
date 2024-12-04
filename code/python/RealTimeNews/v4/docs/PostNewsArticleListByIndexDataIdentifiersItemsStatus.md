# PostNewsArticleListByIndexDataIdentifiersItemsStatus

Error status for the requested identifier.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str, none_type** | Code of the error condition. | Value | Description | | --- | --- | | none | No error. | | parameter | The provided identifier does not refer to a valid listing level identifier. | | entitlement | Not entitled to see data for the identifier. | | identifierMapping | Unable to resolve the provided identifier. |   | [optional] 
**identifier** | **str, none_type** | Provided identifier. | [optional] 
**details** | **str, none_type** | A human-readable, unstructured explanation specific to this occurrence of the problem. | [optional] 
**encrypted_details** | **str, none_type** | Base64-encoded internal details about the error. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


