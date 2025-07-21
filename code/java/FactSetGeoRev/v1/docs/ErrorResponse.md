

# ErrorResponse

Error response object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | status |  [optional]
**timestamp** | **OffsetDateTime** | timestamp in YYYY-MM-DD HH:MM:SS.SSS |  [optional]
**path** | **String** | The Endpoint path {package}/version/{endpoint} |  [optional]
**message** | **String** | The plain text error message |  [optional]
**subErrors** | [**ErrorResponseSubErrors**](ErrorResponseSubErrors.md) |  |  [optional]


## Implemented Interfaces

* Serializable


