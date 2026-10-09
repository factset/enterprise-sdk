# FactSet.SDK.FactSetNER.Model.OutputItemError
Structured error describing why this input failed to process, or null if processing succeeded. Follows the standard partial-errors-in-list-responses convention: each item's error attribute is either an error object or null, never an array or a plain string. Note: Entity-level lookup failures are tracked separately in lookupStatuses, not in this error field. This field only contains input-level processing errors. Shares the same shape as HTTPError (code, detail, id, source, title). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Error code following the Message Serialization standard (e.g., notAuthenticated, notAuthorized, parameterError, genericServerError). | 
**Detail** | **string** | Detailed description of the error, providing additional context beyond the title. | [optional] 
**Id** | **Guid** | Unique identifier (UUID) for this error occurrence, useful for debugging and support inquiries. | 
**Source** | [**ErrorSource**](ErrorSource.md) |  | [optional] 
**Title** | **string** | Human-readable error title or summary. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

