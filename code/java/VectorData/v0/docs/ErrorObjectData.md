

# ErrorObjectData

Error Example Object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | Machine-readable error code | 
**title** | **String** | Human-readable error summary | 
**id** | **java.util.UUID** | Unique error instance identifier for tracking | 
**detail** | **String** | Detailed error explanation |  [optional]
**source** | [**ErrorObjectDataSource**](ErrorObjectDataSource.md) |  |  [optional]



## Enum: CodeEnum

Name | Value
---- | -----
BADREQUEST | &quot;BadRequest&quot;
VALIDATIONERROR | &quot;ValidationError&quot;
NOTFOUND | &quot;NotFound&quot;
FORBIDDEN | &quot;Forbidden&quot;
INTERNALSERVERERROR | &quot;InternalServerError&quot;


## Implemented Interfaces

* Serializable


