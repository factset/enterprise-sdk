

# FundsErrorObject

Error object containing status code, error message, and detailed explanation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Machine-readable error code indicating the error category. Common values are BadRequest, ValidationError, Unauthorized, Forbidden, NotFound, UnsupportedMediaType, InternalServerError |  [optional]
**title** | **String** | The plain text error message |  [optional]
**id** | **String** | Unique error instance identifier for tracking |  [optional]
**detail** | **String** | Error details explanation |  [optional]
**source** | [**FundsErrorObjectSource**](FundsErrorObjectSource.md) |  |  [optional]


## Implemented Interfaces

* Serializable


