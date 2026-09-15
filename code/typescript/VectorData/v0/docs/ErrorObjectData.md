# vectordata.ErrorObjectData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Machine-readable error code | 
**title** | **String** | Human-readable error summary | 
**id** | **String** | Unique error instance identifier for tracking | 
**detail** | **String** | Detailed error explanation | [optional] 
**source** | [**ErrorObjectDataSource**](ErrorObjectDataSource.md) |  | [optional] 



## Enum: CodeEnum


* `BadRequest` (value: `"BadRequest"`)

* `ValidationError` (value: `"ValidationError"`)

* `NotFound` (value: `"NotFound"`)

* `Forbidden` (value: `"Forbidden"`)

* `InternalServerError` (value: `"InternalServerError"`)




