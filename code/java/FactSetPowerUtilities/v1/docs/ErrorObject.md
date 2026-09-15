

# ErrorObject

Individual error detail.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | Unique error identifier for tracing. |  [optional]
**code** | **String** | Machine-readable error code in camelCase. | 
**title** | **String** | Short human-readable summary matching the HTTP status reason phrase. | 
**detail** | **String** | Detailed human-readable explanation of this error occurrence. | 
**links** | [**ErrorObjectLinks**](ErrorObjectLinks.md) |  |  [optional]


## Implemented Interfaces

* Serializable


