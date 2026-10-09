# FactSet.SDK.FactSetNER.Model.HTTPError
Standard HTTP error details including code, message, unique identifier, and source location.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Error code following the Message Serialization standard (e.g., notAuthenticated, notAuthorized, parameterError, genericServerError). | 
**Detail** | **string** | Detailed description of the error, providing additional context beyond the title. | [optional] 
**Id** | **Guid** | Unique identifier (UUID) for this error occurrence, useful for debugging and support inquiries. | 
**Source** | [**ErrorSource**](ErrorSource.md) |  | [optional] 
**Title** | **string** | Human-readable error title or summary. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

