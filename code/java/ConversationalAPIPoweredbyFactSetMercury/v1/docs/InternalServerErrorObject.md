

# InternalServerErrorObject

Single error object returned when an unknown server error occurs.

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
UNKNOWN_ERROR | &quot;Unknown Error&quot;



## Enum: CodeEnum

Name | Value
---- | -----
GENERICSERVERERROR | &quot;genericServerError&quot;


## Implemented Interfaces

* Serializable


