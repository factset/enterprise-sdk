

# OutputItemError

Structured error describing why this input failed to process, or null if processing succeeded. Follows the standard partial-errors-in-list-responses convention: each item's error attribute is either an error object or null, never an array or a plain string. Note: Entity-level lookup failures are tracked separately in lookupStatuses, not in this error field. This field only contains input-level processing errors. Shares the same shape as HTTPError (code, detail, id, source, title). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Error code following the Message Serialization standard (e.g., notAuthenticated, notAuthorized, parameterError, genericServerError). | 
**detail** | **String** | Detailed description of the error, providing additional context beyond the title. |  [optional]
**id** | **java.util.UUID** | Unique identifier (UUID) for this error occurrence, useful for debugging and support inquiries. | 
**source** | [**ErrorSource**](ErrorSource.md) |  |  [optional]
**title** | **String** | Human-readable error title or summary. | 


## Implemented Interfaces

* Serializable


