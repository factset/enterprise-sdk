# FactSet.SDK.RealTimeNews.Model.PostNewsArticleListByInstrumentDataIdentifiersItemsStatus
Error status for the requested identifier.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Code of the error condition. | Value | Description | | - -- | - -- | | none | No error. | | parameter | The provided identifier does not refer to a valid instrument level identifier. | | entitlement | Not entitled to see data for the identifier. | | identifierMapping | Unable to resolve the provided identifier. |   | [optional] 
**Identifier** | **string** | Provided identifier. | [optional] 
**Details** | **string** | A human-readable, unstructured explanation specific to this occurrence of the problem. | [optional] 
**EncryptedDetails** | **string** | Base64-encoded internal details about the error. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

