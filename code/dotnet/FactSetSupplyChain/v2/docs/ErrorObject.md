# FactSet.SDK.FactSetSupplyChain.Model.ErrorObject
Error object containing status code, error message, and detailed explanation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | Machine-readable error code indicating the error category. Common values are BadRequest, ValidationError, Unauthorized, Forbidden, NotFound, UnsupportedMediaType, InternalServerError | [optional] 
**Title** | **string** | The plain text error message | [optional] 
**Id** | **string** | Unique error instance identifier for tracking | [optional] 
**Detail** | **string** | Error details explanation | [optional] 
**Source** | [**ErrorObjectSource**](ErrorObjectSource.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

