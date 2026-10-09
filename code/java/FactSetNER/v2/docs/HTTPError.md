

# HTTPError

Standard HTTP error details including code, message, unique identifier, and source location.

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


