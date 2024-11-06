

# ResourceNotFoundErrorObject

Single error object returned in response to a request for a non-existent resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **java.util.UUID** | Id of error | 
**title** | [**TitleEnum**](#TitleEnum) | Title of error | 
**code** | [**CodeEnum**](#CodeEnum) | Code of error | 
**detail** | **String** | Details of error | 



## Enum: TitleEnum

Name | Value
---- | -----
ENDPOINT_NOT_FOUND | &quot;Endpoint Not Found&quot;
NOT_FOUND | &quot;Not Found&quot;



## Enum: CodeEnum

Name | Value
---- | -----
ENDPOINTNOTFOUND | &quot;endpointNotFound&quot;
CONVERSATIONAL_API_RESOURCENOTFOUND | &quot;conversational_api_resourceNotFound&quot;


## Implemented Interfaces

* Serializable


