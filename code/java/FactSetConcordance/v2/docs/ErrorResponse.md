

# ErrorResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Status. |  [optional]
**timestamp** | **OffsetDateTime** | Timestamp in yyyy-mm-ddThh:mm:ss.sss format. |  [optional]
**path** | **String** | The Endpoint path {package}/version/{endpoint} |  [optional]
**message** | **String** | The plain text error message. |  [optional]
**subErrors** | [**ErrorResponseSubErrors**](ErrorResponseSubErrors.md) |  |  [optional]


## Implemented Interfaces

* Serializable


