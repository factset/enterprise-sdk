# HTTPError

Standard HTTP error details including code, message, unique identifier, and source location.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | Error code following the Message Serialization standard (e.g., notAuthenticated, notAuthorized, parameterError, genericServerError). | 
**id** | **str** | Unique identifier (UUID) for this error occurrence, useful for debugging and support inquiries. | 
**title** | **str** | Human-readable error title or summary. | 
**detail** | **str** | Detailed description of the error, providing additional context beyond the title. | [optional] 
**source** | [**ErrorSource**](ErrorSource.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


