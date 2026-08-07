

# ErrorObject

Error object containing status code, error message, and detailed explanation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | Unique error instance identifier for tracking purposes. |  [optional]
**code** | **String** | Machine-readable error code indicating the error category. Common values are Bad Request, ValidationError, Forbidden, Not Found, Unsupported Media Type, Too Many Requests, Internal Server Error. |  [optional]
**title** | **String** | The plain text error message. |  [optional]
**detail** | **String** | Detailed error description with actionable guidance. |  [optional]


## Implemented Interfaces

* Serializable


